# ColorImageView
Easily color an Android ImageView before Android 5.0 
(The library will use the standard Tint method after 5.0)

## Installation

ColorImageView is available via jitpack

Project Gradle:
```project gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Gradle Module :
```module gradle
compile 'com.github.zail:ColorImageView:0.0.1'
```

## How it works

It just take the imageColor attribut from the ColoredImageView and apply a setColorFilter(attributeColor, PorterDuff.Mode.SRC_ATOP) on the ImageView.

## How to use

Exemple :
```module gradle
...
xmlns:app="http://schemas.android.com/apk/res-auto"
...


<itelios.com.colorimageview.ColoredImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/favoris"
        app:imageColor="@color/colorPrimary" />
```
   




