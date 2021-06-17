package fit.arseny.ta.repo;

import fit.arseny.ta.models.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Long> {
}