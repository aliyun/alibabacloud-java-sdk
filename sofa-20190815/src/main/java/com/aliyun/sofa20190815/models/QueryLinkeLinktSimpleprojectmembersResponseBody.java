// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSimpleprojectmembersResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinktSimpleprojectmembersResponseBodyData> data;

    public static QueryLinkeLinktSimpleprojectmembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSimpleprojectmembersResponseBody self = new QueryLinkeLinktSimpleprojectmembersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktSimpleprojectmembersResponseBody setData(java.util.List<QueryLinkeLinktSimpleprojectmembersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktSimpleprojectmembersResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktSimpleprojectmembersResponseBodyData extends TeaModel {
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

        public static QueryLinkeLinktSimpleprojectmembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktSimpleprojectmembersResponseBodyData self = new QueryLinkeLinktSimpleprojectmembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setAliFullName(String aliFullName) {
            this.aliFullName = aliFullName;
            return this;
        }
        public String getAliFullName() {
            return this.aliFullName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setBuNo(String buNo) {
            this.buNo = buNo;
            return this;
        }
        public String getBuNo() {
            return this.buNo;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setDeptNo(String deptNo) {
            this.deptNo = deptNo;
            return this;
        }
        public String getDeptNo() {
            return this.deptNo;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setEmpType(String empType) {
            this.empType = empType;
            return this;
        }
        public String getEmpType() {
            return this.empType;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setEmpTypeExt(String empTypeExt) {
            this.empTypeExt = empTypeExt;
            return this;
        }
        public String getEmpTypeExt() {
            return this.empTypeExt;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setFullPartTime(String fullPartTime) {
            this.fullPartTime = fullPartTime;
            return this;
        }
        public String getFullPartTime() {
            return this.fullPartTime;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGitModified(Long gitModified) {
            this.gitModified = gitModified;
            return this;
        }
        public Long getGitModified() {
            return this.gitModified;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGitPassword(String gitPassword) {
            this.gitPassword = gitPassword;
            return this;
        }
        public String getGitPassword() {
            return this.gitPassword;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGmtEntry(Long gmtEntry) {
            this.gmtEntry = gmtEntry;
            return this;
        }
        public Long getGmtEntry() {
            return this.gmtEntry;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGmtLeave(Long gmtLeave) {
            this.gmtLeave = gmtLeave;
            return this;
        }
        public Long getGmtLeave() {
            return this.gmtLeave;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
            return this;
        }
        public String getLoginAccount() {
            return this.loginAccount;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setManager(Boolean manager) {
            this.manager = manager;
            return this;
        }
        public Boolean getManager() {
            return this.manager;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setSuperName(String superName) {
            this.superName = superName;
            return this;
        }
        public String getSuperName() {
            return this.superName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setSuperNickName(String superNickName) {
            this.superNickName = superNickName;
            return this;
        }
        public String getSuperNickName() {
            return this.superNickName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setSuperWorkNo(String superWorkNo) {
            this.superWorkNo = superWorkNo;
            return this;
        }
        public String getSuperWorkNo() {
            return this.superWorkNo;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setTenantAdmin(Boolean tenantAdmin) {
            this.tenantAdmin = tenantAdmin;
            return this;
        }
        public Boolean getTenantAdmin() {
            return this.tenantAdmin;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setVirtName(String virtName) {
            this.virtName = virtName;
            return this;
        }
        public String getVirtName() {
            return this.virtName;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setVirtWorkNo(String virtWorkNo) {
            this.virtWorkNo = virtWorkNo;
            return this;
        }
        public String getVirtWorkNo() {
            return this.virtWorkNo;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setWorkStatus(String workStatus) {
            this.workStatus = workStatus;
            return this;
        }
        public String getWorkStatus() {
            return this.workStatus;
        }

        public QueryLinkeLinktSimpleprojectmembersResponseBodyData setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

}
