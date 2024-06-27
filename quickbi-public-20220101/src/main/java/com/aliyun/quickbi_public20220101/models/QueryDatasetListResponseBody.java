// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListResponseBody extends TeaModel {
    /**
     * <p>The keyword used to search for the dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Test dataset</p>
     */
    @NameInMap("Result")
    public QueryDatasetListResponseBodyResult result;

    /**
     * <p>Whether to recursively wrap the dataset in the subdirectory. Valid values:</p>
     * <ul>
     * <li>true: returns datasets in all recursive subdirectories in the directoryId directory.</li>
     * <li>false: Only datasets in the directory specified by directoryId are returned, excluding subdirectories.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetListResponseBody self = new QueryDatasetListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetListResponseBody setResult(QueryDatasetListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDatasetListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDatasetListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDatasetListResponseBodyResultDataDataSource extends TeaModel {
        /**
         * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
         * 
         * <strong>example:</strong>
         * <p>261b252d-c3c3-498a-a0a7-5d1ec6cd****</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The time when the scaling group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the training dataset.</p>
         */
        @NameInMap("DsName")
        public String dsName;

        /**
         * <p>The user ID of the dataset owner in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DsType")
        public String dsType;

        public static QueryDatasetListResponseBodyResultDataDataSource build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetListResponseBodyResultDataDataSource self = new QueryDatasetListResponseBodyResultDataDataSource();
            return TeaModel.build(map, self);
        }

        public QueryDatasetListResponseBodyResultDataDataSource setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public QueryDatasetListResponseBodyResultDataDataSource setDsName(String dsName) {
            this.dsName = dsName;
            return this;
        }
        public String getDsName() {
            return this.dsName;
        }

        public QueryDatasetListResponseBodyResultDataDataSource setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

    }

    public static class QueryDatasetListResponseBodyResultDataDirectory extends TeaModel {
        /**
         * <p>The ID of the directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Information about the directory where the dataset is located</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Test a data source</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QueryDatasetListResponseBodyResultDataDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetListResponseBodyResultDataDirectory self = new QueryDatasetListResponseBodyResultDataDirectory();
            return TeaModel.build(map, self);
        }

        public QueryDatasetListResponseBodyResultDataDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDatasetListResponseBodyResultDataDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDatasetListResponseBodyResultDataDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryDatasetListResponseBodyResultDataDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryDatasetListResponseBodyResultData extends TeaModel {
        /**
         * <p>The details of the dataset list.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-02 10:36:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Test Space</p>
         */
        @NameInMap("DataSource")
        public QueryDatasetListResponseBodyResultDataDataSource dataSource;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>5820f58c-c734-4d8a-baf1-7979af4f****</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>Tom</p>
         * 
         * <strong>example:</strong>
         * <p>company_sales_record_copy12</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The number of rows per page set when the interface is requested.</p>
         * 
         * <strong>example:</strong>
         * <p>The total number of rows in the table.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about the data source to which the dataset belongs.</p>
         */
        @NameInMap("Directory")
        public QueryDatasetListResponseBodyResultDataDirectory directory;

        /**
         * <p>The nickname of the dataset owner.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-02 10:36:05</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("OpenOfflineAcceleration")
        public Boolean openOfflineAcceleration;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>136516262323****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Whether to enable row-level permissions. Valid values:</p>
         * <ul>
         * <li>true: The VIP Netty channel is enabled.</li>
         * <li>false: The incremental log backup feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RowLevel")
        public Boolean rowLevel;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad06adf</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>Test dataset</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryDatasetListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetListResponseBodyResultData self = new QueryDatasetListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryDatasetListResponseBodyResultData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryDatasetListResponseBodyResultData setDataSource(QueryDatasetListResponseBodyResultDataDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public QueryDatasetListResponseBodyResultDataDataSource getDataSource() {
            return this.dataSource;
        }

        public QueryDatasetListResponseBodyResultData setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public QueryDatasetListResponseBodyResultData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public QueryDatasetListResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryDatasetListResponseBodyResultData setDirectory(QueryDatasetListResponseBodyResultDataDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryDatasetListResponseBodyResultDataDirectory getDirectory() {
            return this.directory;
        }

        public QueryDatasetListResponseBodyResultData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryDatasetListResponseBodyResultData setOpenOfflineAcceleration(Boolean openOfflineAcceleration) {
            this.openOfflineAcceleration = openOfflineAcceleration;
            return this;
        }
        public Boolean getOpenOfflineAcceleration() {
            return this.openOfflineAcceleration;
        }

        public QueryDatasetListResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryDatasetListResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryDatasetListResponseBodyResultData setRowLevel(Boolean rowLevel) {
            this.rowLevel = rowLevel;
            return this;
        }
        public Boolean getRowLevel() {
            return this.rowLevel;
        }

        public QueryDatasetListResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryDatasetListResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryDatasetListResponseBodyResult extends TeaModel {
        /**
         * <p>Returns the pagination results of the dataset list. The detailed information of the dataset list is stored in the response parameter Data.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryDatasetListResponseBodyResultData> data;

        /**
         * <p>The number of rows per page in a paged query.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>Maximum value: 1,000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>Current page number for dataset list:</p>
         * <ul>
         * <li>Pages start from page 1.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryDatasetListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetListResponseBodyResult self = new QueryDatasetListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDatasetListResponseBodyResult setData(java.util.List<QueryDatasetListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryDatasetListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryDatasetListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryDatasetListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDatasetListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryDatasetListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
