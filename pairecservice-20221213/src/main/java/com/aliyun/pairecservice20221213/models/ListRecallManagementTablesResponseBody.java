// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementTablesResponseBody extends TeaModel {
    /**
     * <p>This parameter is not in effect.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is not in effect.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of recall management tables.</p>
     */
    @NameInMap("RecallManagementTables")
    public java.util.List<ListRecallManagementTablesResponseBodyRecallManagementTables> recallManagementTables;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRecallManagementTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementTablesResponseBody self = new ListRecallManagementTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementTablesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecallManagementTablesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecallManagementTablesResponseBody setRecallManagementTables(java.util.List<ListRecallManagementTablesResponseBodyRecallManagementTables> recallManagementTables) {
        this.recallManagementTables = recallManagementTables;
        return this;
    }
    public java.util.List<ListRecallManagementTablesResponseBodyRecallManagementTables> getRecallManagementTables() {
        return this.recallManagementTables;
    }

    public ListRecallManagementTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecallManagementTablesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecallManagementTablesResponseBodyRecallManagementTables extends TeaModel {
        /**
         * <p>Indicates whether the table can be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanDelete")
        public Boolean canDelete;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Api</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The table description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time. The value is in ISO 8601 format and includes a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The update time. The value is in ISO 8601 format and includes a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The effective period of the index. The value is in ISO 8601 format and includes a time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("IndexEffectiveTime")
        public String indexEffectiveTime;

        /**
         * <p>The index version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20250701</p>
         */
        @NameInMap("IndexVersionId")
        public String indexVersionId;

        /**
         * <p>The MaxCompute project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MaxcomputeProjectName")
        public String maxcomputeProjectName;

        /**
         * <p>maxcompute schema。</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("MaxcomputeSchema")
        public String maxcomputeSchema;

        /**
         * <p>The table name in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>table-1</p>
         */
        @NameInMap("MaxcomputeTableName")
        public String maxcomputeTableName;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table-123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The partition fields of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("PartitionFields")
        public String partitionFields;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        /**
         * <p>The recall type of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>X2I</p>
         */
        @NameInMap("RecallType")
        public String recallType;

        /**
         * <p>The table type.</p>
         * 
         * <strong>example:</strong>
         * <p>Recall</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRecallManagementTablesResponseBodyRecallManagementTables build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementTablesResponseBodyRecallManagementTables self = new ListRecallManagementTablesResponseBodyRecallManagementTables();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setIndexEffectiveTime(String indexEffectiveTime) {
            this.indexEffectiveTime = indexEffectiveTime;
            return this;
        }
        public String getIndexEffectiveTime() {
            return this.indexEffectiveTime;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setIndexVersionId(String indexVersionId) {
            this.indexVersionId = indexVersionId;
            return this;
        }
        public String getIndexVersionId() {
            return this.indexVersionId;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setMaxcomputeProjectName(String maxcomputeProjectName) {
            this.maxcomputeProjectName = maxcomputeProjectName;
            return this;
        }
        public String getMaxcomputeProjectName() {
            return this.maxcomputeProjectName;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setMaxcomputeSchema(String maxcomputeSchema) {
            this.maxcomputeSchema = maxcomputeSchema;
            return this;
        }
        public String getMaxcomputeSchema() {
            return this.maxcomputeSchema;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setMaxcomputeTableName(String maxcomputeTableName) {
            this.maxcomputeTableName = maxcomputeTableName;
            return this;
        }
        public String getMaxcomputeTableName() {
            return this.maxcomputeTableName;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setPartitionFields(String partitionFields) {
            this.partitionFields = partitionFields;
            return this;
        }
        public String getPartitionFields() {
            return this.partitionFields;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public ListRecallManagementTablesResponseBodyRecallManagementTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
