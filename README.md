# StarCraft II API connector [![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

A fast Java connector/serializer for Blizzard's StraCraft 2 API 

All ladders, profiles and matches histories are serialized with [the fastest Java JSON parser](https://github.com/alibaba/fastjson).
This project also use the anti java verbosity [lombok project](https://projectlombok.org/)

## Get Started
Exemple of use :
```java
public class MyStarcraftStats {

    // get it at https://dev.battle.net/
    private static final String myAPIKey = "XXXXXXXXXXXXXXXX";
    
    // in the url of your SC2 profile page
    private static final Integer myStracraftId = new Integer(1524566);
    
    // your in game name
    private static final String myDisplayName = "soO";
    
    public static void main(String[] args) throws StarcraftException {
        
        // If I want to get the result of my last match:
        MatchHistory matchs = Connector.getMatchHistory(myAPIKey, 
                                                        Region.Europe,
                                                        Locale.en_GB,
                                                        myStracraftId,
                                                        myDisplayName).get();
        
        System.out.println(matchs.getMatches().get(0).getDecision());
    }

}
```

## Disclaimer

This is not a Blizzard Product.
Licensor provides the work (and each contributor provides its contributions) on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
For more information, see [Apache Licence v2](http://www.apache.org/licenses/LICENSE-2.0).

All data used by this software are owned by Blizzard Entertainment, Inc.