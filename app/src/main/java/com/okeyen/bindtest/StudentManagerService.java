package com.okeyen.bindtest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class StudentManagerService extends Service {
    private static final String TAG="StudentManagerService";
    //判断当前service是否销毁
    private AtomicBoolean mIsServieDestoryed = new AtomicBoolean(false);
    private CopyOnWriteArrayList<Student> mStudent = new CopyOnWriteArrayList<>();//CopyOnWrite容器即写时复制的容器。通俗的理解是当我们往一个容器添加元素的时候，不直接往当前容器添加，而是先将当前容器进行Copy，复制出一个新的容器，然后新的容器里添加元素，添加完元素之后，再将原容器的引用指向新的容器。
    // 这样做的好处是我们可以对CopyOnWrite容器进行并发的读，而不需要加锁，因为当前容器不会添加任何元素。所以CopyOnWrite容器也是一种读写分离的思想，读和写不同的容器。
    @Override
    public void onCreate() {
        super.onCreate();
        //
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
