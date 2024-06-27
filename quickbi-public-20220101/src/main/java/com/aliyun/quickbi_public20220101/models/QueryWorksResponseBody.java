// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryWorksResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>83d37ba6-d909-48a2-a517-f4d05c3a****</p>
         */
        @NameInMap("PathId")
        public String pathId;

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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Auth3rdFlag")
        public Integer auth3rdFlag;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryWorksResponseBodyResultDirectory directory;

        /**
         * <strong>example:</strong>
         * <p>1496651577000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1496651577000</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <strong>example:</strong>
         * <p>9187a612aa474e2a8ac1414d5529****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PublicFlag")
        public Boolean publicFlag;

        @NameInMap("PublicInvalidTime")
        public Long publicInvalidTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WorkName")
        public String workName;

        /**
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("WorkType")
        public String workType;

        /**
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <strong>example:</strong>
         * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

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

        public QueryWorksResponseBodyResult setPublicFlag(Boolean publicFlag) {
            this.publicFlag = publicFlag;
            return this;
        }
        public Boolean getPublicFlag() {
            return this.publicFlag;
        }

        public QueryWorksResponseBodyResult setPublicInvalidTime(Long publicInvalidTime) {
            this.publicInvalidTime = publicInvalidTime;
            return this;
        }
        public Long getPublicInvalidTime() {
            return this.publicInvalidTime;
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
