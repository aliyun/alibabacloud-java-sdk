// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAppviewAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAppviewAppsResponseBodyResponse response;

    public static QueryRmsAppviewAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAppviewAppsResponseBody self = new QueryRmsAppviewAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAppviewAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAppviewAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAppviewAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAppviewAppsResponseBody setResponse(QueryRmsAppviewAppsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAppviewAppsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultAppDomains extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryRmsAppviewAppsResponseBodyResponseResultAppDomains build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultAppDomains self = new QueryRmsAppviewAppsResponseBodyResponseResultAppDomains();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultAppDomains setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultAppDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("MonitorEnable")
        public Boolean monitorEnable;

        @NameInMap("MonitorPort")
        public String monitorPort;

        @NameInMap("NormalResourceIds")
        public String normalResourceIds;

        @NameInMap("ResourcesAlertCount")
        public String resourcesAlertCount;

        @NameInMap("ResourcesCount")
        public String resourcesCount;

        @NameInMap("ResourcesNormalCount")
        public String resourcesNormalCount;

        @NameInMap("ResourcesUnconfigedCount")
        public String resourcesUnconfigedCount;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("AlertResourceIds")
        public java.util.List<String> alertResourceIds;

        @NameInMap("ItemTypeConfig")
        public java.util.List<String> itemTypeConfig;

        @NameInMap("ItemTypeNoneConfig")
        public java.util.List<String> itemTypeNoneConfig;

        @NameInMap("ItemTypePartialConfig")
        public java.util.List<String> itemTypePartialConfig;

        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("UnconfigedResourceIds")
        public java.util.List<String> unconfigedResourceIds;

        public static QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData self = new QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setMonitorEnable(Boolean monitorEnable) {
            this.monitorEnable = monitorEnable;
            return this;
        }
        public Boolean getMonitorEnable() {
            return this.monitorEnable;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setMonitorPort(String monitorPort) {
            this.monitorPort = monitorPort;
            return this;
        }
        public String getMonitorPort() {
            return this.monitorPort;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setNormalResourceIds(String normalResourceIds) {
            this.normalResourceIds = normalResourceIds;
            return this;
        }
        public String getNormalResourceIds() {
            return this.normalResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourcesAlertCount(String resourcesAlertCount) {
            this.resourcesAlertCount = resourcesAlertCount;
            return this;
        }
        public String getResourcesAlertCount() {
            return this.resourcesAlertCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourcesCount(String resourcesCount) {
            this.resourcesCount = resourcesCount;
            return this;
        }
        public String getResourcesCount() {
            return this.resourcesCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourcesNormalCount(String resourcesNormalCount) {
            this.resourcesNormalCount = resourcesNormalCount;
            return this;
        }
        public String getResourcesNormalCount() {
            return this.resourcesNormalCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourcesUnconfigedCount(String resourcesUnconfigedCount) {
            this.resourcesUnconfigedCount = resourcesUnconfigedCount;
            return this;
        }
        public String getResourcesUnconfigedCount() {
            return this.resourcesUnconfigedCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setAlertResourceIds(java.util.List<String> alertResourceIds) {
            this.alertResourceIds = alertResourceIds;
            return this;
        }
        public java.util.List<String> getAlertResourceIds() {
            return this.alertResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setItemTypeConfig(java.util.List<String> itemTypeConfig) {
            this.itemTypeConfig = itemTypeConfig;
            return this;
        }
        public java.util.List<String> getItemTypeConfig() {
            return this.itemTypeConfig;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setItemTypeNoneConfig(java.util.List<String> itemTypeNoneConfig) {
            this.itemTypeNoneConfig = itemTypeNoneConfig;
            return this;
        }
        public java.util.List<String> getItemTypeNoneConfig() {
            return this.itemTypeNoneConfig;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setItemTypePartialConfig(java.util.List<String> itemTypePartialConfig) {
            this.itemTypePartialConfig = itemTypePartialConfig;
            return this;
        }
        public java.util.List<String> getItemTypePartialConfig() {
            return this.itemTypePartialConfig;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData setUnconfigedResourceIds(java.util.List<String> unconfigedResourceIds) {
            this.unconfigedResourceIds = unconfigedResourceIds;
            return this;
        }
        public java.util.List<String> getUnconfigedResourceIds() {
            return this.unconfigedResourceIds;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType extends TeaModel {
        @NameInMap("ResourceAlertCount")
        public String resourceAlertCount;

        @NameInMap("ResourceAllCount")
        public String resourceAllCount;

        @NameInMap("ResourceNormalCount")
        public String resourceNormalCount;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceUnconfigedCount")
        public String resourceUnconfigedCount;

        @NameInMap("AlertResourceIds")
        public java.util.List<String> alertResourceIds;

        @NameInMap("AllResourceIds")
        public java.util.List<String> allResourceIds;

        @NameInMap("MonitorPorts")
        public java.util.List<String> monitorPorts;

        @NameInMap("NormalResourceIds")
        public java.util.List<String> normalResourceIds;

        @NameInMap("UnconfigedResourceIds")
        public java.util.List<String> unconfigedResourceIds;

        @NameInMap("Data")
        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData data;

        public static QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType self = new QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setResourceAlertCount(String resourceAlertCount) {
            this.resourceAlertCount = resourceAlertCount;
            return this;
        }
        public String getResourceAlertCount() {
            return this.resourceAlertCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setResourceAllCount(String resourceAllCount) {
            this.resourceAllCount = resourceAllCount;
            return this;
        }
        public String getResourceAllCount() {
            return this.resourceAllCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setResourceNormalCount(String resourceNormalCount) {
            this.resourceNormalCount = resourceNormalCount;
            return this;
        }
        public String getResourceNormalCount() {
            return this.resourceNormalCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setResourceUnconfigedCount(String resourceUnconfigedCount) {
            this.resourceUnconfigedCount = resourceUnconfigedCount;
            return this;
        }
        public String getResourceUnconfigedCount() {
            return this.resourceUnconfigedCount;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setAlertResourceIds(java.util.List<String> alertResourceIds) {
            this.alertResourceIds = alertResourceIds;
            return this;
        }
        public java.util.List<String> getAlertResourceIds() {
            return this.alertResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setAllResourceIds(java.util.List<String> allResourceIds) {
            this.allResourceIds = allResourceIds;
            return this;
        }
        public java.util.List<String> getAllResourceIds() {
            return this.allResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setMonitorPorts(java.util.List<String> monitorPorts) {
            this.monitorPorts = monitorPorts;
            return this;
        }
        public java.util.List<String> getMonitorPorts() {
            return this.monitorPorts;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setNormalResourceIds(java.util.List<String> normalResourceIds) {
            this.normalResourceIds = normalResourceIds;
            return this;
        }
        public java.util.List<String> getNormalResourceIds() {
            return this.normalResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setUnconfigedResourceIds(java.util.List<String> unconfigedResourceIds) {
            this.unconfigedResourceIds = unconfigedResourceIds;
            return this;
        }
        public java.util.List<String> getUnconfigedResourceIds() {
            return this.unconfigedResourceIds;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType setData(QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData data) {
            this.data = data;
            return this;
        }
        public QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceTypeData getData() {
            return this.data;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting self = new QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured self = new QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResultResourceIds extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryRmsAppviewAppsResponseBodyResponseResultResourceIds build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResultResourceIds self = new QueryRmsAppviewAppsResponseBodyResponseResultResourceIds();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultResourceIds setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResultResourceIds setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponseResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("LevelId")
        public String levelId;

        @NameInMap("LevelName")
        public String levelName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("AppDomains")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultAppDomains> appDomains;

        @NameInMap("DataByResourceType")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType> dataByResourceType;

        @NameInMap("ItemTypeAlerting")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting> itemTypeAlerting;

        @NameInMap("ItemTypeConfigured")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured> itemTypeConfigured;

        @NameInMap("ResourceIds")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultResourceIds> resourceIds;

        public static QueryRmsAppviewAppsResponseBodyResponseResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponseResult self = new QueryRmsAppviewAppsResponseBodyResponseResult();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setLevelId(String levelId) {
            this.levelId = levelId;
            return this;
        }
        public String getLevelId() {
            return this.levelId;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setAppDomains(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultAppDomains> appDomains) {
            this.appDomains = appDomains;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultAppDomains> getAppDomains() {
            return this.appDomains;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setDataByResourceType(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType> dataByResourceType) {
            this.dataByResourceType = dataByResourceType;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultDataByResourceType> getDataByResourceType() {
            return this.dataByResourceType;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setItemTypeAlerting(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting> itemTypeAlerting) {
            this.itemTypeAlerting = itemTypeAlerting;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeAlerting> getItemTypeAlerting() {
            return this.itemTypeAlerting;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setItemTypeConfigured(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured> itemTypeConfigured) {
            this.itemTypeConfigured = itemTypeConfigured;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultItemTypeConfigured> getItemTypeConfigured() {
            return this.itemTypeConfigured;
        }

        public QueryRmsAppviewAppsResponseBodyResponseResult setResourceIds(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultResourceIds> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResultResourceIds> getResourceIds() {
            return this.resourceIds;
        }

    }

    public static class QueryRmsAppviewAppsResponseBodyResponse extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Result")
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResult> result;

        public static QueryRmsAppviewAppsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsResponseBodyResponse self = new QueryRmsAppviewAppsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsResponseBodyResponse setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryRmsAppviewAppsResponseBodyResponse setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRmsAppviewAppsResponseBodyResponse setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public QueryRmsAppviewAppsResponseBodyResponse setResult(java.util.List<QueryRmsAppviewAppsResponseBodyResponseResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsResponseBodyResponseResult> getResult() {
            return this.result;
        }

    }

}
