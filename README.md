# Cross View

[![Release](https://img.shields.io/github/release/cdflynn/crossview.svg?label=JitPack)](https://jitpack.io/#cdflynn/crossview)


![Sample App](https://github.com/cdflynn/crossview/blob/master/sample/images/cross_btn_2.gif?raw=true)

![Action Bar](https://github.com/cdflynn/crossview/blob/master/sample/images/cross_btn.gif?raw=true)

Add a CrossView to your layout
```
    <cdflynn.android.library.crossview.CrossView
        android:id="@+id/sample_cross_view"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:padding="14dp"
        android:background="@drawable/cross_view_selector"
        app:lineColor="@android:color/black"/>
```

Note that you can define the color with `lineColor`

toggle in code:
```
    private final View.OnClickListener mCrossViewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mCrossView.toggle();
        }
    };
```

You can also set a state directly:
```
mCrossView.plus();
```
```
mCrossView.cross();
```

Optionally supply an animation duration in milliseconds

```
mCrossView.cross(0l);
```

```
mCrossView.toggle(150l);
```

```
mCrossView.plus(200l);
```

## Install

You can install using gradle:

```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.cdflynn:crossview:v1.0.1'
}
```
