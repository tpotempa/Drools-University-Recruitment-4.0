package pl.edu.atar.universityrecruitment;

import java.util.ArrayList;
import java.util.List;

public class Dataset {

    public Dataset() {
    }

    public List<UniversityCandidate> getUniversityCandidates() {

        List<UniversityCandidate> uc = new ArrayList<UniversityCandidate>();

        uc.add(new UniversityCandidate(1L, "Anna", "Kowalewska", 120.0, null, "Informatyka", Boolean.TRUE, "Female"));
        uc.add(new UniversityCandidate(2L, "Jacek", "Nowak", 110.0, null, "Informatyka", Boolean.FALSE, "Male"));
        uc.add(new UniversityCandidate(3L, "Ewa", "Wiśniowa", 35.0, null, "Elektrotechnika", Boolean.FALSE, "Female"));
        uc.add(new UniversityCandidate(4L, "Karol", "Gruszka", 135.0, null, "Automatyka i robotyka", Boolean.TRUE, "Male"));
        uc.add(new UniversityCandidate(5L, "Kinga", "Poziomka", 45.0, null, "Elektrotechnika", Boolean.TRUE, "Female"));

        return uc;
    }
}