/*
Yaaic - Yet Another Android IRC Client

Copyright 2009 Sebastian Kaspari

This file is part of Yaaic.

Yaaic is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Yaaic is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Yaaic.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.yaaic.client.db;

import android.provider.BaseColumns;

/**
 * Server Constants
 * 
 * @author Sebastian Kaspari <s.kaspari@googlemail.com>
 */
public interface ServerConstants extends BaseColumns
{
	public static final String TABLE_NAME   = "servers";
	
	public static final String TITLE    	= "title";
	public static final String HOST     	= "host";
	public static final String PORT     	= "port";
	public static final String PASSWORD 	= "password";
	public static final String AUTOCONNECT  = "autoConnect";
	public static final String USE_SSL		= "useSSL";
	public static final String IDENTITY     = "identity";
	
	public static final String[] ALL = {
		_ID,
		TITLE,
		HOST,
		PORT,
		PASSWORD,
		AUTOCONNECT,
		USE_SSL
	};
}
