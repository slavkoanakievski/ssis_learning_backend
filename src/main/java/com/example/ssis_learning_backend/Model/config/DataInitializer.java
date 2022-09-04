package com.example.ssis_learning_backend.Model.config;

import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Repository.CourseRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;


@Component
public class DataInitializer {

    private final CourseRepository courseRepository;

    public DataInitializer(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    @PostConstruct
    public void initData()
    {
        this.courseRepository.save(new Course("Вовед во Microsoft SSIS", "Microsoft SSIS", "Почетник", "1h 50min", List.of("Запознавање со Microsoft SSIS и негова примена---20min", "Околина за работа и инсталирање на потребни алати--40min", "Креирање проект и изработка на едноставен Dataflow--50min")));
        this.courseRepository.save(new Course("Компоненти во SSIS", "Microsoft SSIS", "Почетник", "1h 30min",List.of("Запознавање со основните компоненти во SSIS--30min", "Data Flow компонента--20min", "Lookup компонента--40min")));
        this.courseRepository.save(new Course("Користење на променливи", "Microsoft SSIS", "Средно", "2h",List.of("Што се променливи и за што служат?--30min", "Типови на променливи--20min", "Користње на променливите--1h 100min")));
        this.courseRepository.save(new Course("Основни трансформации", "Microsoft SSIS", "Средно", "1h 30min",List.of("Кастирање на податочни типови--30min", "Трансформации на податоци и користење на Derived column компонентата--50min")));
        this.courseRepository.save(new Course("Основни трансформации", "Microsoft SSIS", "Средно", "1h 30min",List.of("Кастирање на податочни типови--30min", "Трансформации на податоци и користење на Derived column компонентата--50min")));

        this.courseRepository.save(new Course("Основни трансформации", "Microsoft SSIS", "Средно", "1h 30min",List.of("Кастирање на податочни типови--30min", "Трансформации на податоци и користење на Derived column компонентата--50min")));
    }
}
