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

package com.android.inputmethod.enhancedime.utils;

import com.android.inputmethod.dictionarypack.DictionarySettingsFragment;
import com.android.inputmethod.enhancedime.about.AboutPreferences;
import com.android.inputmethod.enhancedime.settings.AccountsSettingsFragment;
import com.android.inputmethod.enhancedime.settings.AdvancedSettingsFragment;
import com.android.inputmethod.enhancedime.settings.AppearanceSettingsFragment;
import com.android.inputmethod.enhancedime.settings.CorrectionSettingsFragment;
import com.android.inputmethod.enhancedime.settings.CustomInputStyleSettingsFragment;
import com.android.inputmethod.enhancedime.settings.DebugSettingsFragment;
import com.android.inputmethod.enhancedime.settings.GestureSettingsFragment;
import com.android.inputmethod.enhancedime.settings.PreferencesSettingsFragment;
import com.android.inputmethod.enhancedime.settings.SettingsFragment;
import com.android.inputmethod.enhancedime.settings.ThemeSettingsFragment;
import com.android.inputmethod.enhancedime.spellcheck.SpellCheckerSettingsFragment;
import com.android.inputmethod.enhancedime.userdictionary.UserDictionaryAddWordFragment;
import com.android.inputmethod.enhancedime.userdictionary.UserDictionaryList;
import com.android.inputmethod.enhancedime.userdictionary.UserDictionaryLocalePicker;
import com.android.inputmethod.enhancedime.userdictionary.UserDictionarySettings;

import java.util.HashSet;

public class FragmentUtils {
    private static final HashSet<String> sLatinImeFragments = new HashSet<>();
    static {
        sLatinImeFragments.add(DictionarySettingsFragment.class.getName());
        sLatinImeFragments.add(AboutPreferences.class.getName());
        sLatinImeFragments.add(PreferencesSettingsFragment.class.getName());
        sLatinImeFragments.add(AccountsSettingsFragment.class.getName());
        sLatinImeFragments.add(AppearanceSettingsFragment.class.getName());
        sLatinImeFragments.add(ThemeSettingsFragment.class.getName());
        sLatinImeFragments.add(CustomInputStyleSettingsFragment.class.getName());
        sLatinImeFragments.add(GestureSettingsFragment.class.getName());
        sLatinImeFragments.add(CorrectionSettingsFragment.class.getName());
        sLatinImeFragments.add(AdvancedSettingsFragment.class.getName());
        sLatinImeFragments.add(DebugSettingsFragment.class.getName());
        sLatinImeFragments.add(SettingsFragment.class.getName());
        sLatinImeFragments.add(SpellCheckerSettingsFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryAddWordFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryList.class.getName());
        sLatinImeFragments.add(UserDictionaryLocalePicker.class.getName());
        sLatinImeFragments.add(UserDictionarySettings.class.getName());
    }

    public static boolean isValidFragment(String fragmentName) {
        return sLatinImeFragments.contains(fragmentName);
    }
}
