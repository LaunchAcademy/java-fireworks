package com.launchacademy.javafireworks.services;

import com.launchacademy.javafireworks.models.Firework;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class FireworkSessionService implements FireworkService {
  private List<Firework> fireworks;

  public FireworkSessionService() {
    this.fireworks = new ArrayList<Firework>();
    Firework firework = new Firework();

    firework.setId(0);
    firework.setName("Sparkler");
    firework.setDescription("Tiny. Fun for Kids");
    firework.setPrice(4.99);
    firework.setLoudnessRating(1);
    fireworks.add(firework);


    firework = new Firework();
    firework.setId(1);
    firework.setName("Roman Candle");
    firework.setDescription("Beauuutiful");
    firework.setPrice(6.49);
    firework.setLoudnessRating(2);
    fireworks.add(firework);

    firework = new Firework();
    firework.setId(2);
    firework.setName("M80");
    firework.setDescription("This will wake you up in the morning. All your neighbors have them");
    firework.setPrice(4.49);
    firework.setLoudnessRating(3);
    fireworks.add(firework);
  }

  @Override
  public List<Firework> findAll() {
    return this.fireworks;
  }

  @Override
  public void addToList(Firework firework) {
    this.fireworks.add(firework);
  }

  @Override
  public Firework get(Integer index) {
    return this.fireworks.get(index);
  }
}
