// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paged results of the dataset list. The details of the datasets are returned in the Data parameter.</p>
     */
    @NameInMap("Result")
    public QueryDatasetListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
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
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>261b252d-c3c3-498a-a0a7-5d1ec6cd****</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DsName")
        public String dsName;

        /**
         * <p>The data source type.</p>
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
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the folder path.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The name of the folder path.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The time when the dataset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-02 10:36:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The information about the data source to which the dataset belongs.</p>
         */
        @NameInMap("DataSource")
        public QueryDatasetListResponseBodyResultDataDataSource dataSource;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5820f58c-c734-4d8a-baf1-7979af4f****</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>company_sales_record_copy12</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about the folder in which the dataset is located.</p>
         */
        @NameInMap("Directory")
        public QueryDatasetListResponseBodyResultDataDirectory directory;

        /**
         * <p>The time when the dataset was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-02 10:36:05</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Indicates whether extraction-based acceleration is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled</p>
         * </li>
         * <li><p>false: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenOfflineAcceleration")
        public Boolean openOfflineAcceleration;

        /**
         * <p>The user ID of the dataset owner in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>136516262323****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The nickname of the dataset owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Indicates whether row-level permissions are enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled</p>
         * </li>
         * <li><p>false: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RowLevel")
        public Boolean rowLevel;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad06adf</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The details of the dataset list.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryDatasetListResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
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
