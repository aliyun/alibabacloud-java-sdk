// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
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

    public static class DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tt-gsi-xxxxxxxxx</p>
         */
        @NameInMap("GsiId")
        public String gsiId;

        /**
         * <strong>example:</strong>
         * <p>indexKey1</p>
         */
        @NameInMap("IndexName")
        public String indexName;

        public static DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex self = new DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex();
            return TeaModel.build(map, self);
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex setGsiId(String gsiId) {
            this.gsiId = gsiId;
            return this;
        }
        public String getGsiId() {
            return this.gsiId;
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

    }

    public static class DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList extends TeaModel {
        @NameInMap("GlobalSecondaryIndex")
        public java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex> globalSecondaryIndex;

        public static DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList self = new DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList();
            return TeaModel.build(map, self);
        }

        public DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList setGlobalSecondaryIndex(java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex> globalSecondaryIndex) {
            this.globalSecondaryIndex = globalSecondaryIndex;
            return this;
        }
        public java.util.List<DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexListGlobalSecondaryIndex> getGlobalSecondaryIndex() {
            return this.globalSecondaryIndex;
        }

    }

    public static class DescribeTairSkvDdbTableResponseBodyTablesTable extends TeaModel {
        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Connections")
        public Long connections;

        @NameInMap("GlobalSecondaryIndexList")
        public DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList globalSecondaryIndexList;

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

        public DescribeTairSkvDdbTableResponseBodyTablesTable setGlobalSecondaryIndexList(DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList globalSecondaryIndexList) {
            this.globalSecondaryIndexList = globalSecondaryIndexList;
            return this;
        }
        public DescribeTairSkvDdbTableResponseBodyTablesTableGlobalSecondaryIndexList getGlobalSecondaryIndexList() {
            return this.globalSecondaryIndexList;
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
