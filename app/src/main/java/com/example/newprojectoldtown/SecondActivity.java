package com.example.newprojectoldtown;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;

public class SecondActivity extends AppCompatActivity {
// 1 кнопка
private MapView mapview;
private MapObjectCollection mapObjects;
// Метки
private final Point museum = new Point(59.223950,39.884906);
private final Point kremlin = new Point(59.224024, 39.883197);
private final Point naumov = new Point(59.220559, 39.882638);
private final Point krasilnokov = new Point(59.220674, 39.882444);
private final Point butirina = new Point(59.220728, 39.882053);
private final Point korolev = new Point(59.220728, 39.882053);
private final Point krilov = new Point(59.221882, 39.876993);
private final Point puzanpuzyrevsky = new Point(59.213233, 39.892397);
private final Point sitnikov = new Point(59.212288, 39.892926);
private final Point levashov = new Point(59.212835, 39.893120);
private final Point houseG38 = new Point(59.212123, 39.893274);
private final Point houseZ7A = new Point(59.220252, 39.901512);
private final Point davidov = new Point(59.225488, 39.877635);
private final Point zasetskie = new Point(59.223936, 39.876368);
private final Point volkov = new Point(59.221740, 39.871760);
private final Point drujinin = new Point(59.221017, 39.878677);
private final Point drujininslyjba = new Point(59.220740, 39.878668);
private final Point popov = new Point(59.226920, 39.874392);
private final Point karaulov = new Point(59.226257, 39.875407);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // берём API ключ нашей карты из кабинета разработчика(API Key — это строка символов, которую передает клиент в запросах к серверу. )
        MapKitFactory.setApiKey("c7455a3a-b649-4cf1-9b53-37f414de5d3c");
        MapKitFactory.initialize(this);

