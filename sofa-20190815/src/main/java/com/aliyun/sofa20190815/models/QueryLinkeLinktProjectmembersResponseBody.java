// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkeLinktProjectmembersResponseBodyData> data;

    public static QueryLinkeLinktProjectmembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmembersResponseBody self = new QueryLinkeLinktProjectmembersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktProjectmembersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktProjectmembersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktProjectmembersResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktProjectmembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktProjectmembersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktProjectmembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktProjectmembersResponseBody setData(java.util.List<QueryLinkeLinktProjectmembersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktProjectmembersResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktProjectmembersResponseBodyData extends TeaModel {
        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("Users")
        public java.util.List<String> users;

        public static QueryLinkeLinktProjectmembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktProjectmembersResponseBodyData self = new QueryLinkeLinktProjectmembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktProjectmembersResponseBodyData setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public QueryLinkeLinktProjectmembersResponseBodyData setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

    }

}
