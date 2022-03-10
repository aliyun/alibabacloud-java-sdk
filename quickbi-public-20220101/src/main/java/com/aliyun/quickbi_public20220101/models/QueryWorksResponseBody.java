// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // QueryWorksModel
    @NameInMap("Result")
    public QueryWorksResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryWorksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksResponseBody self = new QueryWorksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksResponseBody setResult(QueryWorksResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryWorksResponseBodyResult getResult() {
        return this.result;
    }

    public QueryWorksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksResponseBodyResultDirectory extends TeaModel {
        // 目录ID
        @NameInMap("Id")
        public String id;

        // 目录名称
        @NameInMap("Name")
        public String name;

        // 目录ID的路径，例如：aa/bb/cc/dd
        @NameInMap("PathId")
        public String pathId;

        // 目录ID的路径名称，例如：一层目录/二层目录
        @NameInMap("PathName")
        public String pathName;

        public static QueryWorksResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksResponseBodyResultDirectory self = new QueryWorksResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryWorksResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWorksResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorksResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryWorksResponseBodyResult extends TeaModel {
        // 第三方嵌入状态
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        // 描述
        @NameInMap("Description")
        public String description;

        // 所属空间目录信息
        @NameInMap("Directory")
        public QueryWorksResponseBodyResultDirectory directory;

        // 创建时间d
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModify")
        public String gmtModify;

        // 修改显示名称
        @NameInMap("ModifyName")
        public String modifyName;

        // 所有者Id
        @NameInMap("OwnerId")
        public String ownerId;

        // 所有者显示名称
        @NameInMap("OwnerName")
        public String ownerName;

        // 安全策略：0 私有 1 协同编辑。 （
        @NameInMap("SecurityLevel")
        public String securityLevel;

        // 报表发布状态 @PublishStatusEnum
        @NameInMap("Status")
        public Integer status;

        // 作品名称
        @NameInMap("WorkName")
        public String workName;

        // 作品类型
        @NameInMap("WorkType")
        public String workType;

        // 作品ID
        @NameInMap("WorksId")
        public String worksId;

        // 所属工作空间
        @NameInMap("WorkspaceId")
        public String workspaceId;

        // 所属空间名称
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryWorksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksResponseBodyResult self = new QueryWorksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksResponseBodyResult setAuth3rdFlag(Integer auth3rdFlag) {
            this.auth3rdFlag = auth3rdFlag;
            return this;
        }
        public Integer getAuth3rdFlag() {
            return this.auth3rdFlag;
        }

        public QueryWorksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryWorksResponseBodyResult setDirectory(QueryWorksResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryWorksResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryWorksResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWorksResponseBodyResult setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryWorksResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryWorksResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryWorksResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryWorksResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryWorksResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryWorksResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryWorksResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryWorksResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryWorksResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryWorksResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
