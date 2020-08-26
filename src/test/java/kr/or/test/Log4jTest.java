package kr.or.test;



import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

// logger level : debug < info < warn < error < fatal

public class Log4jTest {
    private Logger log = Logger.getLogger(Log4jTest.class);
	public void test( ) {
		MemberVO memberVO = new MemberVO();
		memberVO.setName("홍길동");
		memberVO.setAge(24);
		
		try {
			InetAddress localPc = InetAddress.getLocalHost();
			String ip = localPc.getHostAddress();
			log.info("test라는 메서드를 사용한 PC의 아이피는:" + ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
				
		
		log.debug("디버그!!" + memberVO);
		log.info("인포!!");
		log.warn("워닝!!");
		log.error("에러!!");
		log.fatal("파탈!!");
		
	}
	public static void main(String[] args) {
		new Log4jTest().test();

	}

}
