// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scene")
    public GetPtsSceneResponseBodyScene scene;

    @NameInMap("Success")
    public Boolean success;

    public static GetPtsSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneResponseBody self = new GetPtsSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsSceneResponseBody setScene(GetPtsSceneResponseBodyScene scene) {
        this.scene = scene;
        return this;
    }
    public GetPtsSceneResponseBodyScene getScene() {
        return this.scene;
    }

    public GetPtsSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList self = new GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetPtsSceneResponseBodySceneAdvanceSetting extends TeaModel {
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        @NameInMap("DomainBindingList")
        public java.util.List<GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList> domainBindingList;

        @NameInMap("LogRate")
        public Integer logRate;

        @NameInMap("SuccessCode")
        public String successCode;

        public static GetPtsSceneResponseBodySceneAdvanceSetting build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneAdvanceSetting self = new GetPtsSceneResponseBodySceneAdvanceSetting();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneAdvanceSetting setConnectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
            this.connectionTimeoutInSecond = connectionTimeoutInSecond;
            return this;
        }
        public Integer getConnectionTimeoutInSecond() {
            return this.connectionTimeoutInSecond;
        }

        public GetPtsSceneResponseBodySceneAdvanceSetting setDomainBindingList(java.util.List<GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList> domainBindingList) {
            this.domainBindingList = domainBindingList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList> getDomainBindingList() {
            return this.domainBindingList;
        }

        public GetPtsSceneResponseBodySceneAdvanceSetting setLogRate(Integer logRate) {
            this.logRate = logRate;
            return this;
        }
        public Integer getLogRate() {
            return this.logRate;
        }

        public GetPtsSceneResponseBodySceneAdvanceSetting setSuccessCode(String successCode) {
            this.successCode = successCode;
            return this;
        }
        public String getSuccessCode() {
            return this.successCode;
        }

    }

    public static class GetPtsSceneResponseBodySceneFileParameterList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        public static GetPtsSceneResponseBodySceneFileParameterList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneFileParameterList self = new GetPtsSceneResponseBodySceneFileParameterList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneFileParameterList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPtsSceneResponseBodySceneFileParameterList setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

    }

    public static class GetPtsSceneResponseBodySceneGlobalParameterList extends TeaModel {
        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamValue")
        public String paramValue;

        public static GetPtsSceneResponseBodySceneGlobalParameterList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneGlobalParameterList self = new GetPtsSceneResponseBodySceneGlobalParameterList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneGlobalParameterList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetPtsSceneResponseBodySceneGlobalParameterList setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetPtsSceneResponseBodySceneHeaders extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetPtsSceneResponseBodySceneHeaders build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneHeaders self = new GetPtsSceneResponseBodySceneHeaders();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPtsSceneResponseBodySceneHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        @NameInMap("RpsLimit")
        public Integer rpsLimit;

        public static GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList self = new GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList setRpsBegin(Integer rpsBegin) {
            this.rpsBegin = rpsBegin;
            return this;
        }
        public Integer getRpsBegin() {
            return this.rpsBegin;
        }

        public GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList setRpsLimit(Integer rpsLimit) {
            this.rpsLimit = rpsLimit;
            return this;
        }
        public Integer getRpsLimit() {
            return this.rpsLimit;
        }

    }

    public static class GetPtsSceneResponseBodySceneLoadConfigConfiguration extends TeaModel {
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        @NameInMap("AllRpsLimit")
        public Integer allRpsLimit;

        public static GetPtsSceneResponseBodySceneLoadConfigConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneLoadConfigConfiguration self = new GetPtsSceneResponseBodySceneLoadConfigConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneLoadConfigConfiguration setAllConcurrencyBegin(Integer allConcurrencyBegin) {
            this.allConcurrencyBegin = allConcurrencyBegin;
            return this;
        }
        public Integer getAllConcurrencyBegin() {
            return this.allConcurrencyBegin;
        }

        public GetPtsSceneResponseBodySceneLoadConfigConfiguration setAllConcurrencyLimit(Integer allConcurrencyLimit) {
            this.allConcurrencyLimit = allConcurrencyLimit;
            return this;
        }
        public Integer getAllConcurrencyLimit() {
            return this.allConcurrencyLimit;
        }

        public GetPtsSceneResponseBodySceneLoadConfigConfiguration setAllRpsBegin(Integer allRpsBegin) {
            this.allRpsBegin = allRpsBegin;
            return this;
        }
        public Integer getAllRpsBegin() {
            return this.allRpsBegin;
        }

        public GetPtsSceneResponseBodySceneLoadConfigConfiguration setAllRpsLimit(Integer allRpsLimit) {
            this.allRpsLimit = allRpsLimit;
            return this;
        }
        public Integer getAllRpsLimit() {
            return this.allRpsLimit;
        }

    }

    public static class GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList extends TeaModel {
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        @NameInMap("RelationId")
        public String relationId;

        public static GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList self = new GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList setConcurrencyBegin(Integer concurrencyBegin) {
            this.concurrencyBegin = concurrencyBegin;
            return this;
        }
        public Integer getConcurrencyBegin() {
            return this.concurrencyBegin;
        }

        public GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList setConcurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        public GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

    }

    public static class GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig self = new GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetPtsSceneResponseBodySceneLoadConfig extends TeaModel {
        @NameInMap("AgentCount")
        public Integer agentCount;

        @NameInMap("ApiLoadConfigList")
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList> apiLoadConfigList;

        @NameInMap("AutoStep")
        public Boolean autoStep;

        @NameInMap("Configuration")
        public GetPtsSceneResponseBodySceneLoadConfigConfiguration configuration;

        @NameInMap("Increment")
        public Integer increment;

        @NameInMap("KeepTime")
        public Integer keepTime;

        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        @NameInMap("RelationLoadConfigList")
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList> relationLoadConfigList;

        @NameInMap("TestMode")
        public String testMode;

        @NameInMap("VpcLoadConfig")
        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig vpcLoadConfig;

        public static GetPtsSceneResponseBodySceneLoadConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneLoadConfig self = new GetPtsSceneResponseBodySceneLoadConfig();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneLoadConfig setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setApiLoadConfigList(java.util.List<GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList> apiLoadConfigList) {
            this.apiLoadConfigList = apiLoadConfigList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList> getApiLoadConfigList() {
            return this.apiLoadConfigList;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setAutoStep(Boolean autoStep) {
            this.autoStep = autoStep;
            return this;
        }
        public Boolean getAutoStep() {
            return this.autoStep;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setConfiguration(GetPtsSceneResponseBodySceneLoadConfigConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public GetPtsSceneResponseBodySceneLoadConfigConfiguration getConfiguration() {
            return this.configuration;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setIncrement(Integer increment) {
            this.increment = increment;
            return this;
        }
        public Integer getIncrement() {
            return this.increment;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setKeepTime(Integer keepTime) {
            this.keepTime = keepTime;
            return this;
        }
        public Integer getKeepTime() {
            return this.keepTime;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setMaxRunningTime(Integer maxRunningTime) {
            this.maxRunningTime = maxRunningTime;
            return this;
        }
        public Integer getMaxRunningTime() {
            return this.maxRunningTime;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setRelationLoadConfigList(java.util.List<GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList> relationLoadConfigList) {
            this.relationLoadConfigList = relationLoadConfigList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList> getRelationLoadConfigList() {
            return this.relationLoadConfigList;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setTestMode(String testMode) {
            this.testMode = testMode;
            return this;
        }
        public String getTestMode() {
            return this.testMode;
        }

        public GetPtsSceneResponseBodySceneLoadConfig setVpcLoadConfig(GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig vpcLoadConfig) {
            this.vpcLoadConfig = vpcLoadConfig;
            return this;
        }
        public GetPtsSceneResponseBodySceneLoadConfigVpcLoadConfig getVpcLoadConfig() {
            return this.vpcLoadConfig;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListApiListBody extends TeaModel {
        @NameInMap("BodyValue")
        public String bodyValue;

        @NameInMap("ContentType")
        public String contentType;

        public static GetPtsSceneResponseBodySceneRelationListApiListBody build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListApiListBody self = new GetPtsSceneResponseBodySceneRelationListApiListBody();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListApiListBody setBodyValue(String bodyValue) {
            this.bodyValue = bodyValue;
            return this;
        }
        public String getBodyValue() {
            return this.bodyValue;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListBody setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListApiListCheckPointList extends TeaModel {
        @NameInMap("CheckPoint")
        public String checkPoint;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExpectValue")
        public String expectValue;

        @NameInMap("Operator")
        public String operator;

        public static GetPtsSceneResponseBodySceneRelationListApiListCheckPointList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListApiListCheckPointList self = new GetPtsSceneResponseBodySceneRelationListApiListCheckPointList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListApiListCheckPointList setCheckPoint(String checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public String getCheckPoint() {
            return this.checkPoint;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListCheckPointList setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListCheckPointList setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListCheckPointList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListApiListExportList extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("ExportName")
        public String exportName;

        @NameInMap("ExportType")
        public String exportType;

        @NameInMap("ExportValue")
        public String exportValue;

        public static GetPtsSceneResponseBodySceneRelationListApiListExportList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListApiListExportList self = new GetPtsSceneResponseBodySceneRelationListApiListExportList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListApiListExportList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListExportList setExportName(String exportName) {
            this.exportName = exportName;
            return this;
        }
        public String getExportName() {
            return this.exportName;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListExportList setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListExportList setExportValue(String exportValue) {
            this.exportValue = exportValue;
            return this;
        }
        public String getExportValue() {
            return this.exportValue;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListApiListHeaderList extends TeaModel {
        @NameInMap("HeaderName")
        public String headerName;

        @NameInMap("HeaderValue")
        public String headerValue;

        public static GetPtsSceneResponseBodySceneRelationListApiListHeaderList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListApiListHeaderList self = new GetPtsSceneResponseBodySceneRelationListApiListHeaderList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListApiListHeaderList setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetPtsSceneResponseBodySceneRelationListApiListHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListApiList extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("Body")
        public GetPtsSceneResponseBodySceneRelationListApiListBody body;

        @NameInMap("CheckPointList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListCheckPointList> checkPointList;

        @NameInMap("ExportList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListExportList> exportList;

        @NameInMap("HeaderList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListHeaderList> headerList;

        @NameInMap("Method")
        public String method;

        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        @NameInMap("Url")
        public String url;

        public static GetPtsSceneResponseBodySceneRelationListApiList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListApiList self = new GetPtsSceneResponseBodySceneRelationListApiList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setBody(GetPtsSceneResponseBodySceneRelationListApiListBody body) {
            this.body = body;
            return this;
        }
        public GetPtsSceneResponseBodySceneRelationListApiListBody getBody() {
            return this.body;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setCheckPointList(java.util.List<GetPtsSceneResponseBodySceneRelationListApiListCheckPointList> checkPointList) {
            this.checkPointList = checkPointList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListCheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setExportList(java.util.List<GetPtsSceneResponseBodySceneRelationListApiListExportList> exportList) {
            this.exportList = exportList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListExportList> getExportList() {
            return this.exportList;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setHeaderList(java.util.List<GetPtsSceneResponseBodySceneRelationListApiListHeaderList> headerList) {
            this.headerList = headerList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListHeaderList> getHeaderList() {
            return this.headerList;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setRedirectCountLimit(Integer redirectCountLimit) {
            this.redirectCountLimit = redirectCountLimit;
            return this;
        }
        public Integer getRedirectCountLimit() {
            return this.redirectCountLimit;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setTimeoutInSecond(Integer timeoutInSecond) {
            this.timeoutInSecond = timeoutInSecond;
            return this;
        }
        public Integer getTimeoutInSecond() {
            return this.timeoutInSecond;
        }

        public GetPtsSceneResponseBodySceneRelationListApiList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationListFileParameterExplainList extends TeaModel {
        @NameInMap("BaseFile")
        public Boolean baseFile;

        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileParamName")
        public String fileParamName;

        public static GetPtsSceneResponseBodySceneRelationListFileParameterExplainList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationListFileParameterExplainList self = new GetPtsSceneResponseBodySceneRelationListFileParameterExplainList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationListFileParameterExplainList setBaseFile(Boolean baseFile) {
            this.baseFile = baseFile;
            return this;
        }
        public Boolean getBaseFile() {
            return this.baseFile;
        }

        public GetPtsSceneResponseBodySceneRelationListFileParameterExplainList setCycleOnce(Boolean cycleOnce) {
            this.cycleOnce = cycleOnce;
            return this;
        }
        public Boolean getCycleOnce() {
            return this.cycleOnce;
        }

        public GetPtsSceneResponseBodySceneRelationListFileParameterExplainList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPtsSceneResponseBodySceneRelationListFileParameterExplainList setFileParamName(String fileParamName) {
            this.fileParamName = fileParamName;
            return this;
        }
        public String getFileParamName() {
            return this.fileParamName;
        }

    }

    public static class GetPtsSceneResponseBodySceneRelationList extends TeaModel {
        @NameInMap("ApiList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiList> apiList;

        @NameInMap("FileParameterExplainList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListFileParameterExplainList> fileParameterExplainList;

        @NameInMap("RelationId")
        public String relationId;

        @NameInMap("RelationName")
        public String relationName;

        public static GetPtsSceneResponseBodySceneRelationList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodySceneRelationList self = new GetPtsSceneResponseBodySceneRelationList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodySceneRelationList setApiList(java.util.List<GetPtsSceneResponseBodySceneRelationListApiList> apiList) {
            this.apiList = apiList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiList> getApiList() {
            return this.apiList;
        }

        public GetPtsSceneResponseBodySceneRelationList setFileParameterExplainList(java.util.List<GetPtsSceneResponseBodySceneRelationListFileParameterExplainList> fileParameterExplainList) {
            this.fileParameterExplainList = fileParameterExplainList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationListFileParameterExplainList> getFileParameterExplainList() {
            return this.fileParameterExplainList;
        }

        public GetPtsSceneResponseBodySceneRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public GetPtsSceneResponseBodySceneRelationList setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

    }

    public static class GetPtsSceneResponseBodyScene extends TeaModel {
        @NameInMap("AdvanceSetting")
        public GetPtsSceneResponseBodySceneAdvanceSetting advanceSetting;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileParameterList")
        public java.util.List<GetPtsSceneResponseBodySceneFileParameterList> fileParameterList;

        @NameInMap("GlobalParameterList")
        public java.util.List<GetPtsSceneResponseBodySceneGlobalParameterList> globalParameterList;

        @NameInMap("Headers")
        public java.util.List<GetPtsSceneResponseBodySceneHeaders> headers;

        @NameInMap("LoadConfig")
        public GetPtsSceneResponseBodySceneLoadConfig loadConfig;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RelationList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationList> relationList;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Status")
        public String status;

        public static GetPtsSceneResponseBodyScene build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneResponseBodyScene self = new GetPtsSceneResponseBodyScene();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneResponseBodyScene setAdvanceSetting(GetPtsSceneResponseBodySceneAdvanceSetting advanceSetting) {
            this.advanceSetting = advanceSetting;
            return this;
        }
        public GetPtsSceneResponseBodySceneAdvanceSetting getAdvanceSetting() {
            return this.advanceSetting;
        }

        public GetPtsSceneResponseBodyScene setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPtsSceneResponseBodyScene setFileParameterList(java.util.List<GetPtsSceneResponseBodySceneFileParameterList> fileParameterList) {
            this.fileParameterList = fileParameterList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneFileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        public GetPtsSceneResponseBodyScene setGlobalParameterList(java.util.List<GetPtsSceneResponseBodySceneGlobalParameterList> globalParameterList) {
            this.globalParameterList = globalParameterList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneGlobalParameterList> getGlobalParameterList() {
            return this.globalParameterList;
        }

        public GetPtsSceneResponseBodyScene setHeaders(java.util.List<GetPtsSceneResponseBodySceneHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneHeaders> getHeaders() {
            return this.headers;
        }

        public GetPtsSceneResponseBodyScene setLoadConfig(GetPtsSceneResponseBodySceneLoadConfig loadConfig) {
            this.loadConfig = loadConfig;
            return this;
        }
        public GetPtsSceneResponseBodySceneLoadConfig getLoadConfig() {
            return this.loadConfig;
        }

        public GetPtsSceneResponseBodyScene setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPtsSceneResponseBodyScene setRelationList(java.util.List<GetPtsSceneResponseBodySceneRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<GetPtsSceneResponseBodySceneRelationList> getRelationList() {
            return this.relationList;
        }

        public GetPtsSceneResponseBodyScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetPtsSceneResponseBodyScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetPtsSceneResponseBodyScene setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
