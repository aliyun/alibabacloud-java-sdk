// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkeBahamutIterationimportmembersResponseBody extends TeaModel {
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
    public java.util.List<ImportLinkeBahamutIterationimportmembersResponseBodyResult> result;

    public static ImportLinkeBahamutIterationimportmembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkeBahamutIterationimportmembersResponseBody self = new ImportLinkeBahamutIterationimportmembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportLinkeBahamutIterationimportmembersResponseBody setResult(java.util.List<ImportLinkeBahamutIterationimportmembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ImportLinkeBahamutIterationimportmembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ImportLinkeBahamutIterationimportmembersResponseBodyResult extends TeaModel {
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

        public static ImportLinkeBahamutIterationimportmembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ImportLinkeBahamutIterationimportmembersResponseBodyResult self = new ImportLinkeBahamutIterationimportmembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setConfirmedTime(Long confirmedTime) {
            this.confirmedTime = confirmedTime;
            return this;
        }
        public Long getConfirmedTime() {
            return this.confirmedTime;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setHasConfirmed(Boolean hasConfirmed) {
            this.hasConfirmed = hasConfirmed;
            return this;
        }
        public Boolean getHasConfirmed() {
            return this.hasConfirmed;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ImportLinkeBahamutIterationimportmembersResponseBodyResult setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

}
