// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiGroupApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWApiGroupApiResponseBodyData data;

    public static ListGWApiGroupApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiGroupApiResponseBody self = new ListGWApiGroupApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWApiGroupApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWApiGroupApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWApiGroupApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWApiGroupApiResponseBody setData(ListGWApiGroupApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWApiGroupApiResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWApiGroupApiResponseBodyDataListHistoryVersionList extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("EditOperator")
        public String editOperator;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEdit")
        public String gmtEdit;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtOffline")
        public String gmtOffline;

        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("OfflineDesc")
        public String offlineDesc;

        @NameInMap("OfflineOperator")
        public String offlineOperator;

        @NameInMap("OnlineDesc")
        public String onlineDesc;

        @NameInMap("OnlineOperator")
        public String onlineOperator;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("VersionNo")
        public String versionNo;

        @NameInMap("VersionStatus")
        public String versionStatus;

        public static ListGWApiGroupApiResponseBodyDataListHistoryVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListHistoryVersionList self = new ListGWApiGroupApiResponseBodyDataListHistoryVersionList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiGroupApiResponseBodyDataListHistoryVersionList setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList self = new ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListReqParams extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailureDemo")
        public String failureDemo;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SuccessDemo")
        public String successDemo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamLocation")
        public String upstreamLocation;

        @NameInMap("UpstreamName")
        public String upstreamName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RspCodeList")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList> rspCodeList;

        public static ListGWApiGroupApiResponseBodyDataListReqParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListReqParams self = new ListGWApiGroupApiResponseBodyDataListReqParams();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParams setRspCodeList(java.util.List<ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListReqParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList self = new ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailureDemo")
        public String failureDemo;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SuccessDemo")
        public String successDemo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamLocation")
        public String upstreamLocation;

        @NameInMap("UpstreamName")
        public String upstreamName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RspCodeList")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList;

        public static ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings self = new ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings setRspCodeList(java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappingsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Location")
        public String location;

        public static ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys self = new ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListApiCacheModel extends TeaModel {
        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("CacheKeys")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys;

        public static ListGWApiGroupApiResponseBodyDataListApiCacheModel build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListApiCacheModel self = new ListGWApiGroupApiResponseBodyDataListApiCacheModel();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListApiCacheModel setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public ListGWApiGroupApiResponseBodyDataListApiCacheModel setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public ListGWApiGroupApiResponseBodyDataListApiCacheModel setCacheKeys(java.util.List<ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys) {
            this.cacheKeys = cacheKeys;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListApiCacheModelCacheKeys> getCacheKeys() {
            return this.cacheKeys;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListApiLimitConfig extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("LimitRspType")
        public String limitRspType;

        @NameInMap("NeedLimit")
        public Boolean needLimit;

        @NameInMap("RspMsg")
        public String rspMsg;

        public static ListGWApiGroupApiResponseBodyDataListApiLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListApiLimitConfig self = new ListGWApiGroupApiResponseBodyDataListApiLimitConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig setLimitRspType(String limitRspType) {
            this.limitRspType = limitRspType;
            return this;
        }
        public String getLimitRspType() {
            return this.limitRspType;
        }

        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig setNeedLimit(Boolean needLimit) {
            this.needLimit = needLimit;
            return this;
        }
        public Boolean getNeedLimit() {
            return this.needLimit;
        }

        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig setRspMsg(String rspMsg) {
            this.rspMsg = rspMsg;
            return this;
        }
        public String getRspMsg() {
            return this.rspMsg;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListApiMockConfig extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        public static ListGWApiGroupApiResponseBodyDataListApiMockConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListApiMockConfig self = new ListGWApiGroupApiResponseBodyDataListApiMockConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListApiMockConfig setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListCorsInfo extends TeaModel {
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CorsId")
        public String corsId;

        @NameInMap("CorsName")
        public String corsName;

        @NameInMap("CorsScop")
        public String corsScop;

        @NameInMap("CorsStatus")
        public String corsStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MaxAge")
        public Long maxAge;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        @NameInMap("AllowOrigins")
        public java.util.List<String> allowOrigins;

        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        public static ListGWApiGroupApiResponseBodyDataListCorsInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListCorsInfo self = new ListGWApiGroupApiResponseBodyDataListCorsInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setCorsName(String corsName) {
            this.corsName = corsName;
            return this;
        }
        public String getCorsName() {
            return this.corsName;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setCorsScop(String corsScop) {
            this.corsScop = corsScop;
            return this;
        }
        public String getCorsScop() {
            return this.corsScop;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setCorsStatus(String corsStatus) {
            this.corsStatus = corsStatus;
            return this;
        }
        public String getCorsStatus() {
            return this.corsStatus;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setAllowOrigins(java.util.List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public java.util.List<String> getAllowOrigins() {
            return this.allowOrigins;
        }

        public ListGWApiGroupApiResponseBodyDataListCorsInfo setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListEditVersion extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("EditOperator")
        public String editOperator;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEdit")
        public String gmtEdit;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtOffline")
        public String gmtOffline;

        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("OfflineDesc")
        public String offlineDesc;

        @NameInMap("OfflineOperator")
        public String offlineOperator;

        @NameInMap("OnlineDesc")
        public String onlineDesc;

        @NameInMap("OnlineOperator")
        public String onlineOperator;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("VersionNo")
        public String versionNo;

        @NameInMap("VersionStatus")
        public String versionStatus;

        public static ListGWApiGroupApiResponseBodyDataListEditVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListEditVersion self = new ListGWApiGroupApiResponseBodyDataListEditVersion();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiGroupApiResponseBodyDataListEditVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList self = new ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthParams extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailureDemo")
        public String failureDemo;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SuccessDemo")
        public String successDemo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamLocation")
        public String upstreamLocation;

        @NameInMap("UpstreamName")
        public String upstreamName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RspCodeList")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthParams self = new ListGWApiGroupApiResponseBodyDataListExternalAuthParams();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthParams setRspCodeList(java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AuthenticationType")
        public String authenticationType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalAuthCount")
        public Long externalAuthCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LbType")
        public String lbType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("SysType")
        public String sysType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UrlType")
        public String urlType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Host")
        public java.util.List<String> host;

        @NameInMap("AuthenticationConfig")
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster self = new ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs extends TeaModel {
        @NameInMap("ArgKey")
        public String argKey;

        @NameInMap("ArgValue")
        public String argValue;

        @NameInMap("InterceptionRule")
        public String interceptionRule;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("ParamLocation")
        public String paramLocation;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("SystemCluster")
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs self = new ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSystemCluster(ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("RouterName")
        public String routerName;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RouterConfigs")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo self = new ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo setRouterConfigs(java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig self = new ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AuthenticationType")
        public String authenticationType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalAuthCount")
        public Long externalAuthCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LbType")
        public String lbType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("SysType")
        public String sysType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UrlType")
        public String urlType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Host")
        public java.util.List<String> host;

        @NameInMap("AuthenticationConfig")
        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster self = new ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationConfig(ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListExternalAuth extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CacheSwitch")
        public String cacheSwitch;

        @NameInMap("CacheTtl")
        public Long cacheTtl;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalAuthId")
        public String externalAuthId;

        @NameInMap("ExternalAuthName")
        public String externalAuthName;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InterfaceName")
        public String interfaceName;

        @NameInMap("Method")
        public String method;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamPath")
        public String upstreamPath;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UpstreamType")
        public String upstreamType;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Params")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParams> params;

        @NameInMap("RouterInfo")
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo routerInfo;

        @NameInMap("SystemCluster")
        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster systemCluster;

        public static ListGWApiGroupApiResponseBodyDataListExternalAuth build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListExternalAuth self = new ListGWApiGroupApiResponseBodyDataListExternalAuth();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setCacheSwitch(String cacheSwitch) {
            this.cacheSwitch = cacheSwitch;
            return this;
        }
        public String getCacheSwitch() {
            return this.cacheSwitch;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setCacheTtl(Long cacheTtl) {
            this.cacheTtl = cacheTtl;
            return this;
        }
        public Long getCacheTtl() {
            return this.cacheTtl;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setExternalAuthName(String externalAuthName) {
            this.externalAuthName = externalAuthName;
            return this;
        }
        public String getExternalAuthName() {
            return this.externalAuthName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setParams(java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListExternalAuthParams> getParams() {
            return this.params;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setRouterInfo(ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuthRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWApiGroupApiResponseBodyDataListExternalAuth setSystemCluster(ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuthSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListOnlineVersion extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("EditOperator")
        public String editOperator;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEdit")
        public String gmtEdit;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtOffline")
        public String gmtOffline;

        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("OfflineDesc")
        public String offlineDesc;

        @NameInMap("OfflineOperator")
        public String offlineOperator;

        @NameInMap("OnlineDesc")
        public String onlineDesc;

        @NameInMap("OnlineOperator")
        public String onlineOperator;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("VersionNo")
        public String versionNo;

        @NameInMap("VersionStatus")
        public String versionStatus;

        public static ListGWApiGroupApiResponseBodyDataListOnlineVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListOnlineVersion self = new ListGWApiGroupApiResponseBodyDataListOnlineVersion();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiGroupApiResponseBodyDataListOnlineVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListReqParamMapping extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("ConfigTemplate")
        public String configTemplate;

        @NameInMap("ConfigTemplateName")
        public String configTemplateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MappingType")
        public String mappingType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ParamMappingId")
        public String paramMappingId;

        @NameInMap("ParamMappingName")
        public String paramMappingName;

        @NameInMap("ScriptConfig")
        public String scriptConfig;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListGWApiGroupApiResponseBodyDataListReqParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListReqParamMapping self = new ListGWApiGroupApiResponseBodyDataListReqParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListReqParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRespParamMapping extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("ConfigTemplate")
        public String configTemplate;

        @NameInMap("ConfigTemplateName")
        public String configTemplateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MappingType")
        public String mappingType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ParamMappingId")
        public String paramMappingId;

        @NameInMap("ParamMappingName")
        public String paramMappingName;

        @NameInMap("ScriptConfig")
        public String scriptConfig;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListGWApiGroupApiResponseBodyDataListRespParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRespParamMapping self = new ListGWApiGroupApiResponseBodyDataListRespParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListRespParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AuthenticationType")
        public String authenticationType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalAuthCount")
        public Long externalAuthCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LbType")
        public String lbType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("SysType")
        public String sysType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UrlType")
        public String urlType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Host")
        public java.util.List<String> host;

        @NameInMap("AuthenticationConfig")
        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster self = new ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs extends TeaModel {
        @NameInMap("ArgKey")
        public String argKey;

        @NameInMap("ArgValue")
        public String argValue;

        @NameInMap("InterceptionRule")
        public String interceptionRule;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("ParamLocation")
        public String paramLocation;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("SystemCluster")
        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs self = new ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs setSystemCluster(ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRouterInfo extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("RouterName")
        public String routerName;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RouterConfigs")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs;

        public static ListGWApiGroupApiResponseBodyDataListRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRouterInfo self = new ListGWApiGroupApiResponseBodyDataListRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListRouterInfo setRouterConfigs(java.util.List<ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList self = new ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListRsqParam extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailureDemo")
        public String failureDemo;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("RefType")
        public String refType;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("SuccessDemo")
        public String successDemo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpstreamLocation")
        public String upstreamLocation;

        @NameInMap("UpstreamName")
        public String upstreamName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("RspCodeList")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList> rspCodeList;

        public static ListGWApiGroupApiResponseBodyDataListRsqParam build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListRsqParam self = new ListGWApiGroupApiResponseBodyDataListRsqParam();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListRsqParam setRspCodeList(java.util.List<ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListRsqParamRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig self = new ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataListSystemCluster extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("AuthenticationType")
        public String authenticationType;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalAuthCount")
        public Long externalAuthCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LbType")
        public String lbType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Port")
        public Long port;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("SysName")
        public String sysName;

        @NameInMap("SysType")
        public String sysType;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UrlType")
        public String urlType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Host")
        public java.util.List<String> host;

        @NameInMap("AuthenticationConfig")
        public ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiGroupApiResponseBodyDataListSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataListSystemCluster self = new ListGWApiGroupApiResponseBodyDataListSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiGroupApiResponseBodyDataListSystemCluster setAuthenticationConfig(ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataList extends TeaModel {
        @NameInMap("ApiGroupId")
        public String apiGroupId;

        @NameInMap("ApiGroupName")
        public String apiGroupName;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiStatus")
        public String apiStatus;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("AuthenticationType")
        public String authenticationType;

        @NameInMap("AuthAppCount")
        public Long authAppCount;

        @NameInMap("AuthAppInfoId")
        public String authAppInfoId;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CanOperate")
        public Boolean canOperate;

        @NameInMap("Charset")
        public String charset;

        @NameInMap("CompleteInterfaceName")
        public String completeInterfaceName;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CorsId")
        public String corsId;

        @NameInMap("CurrentVersionNo")
        public String currentVersionNo;

        @NameInMap("DataEncryption")
        public String dataEncryption;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DownstreamProtocol")
        public String downstreamProtocol;

        @NameInMap("EditVersionNo")
        public String editVersionNo;

        @NameInMap("ExternalAuthId")
        public String externalAuthId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InterfaceName")
        public String interfaceName;

        @NameInMap("Method")
        public String method;

        @NameInMap("OnlineVersionNo")
        public String onlineVersionNo;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathMatchType")
        public String pathMatchType;

        @NameInMap("ReqModelId")
        public String reqModelId;

        @NameInMap("ReqModelName")
        public String reqModelName;

        @NameInMap("ReqParamMappingId")
        public String reqParamMappingId;

        @NameInMap("ReqParamMappingType")
        public String reqParamMappingType;

        @NameInMap("ReqType")
        public String reqType;

        @NameInMap("RespModelId")
        public String respModelId;

        @NameInMap("RespModelName")
        public String respModelName;

        @NameInMap("RespParamMappingId")
        public String respParamMappingId;

        @NameInMap("RespType")
        public String respType;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("SysId")
        public String sysId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("UpstreamPath")
        public String upstreamPath;

        @NameInMap("UpstreamProtocol")
        public String upstreamProtocol;

        @NameInMap("UpstreamType")
        public String upstreamType;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("HistoryVersionList")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListHistoryVersionList> historyVersionList;

        @NameInMap("ReqParams")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListReqParams> reqParams;

        @NameInMap("UpstreamParamMappings")
        public java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings;

        @NameInMap("ApiCacheModel")
        public ListGWApiGroupApiResponseBodyDataListApiCacheModel apiCacheModel;

        @NameInMap("ApiLimitConfig")
        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig apiLimitConfig;

        @NameInMap("ApiMockConfig")
        public ListGWApiGroupApiResponseBodyDataListApiMockConfig apiMockConfig;

        @NameInMap("CorsInfo")
        public ListGWApiGroupApiResponseBodyDataListCorsInfo corsInfo;

        @NameInMap("EditVersion")
        public ListGWApiGroupApiResponseBodyDataListEditVersion editVersion;

        @NameInMap("ExternalAuth")
        public ListGWApiGroupApiResponseBodyDataListExternalAuth externalAuth;

        @NameInMap("OnlineVersion")
        public ListGWApiGroupApiResponseBodyDataListOnlineVersion onlineVersion;

        @NameInMap("ReqParamMapping")
        public ListGWApiGroupApiResponseBodyDataListReqParamMapping reqParamMapping;

        @NameInMap("RespParamMapping")
        public ListGWApiGroupApiResponseBodyDataListRespParamMapping respParamMapping;

        @NameInMap("RouterInfo")
        public ListGWApiGroupApiResponseBodyDataListRouterInfo routerInfo;

        @NameInMap("RsqParam")
        public ListGWApiGroupApiResponseBodyDataListRsqParam rsqParam;

        @NameInMap("SystemCluster")
        public ListGWApiGroupApiResponseBodyDataListSystemCluster systemCluster;

        public static ListGWApiGroupApiResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataList self = new ListGWApiGroupApiResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataList setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public ListGWApiGroupApiResponseBodyDataList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListGWApiGroupApiResponseBodyDataList setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiGroupApiResponseBodyDataList setAuthAppCount(Long authAppCount) {
            this.authAppCount = authAppCount;
            return this;
        }
        public Long getAuthAppCount() {
            return this.authAppCount;
        }

        public ListGWApiGroupApiResponseBodyDataList setAuthAppInfoId(String authAppInfoId) {
            this.authAppInfoId = authAppInfoId;
            return this;
        }
        public String getAuthAppInfoId() {
            return this.authAppInfoId;
        }

        public ListGWApiGroupApiResponseBodyDataList setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiGroupApiResponseBodyDataList setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public ListGWApiGroupApiResponseBodyDataList setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListGWApiGroupApiResponseBodyDataList setCompleteInterfaceName(String completeInterfaceName) {
            this.completeInterfaceName = completeInterfaceName;
            return this;
        }
        public String getCompleteInterfaceName() {
            return this.completeInterfaceName;
        }

        public ListGWApiGroupApiResponseBodyDataList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListGWApiGroupApiResponseBodyDataList setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWApiGroupApiResponseBodyDataList setCurrentVersionNo(String currentVersionNo) {
            this.currentVersionNo = currentVersionNo;
            return this;
        }
        public String getCurrentVersionNo() {
            return this.currentVersionNo;
        }

        public ListGWApiGroupApiResponseBodyDataList setDataEncryption(String dataEncryption) {
            this.dataEncryption = dataEncryption;
            return this;
        }
        public String getDataEncryption() {
            return this.dataEncryption;
        }

        public ListGWApiGroupApiResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiGroupApiResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGWApiGroupApiResponseBodyDataList setDownstreamProtocol(String downstreamProtocol) {
            this.downstreamProtocol = downstreamProtocol;
            return this;
        }
        public String getDownstreamProtocol() {
            return this.downstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataList setEditVersionNo(String editVersionNo) {
            this.editVersionNo = editVersionNo;
            return this;
        }
        public String getEditVersionNo() {
            return this.editVersionNo;
        }

        public ListGWApiGroupApiResponseBodyDataList setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWApiGroupApiResponseBodyDataList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWApiGroupApiResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiGroupApiResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiGroupApiResponseBodyDataList setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWApiGroupApiResponseBodyDataList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWApiGroupApiResponseBodyDataList setOnlineVersionNo(String onlineVersionNo) {
            this.onlineVersionNo = onlineVersionNo;
            return this;
        }
        public String getOnlineVersionNo() {
            return this.onlineVersionNo;
        }

        public ListGWApiGroupApiResponseBodyDataList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWApiGroupApiResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiGroupApiResponseBodyDataList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGWApiGroupApiResponseBodyDataList setPathMatchType(String pathMatchType) {
            this.pathMatchType = pathMatchType;
            return this;
        }
        public String getPathMatchType() {
            return this.pathMatchType;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqModelId(String reqModelId) {
            this.reqModelId = reqModelId;
            return this;
        }
        public String getReqModelId() {
            return this.reqModelId;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqModelName(String reqModelName) {
            this.reqModelName = reqModelName;
            return this;
        }
        public String getReqModelName() {
            return this.reqModelName;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqParamMappingId(String reqParamMappingId) {
            this.reqParamMappingId = reqParamMappingId;
            return this;
        }
        public String getReqParamMappingId() {
            return this.reqParamMappingId;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqParamMappingType(String reqParamMappingType) {
            this.reqParamMappingType = reqParamMappingType;
            return this;
        }
        public String getReqParamMappingType() {
            return this.reqParamMappingType;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqType(String reqType) {
            this.reqType = reqType;
            return this;
        }
        public String getReqType() {
            return this.reqType;
        }

        public ListGWApiGroupApiResponseBodyDataList setRespModelId(String respModelId) {
            this.respModelId = respModelId;
            return this;
        }
        public String getRespModelId() {
            return this.respModelId;
        }

        public ListGWApiGroupApiResponseBodyDataList setRespModelName(String respModelName) {
            this.respModelName = respModelName;
            return this;
        }
        public String getRespModelName() {
            return this.respModelName;
        }

        public ListGWApiGroupApiResponseBodyDataList setRespParamMappingId(String respParamMappingId) {
            this.respParamMappingId = respParamMappingId;
            return this;
        }
        public String getRespParamMappingId() {
            return this.respParamMappingId;
        }

        public ListGWApiGroupApiResponseBodyDataList setRespType(String respType) {
            this.respType = respType;
            return this;
        }
        public String getRespType() {
            return this.respType;
        }

        public ListGWApiGroupApiResponseBodyDataList setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiGroupApiResponseBodyDataList setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiGroupApiResponseBodyDataList setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiGroupApiResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiGroupApiResponseBodyDataList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWApiGroupApiResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiGroupApiResponseBodyDataList setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWApiGroupApiResponseBodyDataList setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiGroupApiResponseBodyDataList setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWApiGroupApiResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiGroupApiResponseBodyDataList setHistoryVersionList(java.util.List<ListGWApiGroupApiResponseBodyDataListHistoryVersionList> historyVersionList) {
            this.historyVersionList = historyVersionList;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListHistoryVersionList> getHistoryVersionList() {
            return this.historyVersionList;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqParams(java.util.List<ListGWApiGroupApiResponseBodyDataListReqParams> reqParams) {
            this.reqParams = reqParams;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListReqParams> getReqParams() {
            return this.reqParams;
        }

        public ListGWApiGroupApiResponseBodyDataList setUpstreamParamMappings(java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings) {
            this.upstreamParamMappings = upstreamParamMappings;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataListUpstreamParamMappings> getUpstreamParamMappings() {
            return this.upstreamParamMappings;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiCacheModel(ListGWApiGroupApiResponseBodyDataListApiCacheModel apiCacheModel) {
            this.apiCacheModel = apiCacheModel;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListApiCacheModel getApiCacheModel() {
            return this.apiCacheModel;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiLimitConfig(ListGWApiGroupApiResponseBodyDataListApiLimitConfig apiLimitConfig) {
            this.apiLimitConfig = apiLimitConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListApiLimitConfig getApiLimitConfig() {
            return this.apiLimitConfig;
        }

        public ListGWApiGroupApiResponseBodyDataList setApiMockConfig(ListGWApiGroupApiResponseBodyDataListApiMockConfig apiMockConfig) {
            this.apiMockConfig = apiMockConfig;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListApiMockConfig getApiMockConfig() {
            return this.apiMockConfig;
        }

        public ListGWApiGroupApiResponseBodyDataList setCorsInfo(ListGWApiGroupApiResponseBodyDataListCorsInfo corsInfo) {
            this.corsInfo = corsInfo;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListCorsInfo getCorsInfo() {
            return this.corsInfo;
        }

        public ListGWApiGroupApiResponseBodyDataList setEditVersion(ListGWApiGroupApiResponseBodyDataListEditVersion editVersion) {
            this.editVersion = editVersion;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListEditVersion getEditVersion() {
            return this.editVersion;
        }

        public ListGWApiGroupApiResponseBodyDataList setExternalAuth(ListGWApiGroupApiResponseBodyDataListExternalAuth externalAuth) {
            this.externalAuth = externalAuth;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListExternalAuth getExternalAuth() {
            return this.externalAuth;
        }

        public ListGWApiGroupApiResponseBodyDataList setOnlineVersion(ListGWApiGroupApiResponseBodyDataListOnlineVersion onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListOnlineVersion getOnlineVersion() {
            return this.onlineVersion;
        }

        public ListGWApiGroupApiResponseBodyDataList setReqParamMapping(ListGWApiGroupApiResponseBodyDataListReqParamMapping reqParamMapping) {
            this.reqParamMapping = reqParamMapping;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListReqParamMapping getReqParamMapping() {
            return this.reqParamMapping;
        }

        public ListGWApiGroupApiResponseBodyDataList setRespParamMapping(ListGWApiGroupApiResponseBodyDataListRespParamMapping respParamMapping) {
            this.respParamMapping = respParamMapping;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListRespParamMapping getRespParamMapping() {
            return this.respParamMapping;
        }

        public ListGWApiGroupApiResponseBodyDataList setRouterInfo(ListGWApiGroupApiResponseBodyDataListRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWApiGroupApiResponseBodyDataList setRsqParam(ListGWApiGroupApiResponseBodyDataListRsqParam rsqParam) {
            this.rsqParam = rsqParam;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListRsqParam getRsqParam() {
            return this.rsqParam;
        }

        public ListGWApiGroupApiResponseBodyDataList setSystemCluster(ListGWApiGroupApiResponseBodyDataListSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataListSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos self = new ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWApiGroupApiResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWApiGroupApiResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyDataPageInfo self = new ListGWApiGroupApiResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWApiGroupApiResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWApiGroupApiResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWApiGroupApiResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWApiGroupApiResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWApiGroupApiResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWApiGroupApiResponseBodyDataPageInfo pageInfo;

        public static ListGWApiGroupApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiGroupApiResponseBodyData self = new ListGWApiGroupApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWApiGroupApiResponseBodyData setList(java.util.List<ListGWApiGroupApiResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWApiGroupApiResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWApiGroupApiResponseBodyData setPageInfo(ListGWApiGroupApiResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWApiGroupApiResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
