// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRoleUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListOrganizationRoleUsersResponseBodyResult result;

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
        @NameInMap("NickName")
        public String nickName;

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
        @NameInMap("Data")
        public java.util.List<ListOrganizationRoleUsersResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

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
