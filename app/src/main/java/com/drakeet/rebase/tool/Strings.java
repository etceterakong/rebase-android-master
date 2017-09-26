/*
 * Copyright (C) 2017 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of rebase-android
 *
 * rebase-android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * rebase-android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with rebase-android. If not, see <http://www.gnu.org/licenses/>.
 */

package com.drakeet.rebase.tool;

import android.support.annotation.Nullable;

/**
 * @author drakeet
 */
public class Strings {

    private Strings() {}


    public static boolean isNullOrEmpty(@Nullable String string) {
        return string == null || string.isEmpty();
    }


    public static boolean notNullAndEmpty(@Nullable String string) {
        return !isNullOrEmpty(string);
    }


    /**
     * Returns the given string if it is nonempty; {@code null} otherwise.
     *
     * @param string the string to transform and possibly return
     * @return {@code string} itself if it is nonempty; {@code null} if it is empty or null
     */
    @Nullable
    public static String emptyToNull(@Nullable String string) {
        return isNullOrEmpty(string) ? null : string;
    }
}
