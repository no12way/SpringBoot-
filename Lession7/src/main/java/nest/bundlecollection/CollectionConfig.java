package nest.bundlecollection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties
public class CollectionConfig {
    private List<MyServer> myServers;
    private Map<String,User> userMap;
    private String[] names;

    public List<MyServer> getMyServers() {
        return myServers;
    }

    public void setMyServers(List<MyServer> myServers) {
        this.myServers = myServers;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "CollectionConfig{" +
                "myServers=" + myServers +
                ", userMap=" + userMap +
                ", names=" + Arrays.toString(names) +
                '}';
    }
}
