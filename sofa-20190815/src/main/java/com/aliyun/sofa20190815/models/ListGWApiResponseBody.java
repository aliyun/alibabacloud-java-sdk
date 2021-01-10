// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWApiResponseBodyData data;

    public static ListGWApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiResponseBody self = new ListGWApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWApiResponseBody setData(ListGWApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWApiResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWApiResponseBodyDataListHistoryVersionList extends TeaModel {
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

        public static ListGWApiResponseBodyDataListHistoryVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListHistoryVersionList self = new ListGWApiResponseBodyDataListHistoryVersionList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiResponseBodyDataListHistoryVersionList setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiResponseBodyDataListReqParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiResponseBodyDataListReqParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListReqParamsRspCodeList self = new ListGWApiResponseBodyDataListReqParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListReqParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiResponseBodyDataListReqParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiResponseBodyDataListReqParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiResponseBodyDataListReqParams extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListReqParamsRspCodeList> rspCodeList;

        public static ListGWApiResponseBodyDataListReqParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListReqParams self = new ListGWApiResponseBodyDataListReqParams();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListReqParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListReqParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiResponseBodyDataListReqParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListReqParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiResponseBodyDataListReqParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiResponseBodyDataListReqParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiResponseBodyDataListReqParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiResponseBodyDataListReqParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiResponseBodyDataListReqParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiResponseBodyDataListReqParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListReqParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiResponseBodyDataListReqParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiResponseBodyDataListReqParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiResponseBodyDataListReqParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListReqParams setRspCodeList(java.util.List<ListGWApiResponseBodyDataListReqParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListReqParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList self = new ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiResponseBodyDataListUpstreamParamMappings extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList;

        public static ListGWApiResponseBodyDataListUpstreamParamMappings build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListUpstreamParamMappings self = new ListGWApiResponseBodyDataListUpstreamParamMappings();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListUpstreamParamMappings setRspCodeList(java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappingsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiResponseBodyDataListApiCacheModelCacheKeys extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Location")
        public String location;

        public static ListGWApiResponseBodyDataListApiCacheModelCacheKeys build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListApiCacheModelCacheKeys self = new ListGWApiResponseBodyDataListApiCacheModelCacheKeys();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListApiCacheModelCacheKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiResponseBodyDataListApiCacheModelCacheKeys setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ListGWApiResponseBodyDataListApiCacheModel extends TeaModel {
        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("CacheKeys")
        public java.util.List<ListGWApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys;

        public static ListGWApiResponseBodyDataListApiCacheModel build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListApiCacheModel self = new ListGWApiResponseBodyDataListApiCacheModel();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListApiCacheModel setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public ListGWApiResponseBodyDataListApiCacheModel setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public ListGWApiResponseBodyDataListApiCacheModel setCacheKeys(java.util.List<ListGWApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys) {
            this.cacheKeys = cacheKeys;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListApiCacheModelCacheKeys> getCacheKeys() {
            return this.cacheKeys;
        }

    }

    public static class ListGWApiResponseBodyDataListApiLimitConfig extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("LimitRspType")
        public String limitRspType;

        @NameInMap("NeedLimit")
        public Boolean needLimit;

        @NameInMap("RspMsg")
        public String rspMsg;

        public static ListGWApiResponseBodyDataListApiLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListApiLimitConfig self = new ListGWApiResponseBodyDataListApiLimitConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListApiLimitConfig setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public ListGWApiResponseBodyDataListApiLimitConfig setLimitRspType(String limitRspType) {
            this.limitRspType = limitRspType;
            return this;
        }
        public String getLimitRspType() {
            return this.limitRspType;
        }

        public ListGWApiResponseBodyDataListApiLimitConfig setNeedLimit(Boolean needLimit) {
            this.needLimit = needLimit;
            return this;
        }
        public Boolean getNeedLimit() {
            return this.needLimit;
        }

        public ListGWApiResponseBodyDataListApiLimitConfig setRspMsg(String rspMsg) {
            this.rspMsg = rspMsg;
            return this;
        }
        public String getRspMsg() {
            return this.rspMsg;
        }

    }

    public static class ListGWApiResponseBodyDataListApiMockConfig extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        public static ListGWApiResponseBodyDataListApiMockConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListApiMockConfig self = new ListGWApiResponseBodyDataListApiMockConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListApiMockConfig setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

    }

    public static class ListGWApiResponseBodyDataListCorsInfo extends TeaModel {
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

        public static ListGWApiResponseBodyDataListCorsInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListCorsInfo self = new ListGWApiResponseBodyDataListCorsInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListCorsInfo setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public ListGWApiResponseBodyDataListCorsInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListCorsInfo setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWApiResponseBodyDataListCorsInfo setCorsName(String corsName) {
            this.corsName = corsName;
            return this;
        }
        public String getCorsName() {
            return this.corsName;
        }

        public ListGWApiResponseBodyDataListCorsInfo setCorsScop(String corsScop) {
            this.corsScop = corsScop;
            return this;
        }
        public String getCorsScop() {
            return this.corsScop;
        }

        public ListGWApiResponseBodyDataListCorsInfo setCorsStatus(String corsStatus) {
            this.corsStatus = corsStatus;
            return this;
        }
        public String getCorsStatus() {
            return this.corsStatus;
        }

        public ListGWApiResponseBodyDataListCorsInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListCorsInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListCorsInfo setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

        public ListGWApiResponseBodyDataListCorsInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListCorsInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListCorsInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListCorsInfo setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public ListGWApiResponseBodyDataListCorsInfo setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public ListGWApiResponseBodyDataListCorsInfo setAllowOrigins(java.util.List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public java.util.List<String> getAllowOrigins() {
            return this.allowOrigins;
        }

        public ListGWApiResponseBodyDataListCorsInfo setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

    }

    public static class ListGWApiResponseBodyDataListEditVersion extends TeaModel {
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

        public static ListGWApiResponseBodyDataListEditVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListEditVersion self = new ListGWApiResponseBodyDataListEditVersion();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListEditVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListEditVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiResponseBodyDataListEditVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListEditVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiResponseBodyDataListEditVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListEditVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiResponseBodyDataListEditVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiResponseBodyDataListEditVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiResponseBodyDataListEditVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiResponseBodyDataListEditVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiResponseBodyDataListEditVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiResponseBodyDataListEditVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiResponseBodyDataListEditVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiResponseBodyDataListEditVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList self = new ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthParams extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList;

        public static ListGWApiResponseBodyDataListExternalAuthParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthParams self = new ListGWApiResponseBodyDataListExternalAuthParams();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthParams setRspCodeList(java.util.List<ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster extends TeaModel {
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
        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster self = new ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs extends TeaModel {
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
        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs self = new ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSystemCluster(ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthRouterInfo extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs;

        public static ListGWApiResponseBodyDataListExternalAuthRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthRouterInfo self = new ListGWApiResponseBodyDataListExternalAuthRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthRouterInfo setRouterConfigs(java.util.List<ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig self = new ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuthSystemCluster extends TeaModel {
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
        public ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiResponseBodyDataListExternalAuthSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuthSystemCluster self = new ListGWApiResponseBodyDataListExternalAuthSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationConfig(ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiResponseBodyDataListExternalAuth extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthParams> params;

        @NameInMap("RouterInfo")
        public ListGWApiResponseBodyDataListExternalAuthRouterInfo routerInfo;

        @NameInMap("SystemCluster")
        public ListGWApiResponseBodyDataListExternalAuthSystemCluster systemCluster;

        public static ListGWApiResponseBodyDataListExternalAuth build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListExternalAuth self = new ListGWApiResponseBodyDataListExternalAuth();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListExternalAuth setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListExternalAuth setCacheSwitch(String cacheSwitch) {
            this.cacheSwitch = cacheSwitch;
            return this;
        }
        public String getCacheSwitch() {
            return this.cacheSwitch;
        }

        public ListGWApiResponseBodyDataListExternalAuth setCacheTtl(Long cacheTtl) {
            this.cacheTtl = cacheTtl;
            return this;
        }
        public Long getCacheTtl() {
            return this.cacheTtl;
        }

        public ListGWApiResponseBodyDataListExternalAuth setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListExternalAuth setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListExternalAuth setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setExternalAuthName(String externalAuthName) {
            this.externalAuthName = externalAuthName;
            return this;
        }
        public String getExternalAuthName() {
            return this.externalAuthName;
        }

        public ListGWApiResponseBodyDataListExternalAuth setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWApiResponseBodyDataListExternalAuth setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListExternalAuth setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListExternalAuth setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWApiResponseBodyDataListExternalAuth setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWApiResponseBodyDataListExternalAuth setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWApiResponseBodyDataListExternalAuth setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListExternalAuth setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataListExternalAuth setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWApiResponseBodyDataListExternalAuth setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWApiResponseBodyDataListExternalAuth setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListExternalAuth setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWApiResponseBodyDataListExternalAuth setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListExternalAuth setParams(java.util.List<ListGWApiResponseBodyDataListExternalAuthParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListExternalAuthParams> getParams() {
            return this.params;
        }

        public ListGWApiResponseBodyDataListExternalAuth setRouterInfo(ListGWApiResponseBodyDataListExternalAuthRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuthRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWApiResponseBodyDataListExternalAuth setSystemCluster(ListGWApiResponseBodyDataListExternalAuthSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuthSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiResponseBodyDataListOnlineVersion extends TeaModel {
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

        public static ListGWApiResponseBodyDataListOnlineVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListOnlineVersion self = new ListGWApiResponseBodyDataListOnlineVersion();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListOnlineVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWApiResponseBodyDataListOnlineVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWApiResponseBodyDataListReqParamMapping extends TeaModel {
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

        public static ListGWApiResponseBodyDataListReqParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListReqParamMapping self = new ListGWApiResponseBodyDataListReqParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListReqParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListReqParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWApiResponseBodyDataListRespParamMapping extends TeaModel {
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

        public static ListGWApiResponseBodyDataListRespParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRespParamMapping self = new ListGWApiResponseBodyDataListRespParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRespParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListRespParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster extends TeaModel {
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
        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster self = new ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiResponseBodyDataListRouterInfoRouterConfigs extends TeaModel {
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
        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWApiResponseBodyDataListRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRouterInfoRouterConfigs self = new ListGWApiResponseBodyDataListRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWApiResponseBodyDataListRouterInfoRouterConfigs setSystemCluster(ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiResponseBodyDataListRouterInfo extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs;

        public static ListGWApiResponseBodyDataListRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRouterInfo self = new ListGWApiResponseBodyDataListRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiResponseBodyDataListRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWApiResponseBodyDataListRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataListRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListRouterInfo setRouterConfigs(java.util.List<ListGWApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWApiResponseBodyDataListRsqParamRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWApiResponseBodyDataListRsqParamRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRsqParamRspCodeList self = new ListGWApiResponseBodyDataListRsqParamRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRsqParamRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWApiResponseBodyDataListRsqParamRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWApiResponseBodyDataListRsqParamRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWApiResponseBodyDataListRsqParam extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListRsqParamRspCodeList> rspCodeList;

        public static ListGWApiResponseBodyDataListRsqParam build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListRsqParam self = new ListGWApiResponseBodyDataListRsqParam();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListRsqParam setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataListRsqParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWApiResponseBodyDataListRsqParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListRsqParam setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWApiResponseBodyDataListRsqParam setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWApiResponseBodyDataListRsqParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWApiResponseBodyDataListRsqParam setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWApiResponseBodyDataListRsqParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWApiResponseBodyDataListRsqParam setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWApiResponseBodyDataListRsqParam setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListRsqParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWApiResponseBodyDataListRsqParam setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWApiResponseBodyDataListRsqParam setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWApiResponseBodyDataListRsqParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListRsqParam setRspCodeList(java.util.List<ListGWApiResponseBodyDataListRsqParamRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListRsqParamRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig self = new ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWApiResponseBodyDataListSystemCluster extends TeaModel {
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
        public ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWApiResponseBodyDataListSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataListSystemCluster self = new ListGWApiResponseBodyDataListSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataListSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWApiResponseBodyDataListSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiResponseBodyDataListSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataListSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataListSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWApiResponseBodyDataListSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataListSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataListSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWApiResponseBodyDataListSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataListSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWApiResponseBodyDataListSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWApiResponseBodyDataListSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWApiResponseBodyDataListSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataListSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWApiResponseBodyDataListSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataListSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWApiResponseBodyDataListSystemCluster setAuthenticationConfig(ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWApiResponseBodyDataList extends TeaModel {
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
        public java.util.List<ListGWApiResponseBodyDataListHistoryVersionList> historyVersionList;

        @NameInMap("ReqParams")
        public java.util.List<ListGWApiResponseBodyDataListReqParams> reqParams;

        @NameInMap("UpstreamParamMappings")
        public java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings;

        @NameInMap("ApiCacheModel")
        public ListGWApiResponseBodyDataListApiCacheModel apiCacheModel;

        @NameInMap("ApiLimitConfig")
        public ListGWApiResponseBodyDataListApiLimitConfig apiLimitConfig;

        @NameInMap("ApiMockConfig")
        public ListGWApiResponseBodyDataListApiMockConfig apiMockConfig;

        @NameInMap("CorsInfo")
        public ListGWApiResponseBodyDataListCorsInfo corsInfo;

        @NameInMap("EditVersion")
        public ListGWApiResponseBodyDataListEditVersion editVersion;

        @NameInMap("ExternalAuth")
        public ListGWApiResponseBodyDataListExternalAuth externalAuth;

        @NameInMap("OnlineVersion")
        public ListGWApiResponseBodyDataListOnlineVersion onlineVersion;

        @NameInMap("ReqParamMapping")
        public ListGWApiResponseBodyDataListReqParamMapping reqParamMapping;

        @NameInMap("RespParamMapping")
        public ListGWApiResponseBodyDataListRespParamMapping respParamMapping;

        @NameInMap("RouterInfo")
        public ListGWApiResponseBodyDataListRouterInfo routerInfo;

        @NameInMap("RsqParam")
        public ListGWApiResponseBodyDataListRsqParam rsqParam;

        @NameInMap("SystemCluster")
        public ListGWApiResponseBodyDataListSystemCluster systemCluster;

        public static ListGWApiResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataList self = new ListGWApiResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataList setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public ListGWApiResponseBodyDataList setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public ListGWApiResponseBodyDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWApiResponseBodyDataList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListGWApiResponseBodyDataList setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public ListGWApiResponseBodyDataList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListGWApiResponseBodyDataList setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWApiResponseBodyDataList setAuthAppCount(Long authAppCount) {
            this.authAppCount = authAppCount;
            return this;
        }
        public Long getAuthAppCount() {
            return this.authAppCount;
        }

        public ListGWApiResponseBodyDataList setAuthAppInfoId(String authAppInfoId) {
            this.authAppInfoId = authAppInfoId;
            return this;
        }
        public String getAuthAppInfoId() {
            return this.authAppInfoId;
        }

        public ListGWApiResponseBodyDataList setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWApiResponseBodyDataList setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public ListGWApiResponseBodyDataList setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListGWApiResponseBodyDataList setCompleteInterfaceName(String completeInterfaceName) {
            this.completeInterfaceName = completeInterfaceName;
            return this;
        }
        public String getCompleteInterfaceName() {
            return this.completeInterfaceName;
        }

        public ListGWApiResponseBodyDataList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListGWApiResponseBodyDataList setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWApiResponseBodyDataList setCurrentVersionNo(String currentVersionNo) {
            this.currentVersionNo = currentVersionNo;
            return this;
        }
        public String getCurrentVersionNo() {
            return this.currentVersionNo;
        }

        public ListGWApiResponseBodyDataList setDataEncryption(String dataEncryption) {
            this.dataEncryption = dataEncryption;
            return this;
        }
        public String getDataEncryption() {
            return this.dataEncryption;
        }

        public ListGWApiResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWApiResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGWApiResponseBodyDataList setDownstreamProtocol(String downstreamProtocol) {
            this.downstreamProtocol = downstreamProtocol;
            return this;
        }
        public String getDownstreamProtocol() {
            return this.downstreamProtocol;
        }

        public ListGWApiResponseBodyDataList setEditVersionNo(String editVersionNo) {
            this.editVersionNo = editVersionNo;
            return this;
        }
        public String getEditVersionNo() {
            return this.editVersionNo;
        }

        public ListGWApiResponseBodyDataList setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWApiResponseBodyDataList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWApiResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWApiResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWApiResponseBodyDataList setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWApiResponseBodyDataList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWApiResponseBodyDataList setOnlineVersionNo(String onlineVersionNo) {
            this.onlineVersionNo = onlineVersionNo;
            return this;
        }
        public String getOnlineVersionNo() {
            return this.onlineVersionNo;
        }

        public ListGWApiResponseBodyDataList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWApiResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWApiResponseBodyDataList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGWApiResponseBodyDataList setPathMatchType(String pathMatchType) {
            this.pathMatchType = pathMatchType;
            return this;
        }
        public String getPathMatchType() {
            return this.pathMatchType;
        }

        public ListGWApiResponseBodyDataList setReqModelId(String reqModelId) {
            this.reqModelId = reqModelId;
            return this;
        }
        public String getReqModelId() {
            return this.reqModelId;
        }

        public ListGWApiResponseBodyDataList setReqModelName(String reqModelName) {
            this.reqModelName = reqModelName;
            return this;
        }
        public String getReqModelName() {
            return this.reqModelName;
        }

        public ListGWApiResponseBodyDataList setReqParamMappingId(String reqParamMappingId) {
            this.reqParamMappingId = reqParamMappingId;
            return this;
        }
        public String getReqParamMappingId() {
            return this.reqParamMappingId;
        }

        public ListGWApiResponseBodyDataList setReqParamMappingType(String reqParamMappingType) {
            this.reqParamMappingType = reqParamMappingType;
            return this;
        }
        public String getReqParamMappingType() {
            return this.reqParamMappingType;
        }

        public ListGWApiResponseBodyDataList setReqType(String reqType) {
            this.reqType = reqType;
            return this;
        }
        public String getReqType() {
            return this.reqType;
        }

        public ListGWApiResponseBodyDataList setRespModelId(String respModelId) {
            this.respModelId = respModelId;
            return this;
        }
        public String getRespModelId() {
            return this.respModelId;
        }

        public ListGWApiResponseBodyDataList setRespModelName(String respModelName) {
            this.respModelName = respModelName;
            return this;
        }
        public String getRespModelName() {
            return this.respModelName;
        }

        public ListGWApiResponseBodyDataList setRespParamMappingId(String respParamMappingId) {
            this.respParamMappingId = respParamMappingId;
            return this;
        }
        public String getRespParamMappingId() {
            return this.respParamMappingId;
        }

        public ListGWApiResponseBodyDataList setRespType(String respType) {
            this.respType = respType;
            return this;
        }
        public String getRespType() {
            return this.respType;
        }

        public ListGWApiResponseBodyDataList setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWApiResponseBodyDataList setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWApiResponseBodyDataList setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWApiResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWApiResponseBodyDataList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWApiResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWApiResponseBodyDataList setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWApiResponseBodyDataList setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWApiResponseBodyDataList setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWApiResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWApiResponseBodyDataList setHistoryVersionList(java.util.List<ListGWApiResponseBodyDataListHistoryVersionList> historyVersionList) {
            this.historyVersionList = historyVersionList;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListHistoryVersionList> getHistoryVersionList() {
            return this.historyVersionList;
        }

        public ListGWApiResponseBodyDataList setReqParams(java.util.List<ListGWApiResponseBodyDataListReqParams> reqParams) {
            this.reqParams = reqParams;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListReqParams> getReqParams() {
            return this.reqParams;
        }

        public ListGWApiResponseBodyDataList setUpstreamParamMappings(java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings) {
            this.upstreamParamMappings = upstreamParamMappings;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataListUpstreamParamMappings> getUpstreamParamMappings() {
            return this.upstreamParamMappings;
        }

        public ListGWApiResponseBodyDataList setApiCacheModel(ListGWApiResponseBodyDataListApiCacheModel apiCacheModel) {
            this.apiCacheModel = apiCacheModel;
            return this;
        }
        public ListGWApiResponseBodyDataListApiCacheModel getApiCacheModel() {
            return this.apiCacheModel;
        }

        public ListGWApiResponseBodyDataList setApiLimitConfig(ListGWApiResponseBodyDataListApiLimitConfig apiLimitConfig) {
            this.apiLimitConfig = apiLimitConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListApiLimitConfig getApiLimitConfig() {
            return this.apiLimitConfig;
        }

        public ListGWApiResponseBodyDataList setApiMockConfig(ListGWApiResponseBodyDataListApiMockConfig apiMockConfig) {
            this.apiMockConfig = apiMockConfig;
            return this;
        }
        public ListGWApiResponseBodyDataListApiMockConfig getApiMockConfig() {
            return this.apiMockConfig;
        }

        public ListGWApiResponseBodyDataList setCorsInfo(ListGWApiResponseBodyDataListCorsInfo corsInfo) {
            this.corsInfo = corsInfo;
            return this;
        }
        public ListGWApiResponseBodyDataListCorsInfo getCorsInfo() {
            return this.corsInfo;
        }

        public ListGWApiResponseBodyDataList setEditVersion(ListGWApiResponseBodyDataListEditVersion editVersion) {
            this.editVersion = editVersion;
            return this;
        }
        public ListGWApiResponseBodyDataListEditVersion getEditVersion() {
            return this.editVersion;
        }

        public ListGWApiResponseBodyDataList setExternalAuth(ListGWApiResponseBodyDataListExternalAuth externalAuth) {
            this.externalAuth = externalAuth;
            return this;
        }
        public ListGWApiResponseBodyDataListExternalAuth getExternalAuth() {
            return this.externalAuth;
        }

        public ListGWApiResponseBodyDataList setOnlineVersion(ListGWApiResponseBodyDataListOnlineVersion onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public ListGWApiResponseBodyDataListOnlineVersion getOnlineVersion() {
            return this.onlineVersion;
        }

        public ListGWApiResponseBodyDataList setReqParamMapping(ListGWApiResponseBodyDataListReqParamMapping reqParamMapping) {
            this.reqParamMapping = reqParamMapping;
            return this;
        }
        public ListGWApiResponseBodyDataListReqParamMapping getReqParamMapping() {
            return this.reqParamMapping;
        }

        public ListGWApiResponseBodyDataList setRespParamMapping(ListGWApiResponseBodyDataListRespParamMapping respParamMapping) {
            this.respParamMapping = respParamMapping;
            return this;
        }
        public ListGWApiResponseBodyDataListRespParamMapping getRespParamMapping() {
            return this.respParamMapping;
        }

        public ListGWApiResponseBodyDataList setRouterInfo(ListGWApiResponseBodyDataListRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWApiResponseBodyDataListRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWApiResponseBodyDataList setRsqParam(ListGWApiResponseBodyDataListRsqParam rsqParam) {
            this.rsqParam = rsqParam;
            return this;
        }
        public ListGWApiResponseBodyDataListRsqParam getRsqParam() {
            return this.rsqParam;
        }

        public ListGWApiResponseBodyDataList setSystemCluster(ListGWApiResponseBodyDataListSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWApiResponseBodyDataListSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWApiResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWApiResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataPageInfoOrderInfos self = new ListGWApiResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWApiResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWApiResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWApiResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWApiResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyDataPageInfo self = new ListGWApiResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWApiResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWApiResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWApiResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWApiResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWApiResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWApiResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWApiResponseBodyDataPageInfo pageInfo;

        public static ListGWApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWApiResponseBodyData self = new ListGWApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWApiResponseBodyData setList(java.util.List<ListGWApiResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWApiResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWApiResponseBodyData setPageInfo(ListGWApiResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWApiResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
