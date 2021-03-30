// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> result;

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

    public QueryReadableResourcesListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryReadableResourcesListByUserIdResponseBody setResult(java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryReadableResourcesListByUserIdResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryReadableResourcesListByUserIdResponseBodyResultDirectory extends TeaModel {
        @NameInMap("PathName")
        public String pathName;

        @NameInMap("PathId")
        public String pathId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static QueryReadableResourcesListByUserIdResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdResponseBodyResultDirectory self = new QueryReadableResourcesListByUserIdResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryReadableResourcesListByUserIdResponseBodyResult extends TeaModel {
        @NameInMap("ThirdPartAuthFlag")
        public Integer thirdPartAuthFlag;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WorksId")
        public String worksId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("WorkType")
        public String workType;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ModifyName")
        public String modifyName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("WorkName")
        public String workName;

        @NameInMap("Directory")
        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory directory;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryReadableResourcesListByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdResponseBodyResult self = new QueryReadableResourcesListByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setDirectory(QueryReadableResourcesListByUserIdResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryReadableResourcesListByUserIdResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryReadableResourcesListByUserIdResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
