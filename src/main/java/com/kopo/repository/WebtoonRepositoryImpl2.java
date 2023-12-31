package com.kopo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kopo.domain.Webtoon;
import com.kopo.domain.Webtoon2;

@Repository
public class WebtoonRepositoryImpl2 implements WebtoonRepository2 {
	
	private List<Webtoon2> listOfwebtoons = new ArrayList<Webtoon2>();
	
	public WebtoonRepositoryImpl2() {
		Webtoon2 webtoon1 = new Webtoon2("백수세끼","mon1.jpg");
		webtoon1.setAuthor("치즈");
		webtoon1.setPublicationDay("Mon");
		webtoon1.setAgeLimit("전체연령가");
		webtoon1.setDescription("백수 시절 내 곁을 지켜줬던 그녀... 돌아와 주면 안 되겠니? 음식 메뉴마다 담겨 있는 우리들의 연애 흑역사!");
		webtoon1.setWebsite("naver");
		webtoon1.setGenre("드라마");
		webtoon1.setUrl("https://comic.naver.com/webtoon/list?titleId=733074");
		webtoon1.setTitleId("7733074");
		webtoon1.setDrawing(4.1);
		webtoon1.setMaterial(3.5);
		webtoon1.setStory(3.6);
		webtoon1.setMessage(3.9);
		webtoon1.setTotalScore("3.8");
		
		Webtoon2 webtoon2 = new Webtoon2("윈드브레이커","mon2.jpg");
		webtoon2.setAuthor("조용석");
		webtoon2.setPublicationDay("Mon");
		webtoon2.setAgeLimit("12세 이용가");
		webtoon2.setDescription("혼자서 자전거를 즐겨타던 모범생 조자현. 원치 않게 자전거 크루의 일에 자꾸 휘말리게 되는데... 자유를 꿈꾸는 청춘들의 스트릿라이딩 드라마!");
		webtoon2.setWebsite("naver");
		webtoon2.setGenre("스포츠");
		webtoon2.setUrl("https://comic.naver.com/webtoon/list?titleId=602910");
		webtoon2.setTitleId("602910");
		webtoon2.setDrawing(4.7);
		webtoon2.setMaterial(4.9);
		webtoon2.setStory(2.9);
		webtoon2.setMessage(3.3);
		webtoon2.setTotalScore("4.0");
		
		Webtoon2 webtoon3 = new Webtoon2("별난식당","mon3.jpg");
		webtoon3.setAuthor("HO9");
		webtoon3.setPublicationDay("Mon");
		webtoon3.setAgeLimit("전체연령가");
		webtoon3.setDescription("<요리GO>의 새로운 이야기,<별난식당>. 특급호텔에서 최연소 팀장에 오르며 승승장구하던 주인공 한별은 퇴사를 하고 작은 식당을 차린다. 그 식당의 이름은 '별난식당'" + 
				"별난식당은 상권이라고는 찾아볼 수 없는, 서울에서 제일 가난한 동네인 부자동에 위치해 있다. 또한 메뉴도 별나다. 바로 메뉴가 없기 때문이다. 메뉴가 없이 한별 셰프가 그때그때 제철 식재료를 이용해 요리를 만드는 식당이다." + 
				"이 식당의 특별한 점은 요리를 먹는 손님이 마음까지 위로 받는다는 것. 한별 셰프는 대체 어떠한 방법으로 마음의 상처가 있는 많은 손님들을 요리로 치유하는 것일까");
		webtoon3.setWebsite("naver");
		webtoon3.setGenre("드라마");
		webtoon3.setUrl("https://comic.naver.com/webtoon/list?titleId=806189");
		webtoon3.setTitleId("806189");
		webtoon3.setDrawing(3.1);
		webtoon3.setMaterial(3.5);
		webtoon3.setStory(3.2);
		webtoon3.setMessage(4.1);
		webtoon3.setTotalScore("3.5");
		
		Webtoon2 webtoon4 = new Webtoon2("참교육","mon4.jpg");
		webtoon4.setAuthor("채용택");
		webtoon4.setPublicationDay("Mon");
		webtoon4.setAgeLimit("15세 이용가");
		webtoon4.setDescription("무너진 교권을 지키기 위해 교권보호국 소속 나화진의 참교육이 시작된다! <부활남> 채용택 작가 X <신석기녀> 한가람 작가의 신작!");
		webtoon4.setWebsite("naver");
		webtoon4.setGenre("액션");
		webtoon4.setUrl("https://comic.naver.com/webtoon/list?titleId=758037");
		webtoon4.setTitleId("758037");
		webtoon4.setDrawing(3.9);
		webtoon4.setMaterial(4.3);
		webtoon4.setStory(3.3);
		webtoon4.setMessage(4.2);
		webtoon4.setTotalScore("3.9");
		
		Webtoon2 webtoon5 = new Webtoon2("만렙돌파","mon5.jpg");
		webtoon5.setAuthor("성불예정");
		webtoon5.setPublicationDay("Mon");
		webtoon5.setAgeLimit("15세 이용가");
		webtoon5.setDescription("알 수 없는 오류로 3000년간 각성 테스트에 갇힌 김기봉. 그 사이 현실에선 10년이 흘렀고, 온 세상은 몬스터와 던전으로 가득차게 되었다. 만렙으로 귀환한 김기봉의 모든 것을 원래대로 돌려놓기 위한 싸움이 시작된다!");
		webtoon5.setWebsite("naver");
		webtoon5.setGenre("판타지");
		webtoon5.setUrl("https://comic.naver.com/webtoon/list?titleId=759940");
		webtoon5.setTitleId("759940");
		webtoon5.setDrawing(3.9);
		webtoon5.setMaterial(2.6);
		webtoon5.setStory(2.5);
		webtoon5.setMessage(2.5);
		webtoon5.setTotalScore("2.9");
		
		Webtoon2 webtoon6 = new Webtoon2("잔불의 기사","mon6.jpg");
		webtoon6.setAuthor("환댕");
		webtoon6.setPublicationDay("Mon");
		webtoon6.setAgeLimit("15세 이용가");
		webtoon6.setDescription("유일한 가족이자, 최고의 기사 유망주였던 쌍둥이 동생이 살해당했다." + 
				"천재적이었던 동생과는 달리 무예에 재능이 전혀 없지만," + 
				"동생의 복수를 위해 '강함'을 연기하기로 결심했다." + 
				"약해빠진 나는 복수에 성공할 수 있을까.");
		webtoon6.setWebsite("naver");
		webtoon6.setGenre("판타지");
		webtoon6.setUrl("https://comic.naver.com/webtoon/list?titleId=768536");
		webtoon6.setTitleId("768536");
		webtoon6.setDrawing(4.0);
		webtoon6.setMaterial(4.5);
		webtoon6.setStory(4.7);
		webtoon6.setMessage(3.5);
		webtoon6.setTotalScore("4.2");
		
		Webtoon2 webtoon7 = new Webtoon2("마이너스의 손","mon7.jpg");
		webtoon7.setAuthor("김뎐");
		webtoon7.setPublicationDay("Mon");
		webtoon7.setAgeLimit("전체연령가");
		webtoon7.setDescription("만지면 모두 부서진다. 마이너스의 오른손을 가진 소년 이야기");
		webtoon7.setWebsite("naver");
		webtoon7.setGenre("판타지");
		webtoon7.setUrl("https://comic.naver.com/webtoon/list?titleId=679568");
		webtoon7.setTitleId("679568");
		webtoon7.setDrawing(3.6);
		webtoon7.setMaterial(4.3);
		webtoon7.setStory(3.6);
		webtoon7.setMessage(3.4);
		webtoon7.setTotalScore("3.7");
		
		Webtoon2 webtoon8 = new Webtoon2("인섹터","mon8.jpg");
		webtoon8.setAuthor("마카빔");
		webtoon8.setPublicationDay("Mon");
		webtoon8.setAgeLimit("15세 이용가");
		webtoon8.setDescription("어느 날 학교에서 담임교사가 <공벌레 인섹터 내라해치>가 되어" + 
				"반 아이들을 무차별적으로 살해한 사건이 벌어진다." + 
				"그때 나타난 검은 개미, 그는 반 아이들을 구하게 되고 이 사건을 시작으로" + 
				"언론과 SNS로 퍼져 인섹터의 존재는 더 이상 도시 괴담 수준의 이야기가 아니게 된다." + 
				"결국, 정부는 비밀리에 임무를 수행하던 인섹터 퇴치반 버그리퍼를 내세우고 생존자의 증언에 따라 검은 개미를 뒤쫓게 되는데,");
		webtoon8.setWebsite("naver");
		webtoon8.setGenre("판타지");
		webtoon8.setUrl("https://comic.naver.com/webtoon/list?titleId=801710");
		webtoon8.setTitleId("801710");
		webtoon8.setDrawing(3.7);
		webtoon8.setMaterial(4.2);
		webtoon8.setStory(3.5);
		webtoon8.setMessage(3.2);
		webtoon8.setTotalScore("3.7");
		
		Webtoon2 webtoon9 = new Webtoon2("라서드","mon9.jpg");
		webtoon9.setAuthor("감람");
		webtoon9.setPublicationDay("Mon");
		webtoon9.setAgeLimit("12세 이용가");
		webtoon9.setDescription("절대적 권능을 지닌 11인의 왕과, 왕을 수호하기 위한 기사단이 존재하는 세계." + 
				"수습기사 힌타는 파트너 캐넛과 함께 정식 기사가 되기 위한 모험을 떠나는데..." + 
				"정식기사가 되기 위한 소년들의 고군분투 정통판타지액션!");
		webtoon9.setWebsite("naver");
		webtoon9.setGenre("판타지");
		webtoon9.setUrl("https://comic.naver.com/webtoon/list?titleId=756140");
		webtoon9.setTitleId("756140");
		webtoon9.setDrawing(4.0);
		webtoon9.setMaterial(4.5);
		webtoon9.setStory(4.7);
		webtoon9.setMessage(3.5);
		webtoon9.setTotalScore("4.2");
		
		Webtoon2 webtoon10 = new Webtoon2("파운더","mon10.jpg");
		webtoon10.setAuthor("임상윤");
		webtoon10.setPublicationDay("Mon");
		webtoon10.setAgeLimit("15세 이용가");
		webtoon10.setDescription("1970년대 각하에 대한 과잉 충성으로 비밀스런 공작대가 운영되었고 이는 정권이 바뀐 1980년대 대한민국 최초의 살인 청부 회사가 설립되는 토대가 된다. " + 
				"공작대의 에이스 공작원은 처절하게 살아남아 살인청부업 회사의 대표가 되어 회사를 이끌어가게 되는데...");
		webtoon10.setWebsite("naver");
		webtoon10.setGenre("액션");
		webtoon10.setUrl("https://comic.naver.com/webtoon/list?titleId=791205");
		webtoon10.setTitleId("791205");
		webtoon10.setDrawing(3.3);
		webtoon10.setMaterial(4.7);
		webtoon10.setStory(4.2);
		webtoon10.setMessage(4.6);
		webtoon10.setTotalScore("4.2");
		
		listOfwebtoons.add(webtoon1);
		listOfwebtoons.add(webtoon2);
		listOfwebtoons.add(webtoon3);
		listOfwebtoons.add(webtoon4);
		listOfwebtoons.add(webtoon5);
		listOfwebtoons.add(webtoon6);
		listOfwebtoons.add(webtoon7);
		listOfwebtoons.add(webtoon8);
		listOfwebtoons.add(webtoon9);
		listOfwebtoons.add(webtoon10);

	}
	
	
	
