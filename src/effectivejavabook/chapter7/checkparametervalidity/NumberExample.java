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
package effectivejavabook.chapter7.checkparametervalidity;

import java.math.BigInteger;

/**
 *
 * @author Me
 */
public class NumberExample {
  
  /**
   * Return a BigInteger whose value is (this mod m). 
   * This method differs from the remainder method in that it always return a
   * non-negative BigInteger
   * 
   * @param m the modulus, which must be positive
   * @return this mod m
   * @throws ArithmeticException if m is less than or equal to 0
   */
  public BigInteger mod(BigInteger m) {
    if (m.signum() <= 0) {
      throw new ArithmeticException("Modulus <= 0 " + m);
    }
    // do computation
    sort(null, 0, 0);
    
    return m;
  }
  
  /**
   * for an unexported method, 
   * use assert to make sure that parameter are valid
   * 
   * @param a
   * @param offset
   * @param length 
   */
  private static void sort(long a[], int offset, int length) {
    assert a != null;
    assert offset >= 0 && offset <= a.length;
    assert length >= 0 && length <= a.length - offset;
    // do computation
  }
}
