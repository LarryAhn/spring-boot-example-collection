package com.geekswise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaGenericGeneratorApplication implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaGenericGeneratorApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        List<MemberEntity> memberEntityList =
                Arrays.asList(new MemberEntity("치츄"), new MemberEntity("젠득이"));
        memberRepository.save(memberEntityList);

        List<MemberEntity> memberEntities = memberRepository.findAll();
        memberEntities.forEach(memberEntity -> System.out.println(memberEntity));
        
    }
}
