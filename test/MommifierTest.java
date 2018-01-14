import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MommifierTest {

    @Test
    public void shouldReturnEmptyWhenInputIsEmpty() {
        Mommifier mommifier = new Mommifier();
        String result;
        result = mommifier.mommy("");
        assertThat(result, is(""));
    }

    @Test
    public void shoudReturnTrueWhenInputIsVowel(){
        Mommifier mommifier = new Mommifier();
        boolean result = mommifier.isVowel("a");
        assertThat(result, is(true));
    }

    @Test
    public void shouldReturnMommyWhenInputIsVowel() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.mommy("aba");
        assertThat(result, is("mommybmommy"));
    }

    @Test
    public void shouldReturnOneMommyWhenInputIsContinuousVowel(){
        Mommifier mommifier=new Mommifier();
        String result=mommifier.mommy("aabbeeecc");
        assertThat(result,is("mommyabbmommyeecc"));
    }
}
