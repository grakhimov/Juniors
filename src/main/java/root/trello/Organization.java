package root.trello;

import lombok.Getter;

@Getter
public class Organization {
    private String id;
    private String name;
    private String displayName;
    private String desc;
    private DescData descData;
    private String url;
    private String offering;
    private String idMemberCreator;

/*    {
        "id": "66278f860f6f3ad03ddaccf8",
        "name": "testname2694856728941",
        "displayName": "testName2694856728941",
        "desc": "",
        "descData": {
            "emoji": {

                }
            },
        "url": "https://trello.com/w/testname2694856728941",
        "offering": "trello.free",
        "idMemberCreator": "59bb9118dd12481784449c17"
    }*/
}
