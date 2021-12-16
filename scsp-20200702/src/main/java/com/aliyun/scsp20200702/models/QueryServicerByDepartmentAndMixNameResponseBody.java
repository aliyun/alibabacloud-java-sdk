// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByDepartmentAndMixNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryServicerByDepartmentAndMixNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryServicerByDepartmentAndMixNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByDepartmentAndMixNameResponseBody self = new QueryServicerByDepartmentAndMixNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServicerByDepartmentAndMixNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryServicerByDepartmentAndMixNameResponseBody setData(QueryServicerByDepartmentAndMixNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryServicerByDepartmentAndMixNameResponseBodyData getData() {
        return this.data;
    }

    public QueryServicerByDepartmentAndMixNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryServicerByDepartmentAndMixNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryServicerByDepartmentAndMixNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryServicerByDepartmentAndMixNameResponseBodyDataResults extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("ServicerId")
        public Long servicerId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("UserStatus")
        public Integer userStatus;

        public static QueryServicerByDepartmentAndMixNameResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByDepartmentAndMixNameResponseBodyDataResults self = new QueryServicerByDepartmentAndMixNameResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setServicerId(Long servicerId) {
            this.servicerId = servicerId;
            return this;
        }
        public Long getServicerId() {
            return this.servicerId;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyDataResults setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

    }

    public static class QueryServicerByDepartmentAndMixNameResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<QueryServicerByDepartmentAndMixNameResponseBodyDataResults> results;

        @NameInMap("Total")
        public Integer total;

        public static QueryServicerByDepartmentAndMixNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryServicerByDepartmentAndMixNameResponseBodyData self = new QueryServicerByDepartmentAndMixNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyData setResults(java.util.List<QueryServicerByDepartmentAndMixNameResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryServicerByDepartmentAndMixNameResponseBodyDataResults> getResults() {
            return this.results;
        }

        public QueryServicerByDepartmentAndMixNameResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
