package com.myEruekaClient.fategame.service;

import com.fateapi.domain.Rtiuial;
import com.fateapi.domain.Servent;

import java.util.List;


public interface GetCards {
Servent Servent(int start);
Rtiuial rtiuials(int start);
List<Servent> ServentCards(int[] array);
List<Rtiuial> RtiuialCards(int[] array);
}