	@Override
	public List<Webtoon2> getAllwebtoonList2() {
		// TODO Auto-generated method stub
		return listOfwebtoons;
	}



	@Override
	public Webtoon2 getWebtoonById(String titleId) {
		// TODO Auto-generated method stub
		Webtoon2 webtoonInfo = null;
		for(int i=0; i<listOfwebtoons.size(); i++) {
			Webtoon2 web = listOfwebtoons.get(i);
			if (web != null && web.getTitleId() != null && web.getTitleId().equals(titleId)) {
				webtoonInfo = web;
				break;
			}
			
		}
		if (webtoonInfo == null) {
			throw new IllegalArgumentException("웹툰의 ID를 찾을 수가 없습니다 : " + titleId);
		}
	
		return webtoonInfo;
	}



	@Override
	public void setNewWebtoon(Webtoon2 webtoon) {
		// TODO Auto-generated method stub
		listOfwebtoons.add(webtoon);
	}



	@Override
	public List<Webtoon2> getWebtoonByScore(String searchkey) {
		
		double tt;
		List<Webtoon2> listOfScore = new ArrayList<Webtoon2>();
		
	    try {
	        tt = Double.parseDouble(searchkey);
	        for (int i =0; i<listOfwebtoons.size(); i++) {
				Webtoon2 web = listOfwebtoons.get(i);
				double d_score = Double.parseDouble(web.getTotalScore()); 
				if (web != null && d_score >= tt) {
					listOfScore.add(web);
				}
			}
	        
	    } catch (NumberFormatException e) {
	        // 파라미터가 유효한 숫자로 변환되지 않을 경우, 예외 처리
	        //throw new IllegalArgumentException("점수 파라미터가 올바른 숫자가 아닙니다: " + totalscore);
	    	
	    	for (int i =0; i<listOfwebtoons.size(); i++) {
				Webtoon2 web = listOfwebtoons.get(i);
				if (web != null && web.getName().contains(searchkey)) {
					listOfScore.add(web);
				}
			}
	    	
	    }

	   
		return listOfScore;
	}

}
