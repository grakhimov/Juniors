package baseTest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import root.trello.Board;
import root.trello.Organization;
import root.trello.User;

import java.util.HashMap;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestTrello extends BaseTrelloTest {
    @Test
    public void baseScenario() {
        final String userId = "59bb9118dd12481784449c17";
        final String email = "example@gmail.com";
        User user = getUser();
        assertThat(user.getEmail(), Matchers.equalTo(email));
        assertThat(user.getId(), Matchers.equalTo(userId));
    }

    @Test
    public void postBoardsTest() {
        final String boardName = "testBoardName" + new Random().nextInt(1000000);
        Board board = postBoard(boardName, organization.getId());
        assertThat(board.getName(), Matchers.equalTo(boardName));
    }

    @Test
    public void getOrganizationTest() {
        Organization org = getOrganization(organization.getId());
        assertThat(org.getName(), Matchers.equalTo(org.getName()));
    }

    @Test
    public void putOrganizationTest() {
        final String newDisplayName = organization.getDisplayName() + "_upd";
        HashMap<String, String> map = new HashMap();
        map.put("displayName", newDisplayName);
        Organization org = putOrganization(organization.getId(), map);
        assertThat(org.getDisplayName(), Matchers.equalTo(newDisplayName));
    }
}
