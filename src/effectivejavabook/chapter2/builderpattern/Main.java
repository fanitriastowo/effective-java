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
 * Main Class builderpattern chapter 1
 *
 * @author TriasFani
 */
public class Main {

  public static void main(String[] args) {

    /* TELESCOPING PATTERN
    parameter pada constructor tidak harus di pass semua,
    cukup yang required saja.
    hal ini sangat menguntungkan tetapi,
    untuk membuat telescoping pattern membutuhkan waktu dalam pembuatannya.
    mengingat kita harus definisikan constructor untuk semua model constructor
    lihat class TelescopingConstructor tersebut. */
    TelescopingConstructor cocaColaTelescoping
            = new TelescopingConstructor(240, 8);

    /* JAVABEANS PATTERN
    dengan menggunakan pattern ini code lebih explicit dan jelas
    kita mengharuskan menset satu-satu properti
    NAMUN,
    terdapat kerugian yang serius yaitu,,
    Value dari properti dimungkinkan tidak konsisten tergantung state
    kenapa? 
    karena objek dipanggil di berbagai macam tempat (pemanggil)
    sehingga sangat dimungkin value berubah dari suatu kedudukan (state) */
    JavaBeansPattern cocaColaBeans
            = new JavaBeansPattern();
    cocaColaBeans.setServingSize(240);
    cocaColaBeans.setServings(8);
    cocaColaBeans.setCalories(100);
    cocaColaBeans.setSodium(35);
    cocaColaBeans.setCarbohydrate(27);
    
    /* BUILDERPATTERN
    pattern ini sangat baik digunakan pada objek dengan banyak atribut
    karena untuk men-set value tiap property nya dengan menggunakan objek chaining
    sehingga seolah-olah seperti kalimat
    */
    BuilderPattern cocaColaBuilder 
            = new BuilderPattern.Builder(240, 8).calories(100)
            .sodium(35).carbohydrate(27).build();
    
  }

}
