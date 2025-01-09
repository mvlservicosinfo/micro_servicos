package servico;

import org.springframework.stereotype.Service;

@Service
public class Servico {

    public <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public <T extends Comparable<T>> T min(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }


}
