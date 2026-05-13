// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2363CEDF-C697-14B6-AB9E-C57A4AA0EAD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public DescribeTairSkvDdbTableResponseBodyTables tables;

    public static DescribeTairSkvDdbTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairSkvDdbTableResponseBody self = new DescribeTairSkvDdbTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairSkvDdbTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairSkvDdbTableResponseBody setTables(DescribeTairSkvDdbTableResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeTairSkvDdbTableResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeTairSkvDdbTableResponseBodyTablesTable extends TeaModel {
        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Connections")
        public Long connections;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        public static DescribeTairSkvDdbTableResponseBodyTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairSkvDdbTableResponseBodyTablesTable self = new DescribeTairSkvDdbTableResponseBodyTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTable setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTable setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTable setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeTairSkvDdbTableResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTable> table;

        public static DescribeTairSkvDdbTableResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairSkvDdbTableResponseBodyTables self = new DescribeTairSkvDdbTableResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeTairSkvDdbTableResponseBodyTables setTable(java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTable> getTable() {
            return this.table;
        }

    }

}
