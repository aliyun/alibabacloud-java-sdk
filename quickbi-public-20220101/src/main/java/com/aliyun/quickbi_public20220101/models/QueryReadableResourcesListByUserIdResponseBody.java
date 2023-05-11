// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of works that the user has permission to view.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryReadableResourcesListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdResponseBody self = new QueryReadableResourcesListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReadableResourcesListByUserIdResponseBody setResult(java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryReadableResourcesListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryReadableResourcesListByUserIdResponseBodyResultDirectory extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

        @NameInMap("PathName")
        public String pathName;

        public static QueryReadableResourcesListByUserIdResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdResponseBodyResultDirectory self = new QueryReadableResourcesListByUserIdResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryReadableResourcesListByUserIdResponseBodyResult extends TeaModel {
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

        @NameInMap("Directory")
        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory directory;

        /**
         * <p>The name of the Alibaba Cloud account to which the modifier belongs.</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The Quick BI UserID of the work owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the owner.</p>
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
         * <p>The status of the report. Valid values:</p>
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
         * <p>*   0: The embed service is not enabled.</p>
         * <p>*   1: Embed is enabled.</p>
         */
        @NameInMap("ThirdPartAuthFlag")
        public Integer thirdPartAuthFlag;

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

        public static QueryReadableResourcesListByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdResponseBodyResult self = new QueryReadableResourcesListByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setDirectory(QueryReadableResourcesListByUserIdResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
