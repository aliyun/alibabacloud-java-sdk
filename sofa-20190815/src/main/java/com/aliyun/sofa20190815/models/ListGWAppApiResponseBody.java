// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWAppApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListGWAppApiResponseBodyData data;

    public static ListGWAppApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGWAppApiResponseBody self = new ListGWAppApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGWAppApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGWAppApiResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGWAppApiResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGWAppApiResponseBody setData(ListGWAppApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGWAppApiResponseBodyData getData() {
        return this.data;
    }

    public static class ListGWAppApiResponseBodyDataListHistoryVersionList extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListHistoryVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListHistoryVersionList self = new ListGWAppApiResponseBodyDataListHistoryVersionList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWAppApiResponseBodyDataListHistoryVersionList setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWAppApiResponseBodyDataListReqParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWAppApiResponseBodyDataListReqParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListReqParamsRspCodeList self = new ListGWAppApiResponseBodyDataListReqParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListReqParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWAppApiResponseBodyDataListReqParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWAppApiResponseBodyDataListReqParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWAppApiResponseBodyDataListReqParams extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListReqParamsRspCodeList> rspCodeList;

        public static ListGWAppApiResponseBodyDataListReqParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListReqParams self = new ListGWAppApiResponseBodyDataListReqParams();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListReqParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListReqParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWAppApiResponseBodyDataListReqParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListReqParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWAppApiResponseBodyDataListReqParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWAppApiResponseBodyDataListReqParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWAppApiResponseBodyDataListReqParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWAppApiResponseBodyDataListReqParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWAppApiResponseBodyDataListReqParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWAppApiResponseBodyDataListReqParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListReqParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWAppApiResponseBodyDataListReqParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWAppApiResponseBodyDataListReqParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWAppApiResponseBodyDataListReqParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListReqParams setRspCodeList(java.util.List<ListGWAppApiResponseBodyDataListReqParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListReqParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList self = new ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWAppApiResponseBodyDataListUpstreamParamMappings extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList;

        public static ListGWAppApiResponseBodyDataListUpstreamParamMappings build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListUpstreamParamMappings self = new ListGWAppApiResponseBodyDataListUpstreamParamMappings();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListUpstreamParamMappings setRspCodeList(java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappingsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Location")
        public String location;

        public static ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys self = new ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ListGWAppApiResponseBodyDataListApiCacheModel extends TeaModel {
        @NameInMap("NeedCache")
        public Boolean needCache;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("CacheKeys")
        public java.util.List<ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys;

        public static ListGWAppApiResponseBodyDataListApiCacheModel build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListApiCacheModel self = new ListGWAppApiResponseBodyDataListApiCacheModel();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListApiCacheModel setNeedCache(Boolean needCache) {
            this.needCache = needCache;
            return this;
        }
        public Boolean getNeedCache() {
            return this.needCache;
        }

        public ListGWAppApiResponseBodyDataListApiCacheModel setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public ListGWAppApiResponseBodyDataListApiCacheModel setCacheKeys(java.util.List<ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys> cacheKeys) {
            this.cacheKeys = cacheKeys;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListApiCacheModelCacheKeys> getCacheKeys() {
            return this.cacheKeys;
        }

    }

    public static class ListGWAppApiResponseBodyDataListApiLimitConfig extends TeaModel {
        @NameInMap("Limit")
        public Long limit;

        @NameInMap("LimitRspType")
        public String limitRspType;

        @NameInMap("NeedLimit")
        public Boolean needLimit;

        @NameInMap("RspMsg")
        public String rspMsg;

        public static ListGWAppApiResponseBodyDataListApiLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListApiLimitConfig self = new ListGWAppApiResponseBodyDataListApiLimitConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListApiLimitConfig setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public ListGWAppApiResponseBodyDataListApiLimitConfig setLimitRspType(String limitRspType) {
            this.limitRspType = limitRspType;
            return this;
        }
        public String getLimitRspType() {
            return this.limitRspType;
        }

        public ListGWAppApiResponseBodyDataListApiLimitConfig setNeedLimit(Boolean needLimit) {
            this.needLimit = needLimit;
            return this;
        }
        public Boolean getNeedLimit() {
            return this.needLimit;
        }

        public ListGWAppApiResponseBodyDataListApiLimitConfig setRspMsg(String rspMsg) {
            this.rspMsg = rspMsg;
            return this;
        }
        public String getRspMsg() {
            return this.rspMsg;
        }

    }

    public static class ListGWAppApiResponseBodyDataListApiMockConfig extends TeaModel {
        @NameInMap("MockData")
        public String mockData;

        public static ListGWAppApiResponseBodyDataListApiMockConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListApiMockConfig self = new ListGWAppApiResponseBodyDataListApiMockConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListApiMockConfig setMockData(String mockData) {
            this.mockData = mockData;
            return this;
        }
        public String getMockData() {
            return this.mockData;
        }

    }

    public static class ListGWAppApiResponseBodyDataListCorsInfo extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListCorsInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListCorsInfo self = new ListGWAppApiResponseBodyDataListCorsInfo();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setCorsName(String corsName) {
            this.corsName = corsName;
            return this;
        }
        public String getCorsName() {
            return this.corsName;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setCorsScop(String corsScop) {
            this.corsScop = corsScop;
            return this;
        }
        public String getCorsScop() {
            return this.corsScop;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setCorsStatus(String corsStatus) {
            this.corsStatus = corsStatus;
            return this;
        }
        public String getCorsStatus() {
            return this.corsStatus;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setAllowOrigins(java.util.List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public java.util.List<String> getAllowOrigins() {
            return this.allowOrigins;
        }

        public ListGWAppApiResponseBodyDataListCorsInfo setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

    }

    public static class ListGWAppApiResponseBodyDataListEditVersion extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListEditVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListEditVersion self = new ListGWAppApiResponseBodyDataListEditVersion();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListEditVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWAppApiResponseBodyDataListEditVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList self = new ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthParams extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList;

        public static ListGWAppApiResponseBodyDataListExternalAuthParams build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthParams self = new ListGWAppApiResponseBodyDataListExternalAuthParams();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthParams setRspCodeList(java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParamsRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster self = new ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs self = new ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs setSystemCluster(ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthRouterInfo extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs;

        public static ListGWAppApiResponseBodyDataListExternalAuthRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthRouterInfo self = new ListGWAppApiResponseBodyDataListExternalAuthRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo setRouterConfigs(java.util.List<ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig self = new ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuthSystemCluster extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWAppApiResponseBodyDataListExternalAuthSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuthSystemCluster self = new ListGWAppApiResponseBodyDataListExternalAuthSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster setAuthenticationConfig(ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuthSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWAppApiResponseBodyDataListExternalAuth extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParams> params;

        @NameInMap("RouterInfo")
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo routerInfo;

        @NameInMap("SystemCluster")
        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster systemCluster;

        public static ListGWAppApiResponseBodyDataListExternalAuth build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListExternalAuth self = new ListGWAppApiResponseBodyDataListExternalAuth();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setCacheSwitch(String cacheSwitch) {
            this.cacheSwitch = cacheSwitch;
            return this;
        }
        public String getCacheSwitch() {
            return this.cacheSwitch;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setCacheTtl(Long cacheTtl) {
            this.cacheTtl = cacheTtl;
            return this;
        }
        public Long getCacheTtl() {
            return this.cacheTtl;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setExternalAuthName(String externalAuthName) {
            this.externalAuthName = externalAuthName;
            return this;
        }
        public String getExternalAuthName() {
            return this.externalAuthName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setParams(java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListExternalAuthParams> getParams() {
            return this.params;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setRouterInfo(ListGWAppApiResponseBodyDataListExternalAuthRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuthRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWAppApiResponseBodyDataListExternalAuth setSystemCluster(ListGWAppApiResponseBodyDataListExternalAuthSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuthSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWAppApiResponseBodyDataListOnlineVersion extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListOnlineVersion build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListOnlineVersion self = new ListGWAppApiResponseBodyDataListOnlineVersion();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setEditOperator(String editOperator) {
            this.editOperator = editOperator;
            return this;
        }
        public String getEditOperator() {
            return this.editOperator;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setGmtEdit(String gmtEdit) {
            this.gmtEdit = gmtEdit;
            return this;
        }
        public String getGmtEdit() {
            return this.gmtEdit;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setGmtOffline(String gmtOffline) {
            this.gmtOffline = gmtOffline;
            return this;
        }
        public String getGmtOffline() {
            return this.gmtOffline;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setOfflineDesc(String offlineDesc) {
            this.offlineDesc = offlineDesc;
            return this;
        }
        public String getOfflineDesc() {
            return this.offlineDesc;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setOfflineOperator(String offlineOperator) {
            this.offlineOperator = offlineOperator;
            return this;
        }
        public String getOfflineOperator() {
            return this.offlineOperator;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setOnlineDesc(String onlineDesc) {
            this.onlineDesc = onlineDesc;
            return this;
        }
        public String getOnlineDesc() {
            return this.onlineDesc;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setOnlineOperator(String onlineOperator) {
            this.onlineOperator = onlineOperator;
            return this;
        }
        public String getOnlineOperator() {
            return this.onlineOperator;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

        public ListGWAppApiResponseBodyDataListOnlineVersion setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

    public static class ListGWAppApiResponseBodyDataListReqParamMapping extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListReqParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListReqParamMapping self = new ListGWAppApiResponseBodyDataListReqParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListReqParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRespParamMapping extends TeaModel {
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

        public static ListGWAppApiResponseBodyDataListRespParamMapping build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRespParamMapping self = new ListGWAppApiResponseBodyDataListRespParamMapping();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setConfigTemplate(String configTemplate) {
            this.configTemplate = configTemplate;
            return this;
        }
        public String getConfigTemplate() {
            return this.configTemplate;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setConfigTemplateName(String configTemplateName) {
            this.configTemplateName = configTemplateName;
            return this;
        }
        public String getConfigTemplateName() {
            return this.configTemplateName;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setParamMappingId(String paramMappingId) {
            this.paramMappingId = paramMappingId;
            return this;
        }
        public String getParamMappingId() {
            return this.paramMappingId;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setParamMappingName(String paramMappingName) {
            this.paramMappingName = paramMappingName;
            return this;
        }
        public String getParamMappingName() {
            return this.paramMappingName;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setScriptConfig(String scriptConfig) {
            this.scriptConfig = scriptConfig;
            return this;
        }
        public String getScriptConfig() {
            return this.scriptConfig;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListRespParamMapping setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig self = new ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster self = new ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster setAuthenticationConfig(ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster;

        public static ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs self = new ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setArgKey(String argKey) {
            this.argKey = argKey;
            return this;
        }
        public String getArgKey() {
            return this.argKey;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setInterceptionRule(String interceptionRule) {
            this.interceptionRule = interceptionRule;
            return this;
        }
        public String getInterceptionRule() {
            return this.interceptionRule;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setParamLocation(String paramLocation) {
            this.paramLocation = paramLocation;
            return this;
        }
        public String getParamLocation() {
            return this.paramLocation;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs setSystemCluster(ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWAppApiResponseBodyDataListRouterInfoRouterConfigsSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRouterInfo extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs;

        public static ListGWAppApiResponseBodyDataListRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRouterInfo self = new ListGWAppApiResponseBodyDataListRouterInfo();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setRouterName(String routerName) {
            this.routerName = routerName;
            return this;
        }
        public String getRouterName() {
            return this.routerName;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListRouterInfo setRouterConfigs(java.util.List<ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs> routerConfigs) {
            this.routerConfigs = routerConfigs;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListRouterInfoRouterConfigs> getRouterConfigs() {
            return this.routerConfigs;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRsqParamRspCodeList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDesc")
        public String errorDesc;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static ListGWAppApiResponseBodyDataListRsqParamRspCodeList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRsqParamRspCodeList self = new ListGWAppApiResponseBodyDataListRsqParamRspCodeList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRsqParamRspCodeList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListGWAppApiResponseBodyDataListRsqParamRspCodeList setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
            return this;
        }
        public String getErrorDesc() {
            return this.errorDesc;
        }

        public ListGWAppApiResponseBodyDataListRsqParamRspCodeList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ListGWAppApiResponseBodyDataListRsqParam extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListRsqParamRspCodeList> rspCodeList;

        public static ListGWAppApiResponseBodyDataListRsqParam build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListRsqParam self = new ListGWAppApiResponseBodyDataListRsqParam();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListRsqParam setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setFailureDemo(String failureDemo) {
            this.failureDemo = failureDemo;
            return this;
        }
        public String getFailureDemo() {
            return this.failureDemo;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setRefType(String refType) {
            this.refType = refType;
            return this;
        }
        public String getRefType() {
            return this.refType;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setSuccessDemo(String successDemo) {
            this.successDemo = successDemo;
            return this;
        }
        public String getSuccessDemo() {
            return this.successDemo;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setUpstreamLocation(String upstreamLocation) {
            this.upstreamLocation = upstreamLocation;
            return this;
        }
        public String getUpstreamLocation() {
            return this.upstreamLocation;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setUpstreamName(String upstreamName) {
            this.upstreamName = upstreamName;
            return this;
        }
        public String getUpstreamName() {
            return this.upstreamName;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListRsqParam setRspCodeList(java.util.List<ListGWAppApiResponseBodyDataListRsqParamRspCodeList> rspCodeList) {
            this.rspCodeList = rspCodeList;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListRsqParamRspCodeList> getRspCodeList() {
            return this.rspCodeList;
        }

    }

    public static class ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("SecretKey")
        public String secretKey;

        public static ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig self = new ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

    public static class ListGWAppApiResponseBodyDataListSystemCluster extends TeaModel {
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
        public ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig;

        public static ListGWAppApiResponseBodyDataListSystemCluster build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataListSystemCluster self = new ListGWAppApiResponseBodyDataListSystemCluster();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setExternalAuthCount(Long externalAuthCount) {
            this.externalAuthCount = externalAuthCount;
            return this;
        }
        public Long getExternalAuthCount() {
            return this.externalAuthCount;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setLbType(String lbType) {
            this.lbType = lbType;
            return this;
        }
        public String getLbType() {
            return this.lbType;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setSysName(String sysName) {
            this.sysName = sysName;
            return this;
        }
        public String getSysName() {
            return this.sysName;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setSysType(String sysType) {
            this.sysType = sysType;
            return this;
        }
        public String getSysType() {
            return this.sysType;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

        public ListGWAppApiResponseBodyDataListSystemCluster setAuthenticationConfig(ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig authenticationConfig) {
            this.authenticationConfig = authenticationConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListSystemClusterAuthenticationConfig getAuthenticationConfig() {
            return this.authenticationConfig;
        }

    }

    public static class ListGWAppApiResponseBodyDataList extends TeaModel {
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
        public java.util.List<ListGWAppApiResponseBodyDataListHistoryVersionList> historyVersionList;

        @NameInMap("ReqParams")
        public java.util.List<ListGWAppApiResponseBodyDataListReqParams> reqParams;

        @NameInMap("UpstreamParamMappings")
        public java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings;

        @NameInMap("ApiCacheModel")
        public ListGWAppApiResponseBodyDataListApiCacheModel apiCacheModel;

        @NameInMap("ApiLimitConfig")
        public ListGWAppApiResponseBodyDataListApiLimitConfig apiLimitConfig;

        @NameInMap("ApiMockConfig")
        public ListGWAppApiResponseBodyDataListApiMockConfig apiMockConfig;

        @NameInMap("CorsInfo")
        public ListGWAppApiResponseBodyDataListCorsInfo corsInfo;

        @NameInMap("EditVersion")
        public ListGWAppApiResponseBodyDataListEditVersion editVersion;

        @NameInMap("ExternalAuth")
        public ListGWAppApiResponseBodyDataListExternalAuth externalAuth;

        @NameInMap("OnlineVersion")
        public ListGWAppApiResponseBodyDataListOnlineVersion onlineVersion;

        @NameInMap("ReqParamMapping")
        public ListGWAppApiResponseBodyDataListReqParamMapping reqParamMapping;

        @NameInMap("RespParamMapping")
        public ListGWAppApiResponseBodyDataListRespParamMapping respParamMapping;

        @NameInMap("RouterInfo")
        public ListGWAppApiResponseBodyDataListRouterInfo routerInfo;

        @NameInMap("RsqParam")
        public ListGWAppApiResponseBodyDataListRsqParam rsqParam;

        @NameInMap("SystemCluster")
        public ListGWAppApiResponseBodyDataListSystemCluster systemCluster;

        public static ListGWAppApiResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataList self = new ListGWAppApiResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataList setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public ListGWAppApiResponseBodyDataList setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public ListGWAppApiResponseBodyDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGWAppApiResponseBodyDataList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListGWAppApiResponseBodyDataList setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public ListGWAppApiResponseBodyDataList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListGWAppApiResponseBodyDataList setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public ListGWAppApiResponseBodyDataList setAuthAppCount(Long authAppCount) {
            this.authAppCount = authAppCount;
            return this;
        }
        public Long getAuthAppCount() {
            return this.authAppCount;
        }

        public ListGWAppApiResponseBodyDataList setAuthAppInfoId(String authAppInfoId) {
            this.authAppInfoId = authAppInfoId;
            return this;
        }
        public String getAuthAppInfoId() {
            return this.authAppInfoId;
        }

        public ListGWAppApiResponseBodyDataList setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListGWAppApiResponseBodyDataList setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public ListGWAppApiResponseBodyDataList setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListGWAppApiResponseBodyDataList setCompleteInterfaceName(String completeInterfaceName) {
            this.completeInterfaceName = completeInterfaceName;
            return this;
        }
        public String getCompleteInterfaceName() {
            return this.completeInterfaceName;
        }

        public ListGWAppApiResponseBodyDataList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListGWAppApiResponseBodyDataList setCorsId(String corsId) {
            this.corsId = corsId;
            return this;
        }
        public String getCorsId() {
            return this.corsId;
        }

        public ListGWAppApiResponseBodyDataList setCurrentVersionNo(String currentVersionNo) {
            this.currentVersionNo = currentVersionNo;
            return this;
        }
        public String getCurrentVersionNo() {
            return this.currentVersionNo;
        }

        public ListGWAppApiResponseBodyDataList setDataEncryption(String dataEncryption) {
            this.dataEncryption = dataEncryption;
            return this;
        }
        public String getDataEncryption() {
            return this.dataEncryption;
        }

        public ListGWAppApiResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGWAppApiResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGWAppApiResponseBodyDataList setDownstreamProtocol(String downstreamProtocol) {
            this.downstreamProtocol = downstreamProtocol;
            return this;
        }
        public String getDownstreamProtocol() {
            return this.downstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataList setEditVersionNo(String editVersionNo) {
            this.editVersionNo = editVersionNo;
            return this;
        }
        public String getEditVersionNo() {
            return this.editVersionNo;
        }

        public ListGWAppApiResponseBodyDataList setExternalAuthId(String externalAuthId) {
            this.externalAuthId = externalAuthId;
            return this;
        }
        public String getExternalAuthId() {
            return this.externalAuthId;
        }

        public ListGWAppApiResponseBodyDataList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListGWAppApiResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGWAppApiResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGWAppApiResponseBodyDataList setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public String getInterfaceName() {
            return this.interfaceName;
        }

        public ListGWAppApiResponseBodyDataList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListGWAppApiResponseBodyDataList setOnlineVersionNo(String onlineVersionNo) {
            this.onlineVersionNo = onlineVersionNo;
            return this;
        }
        public String getOnlineVersionNo() {
            return this.onlineVersionNo;
        }

        public ListGWAppApiResponseBodyDataList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGWAppApiResponseBodyDataList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListGWAppApiResponseBodyDataList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGWAppApiResponseBodyDataList setPathMatchType(String pathMatchType) {
            this.pathMatchType = pathMatchType;
            return this;
        }
        public String getPathMatchType() {
            return this.pathMatchType;
        }

        public ListGWAppApiResponseBodyDataList setReqModelId(String reqModelId) {
            this.reqModelId = reqModelId;
            return this;
        }
        public String getReqModelId() {
            return this.reqModelId;
        }

        public ListGWAppApiResponseBodyDataList setReqModelName(String reqModelName) {
            this.reqModelName = reqModelName;
            return this;
        }
        public String getReqModelName() {
            return this.reqModelName;
        }

        public ListGWAppApiResponseBodyDataList setReqParamMappingId(String reqParamMappingId) {
            this.reqParamMappingId = reqParamMappingId;
            return this;
        }
        public String getReqParamMappingId() {
            return this.reqParamMappingId;
        }

        public ListGWAppApiResponseBodyDataList setReqParamMappingType(String reqParamMappingType) {
            this.reqParamMappingType = reqParamMappingType;
            return this;
        }
        public String getReqParamMappingType() {
            return this.reqParamMappingType;
        }

        public ListGWAppApiResponseBodyDataList setReqType(String reqType) {
            this.reqType = reqType;
            return this;
        }
        public String getReqType() {
            return this.reqType;
        }

        public ListGWAppApiResponseBodyDataList setRespModelId(String respModelId) {
            this.respModelId = respModelId;
            return this;
        }
        public String getRespModelId() {
            return this.respModelId;
        }

        public ListGWAppApiResponseBodyDataList setRespModelName(String respModelName) {
            this.respModelName = respModelName;
            return this;
        }
        public String getRespModelName() {
            return this.respModelName;
        }

        public ListGWAppApiResponseBodyDataList setRespParamMappingId(String respParamMappingId) {
            this.respParamMappingId = respParamMappingId;
            return this;
        }
        public String getRespParamMappingId() {
            return this.respParamMappingId;
        }

        public ListGWAppApiResponseBodyDataList setRespType(String respType) {
            this.respType = respType;
            return this;
        }
        public String getRespType() {
            return this.respType;
        }

        public ListGWAppApiResponseBodyDataList setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public ListGWAppApiResponseBodyDataList setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public ListGWAppApiResponseBodyDataList setSysId(String sysId) {
            this.sysId = sysId;
            return this;
        }
        public String getSysId() {
            return this.sysId;
        }

        public ListGWAppApiResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListGWAppApiResponseBodyDataList setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListGWAppApiResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ListGWAppApiResponseBodyDataList setUpstreamPath(String upstreamPath) {
            this.upstreamPath = upstreamPath;
            return this;
        }
        public String getUpstreamPath() {
            return this.upstreamPath;
        }

        public ListGWAppApiResponseBodyDataList setUpstreamProtocol(String upstreamProtocol) {
            this.upstreamProtocol = upstreamProtocol;
            return this;
        }
        public String getUpstreamProtocol() {
            return this.upstreamProtocol;
        }

        public ListGWAppApiResponseBodyDataList setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGWAppApiResponseBodyDataList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListGWAppApiResponseBodyDataList setHistoryVersionList(java.util.List<ListGWAppApiResponseBodyDataListHistoryVersionList> historyVersionList) {
            this.historyVersionList = historyVersionList;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListHistoryVersionList> getHistoryVersionList() {
            return this.historyVersionList;
        }

        public ListGWAppApiResponseBodyDataList setReqParams(java.util.List<ListGWAppApiResponseBodyDataListReqParams> reqParams) {
            this.reqParams = reqParams;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListReqParams> getReqParams() {
            return this.reqParams;
        }

        public ListGWAppApiResponseBodyDataList setUpstreamParamMappings(java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappings> upstreamParamMappings) {
            this.upstreamParamMappings = upstreamParamMappings;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataListUpstreamParamMappings> getUpstreamParamMappings() {
            return this.upstreamParamMappings;
        }

        public ListGWAppApiResponseBodyDataList setApiCacheModel(ListGWAppApiResponseBodyDataListApiCacheModel apiCacheModel) {
            this.apiCacheModel = apiCacheModel;
            return this;
        }
        public ListGWAppApiResponseBodyDataListApiCacheModel getApiCacheModel() {
            return this.apiCacheModel;
        }

        public ListGWAppApiResponseBodyDataList setApiLimitConfig(ListGWAppApiResponseBodyDataListApiLimitConfig apiLimitConfig) {
            this.apiLimitConfig = apiLimitConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListApiLimitConfig getApiLimitConfig() {
            return this.apiLimitConfig;
        }

        public ListGWAppApiResponseBodyDataList setApiMockConfig(ListGWAppApiResponseBodyDataListApiMockConfig apiMockConfig) {
            this.apiMockConfig = apiMockConfig;
            return this;
        }
        public ListGWAppApiResponseBodyDataListApiMockConfig getApiMockConfig() {
            return this.apiMockConfig;
        }

        public ListGWAppApiResponseBodyDataList setCorsInfo(ListGWAppApiResponseBodyDataListCorsInfo corsInfo) {
            this.corsInfo = corsInfo;
            return this;
        }
        public ListGWAppApiResponseBodyDataListCorsInfo getCorsInfo() {
            return this.corsInfo;
        }

        public ListGWAppApiResponseBodyDataList setEditVersion(ListGWAppApiResponseBodyDataListEditVersion editVersion) {
            this.editVersion = editVersion;
            return this;
        }
        public ListGWAppApiResponseBodyDataListEditVersion getEditVersion() {
            return this.editVersion;
        }

        public ListGWAppApiResponseBodyDataList setExternalAuth(ListGWAppApiResponseBodyDataListExternalAuth externalAuth) {
            this.externalAuth = externalAuth;
            return this;
        }
        public ListGWAppApiResponseBodyDataListExternalAuth getExternalAuth() {
            return this.externalAuth;
        }

        public ListGWAppApiResponseBodyDataList setOnlineVersion(ListGWAppApiResponseBodyDataListOnlineVersion onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public ListGWAppApiResponseBodyDataListOnlineVersion getOnlineVersion() {
            return this.onlineVersion;
        }

        public ListGWAppApiResponseBodyDataList setReqParamMapping(ListGWAppApiResponseBodyDataListReqParamMapping reqParamMapping) {
            this.reqParamMapping = reqParamMapping;
            return this;
        }
        public ListGWAppApiResponseBodyDataListReqParamMapping getReqParamMapping() {
            return this.reqParamMapping;
        }

        public ListGWAppApiResponseBodyDataList setRespParamMapping(ListGWAppApiResponseBodyDataListRespParamMapping respParamMapping) {
            this.respParamMapping = respParamMapping;
            return this;
        }
        public ListGWAppApiResponseBodyDataListRespParamMapping getRespParamMapping() {
            return this.respParamMapping;
        }

        public ListGWAppApiResponseBodyDataList setRouterInfo(ListGWAppApiResponseBodyDataListRouterInfo routerInfo) {
            this.routerInfo = routerInfo;
            return this;
        }
        public ListGWAppApiResponseBodyDataListRouterInfo getRouterInfo() {
            return this.routerInfo;
        }

        public ListGWAppApiResponseBodyDataList setRsqParam(ListGWAppApiResponseBodyDataListRsqParam rsqParam) {
            this.rsqParam = rsqParam;
            return this;
        }
        public ListGWAppApiResponseBodyDataListRsqParam getRsqParam() {
            return this.rsqParam;
        }

        public ListGWAppApiResponseBodyDataList setSystemCluster(ListGWAppApiResponseBodyDataListSystemCluster systemCluster) {
            this.systemCluster = systemCluster;
            return this;
        }
        public ListGWAppApiResponseBodyDataListSystemCluster getSystemCluster() {
            return this.systemCluster;
        }

    }

    public static class ListGWAppApiResponseBodyDataPageInfoOrderInfos extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static ListGWAppApiResponseBodyDataPageInfoOrderInfos build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataPageInfoOrderInfos self = new ListGWAppApiResponseBodyDataPageInfoOrderInfos();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataPageInfoOrderInfos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGWAppApiResponseBodyDataPageInfoOrderInfos setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class ListGWAppApiResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OrderInfos")
        public java.util.List<ListGWAppApiResponseBodyDataPageInfoOrderInfos> orderInfos;

        public static ListGWAppApiResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyDataPageInfo self = new ListGWAppApiResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyDataPageInfo setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListGWAppApiResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListGWAppApiResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListGWAppApiResponseBodyDataPageInfo setOrderInfos(java.util.List<ListGWAppApiResponseBodyDataPageInfoOrderInfos> orderInfos) {
            this.orderInfos = orderInfos;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataPageInfoOrderInfos> getOrderInfos() {
            return this.orderInfos;
        }

    }

    public static class ListGWAppApiResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListGWAppApiResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public ListGWAppApiResponseBodyDataPageInfo pageInfo;

        public static ListGWAppApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGWAppApiResponseBodyData self = new ListGWAppApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGWAppApiResponseBodyData setList(java.util.List<ListGWAppApiResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListGWAppApiResponseBodyDataList> getList() {
            return this.list;
        }

        public ListGWAppApiResponseBodyData setPageInfo(ListGWAppApiResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListGWAppApiResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
