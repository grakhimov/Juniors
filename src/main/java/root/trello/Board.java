package root.trello;

import lombok.Getter;

import java.util.List;

@Getter
public class Board {
    private String id;
    private String name;
    private String desc;
    private DescData descData;
    private boolean closed;
    private String idOrganization;
    private String url;
    private String shortUrl;
    private Prefs prefs;

    @Getter
    class Prefs {
        private String permissionLevel;
        private boolean hideVotes;
        private List<SwitcherView> switcherViews;

        @Getter
        class SwitcherView {
            private String viewType;
            private boolean enabled;
        }
    }
//    {
//            "id": "662792f5e61db28fd8b8dd06",
//            "name": "testBoardName154382",
//            "desc": "",
//            "descData": null,
//            "closed": false,
//            "idOrganization": "662792f57af3e55e24e855cf",
//            "url": "https://trello.com/b/aKG6bo1h/testboardname154382",
//            "shortUrl": "https://trello.com/b/aKG6bo1h",
//            "prefs": {
//                  "permissionLevel": "private",
//                  "hideVotes": false,
//                  "switcherViews": [
//                      {
//                          "viewType": "Board",
//                          "enabled": true
//                      }
//                  ]
//
//            }
//    }

}
