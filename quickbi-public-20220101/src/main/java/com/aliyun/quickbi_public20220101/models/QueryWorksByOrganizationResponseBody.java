// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationResponseBody extends TeaModel {
    /**
     * <p>The details of the list of works.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the report. Valid values:</p>
     * <br>
     * <p>*   0: unpublished</p>
     * <p>*   1: published</p>
     * <p>*   2: modified but not published</p>
     * <p>*   3: unpublished</p>
     */
    @NameInMap("Result")
    public QueryWorksByOrganizationResponseBodyResult result;

    /**
     * <p>The total number of rows in the table.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryWorksByOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByOrganizationResponseBody self = new QueryWorksByOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksByOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksByOrganizationResponseBody setResult(QueryWorksByOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksByOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksByOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksByOrganizationResponseBodyResultDataDirectory extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

        @NameInMap("PathName")
        public String pathName;

        public static QueryWorksByOrganizationResponseBodyResultDataDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResultDataDirectory self = new QueryWorksByOrganizationResponseBodyResultDataDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksByOrganizationResponseBodyResultDataDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksByOrganizationResponseBodyResultData extends TeaModel {
        /**
         * <p>The name of the workspace to which the work belongs.</p>
         */
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        /**
         * <p>The hierarchical structure of the directory ID to which the directory belongs. Separate the hierarchical structure with a /.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("Directory")
        public QueryWorksByOrganizationResponseBodyResultDataDirectory directory;

        /**
         * <p>Test directory</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Test Workspace</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>Description</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

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
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the person who modified the work.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The directory to which the work belongs.</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>Li Si</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Test directory</p>
         */
        @NameInMap("WorkName")
        public String workName;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <p>The user ID of the work owner in the Quick BI.</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>Test report</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksByOrganizationResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResultData self = new QueryWorksByOrganizationResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResultData setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksByOrganizationResponseBodyResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksByOrganizationResponseBodyResultData setDirectory(QueryWorksByOrganizationResponseBodyResultDataDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksByOrganizationResponseBodyResultDataDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksByOrganizationResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksByOrganizationResponseBodyResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksByOrganizationResponseBodyResultData setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksByOrganizationResponseBodyResultData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksByOrganizationResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryWorksByOrganizationResponseBodyResult extends TeaModel {
        /**
         * <p>The Alibaba Cloud account name of the work owner.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryWorksByOrganizationResponseBodyResultData> data;

        /**
         * <p>The timestamp of the modification of the work in milliseconds.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The ID of the work.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The type of the work. Valid values:</p>
         * <br>
         * <p>*   DATAPRODUCT: BI portal</p>
         * <p>*   PAGE: Dashboard</p>
         * <p>*   FULLPAGE: full-screen dashboards</p>
         * <p>*   REPORT: workbook</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <br>
         * <p>*   0: The embed service is not enabled.</p>
         * <p>*   1: Embed is enabled.</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryWorksByOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksByOrganizationResponseBodyResult self = new QueryWorksByOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksByOrganizationResponseBodyResult setData(java.util.List<QueryWorksByOrganizationResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryWorksByOrganizationResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryWorksByOrganizationResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryWorksByOrganizationResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryWorksByOrganizationResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryWorksByOrganizationResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
