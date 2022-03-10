// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryOrganizationWorkspaceListResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOrganizationWorkspaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationWorkspaceListResponseBody self = new QueryOrganizationWorkspaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationWorkspaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrganizationWorkspaceListResponseBody setResult(QueryOrganizationWorkspaceListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryOrganizationWorkspaceListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryOrganizationWorkspaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrganizationWorkspaceListResponseBodyResultData extends TeaModel {
        @NameInMap("AllowPublishOperation")
        public Boolean allowPublishOperation;

        @NameInMap("AllowShareOperation")
        public Boolean allowShareOperation;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("CreateUserAccountName")
        public String createUserAccountName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ModifyUserAccountName")
        public String modifyUserAccountName;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        @NameInMap("WorkspaceDescription")
        public String workspaceDescription;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryOrganizationWorkspaceListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationWorkspaceListResponseBodyResultData self = new QueryOrganizationWorkspaceListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setAllowPublishOperation(Boolean allowPublishOperation) {
            this.allowPublishOperation = allowPublishOperation;
            return this;
        }
        public Boolean getAllowPublishOperation() {
            return this.allowPublishOperation;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setAllowShareOperation(Boolean allowShareOperation) {
            this.allowShareOperation = allowShareOperation;
            return this;
        }
        public Boolean getAllowShareOperation() {
            return this.allowShareOperation;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setCreateUserAccountName(String createUserAccountName) {
            this.createUserAccountName = createUserAccountName;
            return this;
        }
        public String getCreateUserAccountName() {
            return this.createUserAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setModifyUserAccountName(String modifyUserAccountName) {
            this.modifyUserAccountName = modifyUserAccountName;
            return this;
        }
        public String getModifyUserAccountName() {
            return this.modifyUserAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setOwnerAccountName(String ownerAccountName) {
            this.ownerAccountName = ownerAccountName;
            return this;
        }
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceDescription(String workspaceDescription) {
            this.workspaceDescription = workspaceDescription;
            return this;
        }
        public String getWorkspaceDescription() {
            return this.workspaceDescription;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryOrganizationWorkspaceListResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryOrganizationWorkspaceListResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryOrganizationWorkspaceListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationWorkspaceListResponseBodyResult self = new QueryOrganizationWorkspaceListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setData(java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryOrganizationWorkspaceListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
