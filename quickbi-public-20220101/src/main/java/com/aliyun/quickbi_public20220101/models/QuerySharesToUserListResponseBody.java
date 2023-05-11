// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QuerySharesToUserListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns a list of works authorized to the user.</p>
     */
    @NameInMap("Result")
    public java.util.List<QuerySharesToUserListResponseBodyResult> result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySharesToUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySharesToUserListResponseBody self = new QuerySharesToUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySharesToUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySharesToUserListResponseBody setResult(java.util.List<QuerySharesToUserListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QuerySharesToUserListResponseBodyResult> getResult() {
        return this.result;
    }

    public QuerySharesToUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySharesToUserListResponseBodyResultDirectory extends TeaModel {
        /**
         * <p>The ID of the directory where the resource is located.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path ID of the directory where the resource is located.</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The path name of the directory where the resource is located.</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QuerySharesToUserListResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QuerySharesToUserListResponseBodyResultDirectory self = new QuerySharesToUserListResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QuerySharesToUserListResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QuerySharesToUserListResponseBodyResult extends TeaModel {
        /**
         * <p>The timestamp of the creation time in milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Remarks on the work.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Information about the directory where the work is located.</p>
         */
        @NameInMap("Directory")
        public QuerySharesToUserListResponseBodyResultDirectory directory;

        /**
         * <p>The name of the Alibaba Cloud account to which the modifier belongs.</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <p>The timestamp of the modification time in milliseconds.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The UserID of the work owner in Quickbi.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the work owner.</p>
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
         * <p>The publishing status of the report. Valid values:</p>
         * <br>
         * <p>*   0: unpublished</p>
         * <p>*   1: published</p>
         * <p>*   2: modified but not published</p>
         * <p>*   3: unpublished</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <br>
         * <p>*   0: No embedding is enabled.</p>
         * <p>*   1: Embed is enabled.</p>
         */
        @NameInMap("ThirdPartAuthFlag")
        public Integer thirdPartAuthFlag;

        /**
         * <p>The name of the report.</p>
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
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <p>The ID of the operations report.</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>The ID of the workspace to which the report belongs.</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the report belongs.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QuerySharesToUserListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySharesToUserListResponseBodyResult self = new QuerySharesToUserListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySharesToUserListResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySharesToUserListResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySharesToUserListResponseBodyResult setDirectory(QuerySharesToUserListResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QuerySharesToUserListResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QuerySharesToUserListResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QuerySharesToUserListResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QuerySharesToUserListResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QuerySharesToUserListResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QuerySharesToUserListResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QuerySharesToUserListResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QuerySharesToUserListResponseBodyResult setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        public QuerySharesToUserListResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QuerySharesToUserListResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QuerySharesToUserListResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QuerySharesToUserListResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QuerySharesToUserListResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
