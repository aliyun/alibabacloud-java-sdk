// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
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
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <strong>example:</strong>
         * <p>e4276ea5-b232-4fb1-8f0f-efcee4a2****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>e4276ea5-b232-4fb1-8f0f-efcee4a2****</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>1611023338000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Remarks on the work.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory directory;

        /**
         * <p>The name of the Alibaba Cloud account to which the modifier belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <strong>example:</strong>
         * <p>1611023338000</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The Quick BI UserID of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>46e5374665ba4b679ee22e2a2927****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The Alibaba Cloud account name of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Security policies for collaborative authorization of works. Valid values:</p>
         * <ul>
         * <li>0: private</li>
         * <li>12: Authorize specified members</li>
         * <li>1 or 11: Authorize all workspace members</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you use legacy permissions, the return value is 1.</p>
         * </li>
         * <li><p>If you use the new permissions, the return value is 11.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li>0: unpublished</li>
         * <li>1: published</li>
         * <li>2: modified but not published</li>
         * <li>3: unpublished</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Third-party embedding status. Valid values:</p>
         * <ul>
         * <li>0: The embed service is not enabled.</li>
         * <li>1: Embed is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <ul>
         * <li>DATAPRODUCT: BI portal</li>
         * <li>PAGE: Dashboard</li>
         * <li>FULLPAGE: full-screen dashboards</li>
         * <li>REPORT: workbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <p>The ID of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>03366b16-69ce-43c8-b782-56c2f6ec****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Workspace</p>
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
