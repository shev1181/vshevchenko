import org.junit.Test;
import ru.job4j.max.Max;

public class MaxTest{
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

}