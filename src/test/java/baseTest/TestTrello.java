package baseTest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import root.trello.User;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestTrello extends BaseTrelloTest {
    @Test
    public void getUserTest() {
        final String userId = "59bb9118dd12481784449c17";
        final String email = "example@gmail.com";
        User user = getUser();
        assertThat(user.getEmail(), Matchers.equalTo(email));
        assertThat(user.getId(), Matchers.equalTo(userId));

        //someMethod(user);
    }

    @Test
    public void nonExistingTest() {

    }
}
