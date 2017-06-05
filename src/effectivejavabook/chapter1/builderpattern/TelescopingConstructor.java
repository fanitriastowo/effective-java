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
package effectivejavabook.chapter1.builderpattern;

/**
 * berikut ini merupakan TelescopingConstructor Pattern
 * perhatikan jumlah constructor pada class dibawah ini,
 * jumlah constructor mengikuti banyaknya kombinasi property.
 * hal ini akan sangat mengganggu apabila property berjumlah banyak.
 * 
 * @author TriasFani
 */
public class TelescopingConstructor {

  private final int servingSize;  // (mL)             required
  private final int servings;     // (per container)  required
  private final int calories;     //                  optional
  private final int fat;          // (g)              optional
  private final int sodium;       // (mg)             optional
  private final int carbohydrate; // (g)              optional

  /**
   * constructor dengan 2 parameter
   * 
   * @param servingSize
   * @param servings 
   */
  public TelescopingConstructor(int servingSize, int servings) {
    this(servingSize, servings, 0);
  }

  /**
   * constructor dengan 3 parameter
   * 
   * @param servingSize
   * @param servings
   * @param calories 
   */
  public TelescopingConstructor(int servingSize, int servings,
          int calories) {
    this(servingSize, servings, calories, 0);
  }

  /**
   * constructor dengan 4 parameter
   * 
   * @param servingSize
   * @param servings
   * @param calories
   * @param fat 
   */
  public TelescopingConstructor(int servingSize, int servings,
          int calories, int fat) {
    this(servingSize, servings, calories, fat, 0);
  }

  /**
   * constructor dengan 5 parameter
   * 
   * @param servingSize
   * @param servings
   * @param calories
   * @param fat
   * @param sodium 
   */
  public TelescopingConstructor(int servingSize, int servings,
          int calories, int fat, int sodium) {
    this(servingSize, servings, calories, fat, sodium, 0);
  }

  /**
   * constructor dengan 6 parameter
   * 
   * @param servingSize
   * @param servings
   * @param calories
   * @param fat
   * @param sodium
   * @param carbohydrate 
   */
  public TelescopingConstructor(int servingSize, int servings,
          int calories, int fat, int sodium, int carbohydrate) {
    this.servingSize = servingSize;
    this.servings = servings;
    this.calories = calories;
    this.fat = fat;
    this.sodium = sodium;
    this.carbohydrate = carbohydrate;
  }

}
