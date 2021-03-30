// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class QuerySharesToUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QuerySharesToUserListResponseBodyResult> result;

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

    public QuerySharesToUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySharesToUserListResponseBody setResult(java.util.List<QuerySharesToUserListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QuerySharesToUserListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QuerySharesToUserListResponseBodyResultDirectory extends TeaModel {
        @NameInMap("PathName")
        public String pathName;

        @NameInMap("PathId")
        public String pathId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static QuerySharesToUserListResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QuerySharesToUserListResponseBodyResultDirectory self = new QuerySharesToUserListResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QuerySharesToUserListResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySharesToUserListResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QuerySharesToUserListResponseBodyResult extends TeaModel {
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
        public QuerySharesToUserListResponseBodyResultDirectory directory;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QuerySharesToUserListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySharesToUserListResponseBodyResult self = new QuerySharesToUserListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySharesToUserListResponseBodyResult setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        public QuerySharesToUserListResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QuerySharesToUserListResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QuerySharesToUserListResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySharesToUserListResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QuerySharesToUserListResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QuerySharesToUserListResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public QuerySharesToUserListResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QuerySharesToUserListResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QuerySharesToUserListResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QuerySharesToUserListResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QuerySharesToUserListResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySharesToUserListResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QuerySharesToUserListResponseBodyResult setDirectory(QuerySharesToUserListResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QuerySharesToUserListResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QuerySharesToUserListResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
