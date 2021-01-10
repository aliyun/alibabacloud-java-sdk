// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllLinkeBahamutAppmembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<AllLinkeBahamutAppmembersResponseBodyResult> result;

    public static AllLinkeBahamutAppmembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllLinkeBahamutAppmembersResponseBody self = new AllLinkeBahamutAppmembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AllLinkeBahamutAppmembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllLinkeBahamutAppmembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllLinkeBahamutAppmembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AllLinkeBahamutAppmembersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AllLinkeBahamutAppmembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AllLinkeBahamutAppmembersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllLinkeBahamutAppmembersResponseBody setResult(java.util.List<AllLinkeBahamutAppmembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AllLinkeBahamutAppmembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class AllLinkeBahamutAppmembersResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Ww")
        public String ww;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Email")
        public String email;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("Id")
        public String id;

        @NameInMap("Uid")
        public String uid;

        public static AllLinkeBahamutAppmembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AllLinkeBahamutAppmembersResponseBodyResult self = new AllLinkeBahamutAppmembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AllLinkeBahamutAppmembersResponseBodyResult setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
