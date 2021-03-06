/*******************************************************************************
 * Copyright 2012 AndroidQuery (tinyeeliu@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Additional Note:
 * 1. You cannot use AndroidQuery's Facebook app account in your own apps.
 * 2. You cannot republish the app as is with advertisements.
 ******************************************************************************/
package com.androidquery.simplefeed.util;

import java.util.HashMap;
import java.util.Map;

import android.graphics.drawable.Drawable;

import com.androidquery.simplefeed.MainApplication;

public class IconUtility {

	private static Map<Integer, Drawable> cache = new HashMap<Integer, Drawable>();
	
	public static Drawable getCached(int resId){
		
		if(resId == 0) return null;
		
		Drawable result = cache.get(resId);
		
		if(result == null){
			result = MainApplication.getContext().getResources().getDrawable(resId);
			cache.put(resId, result);
		}
		
		return result;
		
		
	}
	
}
