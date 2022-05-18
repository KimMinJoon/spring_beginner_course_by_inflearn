package resume.resumespring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import resume.resumespring.repository.MemberRepository;
import resume.resumespring.repository.MemoryMemberRepository;
import resume.resumespring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
