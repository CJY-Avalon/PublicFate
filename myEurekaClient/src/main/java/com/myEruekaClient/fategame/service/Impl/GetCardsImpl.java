package com.myEruekaClient.fategame.service.Impl;
import java.util.ArrayList;
import java.util.List;

import com.fateapi.Dao.RtiuialDao;
import com.fateapi.Dao.ServentDao;
import com.fateapi.domain.Rtiuial;
import com.fateapi.domain.Servent;
import com.myEruekaClient.fategame.service.GetCards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GetCardsImpl implements GetCards {
	@Autowired
	private ServentDao serventDao;
	@Autowired
	private RtiuialDao rtiuialDao;
	Servent s = new Servent();
	Rtiuial r = new Rtiuial();
	@Override
	public Servent Servent(int start) {
		List<Servent> servents =  serventDao.findBystar(start);
		int getrole = (int) (Math.random()*servents.size());
		s = servents.get(getrole);
		return s;
	}

	@Override
	public Rtiuial rtiuials(int start) {
		List<Rtiuial> Rtiuial =  rtiuialDao.findBystar(start);
		int getrtiui = (int) (Math.random()*Rtiuial.size());
		r = Rtiuial.get(getrtiui);
		return r;
	}

	@Override
	public List<Servent> ServentCards(int[] array) {
		int ss = 0;
		int r = 0;
		List<Servent> Serventlist = new ArrayList<>(10);
		for (int i = 0; i < array.length; i++) {
			if (array[i]<=44) {
				ss+=1;
			}
			if (array[i]>44) {
				r+=1;
			}
		}
		for (int i = 0; i < 10; i++) {
			if(array[i]>=0 && array[i]<=1) {
				s=Servent(5);
				Serventlist.add(s);
			}
			if(array[i]>1 && array[i]<=4) {
				s=Servent(4);
				Serventlist.add(s);
			}
			if(array[i]>4 && array[i]<=44) {
				s=Servent(3);
				Serventlist.add(s);
			}
		}
		System.out.println("英灵数"+ss);
		System.out.println("礼装数"+r);
		return Serventlist;
	}

	@Override
	public List<Rtiuial> RtiuialCards(int[] array) {
		List<Rtiuial> Rtiuiallist = new ArrayList<>(10);
		for (int i = 0; i <10; i++) {
			if(array[i]>44 && array[i]<=48) {
				r = rtiuials(5); 
				Rtiuiallist.add(r);
			}
			if(array[i]>48 && array[i]<=60) {
				r = rtiuials(4); 
				Rtiuiallist.add(r);
			}
			if(array[i]>60 && array[i]<=100) {
				r = rtiuials(3); 
				Rtiuiallist.add(r);
			}
		}
		return Rtiuiallist;
	}

}
