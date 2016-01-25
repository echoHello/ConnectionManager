/**
 * Created by Taylor on 1/23/16.
 */
public class ConnectionManager {
    private Connection connection = new Connection(001, 002);

    public Connection displayConnection() {
        return connection;
    }

    public void addConnection(Connection newConnection) {
        connection = newConnection;
    }

    public void deleteConnection(){
        connection = null;
    }

    public class Connection {
        private int ipAddress; // need a constructor to pass in this value
        private int portNumber;

        private Connection(int ipAddress, int portNumber) { //client programmer has access to variables but cannot create obj
            this.ipAddress = ipAddress;
            this.portNumber = portNumber;
        }

        public int getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(int newIpAddress){
            this.ipAddress = newIpAddress;
        }

        public int getPortNumber(){
            return portNumber;
        }

        public void setPortNumber(int newPortNumber){
            this.portNumber = newPortNumber;
        }
    }
}
