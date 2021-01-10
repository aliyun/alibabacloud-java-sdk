// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkeBahamutUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public ConfirmLinkeBahamutUserResponseBodyResult result;

    public static ConfirmLinkeBahamutUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkeBahamutUserResponseBody self = new ConfirmLinkeBahamutUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkeBahamutUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmLinkeBahamutUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmLinkeBahamutUserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ConfirmLinkeBahamutUserResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ConfirmLinkeBahamutUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ConfirmLinkeBahamutUserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmLinkeBahamutUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmLinkeBahamutUserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmLinkeBahamutUserResponseBody setResult(ConfirmLinkeBahamutUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ConfirmLinkeBahamutUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class ConfirmLinkeBahamutUserResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Ww")
        public String ww;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("ConfirmedTime")
        public Long confirmedTime;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Name")
        public String name;

        @NameInMap("HasConfirmed")
        public Boolean hasConfirmed;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Department")
        public String department;

        @NameInMap("Id")
        public String id;

        @NameInMap("Uid")
        public String uid;

        public static ConfirmLinkeBahamutUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ConfirmLinkeBahamutUserResponseBodyResult self = new ConfirmLinkeBahamutUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setConfirmedTime(Long confirmedTime) {
            this.confirmedTime = confirmedTime;
            return this;
        }
        public Long getConfirmedTime() {
            return this.confirmedTime;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setHasConfirmed(Boolean hasConfirmed) {
            this.hasConfirmed = hasConfirmed;
            return this;
        }
        public Boolean getHasConfirmed() {
            return this.hasConfirmed;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ConfirmLinkeBahamutUserResponseBodyResult setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
