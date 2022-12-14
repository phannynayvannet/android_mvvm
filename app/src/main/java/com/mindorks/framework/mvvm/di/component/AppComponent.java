/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.mindorks.framework.mvvm.di.component;

import android.app.Application;
import com.mindorks.framework.mvvm.MvvmApp;
import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.data.local.db.AppDatabase;
import com.mindorks.framework.mvvm.data.local.db.DbHelper;
import com.mindorks.framework.mvvm.data.local.prefs.PreferencesHelper;
import com.mindorks.framework.mvvm.data.remote.ApiHelper;

import com.mindorks.framework.mvvm.di.module.AppModule;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by amitshekhar on 07/07/17.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MvvmApp app);

    DataManager getDataManager();

    SchedulerProvider getSchedulerProvider();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
