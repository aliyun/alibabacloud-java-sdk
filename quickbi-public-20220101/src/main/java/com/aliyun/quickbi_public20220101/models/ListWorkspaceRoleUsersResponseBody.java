// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRoleUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListWorkspaceRoleUsersResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceRoleUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRoleUsersResponseBody self = new ListWorkspaceRoleUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRoleUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceRoleUsersResponseBody setResult(ListWorkspaceRoleUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListWorkspaceRoleUsersResponseBodyResult getResult() {
        return this.result;
    }

    public ListWorkspaceRoleUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceRoleUsersResponseBodyResultData extends TeaModel {
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>b5d8fd9348cc4327****afb604</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspaceRoleUsersResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRoleUsersResponseBodyResultData self = new ListWorkspaceRoleUsersResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRoleUsersResponseBodyResultData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListWorkspaceRoleUsersResponseBodyResultData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListWorkspaceRoleUsersResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspaceRoleUsersResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListWorkspaceRoleUsersResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListWorkspaceRoleUsersResponseBodyResultData> data;

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

        public static ListWorkspaceRoleUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceRoleUsersResponseBodyResult self = new ListWorkspaceRoleUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceRoleUsersResponseBodyResult setData(java.util.List<ListWorkspaceRoleUsersResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListWorkspaceRoleUsersResponseBodyResultData> getData() {
            return this.data;
        }

        public ListWorkspaceRoleUsersResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListWorkspaceRoleUsersResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkspaceRoleUsersResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListWorkspaceRoleUsersResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
