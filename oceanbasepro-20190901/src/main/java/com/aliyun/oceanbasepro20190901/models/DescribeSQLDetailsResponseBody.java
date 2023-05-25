// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLDetailsResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **DescribeSQLDetails**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=DescribeSQLDetails</p>
     * <p>&TenantId=t2mr3oae0****</p>
     * <p>&SQLId=8D6E84****0B8FB1823D199E2CA1****</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("SQLDetails")
    public java.util.List<DescribeSQLDetailsResponseBodySQLDetails> SQLDetails;

    public static DescribeSQLDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLDetailsResponseBody self = new DescribeSQLDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLDetailsResponseBody setSQLDetails(java.util.List<DescribeSQLDetailsResponseBodySQLDetails> SQLDetails) {
        this.SQLDetails = SQLDetails;
        return this;
    }
    public java.util.List<DescribeSQLDetailsResponseBodySQLDetails> getSQLDetails() {
        return this.SQLDetails;
    }

    public static class DescribeSQLDetailsResponseBodySQLDetails extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>{"name":"DescribeSQLDetails","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"POST|GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeSQLDetails\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\"},{\"name\":\"SQLDetails\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"description\":\"  \",\"children\":[{\"name\":\"SQLText\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC\"},{\"name\":\"DbName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"UserName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"tester\"}],\"title\":\"\"}],\"title\":\"\",\"description\":\"\"}","errors":"{}"}</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        @NameInMap("UserName")
        public String userName;

        public static DescribeSQLDetailsResponseBodySQLDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLDetailsResponseBodySQLDetails self = new DescribeSQLDetailsResponseBodySQLDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSQLDetailsResponseBodySQLDetails setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSQLDetailsResponseBodySQLDetails setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLDetailsResponseBodySQLDetails setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
