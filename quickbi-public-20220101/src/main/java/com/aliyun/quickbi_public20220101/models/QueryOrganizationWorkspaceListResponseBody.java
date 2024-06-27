// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryOrganizationWorkspaceListResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowPublishOperation")
        public Boolean allowPublishOperation;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowShareOperation")
        public Boolean allowShareOperation;

        /**
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("CreateUserAccountName")
        public String createUserAccountName;

        /**
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("ModifyUserAccountName")
        public String modifyUserAccountName;

        /**
         * <strong>example:</strong>
         * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        @NameInMap("WorkspaceDescription")
        public String workspaceDescription;

        /**
         * <strong>example:</strong>
         * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
