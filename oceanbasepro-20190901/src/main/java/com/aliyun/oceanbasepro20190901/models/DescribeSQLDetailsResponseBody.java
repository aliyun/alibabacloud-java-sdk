// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLDetailsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // SQL详情
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
        // 数据库名
        @NameInMap("DbName")
        public String dbName;

        // SQL文本
        @NameInMap("SQLText")
        public String SQLText;

        // 用户名
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
