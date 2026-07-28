// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeTableSchemaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CREATE TABLE test_tb
     * (
     *     k1 TINYINT,
     *     k2 DECIMAL(10, 2) DEFAULT &quot;10.05&quot;,
     *     k3 CHAR(10) COMMENT &quot;string column&quot;,
     *     k4 INT NOT NULL DEFAULT &quot;1&quot; COMMENT &quot;int column&quot;
     * )
     * COMMENT &quot;my first table&quot;
     * DISTRIBUTED BY HASH(k1) BUCKETS 16</p>
     */
    @NameInMap("CreateStatement")
    public String createStatement;

    /**
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test_tb</p>
     */
    @NameInMap("Table")
    public String table;

    public static DescribeTableSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableSchemaResponseBody self = new DescribeTableSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableSchemaResponseBody setCreateStatement(String createStatement) {
        this.createStatement = createStatement;
        return this;
    }
    public String getCreateStatement() {
        return this.createStatement;
    }

    public DescribeTableSchemaResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeTableSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableSchemaResponseBody setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
