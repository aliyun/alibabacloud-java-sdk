// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryDatasetListResponseBodyResult result;

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
        @NameInMap("DsId")
        public String dsId;

        @NameInMap("DsName")
        public String dsName;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSource")
        public QueryDatasetListResponseBodyResultDataDataSource dataSource;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryDatasetListResponseBodyResultDataDirectory directory;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("RowLevel")
        public Boolean rowLevel;

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
        @NameInMap("Data")
        public java.util.List<QueryDatasetListResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

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
