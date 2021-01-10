// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkspacesResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutWorkspacesResponseBodyResult> result;

    public static QueryLinkeBahamutWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkspacesResponseBody self = new QueryLinkeBahamutWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutWorkspacesResponseBody setResult(java.util.List<QueryLinkeBahamutWorkspacesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutWorkspacesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant extends TeaModel {
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

        public static QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant self = new QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo extends TeaModel {
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

        public static QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo self = new QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setAntXUrl(String antXUrl) {
            this.antXUrl = antXUrl;
            return this;
        }
        public String getAntXUrl() {
            return this.antXUrl;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setAuthTokenType(Boolean authTokenType) {
            this.authTokenType = authTokenType;
            return this;
        }
        public Boolean getAuthTokenType() {
            return this.authTokenType;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setEnvTypeEnum(String envTypeEnum) {
            this.envTypeEnum = envTypeEnum;
            return this;
        }
        public String getEnvTypeEnum() {
            return this.envTypeEnum;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setLdcConsoleUrl(String ldcConsoleUrl) {
            this.ldcConsoleUrl = ldcConsoleUrl;
            return this;
        }
        public String getLdcConsoleUrl() {
            return this.ldcConsoleUrl;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMachImport(Boolean machImport) {
            this.machImport = machImport;
            return this;
        }
        public Boolean getMachImport() {
            return this.machImport;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMachIter(Boolean machIter) {
            this.machIter = machIter;
            return this;
        }
        public Boolean getMachIter() {
            return this.machIter;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setMavenModeEnum(String mavenModeEnum) {
            this.mavenModeEnum = mavenModeEnum;
            return this;
        }
        public String getMavenModeEnum() {
            return this.mavenModeEnum;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setRegistryHost(String registryHost) {
            this.registryHost = registryHost;
            return this;
        }
        public String getRegistryHost() {
            return this.registryHost;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setReleaseTypeEnum(String releaseTypeEnum) {
            this.releaseTypeEnum = releaseTypeEnum;
            return this;
        }
        public String getReleaseTypeEnum() {
            return this.releaseTypeEnum;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setShareOpenAPI(Boolean shareOpenAPI) {
            this.shareOpenAPI = shareOpenAPI;
            return this;
        }
        public Boolean getShareOpenAPI() {
            return this.shareOpenAPI;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setSofarouterEnabled(Boolean sofarouterEnabled) {
            this.sofarouterEnabled = sofarouterEnabled;
            return this;
        }
        public Boolean getSofarouterEnabled() {
            return this.sofarouterEnabled;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo setBuildWorkspaceList(java.util.List<String> buildWorkspaceList) {
            this.buildWorkspaceList = buildWorkspaceList;
            return this;
        }
        public java.util.List<String> getBuildWorkspaceList() {
            return this.buildWorkspaceList;
        }

    }

    public static class QueryLinkeBahamutWorkspacesResponseBodyResultModifier extends TeaModel {
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

        public static QueryLinkeBahamutWorkspacesResponseBodyResultModifier build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkspacesResponseBodyResultModifier self = new QueryLinkeBahamutWorkspacesResponseBodyResultModifier();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setCustomer(String customer) {
            this.customer = customer;
            return this;
        }
        public String getCustomer() {
            return this.customer;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setLastLogin(Long lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }
        public Long getLastLogin() {
            return this.lastLogin;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setWw(String ww) {
            this.ww = ww;
            return this;
        }
        public String getWw() {
            return this.ww;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier setTenants(java.util.List<String> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<String> getTenants() {
            return this.tenants;
        }

    }

    public static class QueryLinkeBahamutWorkspacesResponseBodyResult extends TeaModel {
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
        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant cloudTenant;

        @NameInMap("ExtraInfo")
        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo extraInfo;

        @NameInMap("Modifier")
        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier modifier;

        public static QueryLinkeBahamutWorkspacesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkspacesResponseBodyResult self = new QueryLinkeBahamutWorkspacesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setDefaultUse(Boolean defaultUse) {
            this.defaultUse = defaultUse;
            return this;
        }
        public Boolean getDefaultUse() {
            return this.defaultUse;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setUse(String use) {
            this.use = use;
            return this;
        }
        public String getUse() {
            return this.use;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setCloudTenant(QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant cloudTenant) {
            this.cloudTenant = cloudTenant;
            return this;
        }
        public QueryLinkeBahamutWorkspacesResponseBodyResultCloudTenant getCloudTenant() {
            return this.cloudTenant;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setExtraInfo(QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public QueryLinkeBahamutWorkspacesResponseBodyResultExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public QueryLinkeBahamutWorkspacesResponseBodyResult setModifier(QueryLinkeBahamutWorkspacesResponseBodyResultModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public QueryLinkeBahamutWorkspacesResponseBodyResultModifier getModifier() {
            return this.modifier;
        }

    }

}
