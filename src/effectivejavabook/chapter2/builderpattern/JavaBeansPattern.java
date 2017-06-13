/*
 * Copyright (C) 2017 Me
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package effectivejavabook.chapter2.builderpattern;

/**
 * JavaBeansPattern
 * Class ini mengharuskan men-set satu persatu property
 * pemanggilan menjadi lebih jelas dan explisit.
 * namun membuat value dari class tersebut tidak konsisten
 * karena dipanggil dari berbagai tempat.
 * dan juga karena dengan saking banyaknya pemanggil,
 * memungkinkan Class ini menjadi immutable 
 * (tidak dapat berubah value)
 * 
 * @author Me
 */
public class JavaBeansPattern {
  
  // Parameters initialized to default values (if any)
  private int servingSize   = -1;   // required; no default value
  private int servings      = -1;   // required; no default value
  private int calories      = 0;
  private int fat           = 0;
  private int sodium        = 0;
  private int carbohydrate  = 0;
  
  /**
   * default Constructor
   */
  public JavaBeansPattern() {}

  /**
   * setter servingSize
   * @param servingSize 
   */
  public void setServingSize(int servingSize) {
    this.servingSize = servingSize;
  }

  /**
   * setter servings
   * 
   * @param servings 
   */
  public void setServings(int servings) {
    this.servings = servings;
  }

  /**
   * setter calories
   * 
   * @param calories 
   */
  public void setCalories(int calories) {
    this.calories = calories;
  }

  /**
   * setter fat
   * 
   * @param fat 
   */
  public void setFat(int fat) {
    this.fat = fat;
  }

  /**
   * setter sodium
   * 
   * @param sodium 
   */
  public void setSodium(int sodium) {
    this.sodium = sodium;
  }

  /**
   * setter carbohydrate
   * 
   * @param carbohydrate 
   */
  public void setCarbohydrate(int carbohydrate) {
    this.carbohydrate = carbohydrate;
  }
}
