// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutMyreleasesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResult> result;

    public static ListLinkeBahamutMyreleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutMyreleasesResponseBody self = new ListLinkeBahamutMyreleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutMyreleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutMyreleasesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutMyreleasesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutMyreleasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutMyreleasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutMyreleasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutMyreleasesResponseBody setResult(java.util.List<ListLinkeBahamutMyreleasesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultManagers extends TeaModel {
        @NameInMap("Account")
        public String account;

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

        public static ListLinkeBahamutMyreleasesResponseBodyResultManagers build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultManagers self = new ListLinkeBahamutMyreleasesResponseBodyResultManagers();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultManagers setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultStages extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseStatus")
        public String releaseStatus;

        @NameInMap("Status")
        public String status;

        public static ListLinkeBahamutMyreleasesResponseBodyResultStages build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultStages self = new ListLinkeBahamutMyreleasesResponseBodyResultStages();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultStages setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultStages setReleaseStatus(String releaseStatus) {
            this.releaseStatus = releaseStatus;
            return this;
        }
        public String getReleaseStatus() {
            return this.releaseStatus;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo extends TeaModel {
        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Info")
        public String info;

        @NameInMap("Status")
        public String status;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo self = new ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo extends TeaModel {
        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Info")
        public String info;

        @NameInMap("Status")
        public String status;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo self = new ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos extends TeaModel {
        @NameInMap("CloudTenantId")
        public String cloudTenantId;

        @NameInMap("CloudTenantName")
        public String cloudTenantName;

        @NameInMap("PreEnvReleaseInfo")
        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo preEnvReleaseInfo;

        @NameInMap("ProdEnvReleaseInfo")
        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo prodEnvReleaseInfo;

        public static ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos self = new ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos setCloudTenantId(String cloudTenantId) {
            this.cloudTenantId = cloudTenantId;
            return this;
        }
        public String getCloudTenantId() {
            return this.cloudTenantId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos setCloudTenantName(String cloudTenantName) {
            this.cloudTenantName = cloudTenantName;
            return this;
        }
        public String getCloudTenantName() {
            return this.cloudTenantName;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos setPreEnvReleaseInfo(ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo preEnvReleaseInfo) {
            this.preEnvReleaseInfo = preEnvReleaseInfo;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosPreEnvReleaseInfo getPreEnvReleaseInfo() {
            return this.preEnvReleaseInfo;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos setProdEnvReleaseInfo(ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo prodEnvReleaseInfo) {
            this.prodEnvReleaseInfo = prodEnvReleaseInfo;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfosProdEnvReleaseInfo getProdEnvReleaseInfo() {
            return this.prodEnvReleaseInfo;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins extends TeaModel {
        @NameInMap("Account")
        public String account;

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

        public static ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins self = new ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator extends TeaModel {
        @NameInMap("Account")
        public String account;

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

        public static ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator self = new ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser extends TeaModel {
        @NameInMap("Account")
        public String account;

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

        public static ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser self = new ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("AccessToken")
        public String accessToken;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Customer")
        public String customer;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DropQualityApprovslDate")
        public Long dropQualityApprovslDate;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("FromAliyun")
        public Boolean fromAliyun;

        @NameInMap("HaveNotInited")
        public Boolean haveNotInited;

        @NameInMap("Id")
        public String id;

        @NameInMap("InitStep")
        public String initStep;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenMyBankControl")
        public Boolean openMyBankControl;

        @NameInMap("Path")
        public String path;

        @NameInMap("UseConfigTypes")
        public Boolean useConfigTypes;

        @NameInMap("YunYou")
        public Boolean yunYou;

        @NameInMap("AuthorizedUsers")
        public java.util.List<String> authorizedUsers;

        @NameInMap("ConfigTypes")
        public java.util.List<String> configTypes;

        @NameInMap("SitMergeTrialList")
        public java.util.List<String> sitMergeTrialList;

        @NameInMap("TrialList")
        public java.util.List<String> trialList;

        @NameInMap("ZoneModeList")
        public java.util.List<String> zoneModeList;

        public static ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant self = new ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setDropQualityApprovslDate(Long dropQualityApprovslDate) {
            this.dropQualityApprovslDate = dropQualityApprovslDate;
            return this;
        }
        public Long getDropQualityApprovslDate() {
            return this.dropQualityApprovslDate;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setFromAliyun(Boolean fromAliyun) {
            this.fromAliyun = fromAliyun;
            return this;
        }
        public Boolean getFromAliyun() {
            return this.fromAliyun;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setHaveNotInited(Boolean haveNotInited) {
            this.haveNotInited = haveNotInited;
            return this;
        }
        public Boolean getHaveNotInited() {
            return this.haveNotInited;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setInitStep(String initStep) {
            this.initStep = initStep;
            return this;
        }
        public String getInitStep() {
            return this.initStep;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setOpenMyBankControl(Boolean openMyBankControl) {
            this.openMyBankControl = openMyBankControl;
            return this;
        }
        public Boolean getOpenMyBankControl() {
            return this.openMyBankControl;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setUseConfigTypes(Boolean useConfigTypes) {
            this.useConfigTypes = useConfigTypes;
            return this;
        }
        public Boolean getUseConfigTypes() {
            return this.useConfigTypes;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setYunYou(Boolean yunYou) {
            this.yunYou = yunYou;
            return this;
        }
        public Boolean getYunYou() {
            return this.yunYou;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setAuthorizedUsers(java.util.List<String> authorizedUsers) {
            this.authorizedUsers = authorizedUsers;
            return this;
        }
        public java.util.List<String> getAuthorizedUsers() {
            return this.authorizedUsers;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setConfigTypes(java.util.List<String> configTypes) {
            this.configTypes = configTypes;
            return this;
        }
        public java.util.List<String> getConfigTypes() {
            return this.configTypes;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setSitMergeTrialList(java.util.List<String> sitMergeTrialList) {
            this.sitMergeTrialList = sitMergeTrialList;
            return this;
        }
        public java.util.List<String> getSitMergeTrialList() {
            return this.sitMergeTrialList;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setTrialList(java.util.List<String> trialList) {
            this.trialList = trialList;
            return this;
        }
        public java.util.List<String> getTrialList() {
            return this.trialList;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant setZoneModeList(java.util.List<String> zoneModeList) {
            this.zoneModeList = zoneModeList;
            return this;
        }
        public java.util.List<String> getZoneModeList() {
            return this.zoneModeList;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultAppGroup extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Type")
        public String type;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        @NameInMap("Admins")
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins> admins;

        @NameInMap("Creator")
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator creator;

        @NameInMap("ModifiyUser")
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser modifiyUser;

        @NameInMap("Tenant")
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant tenant;

        public static ListLinkeBahamutMyreleasesResponseBodyResultAppGroup build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultAppGroup self = new ListLinkeBahamutMyreleasesResponseBodyResultAppGroup();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setAdmins(java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultAppGroupAdmins> getAdmins() {
            return this.admins;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setCreator(ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupCreator getCreator() {
            return this.creator;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setModifiyUser(ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser modifiyUser) {
            this.modifiyUser = modifiyUser;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupModifiyUser getModifiyUser() {
            return this.modifiyUser;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup setTenant(ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant tenant) {
            this.tenant = tenant;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroupTenant getTenant() {
            return this.tenant;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResultCreator extends TeaModel {
        @NameInMap("Account")
        public String account;

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

        public static ListLinkeBahamutMyreleasesResponseBodyResultCreator build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResultCreator self = new ListLinkeBahamutMyreleasesResponseBodyResultCreator();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResultCreator setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutMyreleasesResponseBodyResult extends TeaModel {
        @NameInMap("AfterFastDevDate")
        public Boolean afterFastDevDate;

        @NameInMap("AoneReleaseId")
        public String aoneReleaseId;

        @NameInMap("Attachable")
        public Boolean attachable;

        @NameInMap("BetaRelease")
        public Boolean betaRelease;

        @NameInMap("ContainPreInMultiEnv")
        public Boolean containPreInMultiEnv;

        @NameInMap("Created")
        public Long created;

        @NameInMap("DailyRelease")
        public Boolean dailyRelease;

        @NameInMap("Deadlines")
        public String deadlines;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Dependencies")
        public String dependencies;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("GreenChannelId")
        public String greenChannelId;

        @NameInMap("GreenChannelName")
        public String greenChannelName;

        @NameInMap("GreenChannelPortalUrl")
        public String greenChannelPortalUrl;

        @NameInMap("HasCreatedAppReleaseDetail")
        public Boolean hasCreatedAppReleaseDetail;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationType")
        public String iterationType;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("MergeStartTime")
        public Long mergeStartTime;

        @NameInMap("MultiEnvRelease")
        public Boolean multiEnvRelease;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagAndMergeMasterWhenEmergency")
        public Boolean tagAndMergeMasterWhenEmergency;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Type")
        public String type;

        @NameInMap("WindowRelease")
        public Boolean windowRelease;

        @NameInMap("DelAppMetaIds")
        public java.util.List<String> delAppMetaIds;

        @NameInMap("Managers")
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultManagers> managers;

        @NameInMap("Stages")
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultStages> stages;

        @NameInMap("TenantReleaseInfos")
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos> tenantReleaseInfos;

        @NameInMap("AppGroup")
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup appGroup;

        @NameInMap("Creator")
        public ListLinkeBahamutMyreleasesResponseBodyResultCreator creator;

        public static ListLinkeBahamutMyreleasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutMyreleasesResponseBodyResult self = new ListLinkeBahamutMyreleasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setAfterFastDevDate(Boolean afterFastDevDate) {
            this.afterFastDevDate = afterFastDevDate;
            return this;
        }
        public Boolean getAfterFastDevDate() {
            return this.afterFastDevDate;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setAttachable(Boolean attachable) {
            this.attachable = attachable;
            return this;
        }
        public Boolean getAttachable() {
            return this.attachable;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setBetaRelease(Boolean betaRelease) {
            this.betaRelease = betaRelease;
            return this;
        }
        public Boolean getBetaRelease() {
            return this.betaRelease;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
            this.containPreInMultiEnv = containPreInMultiEnv;
            return this;
        }
        public Boolean getContainPreInMultiEnv() {
            return this.containPreInMultiEnv;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setDailyRelease(Boolean dailyRelease) {
            this.dailyRelease = dailyRelease;
            return this;
        }
        public Boolean getDailyRelease() {
            return this.dailyRelease;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setDeadlines(String deadlines) {
            this.deadlines = deadlines;
            return this;
        }
        public String getDeadlines() {
            return this.deadlines;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setGreenChannelId(String greenChannelId) {
            this.greenChannelId = greenChannelId;
            return this;
        }
        public String getGreenChannelId() {
            return this.greenChannelId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setGreenChannelName(String greenChannelName) {
            this.greenChannelName = greenChannelName;
            return this;
        }
        public String getGreenChannelName() {
            return this.greenChannelName;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setGreenChannelPortalUrl(String greenChannelPortalUrl) {
            this.greenChannelPortalUrl = greenChannelPortalUrl;
            return this;
        }
        public String getGreenChannelPortalUrl() {
            return this.greenChannelPortalUrl;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
            this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
            return this;
        }
        public Boolean getHasCreatedAppReleaseDetail() {
            return this.hasCreatedAppReleaseDetail;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setIterationType(String iterationType) {
            this.iterationType = iterationType;
            return this;
        }
        public String getIterationType() {
            return this.iterationType;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setMergeStartTime(Long mergeStartTime) {
            this.mergeStartTime = mergeStartTime;
            return this;
        }
        public Long getMergeStartTime() {
            return this.mergeStartTime;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setMultiEnvRelease(Boolean multiEnvRelease) {
            this.multiEnvRelease = multiEnvRelease;
            return this;
        }
        public Boolean getMultiEnvRelease() {
            return this.multiEnvRelease;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setWindowRelease(Boolean windowRelease) {
            this.windowRelease = windowRelease;
            return this;
        }
        public Boolean getWindowRelease() {
            return this.windowRelease;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setDelAppMetaIds(java.util.List<String> delAppMetaIds) {
            this.delAppMetaIds = delAppMetaIds;
            return this;
        }
        public java.util.List<String> getDelAppMetaIds() {
            return this.delAppMetaIds;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setManagers(java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultManagers> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultManagers> getManagers() {
            return this.managers;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setStages(java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultStages> getStages() {
            return this.stages;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setTenantReleaseInfos(java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos> tenantReleaseInfos) {
            this.tenantReleaseInfos = tenantReleaseInfos;
            return this;
        }
        public java.util.List<ListLinkeBahamutMyreleasesResponseBodyResultTenantReleaseInfos> getTenantReleaseInfos() {
            return this.tenantReleaseInfos;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setAppGroup(ListLinkeBahamutMyreleasesResponseBodyResultAppGroup appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultAppGroup getAppGroup() {
            return this.appGroup;
        }

        public ListLinkeBahamutMyreleasesResponseBodyResult setCreator(ListLinkeBahamutMyreleasesResponseBodyResultCreator creator) {
            this.creator = creator;
            return this;
        }
        public ListLinkeBahamutMyreleasesResponseBodyResultCreator getCreator() {
            return this.creator;
        }

    }

}
