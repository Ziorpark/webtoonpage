package com.kopo.repository;

import java.util.List;


import com.kopo.domain.Webtoon2;

public interface WebtoonRepository2 {
	List<Webtoon2> getAllwebtoonList2();
	
	Webtoon2 getWebtoonById(String titleId);
	void setNewWebtoon(Webtoon2 webtoon);
	List<Webtoon2> getWebtoonByScore(String totalscore);
}
