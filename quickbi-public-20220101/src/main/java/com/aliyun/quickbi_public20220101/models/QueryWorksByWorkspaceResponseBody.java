// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns a list of all works in the organization workspace that meet the requested criteria.</p>
     */
    @NameInMap("Result")
    public QueryWorksByWorkspaceResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryWorksByWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByWorkspaceResponseBody self = new QueryWorksByWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksByWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksByWorkspaceResponseBody setResult(QueryWorksByWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksByWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksByWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksByWorkspaceResponseBodyResultDataDirectory extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The hierarchical structure of the directory ID to which the directory belongs. Separate the hierarchical structure with a /.</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The hierarchical structure of the directory to which the directory belongs. Separate the hierarchical structure with a (/).</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QueryWorksByWorkspaceResponseBodyResultDataDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResultDataDirectory self = new QueryWorksByWorkspaceResponseBodyResultDataDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksByWorkspaceResponseBodyResultDataDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksByWorkspaceResponseBodyResultData extends TeaModel {
        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <br>
         * <p>*   0: The embed service is not enabled.</p>
         * <p>*   1: Embed is enabled.</p>
         */
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        /**
         * <p>Remarks on the work.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory to which the work belongs.</p>
         */
        @NameInMap("Directory")
        public QueryWorksByWorkspaceResponseBodyResultDataDirectory directory;

        /**
         * <p>The timestamp of the creation of the work in milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The timestamp of the modification of the work in milliseconds.</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>Nickname of the work modifier.</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <p>The user ID of the work owner in the Quick BI.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The nickname of the work owner.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Security policies for collaborative authorization of works. Valid values:</p>
         * <br>
         * <p>*   0: private</p>
         * <p>*   12: Authorize specified members</p>
         * <p>*   1 or 11: Authorize all workspace members</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you use legacy permissions, the return value is 1.</p>
         * <br>
         * <p>*   If you use the new permissions, the return value is 11.</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>Status of dashboards, full-screen dashboards, spreadsheets. The default value of other work types is 1. Valid values:</p>
         * <br>
         * <p>*   0: unpublished</p>
         * <p>*   1: published</p>
         * <p>*   2: modified but not published</p>
         * <p>*   3: unpublished</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the work.</p>
         */
        @NameInMap("WorkName")
        public String workName;

        /**
         * <p>The type of the work. Valid values:</p>
         * <br>
         * <p>*   DATAPRODUCT: BI portal</p>
         * <p>*   PAGE: Dashboard</p>
         * <p>*   FULLPAGE: full-screen dashboards</p>
         * <p>*   REPORT: workbook</p>
         * <p>*   dashboardOfflineQuery: self-service data retrieval</p>
         * <p>*   Analysis: Ad hoc analysis</p>
         * <p>*   DATAFORM: form filling</p>
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <p>The ID of the work.</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksByWorkspaceResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResultData self = new QueryWorksByWorkspaceResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResultData setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setDirectory(QueryWorksByWorkspaceResponseBodyResultDataDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksByWorkspaceResponseBodyResultDataDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksByWorkspaceResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryWorksByWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>The details of the list of works.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryWorksByWorkspaceResponseBodyResultData> data;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of rows per page set when the interface is requested.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows in the table.</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages returned.</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryWorksByWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByWorkspaceResponseBodyResult self = new QueryWorksByWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksByWorkspaceResponseBodyResult setData(java.util.List<QueryWorksByWorkspaceResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryWorksByWorkspaceResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryWorksByWorkspaceResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryWorksByWorkspaceResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWorksByWorkspaceResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryWorksByWorkspaceResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
