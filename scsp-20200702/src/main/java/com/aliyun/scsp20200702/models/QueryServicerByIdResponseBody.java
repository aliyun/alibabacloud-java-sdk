// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryServicerByIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryServicerByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByIdResponseBody self = new QueryServicerByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServicerByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryServicerByIdResponseBody setData(QueryServicerByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryServicerByIdResponseBodyData getData() {
        return this.data;
    }

    public QueryServicerByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryServicerByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServicerByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryServicerByIdResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("UserStatus")
        public Integer userStatus;

        public static QueryServicerByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByIdResponseBodyData self = new QueryServicerByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryServicerByIdResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryServicerByIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryServicerByIdResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryServicerByIdResponseBodyData setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryServicerByIdResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryServicerByIdResponseBodyData setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

    }

}
