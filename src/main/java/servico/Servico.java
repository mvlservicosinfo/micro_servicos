package servico;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Servico {

    @Bean
    public <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }
    @Bean
    public <T extends Comparable<T>> T min(T x, T y) {
        return x.compareTo(y) < 0 ? x : y;
    }
}
