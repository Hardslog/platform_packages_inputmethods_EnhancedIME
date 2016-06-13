/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.util;

/**
 * This is a compatibility class that aims at emulating android.util.Log from the
 * Android library as simply as possible, and only to the extent that is used by the client classes.
 * Its purpose is to provide compatibility without having to pull the whole Android library.
 */
public class Log {
    public static void d(final String tag, final String message) {
        System.out.println(tag + " : " + message);
    }
    public static void d(final String tag, final String message, final Throwable t) {
        System.out.println(tag + " : " + message + " : " + t);
    }
    public static void e(final String tag, final String message) {
        d(tag, message);
    }
    public static void e(final String tag, final String message, final Throwable t) {
        d(tag, message, t);
    }
    public static void w(final String tag, final String message) {
        d(tag, message);
    }
    public static void w(final String tag, final String message, final Throwable t) {
        d(tag, message, t);
    }
}
