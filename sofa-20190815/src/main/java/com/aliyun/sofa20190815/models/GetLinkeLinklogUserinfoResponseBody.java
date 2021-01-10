// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogUserinfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeLinklogUserinfoResponseBodyResult result;

    public static GetLinkeLinklogUserinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogUserinfoResponseBody self = new GetLinkeLinklogUserinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogUserinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinklogUserinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinklogUserinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinklogUserinfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkeLinklogUserinfoResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public GetLinkeLinklogUserinfoResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public GetLinkeLinklogUserinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinklogUserinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinklogUserinfoResponseBody setResult(GetLinkeLinklogUserinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeLinklogUserinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeLinklogUserinfoResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("LastLogin")
        public Long lastLogin;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("UserAuthType")
        public String userAuthType;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static GetLinkeLinklogUserinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinklogUserinfoResponseBodyResult self = new GetLinkeLinklogUserinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setUserAuthType(String userAuthType) {
            this.userAuthType = userAuthType;
            return this;
        }
        public String getUserAuthType() {
            return this.userAuthType;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetLinkeLinklogUserinfoResponseBodyResult setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

}
