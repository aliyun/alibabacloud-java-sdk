// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paginated query results. The Data parameter contains the details of each workspace.</p>
     */
    @NameInMap("Result")
    public QueryOrganizationWorkspaceListResponseBodyResult result;

    /**
     * <p>Whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The request succeeded.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>Whether works in the workspace can be published. Valid values:</p>
         * <ul>
         * <li><p>true: Publishing is allowed.</p>
         * </li>
         * <li><p>false: Publishing is not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowPublishOperation")
        public Boolean allowPublishOperation;

        /**
         * <p>Whether works in the workspace can be shared. Valid values:</p>
         * <ul>
         * <li><p>true: Sharing is allowed.</p>
         * </li>
         * <li><p>false: Sharing is not allowed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowShareOperation")
        public Boolean allowShareOperation;

        /**
         * <p>The time when the workspace was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator\&quot;s Quick BI user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The creator\&quot;s Alibaba Cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("CreateUserAccountName")
        public String createUserAccountName;

        /**
         * <p>The time when the workspace was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10 17:51:07</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The modifier\&quot;s Quick BI user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The modifier\&quot;s Alibaba Cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("ModifyUserAccountName")
        public String modifyUserAccountName;

        /**
         * <p>The ID of the workspace\&quot;s organization.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The workspace owner\&quot;s Quick BI user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The workspace owner\&quot;s Alibaba Cloud account name.</p>
         * 
         * <strong>example:</strong>
         * <p>pop****@aliyun.com</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        /**
         * <p>The workspace owner\&quot;s Quick BI account name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RealOwnerAccountName")
        public String realOwnerAccountName;

        /**
         * <p>The workspace description.</p>
         * 
         * <strong>example:</strong>
         * <p>该空间是测试空间</p>
         */
        @NameInMap("WorkspaceDescription")
        public String workspaceDescription;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试空间</p>
         */
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

        public QueryOrganizationWorkspaceListResponseBodyResultData setRealOwnerAccountName(String realOwnerAccountName) {
            this.realOwnerAccountName = realOwnerAccountName;
            return this;
        }
        public String getRealOwnerAccountName() {
            return this.realOwnerAccountName;
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
        /**
         * <p>An array of workspace objects.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryOrganizationWorkspaceListResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
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
