package com.yang.ecommerce.component;

import com.yang.ecommerce.model.Category;
import com.yang.ecommerce.repository.CategoryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Watchable;

@Component
public class CategoryDataInitializer {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryDataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostConstruct
    public void init() {
        if (categoryRepository.count() == 0) {
            Category TV = new Category();
            TV.setName("TV");
            TV.setTopCategory(true);
            TV.setImagePath("/images/samsung.jpg");
            TV.setImageFilename("samsung.jpg");
            categoryRepository.save(TV);



            Category iphone = new Category();
            iphone.setName("iPhone");
            iphone.setTopCategory(true);
            iphone.setImagePath("/images/iphone.jpg");
            iphone.setImageFilename("iphone.jpg");
            categoryRepository.save(iphone);


            Category samsung = new Category();
            samsung.setName("Samsung Galaxy");
            samsung.setImagePath("/images/samsungPhone.jpg");
            samsung.setImageFilename("samsungPhone.jpg");
            categoryRepository.save(samsung);

            Category google = new Category();
            google.setName("Google");
            google.setImagePath("/images/googlePhone.jpg");
            google.setImageFilename("googlePhone.jpg");
            categoryRepository.save(google);

            Category prepaidPhone = new Category();
            prepaidPhone.setName("Prepaid Phones");
            prepaidPhone.setImagePath("/images/prepaid.jpg");
            prepaidPhone.setImageFilename("prepaid.jpg");
            categoryRepository.save(prepaidPhone);

            Category headphones = new Category();
            headphones.setName("Headphones");
            headphones.setTopCategory(true);
            headphones.setImagePath("/images/headphone.jpg");
            headphones.setImageFilename("headphone.jpg");
            categoryRepository.save(headphones);


            Category speakers = new Category();
            speakers.setName("Speakers");
            speakers.setImagePath("/images/homeSpeaker.jpg");
            speakers.setImageFilename("homeSpeaker.jpg");
            categoryRepository.save(speakers);

            Category bluetoothSpeakers = new Category();
            bluetoothSpeakers.setName("Bluetooth Speakers");
            bluetoothSpeakers.setImagePath("/images/speaker.jpg");
            bluetoothSpeakers.setImageFilename("speaker.jpg");
            categoryRepository.save(bluetoothSpeakers);

            Category laptops = new Category();
            laptops.setName("Laptops");
            laptops.setTopCategory(true);
            laptops.setImagePath("/images/laptop.jpg");
            laptops.setImageFilename("laptop.jpg");
            categoryRepository.save(laptops);


            Category desktops = new Category();
            desktops.setName("Desktops");
            desktops.setImagePath("/images/desktop.jpg");
            desktops.setImageFilename("desktop.jpg");
            categoryRepository.save(desktops);

            Category tablets = new Category();
            tablets.setName("Tablets");
            tablets.setImagePath("/images/tablet.jpg");
            tablets.setImageFilename("tablet.jpg");
            categoryRepository.save(tablets);

            Category xbox = new Category();
            xbox.setName("Xbox Series");
            xbox.setImagePath("/images/xbox.jpg");
            xbox.setImageFilename("xbox.jpg");
            categoryRepository.save(xbox);

            Category playstation = new Category();
            playstation.setName("PlayStation");
            playstation.setTopCategory(true);
            playstation.setImagePath("/images/ps.jpg");
            playstation.setImageFilename("ps.jpg");
            categoryRepository.save(playstation);


            Category nintendoSwitch = new Category();
            nintendoSwitch.setName("Nintendo Switch");
            nintendoSwitch.setImagePath("/images/nintendo.jpg");
            nintendoSwitch.setImageFilename("nintendo.jpg");
            categoryRepository.save(nintendoSwitch);

            Category VR = new Category();
            VR.setName("Virtual Reality");
            VR.setImagePath("/images/vr.jpg");
            VR.setImageFilename("vr.jpg");
            categoryRepository.save(VR);

            Category gamingAccessories = new Category();
            gamingAccessories.setName("Gaming Accessories");
            gamingAccessories.setImagePath("/images/acc.jpg");
            gamingAccessories.setImageFilename("acc.jpg");
            categoryRepository.save(gamingAccessories);

            Category cameras = new Category();
            cameras.setName("Cameras");
            cameras.setImagePath("/images/camera.jpg");
            cameras.setImageFilename("camera.jpg");
            categoryRepository.save(cameras);

            Category drones = new Category();
            drones.setName("Drones");
            drones.setImagePath("/images/drone.jpg");
            drones.setImageFilename("drone.jpg");
            categoryRepository.save(drones);

            Category carStereo = new Category();
            carStereo.setName("Car Stereo Receivers");
            carStereo.setImagePath("/images/stereo.jpg");
            carStereo.setImageFilename("stereo.jpg");
            categoryRepository.save(carStereo);

            Category carSpeaker = new Category();
            carSpeaker.setName("Car Speakers");
            carSpeaker.setImagePath("/images/carSpeaker.jpg");
            carSpeaker.setImageFilename("carSpeaker.jpg");
            categoryRepository.save(carSpeaker);

            Category gps = new Category();
            gps.setName("GPS Navigation");
            gps.setImagePath("/images/gps.jpg");
            gps.setImageFilename("gps.jpg");
            categoryRepository.save(gps);

            Category dashCam = new Category();
            dashCam.setName("Dash Cameras");
            dashCam.setImagePath("/images/dashcam.jpg");
            dashCam.setImageFilename("dashcam.jpg");
            categoryRepository.save(dashCam);

            Category appleWatch = new Category();
            appleWatch.setName("Apple Watch");
            appleWatch.setImagePath("/images/appleWatch.jpg");
            appleWatch.setImageFilename("appleWatch.jpg");
            categoryRepository.save(appleWatch);

            Category samsungWatch = new Category();
            samsungWatch.setName("Samsung Galaxy Watch");
            samsungWatch.setImagePath("/images/samWatch.jpg");
            samsungWatch.setImageFilename("samWatch.jpg");
            categoryRepository.save(samsungWatch);

            Category fitnessTracker = new Category();
            fitnessTracker.setName("Fitness Tracker");
            fitnessTracker.setImagePath("/images/fitbit.jpg");
            fitnessTracker.setImageFilename("fitbit.jpg");
            categoryRepository.save(fitnessTracker);

        }
    }
}
