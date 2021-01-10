// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowGetcurrentuserResponseBody extends TeaModel {
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
    public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData data;

    public static GetLinkelinkflowLinkflowGetcurrentuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowGetcurrentuserResponseBody self = new GetLinkelinkflowLinkflowGetcurrentuserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowGetcurrentuserResponseBody setData(GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData extends TeaModel {
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

        public static GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData self = new GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setAdmin(Boolean admin) {
            this.admin = admin;
            return this;
        }
        public Boolean getAdmin() {
            return this.admin;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setIsPictureSet(Boolean isPictureSet) {
            this.isPictureSet = isPictureSet;
            return this;
        }
        public Boolean getIsPictureSet() {
            return this.isPictureSet;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetLinkelinkflowLinkflowGetcurrentuserResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
