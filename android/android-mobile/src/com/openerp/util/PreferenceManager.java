/**
 * OpenERP, Open Source Management Solution
 * Copyright (C) 2012-today OpenERP SA (<http://www.openerp.com>)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * 
 */
package com.openerp.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
	SharedPreferences mPref = null;

	public PreferenceManager(Context context) {
		mPref = android.preference.PreferenceManager
				.getDefaultSharedPreferences(context);
	}

	public int getInt(String key, int default_value) {
		return Integer.parseInt(mPref.getString(key, default_value + ""));
	}

}
