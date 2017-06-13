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
 * BuilderPattern
 * class ini memanfaatkan static class yang bisa di-inisialisasi tanpa keyword new
 * static class tersebut mendefinisikan method-method yang men-set property
 * dengan nama method yang deskriptif sehingga mudah dibaca.
 * method pada static class mengembalikan static class itu sendiri sehingga static class tersebut
 * dapat di-chaining.
 * 
 * dan yang terakhir, static class akan melakukan inisialisasi objek baru 
 * sesuai dengan class yang sebenarnya dipanggil
 * 
 * @author Me
 */
public class BuilderPattern {
  
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;
  
  private BuilderPattern(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }
  
  public static class Builder {
    // required parameters
    private final int servingSize;
    private final int servings;
    
    // optional parameters - initialized to default values
    private int calories      = 0;
    private int fat           = 0;
    private int carbohydrate  = 0;
    private int sodium         = 0;
    
    /**
     * Constructor 2 parameter 
     * required parameters only
     * 
     * @param servingSize
     * @param servings 
     */
    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }
    
    public Builder calories(int val) {
      calories = val;
      return this;
    }
    
    public Builder fat(int val) {
      fat = val;
      return this;
    }
    
    public Builder carbohydrate(int val) {
      carbohydrate = val;
      return this;
    }
    
    public Builder sodium(int val) {
      sodium = val;
      return this;
    }
    
    public BuilderPattern build() {
      return new BuilderPattern(this);
    }
  }
  
}
