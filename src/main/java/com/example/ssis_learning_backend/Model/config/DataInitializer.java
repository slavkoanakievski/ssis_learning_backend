package com.example.ssis_learning_backend.Model.config;

import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Model.entities.QuestionForum;
import com.example.ssis_learning_backend.Model.entities.Quiz;
import com.example.ssis_learning_backend.Repository.CourseRepository;
import com.example.ssis_learning_backend.Repository.QuestionForumRepository;
import com.example.ssis_learning_backend.Repository.QuizRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;


@Component
public class DataInitializer {

    private final CourseRepository courseRepository;
    private final QuizRepository quizRepository;
    private final QuestionForumRepository questionForumRepository;

    public DataInitializer(CourseRepository courseRepository, QuizRepository quizRepository, QuestionForumRepository questionForumRepository) {
        this.courseRepository = courseRepository;
        this.quizRepository = quizRepository;
        this.questionForumRepository = questionForumRepository;
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
        this.courseRepository.save(new Course("Вовед во Microsoft SSIS", "Microsoft SSIS", "Почетник", "1h 50min", LocalDateTime.now(), "Во овој дел ќе се запознаете со предностите на Microsoft SSIS алатката, нејзината примена и основни чекори за почеток со SSIS.", "4.5", 90, List.of("Запознавање со Microsoft SSIS и негова примена--20min", "Околина за работа и инсталирање на потребни алати--40min", "Креирање проект и изработка на едноставен Dataflow--50min")));
        this.courseRepository.save(new Course("Компоненти во SSIS", "Microsoft SSIS", "Почетник", "1h 30min", LocalDateTime.now(), "Компонентите во SSIS се клучниот дел за работа во оваа алатка. Овој дел ги обработува поголем дел од компонентите и во детали се учат најважните компоненти како Dataflow, LookUp, Derived Column и Conditional Split.", "4.2", 120,List.of("Запознавање со основните компоненти во SSIS--30min", "Data Flow компонента--20min", "Lookup компонента--40min")));
        this.courseRepository.save(new Course("Користење на променливи", "Microsoft SSIS", "Почетник", "2h", LocalDateTime.now(), "Во овој курс, ќе покажеме како да користите променливи во вашиот SSIS пакет. Променливите се исклучително важни и широко се користат во пакетот SSIS. Променлива е именуван објект кој складира една или повеќе вредности.", "3.9", 100,List.of("Што се променливи и за што служат?--30min", "Типови на променливи--20min", "Користење на променливите--1h 10min")));
        this.courseRepository.save(new Course("Основни трансформации", "Microsoft SSIS", "Средно", "1h 30min",LocalDateTime.now(), "SQL Server Integration Services (SSIS) има трансформации, кои се клучни компоненти на протокот на податоци, кои ги трансформираат податоците во посакуваниот формат додека податоците се движат од еден чекор во друг чекор. Трансформацијата во SSIS се врши во меморијата, по додавањето трансформација податоците се менуваат и се пренесуваат по патеката во протокот на податоци.", "4.9", 180,List.of("Кастирање на податочни типови--30min", "Трансформации на податоци и користење на Derived column компонентата--50min")));
        this.courseRepository.save(new Course("Conditional split", "Microsoft SSIS", "Средно", "2h", LocalDateTime.now(), "Применуваме различни логики на податоците во табелите на SQL Server за да ги исполниме барањата на крајните корисници.\n" +
                "SSIS секогаш доаѓа при рака во такви ситуации и ни обезбедува решение со минимална сложеност.  Можеме да го користиме и за да подготвиме излез во различни формати без да пишуваме сложени програмски кодови.", "3.4", 55,List.of("Conditional split дел 1--1h", "Conditional split дел 2--1h")));
        this.courseRepository.save(new Course("Креирање целосен ETL процес", "Microsoft SSIS", "Експерт", "5h",LocalDateTime.now(), "ETL, што значи извлекување, трансформација и вчитување, е процес на интеграција на податоци кој комбинира податоци од повеќе извори на податоци во единствена, конзистентна продавница на податоци што се вчитува во складиште на податоци или друг целен систем.", "5", 200,List.of("Што е ETL?--1h", "Традиционален ETL процес--1h", "Data Warehouse ETL процес--3h")));



        this.quizRepository.save(new Quiz("Квиз за основи на Microsoft SSIS", "Почетник", LocalDateTime.now(), "20 минути", "A112345", "Microsoft SSIS", "Овој квиз ги опфаќа основните концепти на алатката Microsoft SSIS. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));
        this.quizRepository.save(new Quiz("Квиз за компоненти во Microsoft SSIS", "Почетник", LocalDateTime.now(), "25 минути", "B113255", "Microsoft SSIS", "Овој квиз ги опфаќа основите за компоненти во SSIS. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));
        this.quizRepository.save(new Quiz("Квиз за променливи во Microsoft SSIS", "Средно", LocalDateTime.now(), "20 минути", "B864821", "Microsoft SSIS", "Овој квиз ги опфаќа основите за променливи во SSIS. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));
        this.quizRepository.save(new Quiz("Квиз за основни трансформации", "Средно", LocalDateTime.now(), "30 минути", "A321821", "Microsoft SSIS", "Овој квиз ги опфаќа основите за променливи во SSIS. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));
        this.quizRepository.save(new Quiz("Квиз за компонентата Conditional split", "Експерт", LocalDateTime.now(), "25 минути", "A992311", "Microsoft SSIS", "Овој квиз го опфаќа материјалот за компонентата Conditional Split. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));
        this.quizRepository.save(new Quiz("Квиз за Еxtract,Transform, Load целосен процес", "Експерт", LocalDateTime.now(), "40 минути", "A992311", "Microsoft SSIS", "Овој квиз го опфаќа целосниот процес за ETL. За да го полагате квизот потребно е да ги имате поминато првите три лекции за Microsoft SSIS.", "Квизот е составен од прашања на заокружување, во одговорите можно е да има и повеќе точни одговори или само еден точен одговор"));


        this.questionForumRepository.save(new QuestionForum("Како може да се креира проект за да почнеме со работа?", LocalDateTime.now(), List.of("File->New Project->New Integration services Project. На овој начин ќе креираш проект--Можеш и преку command line, но така е покомплицирано.") ));
        this.questionForumRepository.save(new QuestionForum("Која компонента да ја искористам за да спојам две табели?", LocalDateTime.now(), List.of("За ова се користи компонентта LookUp. Работи идентично како join во SQL.") ));
        this.questionForumRepository.save(new QuestionForum("Следниов линк има многу корисни материјали за ETL процес. Погледнете го: https://www.stitchdata.com/etldatabase/etl-process/", LocalDateTime.now(), Collections.emptyList()));

    }
}
