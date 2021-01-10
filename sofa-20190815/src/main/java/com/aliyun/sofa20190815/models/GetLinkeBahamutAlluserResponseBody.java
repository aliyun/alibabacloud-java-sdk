// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAlluserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutAlluserResponseBodyResult> result;

    public static GetLinkeBahamutAlluserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAlluserResponseBody self = new GetLinkeBahamutAlluserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAlluserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAlluserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAlluserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAlluserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAlluserResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAlluserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAlluserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAlluserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAlluserResponseBody setResult(java.util.List<GetLinkeBahamutAlluserResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutAlluserResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAlluserResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("ConfirmedTime")
        public Long confirmedTime;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("HasConfirmed")
        public Boolean hasConfirmed;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Ww")
        public String ww;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static GetLinkeBahamutAlluserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAlluserResponseBodyResult self = new GetLinkeBahamutAlluserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAlluserResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setConfirmedTime(Long confirmedTime) {
            this.confirmedTime = confirmedTime;
            return this;
        }
        public Long getConfirmedTime() {
            return this.confirmedTime;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setHasConfirmed(Boolean hasConfirmed) {
            this.hasConfirmed = hasConfirmed;
            return this;
        }
        public Boolean getHasConfirmed() {
            return this.hasConfirmed;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public GetLinkeBahamutAlluserResponseBodyResult setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

}
