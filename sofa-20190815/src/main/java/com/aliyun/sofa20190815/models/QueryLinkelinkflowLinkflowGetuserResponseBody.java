// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowGetuserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<QueryLinkelinkflowLinkflowGetuserResponseBodyData> data;

    public static QueryLinkelinkflowLinkflowGetuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowGetuserResponseBody self = new QueryLinkelinkflowLinkflowGetuserResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryLinkelinkflowLinkflowGetuserResponseBody setData(java.util.List<QueryLinkelinkflowLinkflowGetuserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkelinkflowLinkflowGetuserResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkelinkflowLinkflowGetuserResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Admin")
        public Boolean admin;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("FirstName")
        public String firstName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsPictureSet")
        public Boolean isPictureSet;

        @NameInMap("LastName")
        public String lastName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Password")
        public String password;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryLinkelinkflowLinkflowGetuserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkelinkflowLinkflowGetuserResponseBodyData self = new QueryLinkelinkflowLinkflowGetuserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setAdmin(Boolean admin) {
            this.admin = admin;
            return this;
        }
        public Boolean getAdmin() {
            return this.admin;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setIsPictureSet(Boolean isPictureSet) {
            this.isPictureSet = isPictureSet;
            return this;
        }
        public Boolean getIsPictureSet() {
            return this.isPictureSet;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryLinkelinkflowLinkflowGetuserResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
