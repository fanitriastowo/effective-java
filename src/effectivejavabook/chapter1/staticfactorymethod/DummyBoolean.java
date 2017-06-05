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
package effectivejavabook.chapter1.staticfactorymethod;

/**
 * Gunakan static method dengan identifier public daripada constructor. KENAPA??
 * karena :
 * <ol>
 * <li>tidak seperti constructor, static factory method punya nama.</li>
 * <li>tidak seperti constructor, static factory method dapat dipanggil tanpa membuat objek baru</li>
 * <li>tidak seperti constructor, static factory method dapat return tipe lain selain objek dari class</li>
 * </ol>
 * @author TriasFani
 */
public class DummyBoolean {

  /**
   * method untuk meng-cek sebuah value apakah bertipe boolean atau bukan
   * @param value tipe boolean
   * @return boolean hasil TRUE atau FALSE dari sebuah objek
   */
  public static Boolean valueOf(Boolean value) {
    return value ? Boolean.TRUE : Boolean.FALSE;
  }
}
