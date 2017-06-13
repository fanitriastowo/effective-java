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
package effectivejavabook.chapter2.unnecessaryobject;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author Me
 */
public class Main {

  public static void main(String[] args) {
    // Slow Program..
    //Long sum = 0L; exekusi 12 detik
    long sum = 0L;    // eksekusi 1 detik; sebisa mungkin menggunakan primitive
    
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  public static void dontDoThis() {
    String s = new String("stringette");    // DON'T DO THIS!
    // code diatas akan membuat instance String baru setiap eksekusi.
    // bayangkan apabila berada didalam loop atau method yg dipanggil
    // terus menerus?

  }
  
  public static void betterCode() {
    String s = "";
    // dengan code diatas, JVM akan menggunakan objek String yg sudah ada
    // dalam satu instance JVM yg sama
  }

}
