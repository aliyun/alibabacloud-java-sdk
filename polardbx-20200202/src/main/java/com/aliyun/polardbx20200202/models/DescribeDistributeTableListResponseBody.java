// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDistributeTableListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDistributeTableListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDistributeTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributeTableListResponseBody self = new DescribeDistributeTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDistributeTableListResponseBody setData(DescribeDistributeTableListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDistributeTableListResponseBodyData getData() {
        return this.data;
    }

    public DescribeDistributeTableListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDistributeTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDistributeTableListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDistributeTableListResponseBodyDataTables extends TeaModel {
        @NameInMap("DbKey")
        public String dbKey;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableType")
        public String tableType;

        @NameInMap("TbKey")
        public String tbKey;

        public static DescribeDistributeTableListResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistributeTableListResponseBodyDataTables self = new DescribeDistributeTableListResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public DescribeDistributeTableListResponseBodyDataTables setDbKey(String dbKey) {
            this.dbKey = dbKey;
            return this;
        }
        public String getDbKey() {
            return this.dbKey;
        }

        public DescribeDistributeTableListResponseBodyDataTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDistributeTableListResponseBodyDataTables setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public DescribeDistributeTableListResponseBodyDataTables setTbKey(String tbKey) {
            this.tbKey = tbKey;
            return this;
        }
        public String getTbKey() {
            return this.tbKey;
        }

    }

    public static class DescribeDistributeTableListResponseBodyData extends TeaModel {
        @NameInMap("Tables")
        public java.util.List<DescribeDistributeTableListResponseBodyDataTables> tables;

        public static DescribeDistributeTableListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistributeTableListResponseBodyData self = new DescribeDistributeTableListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDistributeTableListResponseBodyData setTables(java.util.List<DescribeDistributeTableListResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeDistributeTableListResponseBodyDataTables> getTables() {
            return this.tables;
        }

    }

}
