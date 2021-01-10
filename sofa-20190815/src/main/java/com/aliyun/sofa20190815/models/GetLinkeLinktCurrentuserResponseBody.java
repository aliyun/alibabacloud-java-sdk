// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktCurrentuserResponseBody extends TeaModel {
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
    public GetLinkeLinktCurrentuserResponseBodyData data;

    public static GetLinkeLinktCurrentuserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktCurrentuserResponseBody self = new GetLinkeLinktCurrentuserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktCurrentuserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktCurrentuserResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktCurrentuserResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktCurrentuserResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktCurrentuserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktCurrentuserResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktCurrentuserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktCurrentuserResponseBody setData(GetLinkeLinktCurrentuserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkeLinktCurrentuserResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkeLinktCurrentuserResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("AliFullName")
        public String aliFullName;

        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("BuName")
        public String buName;

        @NameInMap("BuNo")
        public String buNo;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("DeptNo")
        public String deptNo;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("EmpType")
        public String empType;

        @NameInMap("EmpTypeExt")
        public String empTypeExt;

        @NameInMap("FullPartTime")
        public String fullPartTime;

        @NameInMap("GitModified")
        public Long gitModified;

        @NameInMap("GitPassword")
        public String gitPassword;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtEntry")
        public Long gmtEntry;

        @NameInMap("GmtLeave")
        public Long gmtLeave;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Level")
        public String level;

        @NameInMap("LoginAccount")
        public String loginAccount;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Manager")
        public Boolean manager;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Name")
        public String name;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Site")
        public String site;

        @NameInMap("SuperName")
        public String superName;

        @NameInMap("SuperNickName")
        public String superNickName;

        @NameInMap("SuperWorkNo")
        public String superWorkNo;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("TenantAdmin")
        public Boolean tenantAdmin;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UserToken")
        public String userToken;

        @NameInMap("VirtName")
        public String virtName;

        @NameInMap("VirtWorkNo")
        public String virtWorkNo;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkNo")
        public String workNo;

        @NameInMap("WorkStatus")
        public String workStatus;

        @NameInMap("Tenants")
        public java.util.List<String> tenants;

        public static GetLinkeLinktCurrentuserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktCurrentuserResponseBodyData self = new GetLinkeLinktCurrentuserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktCurrentuserResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setAliFullName(String aliFullName) {
            this.aliFullName = aliFullName;
            return this;
        }
        public String getAliFullName() {
            return this.aliFullName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setBuNo(String buNo) {
            this.buNo = buNo;
            return this;
        }
        public String getBuNo() {
            return this.buNo;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }
        public String getDeptNo() {
            return this.deptNo;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setEmpType(String empType) {
            this.empType = empType;
            return this;
        }
        public String getEmpType() {
            return this.empType;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setEmpTypeExt(String empTypeExt) {
            this.empTypeExt = empTypeExt;
            return this;
        }
        public String getEmpTypeExt() {
            return this.empTypeExt;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setFullPartTime(String fullPartTime) {
            this.fullPartTime = fullPartTime;
            return this;
        }
        public String getFullPartTime() {
            return this.fullPartTime;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGitModified(Long gitModified) {
            this.gitModified = gitModified;
            return this;
        }
        public Long getGitModified() {
            return this.gitModified;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGitPassword(String gitPassword) {
            this.gitPassword = gitPassword;
            return this;
        }
        public String getGitPassword() {
            return this.gitPassword;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGmtEntry(Long gmtEntry) {
            this.gmtEntry = gmtEntry;
            return this;
        }
        public Long getGmtEntry() {
            return this.gmtEntry;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGmtLeave(Long gmtLeave) {
            this.gmtLeave = gmtLeave;
            return this;
        }
        public Long getGmtLeave() {
            return this.gmtLeave;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
            return this;
        }
        public String getLoginAccount() {
            return this.loginAccount;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setManager(Boolean manager) {
            this.manager = manager;
            return this;
        }
        public Boolean getManager() {
            return this.manager;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setSuperName(String superName) {
            this.superName = superName;
            return this;
        }
        public String getSuperName() {
            return this.superName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setSuperNickName(String superNickName) {
            this.superNickName = superNickName;
            return this;
        }
        public String getSuperNickName() {
            return this.superNickName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setSuperWorkNo(String superWorkNo) {
            this.superWorkNo = superWorkNo;
            return this;
        }
        public String getSuperWorkNo() {
            return this.superWorkNo;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setTenantAdmin(Boolean tenantAdmin) {
            this.tenantAdmin = tenantAdmin;
            return this;
        }
        public Boolean getTenantAdmin() {
            return this.tenantAdmin;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setVirtName(String virtName) {
            this.virtName = virtName;
            return this;
        }
        public String getVirtName() {
            return this.virtName;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setVirtWorkNo(String virtWorkNo) {
            this.virtWorkNo = virtWorkNo;
            return this;
        }
        public String getVirtWorkNo() {
            return this.virtWorkNo;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setWorkStatus(String workStatus) {
            this.workStatus = workStatus;
            return this;
        }
        public String getWorkStatus() {
            return this.workStatus;
        }

        public GetLinkeLinktCurrentuserResponseBodyData setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

}
