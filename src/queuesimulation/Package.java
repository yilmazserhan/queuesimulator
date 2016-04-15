/*
 * Copyright (C) 2016 Serhan Yılmaz
 *
 * This file is part of QueueSimulator
 * 
 * QueueSimulator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * QueueSimulator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package queuesimulation;

/**
 *
 * @author Serhan Yılmaz
 */
public class Package {
    
    private final int size;             // Package Size in Bits
   
    protected Time birth_time;
    
    public Package(int package_size,Time time){
        this.size = package_size;
        this.birth_time = new Time(time);
    }
    
    public int getSize(){
        return size;
    }
}
