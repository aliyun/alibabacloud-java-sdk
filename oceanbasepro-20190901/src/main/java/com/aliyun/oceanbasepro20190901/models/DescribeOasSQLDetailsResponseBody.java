// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLDetailsResponseBody extends TeaModel {
    /**
     * <p>The list of the SQL execution plan.</p>
     */
    @NameInMap("Data")
    public DescribeOasSQLDetailsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOasSQLDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLDetailsResponseBody self = new DescribeOasSQLDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLDetailsResponseBody setData(DescribeOasSQLDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOasSQLDetailsResponseBodyData getData() {
        return this.data;
    }

    public DescribeOasSQLDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOasSQLDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>SQL text.</p>
         * 
         * <strong>example:</strong>
         * <p>select a from b</p>
         */
        @NameInMap("Fulltext")
        public String fulltext;

        /**
         * <p>Parameterized text.</p>
         * 
         * <strong>example:</strong>
         * <p>select a from b</p>
         */
        @NameInMap("Statement")
        public String statement;

        /**
         * <p>The table name related to the SQL.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeOasSQLDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOasSQLDetailsResponseBodyData self = new DescribeOasSQLDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOasSQLDetailsResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOasSQLDetailsResponseBodyData setFulltext(String fulltext) {
            this.fulltext = fulltext;
            return this;
        }
        public String getFulltext() {
            return this.fulltext;
        }

        public DescribeOasSQLDetailsResponseBodyData setStatement(String statement) {
            this.statement = statement;
            return this;
        }
        public String getStatement() {
            return this.statement;
        }

        public DescribeOasSQLDetailsResponseBodyData setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public DescribeOasSQLDetailsResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
