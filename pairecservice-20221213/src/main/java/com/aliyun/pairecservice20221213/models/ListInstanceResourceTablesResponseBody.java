// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceTablesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public java.util.List<ListInstanceResourceTablesResponseBodyTables> tables;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListInstanceResourceTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceTablesResponseBody self = new ListInstanceResourceTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResourceTablesResponseBody setTables(java.util.List<ListInstanceResourceTablesResponseBodyTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<ListInstanceResourceTablesResponseBodyTables> getTables() {
        return this.tables;
    }

    public ListInstanceResourceTablesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResourceTablesResponseBodyTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table-1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListInstanceResourceTablesResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResourceTablesResponseBodyTables self = new ListInstanceResourceTablesResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public ListInstanceResourceTablesResponseBodyTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
