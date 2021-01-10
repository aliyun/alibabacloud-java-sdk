// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutWorkspacesResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutWorkspacesResponseBodyResult> result;

    public static ListLinkeBahamutWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutWorkspacesResponseBody self = new ListLinkeBahamutWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutWorkspacesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutWorkspacesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutWorkspacesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutWorkspacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutWorkspacesResponseBody setResult(java.util.List<ListLinkeBahamutWorkspacesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutWorkspacesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("LinkETenant")
        public String linkETenant;

        @NameInMap("StationName")
        public String stationName;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Token")
        public String token;

        public static ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant self = new ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo extends TeaModel {
        @NameInMap("AntXUrl")
        public String antXUrl;

        @NameInMap("AuthTokenType")
        public Boolean authTokenType;

        @NameInMap("EnvTypeEnum")
        public String envTypeEnum;

        @NameInMap("GroupStrategy")
        public String groupStrategy;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LdcConsoleUrl")
        public String ldcConsoleUrl;

        @NameInMap("MachImport")
        public Boolean machImport;

        @NameInMap("MachIter")
        public Boolean machIter;

        @NameInMap("MavenModeEnum")
        public String mavenModeEnum;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegistryHost")
        public String registryHost;

        @NameInMap("ReleaseTypeEnum")
        public String releaseTypeEnum;

        @NameInMap("ShareOpenAPI")
        public Boolean shareOpenAPI;

        @NameInMap("SofarouterEnabled")
        public Boolean sofarouterEnabled;

        @NameInMap("BuildWorkspaceList")
        public java.util.List<String> buildWorkspaceList;

        public static ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo self = new ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setAntXUrl(String antXUrl) {
            this.antXUrl = antXUrl;
            return this;
        }
        public String getAntXUrl() {
            return this.antXUrl;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setAuthTokenType(Boolean authTokenType) {
            this.authTokenType = authTokenType;
            return this;
        }
        public Boolean getAuthTokenType() {
            return this.authTokenType;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setEnvTypeEnum(String envTypeEnum) {
            this.envTypeEnum = envTypeEnum;
            return this;
        }
        public String getEnvTypeEnum() {
            return this.envTypeEnum;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setLdcConsoleUrl(String ldcConsoleUrl) {
            this.ldcConsoleUrl = ldcConsoleUrl;
            return this;
        }
        public String getLdcConsoleUrl() {
            return this.ldcConsoleUrl;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMachImport(Boolean machImport) {
            this.machImport = machImport;
            return this;
        }
        public Boolean getMachImport() {
            return this.machImport;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMachIter(Boolean machIter) {
            this.machIter = machIter;
            return this;
        }
        public Boolean getMachIter() {
            return this.machIter;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMavenModeEnum(String mavenModeEnum) {
            this.mavenModeEnum = mavenModeEnum;
            return this;
        }
        public String getMavenModeEnum() {
            return this.mavenModeEnum;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setRegistryHost(String registryHost) {
            this.registryHost = registryHost;
            return this;
        }
        public String getRegistryHost() {
            return this.registryHost;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setReleaseTypeEnum(String releaseTypeEnum) {
            this.releaseTypeEnum = releaseTypeEnum;
            return this;
        }
        public String getReleaseTypeEnum() {
            return this.releaseTypeEnum;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setShareOpenAPI(Boolean shareOpenAPI) {
            this.shareOpenAPI = shareOpenAPI;
            return this;
        }
        public Boolean getShareOpenAPI() {
            return this.shareOpenAPI;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setSofarouterEnabled(Boolean sofarouterEnabled) {
            this.sofarouterEnabled = sofarouterEnabled;
            return this;
        }
        public Boolean getSofarouterEnabled() {
            return this.sofarouterEnabled;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo setBuildWorkspaceList(java.util.List<String> buildWorkspaceList) {
            this.buildWorkspaceList = buildWorkspaceList;
            return this;
        }
        public java.util.List<String> getBuildWorkspaceList() {
            return this.buildWorkspaceList;
        }

    }

    public static class ListLinkeBahamutWorkspacesResponseBodyResultModifier extends TeaModel {
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

        public static ListLinkeBahamutWorkspacesResponseBodyResultModifier build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutWorkspacesResponseBodyResultModifier self = new ListLinkeBahamutWorkspacesResponseBodyResultModifier();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResultModifier setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class ListLinkeBahamutWorkspacesResponseBodyResult extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CrossCloud")
        public Boolean crossCloud;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("DefaultUse")
        public Boolean defaultUse;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("LinkETenant")
        public String linkETenant;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Type")
        public String type;

        @NameInMap("Use")
        public String use;

        @NameInMap("WorkspaceGroupId")
        public String workspaceGroupId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("CloudTenant")
        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant cloudTenant;

        @NameInMap("ExtraInfo")
        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo extraInfo;

        @NameInMap("Modifier")
        public ListLinkeBahamutWorkspacesResponseBodyResultModifier modifier;

        public static ListLinkeBahamutWorkspacesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutWorkspacesResponseBodyResult self = new ListLinkeBahamutWorkspacesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setDefaultUse(Boolean defaultUse) {
            this.defaultUse = defaultUse;
            return this;
        }
        public Boolean getDefaultUse() {
            return this.defaultUse;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setUse(String use) {
            this.use = use;
            return this;
        }
        public String getUse() {
            return this.use;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setCloudTenant(ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant cloudTenant) {
            this.cloudTenant = cloudTenant;
            return this;
        }
        public ListLinkeBahamutWorkspacesResponseBodyResultCloudTenant getCloudTenant() {
            return this.cloudTenant;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setExtraInfo(ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ListLinkeBahamutWorkspacesResponseBodyResultExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ListLinkeBahamutWorkspacesResponseBodyResult setModifier(ListLinkeBahamutWorkspacesResponseBodyResultModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public ListLinkeBahamutWorkspacesResponseBodyResultModifier getModifier() {
            return this.modifier;
        }

    }

}
