// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRoleUsersResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCE45E6D-****-4F94-86BB-****2B1615FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the list of users under the organization role.</p>
     */
    @NameInMap("Result")
    public ListOrganizationRoleUsersResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: Request succeeded</li>
     * <li>false: Request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOrganizationRoleUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRoleUsersResponseBody self = new ListOrganizationRoleUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRoleUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationRoleUsersResponseBody setResult(ListOrganizationRoleUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListOrganizationRoleUsersResponseBodyResult getResult() {
        return this.result;
    }

    public ListOrganizationRoleUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrganizationRoleUsersResponseBodyResultData extends TeaModel {
        /**
         * <p>Nickname of the organization member.</p>
         * 
         * <strong>example:</strong>
         * <p>Test User</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>UserID of the organization member in Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>b5d8fd9348cc4327****afb604</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListOrganizationRoleUsersResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRoleUsersResponseBodyResultData self = new ListOrganizationRoleUsersResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRoleUsersResponseBodyResultData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListOrganizationRoleUsersResponseBodyResultData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListOrganizationRoleUsersResponseBodyResult extends TeaModel {
        /**
         * <p>User list.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListOrganizationRoleUsersResponseBodyResultData> data;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of items per page as set in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListOrganizationRoleUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationRoleUsersResponseBodyResult self = new ListOrganizationRoleUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOrganizationRoleUsersResponseBodyResult setData(java.util.List<ListOrganizationRoleUsersResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListOrganizationRoleUsersResponseBodyResultData> getData() {
            return this.data;
        }

        public ListOrganizationRoleUsersResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListOrganizationRoleUsersResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOrganizationRoleUsersResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListOrganizationRoleUsersResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
