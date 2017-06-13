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

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * bayangkan apabila class ini diexekusi pada aplikasi web
 * maka setiap class berada pada thread sendiri-sendiri
 * JVM akan punya banyak sekali objek yang sebetulnya tidak perlu
 * gunakan static apabila objek bersifat fungsi, 
 * bukan data yang seharusnya independent untuk masing-masing thread
 * 
 * @author Me
 */
public class ImprovedPerson {
  
  private final Date birthDate = null;
  
  private static final Date BOOM_START;
  private static final Date BOOM_END;
  
  static {
    Calendar gmtCal = 
            Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
    BOOM_START = gmtCal.getTime();
    
    gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
    BOOM_END = gmtCal.getTime();
  }
  
  public boolean isBabyBoomer() {
    return  birthDate.compareTo(BOOM_START) >= 0 &&
            birthDate.compareTo(BOOM_END) < 0;
  }
  
}
