package com.launchacademy.javafireworks.services;

import com.launchacademy.javafireworks.models.Firework;
import java.util.List;

public interface FireworkService {
  List<Firework> findAll();
  void addToList(Firework firework);
  Firework get(Integer index);
}
