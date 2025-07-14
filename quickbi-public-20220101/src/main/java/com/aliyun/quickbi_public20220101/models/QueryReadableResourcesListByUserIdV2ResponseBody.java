// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReadableResourcesListByUserIdV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C********05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryReadableResourcesListByUserIdV2ResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryReadableResourcesListByUserIdV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReadableResourcesListByUserIdV2ResponseBody self = new QueryReadableResourcesListByUserIdV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReadableResourcesListByUserIdV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReadableResourcesListByUserIdV2ResponseBody setResult(java.util.List<QueryReadableResourcesListByUserIdV2ResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryReadableResourcesListByUserIdV2ResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryReadableResourcesListByUserIdV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a3eecab7-618d-4f9f-*****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>88b680****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        @NameInMap("PathName")
        public String pathName;

        public static QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory self = new QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryReadableResourcesListByUserIdV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1611023338000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory directory;

        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <strong>example:</strong>
         * <p>1530078690000</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ThirdPartAuthFlag")
        public Integer thirdPartAuthFlag;

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
         * <p>ccd3428c-<strong><strong>-</strong></strong>-a608-26bae29dffee</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <strong>example:</strong>
         * <p>c5f86ad2-ef53-4c51-8720-162ecfdb****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryReadableResourcesListByUserIdV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryReadableResourcesListByUserIdV2ResponseBodyResult self = new QueryReadableResourcesListByUserIdV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setDirectory(QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryReadableResourcesListByUserIdV2ResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }
        public Integer getThirdPartAuthFlag() {
            return this.thirdPartAuthFlag;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setWorkName(String workName) {
            this.workName = workName;
            return this;
        }
        public String getWorkName() {
            return this.workName;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setWorkType(String workType) {
            this.workType = workType;
            return this;
        }
        public String getWorkType() {
            return this.workType;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryReadableResourcesListByUserIdV2ResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
