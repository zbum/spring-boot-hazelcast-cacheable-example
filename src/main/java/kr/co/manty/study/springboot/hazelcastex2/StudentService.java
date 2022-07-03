package kr.co.manty.study.springboot.hazelcastex2;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class StudentService {
    @Cacheable("students")
    public List<Student> getAllStudents() {
        try {
            Thread.sleep(10_000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return List.of(new Student(1L, "Manty"));
    }
}