        // Укажите имя activity вместо map(где располагается карта)
        setContentView(R.layout.activity_secod);
        // находим карты по ID
        mapview = (MapView)findViewById(R.id.mapview);
        mapview.getMap().move(
                new CameraPosition(new Point(59.2239, 39.88398), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
        mapObjects = mapview.getMap().getMapObjects().addCollection();
        // PlacemarkMapObject mark = new map
        createMapObjects(); // ВЫЗОВ ЭТОГО МЕТОДА
    }
    private void createMapObjects(){  // функция по созданию метки
        // Музей кружева
        PlacemarkMapObject mark = mapObjects.addPlacemark(museum); // расположение точки
        mark.setOpacity(0.5f); // прозрасчность элемента
        mark.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("MUSEUM"))); // текст на иконке
        mark.setDraggable(true);
        // Вологодский Кремль
        PlacemarkMapObject mark1 = mapObjects.addPlacemark(kremlin);
        mark1.setOpacity(0.5f);
        mark1.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("kremlin")));
        mark1.setDraggable(true);
        // Дом Наумова
        PlacemarkMapObject mark2 = mapObjects.addPlacemark(naumov);
        mark2.setOpacity(0.5f);
        mark2.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("NAUMOV")));
        mark2.setDraggable(true);
        // Усадьба Красильникова
        PlacemarkMapObject mark3 = mapObjects.addPlacemark(krasilnokov);
        mark3.setOpacity(0.5f);
        mark3.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("KRASILNIKOV")));
        mark3.setDraggable(true);
        //  Дом Бутыриной
        PlacemarkMapObject mark4 = mapObjects.addPlacemark(butirina);
        mark4.setOpacity(0.5f);
        mark4.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Бутырина")));
        mark4.setDraggable(true);
        // Дом Королёва
        PlacemarkMapObject mark5 = mapObjects.addPlacemark(korolev);
        mark5.setOpacity(0.5f);
        mark5.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Королёв")));
        mark5.setDraggable(true);
        //  Дом Крылова
        PlacemarkMapObject mark6 = mapObjects.addPlacemark(krilov);
        mark6.setOpacity(0.5f);
        mark6.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Крылов")));
        mark6.setDraggable(true);
        // Дом Пузан-Пузыревского
        PlacemarkMapObject mark7 = mapObjects.addPlacemark(puzanpuzyrevsky);
        mark7.setOpacity(0.5f);
        mark7.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap(" Пузан-Пузыревский")));
        mark7.setDraggable(true);
        //Дом Ситникова
        PlacemarkMapObject mark8 = mapObjects.addPlacemark(sitnikov);
        mark8.setOpacity(0.5f);
        mark8.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Ситников")));
        mark8.setDraggable(true);
        // Дом Левашова
        PlacemarkMapObject mark9 = mapObjects.addPlacemark(levashov);
        mark9.setOpacity(0.5f);
        mark9.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Левашов")));
        mark9.setDraggable(true);
        // Дом жилой (дер.), XIX в. Герцена 38
        PlacemarkMapObject mark10 = mapObjects.addPlacemark(houseG38);
        mark10.setOpacity(0.5f);
        mark10.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Дом")));
        mark10.setDraggable(true);
        // Дом жилой Зосимовская улица, 7А
        PlacemarkMapObject mark11 = mapObjects.addPlacemark(houseZ7A);
        mark11.setOpacity(0.5f);
        mark11.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Дом1")));
        mark11.setDraggable(true);
        // Дом Давыдова
        PlacemarkMapObject mark12 = mapObjects.addPlacemark(davidov);
        mark12.setOpacity(0.5f);
        mark12.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Давыдова")));
        mark12.setDraggable(true);
        // Дом Засецких
        PlacemarkMapObject mark13 = mapObjects.addPlacemark(zasetskie);
        mark13.setOpacity(0.5f);
        mark13.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Засецкие")));
        mark13.setDraggable(true);
        // Усадьба Волкова
        PlacemarkMapObject mark14 = mapObjects.addPlacemark(volkov);
        mark14.setOpacity(0.5f);
        mark14.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Волков")));
        mark14.setDraggable(true);
        // Усадьба Дружинина
        PlacemarkMapObject mark15 = mapObjects.addPlacemark(drujinin);
        mark15.setOpacity(0.5f);
        mark15.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Дружинин")));
        mark15.setDraggable(true);
        // Дружинин Служба
        PlacemarkMapObject mark16 = mapObjects.addPlacemark(drujininslyjba);
        mark16.setOpacity(0.5f);
        mark16.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Дружинин служба")));
        mark16.setDraggable(true);
        // Дом Купца Попова
        PlacemarkMapObject mark17 = mapObjects.addPlacemark(popov);
        mark17.setOpacity(0.5f);
        mark17.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Попов")));
        mark17.setDraggable(true);
        // Дом Караулова
        PlacemarkMapObject mark18 = mapObjects.addPlacemark(karaulov);
        mark18.setOpacity(0.5f);
        mark18.setIcon(ImageProvider.fromBitmap(drawSimpleBitmap("Караулов")));
        mark18.setDraggable(true);

    }

    // Передаём события onStart и onStop в MapKitFactory и mapView, если этого несделать MapKit не сможет отобразить карту и остановить обработку карты, когда Activity с картой становится невидимым для пользователя:
    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();
    }

    public Bitmap drawSimpleBitmap(String number) {
        int picSize = 50; // переменная с размером картинки
        Bitmap bitmap = Bitmap.createBitmap(picSize, picSize, Bitmap.Config.ARGB_8888); // для работы с растровыми иображениями
        Canvas canvas = new Canvas(bitmap); //  (Холст) предоставляет методы для рисования
        // отрисовка плейсмарка
        Paint paint = new Paint(); //СОЗДАНИЕ ОБЪЕКТА КЛАССА PAINT ДЛЯ РИСОВАНИЯ
        paint.setColor(Color.GREEN); // цвет кружка
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(picSize / 2, picSize / 2, picSize / 2, paint); // рисует круг
        // отрисовка текста
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setTextSize(30);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(number, picSize / 2,
                picSize / 2 - ((paint.descent() + paint.ascent()) / 2), paint);
        return bitmap;
    }

}