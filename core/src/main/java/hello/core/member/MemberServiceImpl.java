package hello.core.member;

//관례 : 구현체 하나만 있을때는, 인터페이스명 뒤에 Impl을 많이 붙힌다.
public class MemberServiceImpl implements MemberService{

    // command + shift + enter = 세미콜론까지 자동완성
    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
