// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsResourcesResponseBodyResponse response;

    public static QueryRmsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourcesResponseBody self = new QueryRmsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsResourcesResponseBody setResponse(QueryRmsResourcesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsResourcesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsResourcesResponseBodyResponseDataListenersCells extends TeaModel {
        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CellName")
        public String cellName;

        public static QueryRmsResourcesResponseBodyResponseDataListenersCells build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListenersCells self = new QueryRmsResourcesResponseBodyResponseDataListenersCells();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListenersCells setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenersCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataListenersOptions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRmsResourcesResponseBodyResponseDataListenersOptions build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListenersOptions self = new QueryRmsResourcesResponseBodyResponseDataListenersOptions();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListenersOptions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenersOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataListeners extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IdcId")
        public String idcId;

        @NameInMap("IdcName")
        public String idcName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("MasterId")
        public String masterId;

        @NameInMap("PaasId")
        public String paasId;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProviderId")
        public String providerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("Version")
        public String version;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AppServiceIds")
        public java.util.List<String> appServiceIds;

        @NameInMap("AssignedAppIds")
        public java.util.List<String> assignedAppIds;

        @NameInMap("Cells")
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersCells> cells;

        @NameInMap("Options")
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersOptions> options;

        public static QueryRmsResourcesResponseBodyResponseDataListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListeners self = new QueryRmsResourcesResponseBodyResponseDataListeners();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setIdcId(String idcId) {
            this.idcId = idcId;
            return this;
        }
        public String getIdcId() {
            return this.idcId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setIdcName(String idcName) {
            this.idcName = idcName;
            return this;
        }
        public String getIdcName() {
            return this.idcName;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setPaasId(String paasId) {
            this.paasId = paasId;
            return this;
        }
        public String getPaasId() {
            return this.paasId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setAppServiceIds(java.util.List<String> appServiceIds) {
            this.appServiceIds = appServiceIds;
            return this;
        }
        public java.util.List<String> getAppServiceIds() {
            return this.appServiceIds;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setAssignedAppIds(java.util.List<String> assignedAppIds) {
            this.assignedAppIds = assignedAppIds;
            return this;
        }
        public java.util.List<String> getAssignedAppIds() {
            return this.assignedAppIds;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setCells(java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersCells> getCells() {
            return this.cells;
        }

        public QueryRmsResourcesResponseBodyResponseDataListeners setOptions(java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenersOptions> getOptions() {
            return this.options;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo extends TeaModel {
        @NameInMap("AlertState")
        public Boolean alertState;

        @NameInMap("ItemTypeAlerting")
        public java.util.List<String> itemTypeAlerting;

        @NameInMap("ItemTypeConfig")
        public java.util.List<String> itemTypeConfig;

        @NameInMap("ItemTypeNoneConfig")
        public java.util.List<String> itemTypeNoneConfig;

        public static QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo self = new QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo setAlertState(Boolean alertState) {
            this.alertState = alertState;
            return this;
        }
        public Boolean getAlertState() {
            return this.alertState;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo setItemTypeAlerting(java.util.List<String> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<String> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo setItemTypeConfig(java.util.List<String> itemTypeConfig) {
            this.itemTypeConfig = itemTypeConfig;
            return this;
        }
        public java.util.List<String> getItemTypeConfig() {
            return this.itemTypeConfig;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo setItemTypeNoneConfig(java.util.List<String> itemTypeNoneConfig) {
            this.itemTypeNoneConfig = itemTypeNoneConfig;
            return this;
        }
        public java.util.List<String> getItemTypeNoneConfig() {
            return this.itemTypeNoneConfig;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("Port")
        public String port;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener self = new QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataListenerConfigs extends TeaModel {
        @NameInMap("AlertRuleInfoVo")
        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo alertRuleInfoVo;

        @NameInMap("Listener")
        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener listener;

        public static QueryRmsResourcesResponseBodyResponseDataListenerConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataListenerConfigs self = new QueryRmsResourcesResponseBodyResponseDataListenerConfigs();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigs setAlertRuleInfoVo(QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo alertRuleInfoVo) {
            this.alertRuleInfoVo = alertRuleInfoVo;
            return this;
        }
        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsAlertRuleInfoVo getAlertRuleInfoVo() {
            return this.alertRuleInfoVo;
        }

        public QueryRmsResourcesResponseBodyResponseDataListenerConfigs setListener(QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener listener) {
            this.listener = listener;
            return this;
        }
        public QueryRmsResourcesResponseBodyResponseDataListenerConfigsListener getListener() {
            return this.listener;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo extends TeaModel {
        @NameInMap("ItemTypeAlerting")
        public java.util.List<String> itemTypeAlerting;

        @NameInMap("ItemTypeConfigured")
        public java.util.List<String> itemTypeConfigured;

        @NameInMap("ItemTypeNotConfigured")
        public java.util.List<String> itemTypeNotConfigured;

        public static QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo self = new QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo setItemTypeAlerting(java.util.List<String> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<String> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo setItemTypeConfigured(java.util.List<String> itemTypeConfigured) {
            this.itemTypeConfigured = itemTypeConfigured;
            return this;
        }
        public java.util.List<String> getItemTypeConfigured() {
            return this.itemTypeConfigured;
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo setItemTypeNotConfigured(java.util.List<String> itemTypeNotConfigured) {
            this.itemTypeNotConfigured = itemTypeNotConfigured;
            return this;
        }
        public java.util.List<String> getItemTypeNotConfigured() {
            return this.itemTypeNotConfigured;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo extends TeaModel {
        @NameInMap("AlertState")
        public Boolean alertState;

        @NameInMap("ItemTypeAlerting")
        public java.util.List<String> itemTypeAlerting;

        @NameInMap("ItemTypeConfig")
        public java.util.List<String> itemTypeConfig;

        @NameInMap("ItemTypeNoneConfig")
        public java.util.List<String> itemTypeNoneConfig;

        public static QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo self = new QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo setAlertState(Boolean alertState) {
            this.alertState = alertState;
            return this;
        }
        public Boolean getAlertState() {
            return this.alertState;
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo setItemTypeAlerting(java.util.List<String> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<String> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo setItemTypeConfig(java.util.List<String> itemTypeConfig) {
            this.itemTypeConfig = itemTypeConfig;
            return this;
        }
        public java.util.List<String> getItemTypeConfig() {
            return this.itemTypeConfig;
        }

        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo setItemTypeNoneConfig(java.util.List<String> itemTypeNoneConfig) {
            this.itemTypeNoneConfig = itemTypeNoneConfig;
            return this;
        }
        public java.util.List<String> getItemTypeNoneConfig() {
            return this.itemTypeNoneConfig;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponseData extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("CreatedDateTime")
        public Long createdDateTime;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("DataAccessLevel")
        public String dataAccessLevel;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("IdcName")
        public String idcName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("VipAddress")
        public java.util.List<String> vipAddress;

        @NameInMap("Listeners")
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListeners> listeners;

        @NameInMap("ListenerConfigs")
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenerConfigs> listenerConfigs;

        @NameInMap("AlertRuleConfigurationStatusVo")
        public QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo alertRuleConfigurationStatusVo;

        @NameInMap("AlertRuleInfoVo")
        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo alertRuleInfoVo;

        public static QueryRmsResourcesResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponseData self = new QueryRmsResourcesResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponseData setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public QueryRmsResourcesResponseBodyResponseData setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public QueryRmsResourcesResponseBodyResponseData setCreatedDateTime(Long createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }
        public Long getCreatedDateTime() {
            return this.createdDateTime;
        }

        public QueryRmsResourcesResponseBodyResponseData setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public QueryRmsResourcesResponseBodyResponseData setDataAccessLevel(String dataAccessLevel) {
            this.dataAccessLevel = dataAccessLevel;
            return this;
        }
        public String getDataAccessLevel() {
            return this.dataAccessLevel;
        }

        public QueryRmsResourcesResponseBodyResponseData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryRmsResourcesResponseBodyResponseData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryRmsResourcesResponseBodyResponseData setIdcName(String idcName) {
            this.idcName = idcName;
            return this;
        }
        public String getIdcName() {
            return this.idcName;
        }

        public QueryRmsResourcesResponseBodyResponseData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public QueryRmsResourcesResponseBodyResponseData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryRmsResourcesResponseBodyResponseData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryRmsResourcesResponseBodyResponseData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public QueryRmsResourcesResponseBodyResponseData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryRmsResourcesResponseBodyResponseData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public QueryRmsResourcesResponseBodyResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRmsResourcesResponseBodyResponseData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryRmsResourcesResponseBodyResponseData setVipAddress(java.util.List<String> vipAddress) {
            this.vipAddress = vipAddress;
            return this;
        }
        public java.util.List<String> getVipAddress() {
            return this.vipAddress;
        }

        public QueryRmsResourcesResponseBodyResponseData setListeners(java.util.List<QueryRmsResourcesResponseBodyResponseDataListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListeners> getListeners() {
            return this.listeners;
        }

        public QueryRmsResourcesResponseBodyResponseData setListenerConfigs(java.util.List<QueryRmsResourcesResponseBodyResponseDataListenerConfigs> listenerConfigs) {
            this.listenerConfigs = listenerConfigs;
            return this;
        }
        public java.util.List<QueryRmsResourcesResponseBodyResponseDataListenerConfigs> getListenerConfigs() {
            return this.listenerConfigs;
        }

        public QueryRmsResourcesResponseBodyResponseData setAlertRuleConfigurationStatusVo(QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo alertRuleConfigurationStatusVo) {
            this.alertRuleConfigurationStatusVo = alertRuleConfigurationStatusVo;
            return this;
        }
        public QueryRmsResourcesResponseBodyResponseDataAlertRuleConfigurationStatusVo getAlertRuleConfigurationStatusVo() {
            return this.alertRuleConfigurationStatusVo;
        }

        public QueryRmsResourcesResponseBodyResponseData setAlertRuleInfoVo(QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo alertRuleInfoVo) {
            this.alertRuleInfoVo = alertRuleInfoVo;
            return this;
        }
        public QueryRmsResourcesResponseBodyResponseDataAlertRuleInfoVo getAlertRuleInfoVo() {
            return this.alertRuleInfoVo;
        }

    }

    public static class QueryRmsResourcesResponseBodyResponse extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public String totalSize;

        @NameInMap("Data")
        public java.util.List<QueryRmsResourcesResponseBodyResponseData> data;

        public static QueryRmsResourcesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourcesResponseBodyResponse self = new QueryRmsResourcesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourcesResponseBodyResponse setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryRmsResourcesResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRmsResourcesResponseBodyResponse setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

        public QueryRmsResourcesResponseBodyResponse setData(java.util.List<QueryRmsResourcesResponseBodyResponseData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsResourcesResponseBodyResponseData> getData() {
            return this.data;
        }

    }

}
