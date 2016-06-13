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

package com.android.inputmethod.latin.utils;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Unit tests for {@link ExecutorUtils}.
 */
@MediumTest
public class ExecutorUtilsTests extends AndroidTestCase {
    private static final String TAG = ExecutorUtilsTests.class.getSimpleName();

    private static final int NUM_OF_TASKS = 10;
    private static final int DELAY_FOR_WAITING_TASKS_MILLISECONDS = 500;

    public void testExecute() {
        final ExecutorService executor =
                ExecutorUtils.getBackgroundExecutor(ExecutorUtils.KEYBOARD);
        final AtomicInteger v = new AtomicInteger(0);
        for (int i = 0; i < NUM_OF_TASKS; ++i) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    v.incrementAndGet();
                }
            });
        }
        try {
            executor.awaitTermination(DELAY_FOR_WAITING_TASKS_MILLISECONDS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.d(TAG, "Exception while sleeping.", e);
        }

        assertEquals(NUM_OF_TASKS, v.get());
    }
}
