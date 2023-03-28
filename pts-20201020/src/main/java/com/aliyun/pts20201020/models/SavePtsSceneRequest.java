// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SavePtsSceneRequest extends TeaModel {
    @NameInMap("Scene")
    public SavePtsSceneRequestScene scene;

    public static SavePtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        SavePtsSceneRequest self = new SavePtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public SavePtsSceneRequest setScene(SavePtsSceneRequestScene scene) {
        this.scene = scene;
        return this;
    }
    public SavePtsSceneRequestScene getScene() {
        return this.scene;
    }

    public static class SavePtsSceneRequestSceneAdvanceSettingDomainBindingList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static SavePtsSceneRequestSceneAdvanceSettingDomainBindingList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneAdvanceSettingDomainBindingList self = new SavePtsSceneRequestSceneAdvanceSettingDomainBindingList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneAdvanceSettingDomainBindingList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public SavePtsSceneRequestSceneAdvanceSettingDomainBindingList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class SavePtsSceneRequestSceneAdvanceSetting extends TeaModel {
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        @NameInMap("DomainBindingList")
        public java.util.List<SavePtsSceneRequestSceneAdvanceSettingDomainBindingList> domainBindingList;

        @NameInMap("LogRate")
        public Integer logRate;

        @NameInMap("SuccessCode")
        public String successCode;

        public static SavePtsSceneRequestSceneAdvanceSetting build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneAdvanceSetting self = new SavePtsSceneRequestSceneAdvanceSetting();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneAdvanceSetting setConnectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
            this.connectionTimeoutInSecond = connectionTimeoutInSecond;
            return this;
        }
        public Integer getConnectionTimeoutInSecond() {
            return this.connectionTimeoutInSecond;
        }

        public SavePtsSceneRequestSceneAdvanceSetting setDomainBindingList(java.util.List<SavePtsSceneRequestSceneAdvanceSettingDomainBindingList> domainBindingList) {
            this.domainBindingList = domainBindingList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneAdvanceSettingDomainBindingList> getDomainBindingList() {
            return this.domainBindingList;
        }

        public SavePtsSceneRequestSceneAdvanceSetting setLogRate(Integer logRate) {
            this.logRate = logRate;
            return this;
        }
        public Integer getLogRate() {
            return this.logRate;
        }

        public SavePtsSceneRequestSceneAdvanceSetting setSuccessCode(String successCode) {
            this.successCode = successCode;
            return this;
        }
        public String getSuccessCode() {
            return this.successCode;
        }

    }

    public static class SavePtsSceneRequestSceneFileParameterList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        public static SavePtsSceneRequestSceneFileParameterList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneFileParameterList self = new SavePtsSceneRequestSceneFileParameterList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneFileParameterList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SavePtsSceneRequestSceneFileParameterList setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

    }

    public static class SavePtsSceneRequestSceneGlobalParameterList extends TeaModel {
        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamValue")
        public String paramValue;

        public static SavePtsSceneRequestSceneGlobalParameterList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneGlobalParameterList self = new SavePtsSceneRequestSceneGlobalParameterList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneGlobalParameterList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public SavePtsSceneRequestSceneGlobalParameterList setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class SavePtsSceneRequestSceneLoadConfigApiLoadConfigList extends TeaModel {
        /**
         * <p>API ID。</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        @NameInMap("RpsLimit")
        public Integer rpsLimit;

        public static SavePtsSceneRequestSceneLoadConfigApiLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneLoadConfigApiLoadConfigList self = new SavePtsSceneRequestSceneLoadConfigApiLoadConfigList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneLoadConfigApiLoadConfigList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public SavePtsSceneRequestSceneLoadConfigApiLoadConfigList setRpsBegin(Integer rpsBegin) {
            this.rpsBegin = rpsBegin;
            return this;
        }
        public Integer getRpsBegin() {
            return this.rpsBegin;
        }

        public SavePtsSceneRequestSceneLoadConfigApiLoadConfigList setRpsLimit(Integer rpsLimit) {
            this.rpsLimit = rpsLimit;
            return this;
        }
        public Integer getRpsLimit() {
            return this.rpsLimit;
        }

    }

    public static class SavePtsSceneRequestSceneLoadConfigConfiguration extends TeaModel {
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        @NameInMap("AllRpsLimit")
        public Integer allRpsLimit;

        public static SavePtsSceneRequestSceneLoadConfigConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneLoadConfigConfiguration self = new SavePtsSceneRequestSceneLoadConfigConfiguration();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneLoadConfigConfiguration setAllConcurrencyBegin(Integer allConcurrencyBegin) {
            this.allConcurrencyBegin = allConcurrencyBegin;
            return this;
        }
        public Integer getAllConcurrencyBegin() {
            return this.allConcurrencyBegin;
        }

        public SavePtsSceneRequestSceneLoadConfigConfiguration setAllConcurrencyLimit(Integer allConcurrencyLimit) {
            this.allConcurrencyLimit = allConcurrencyLimit;
            return this;
        }
        public Integer getAllConcurrencyLimit() {
            return this.allConcurrencyLimit;
        }

        public SavePtsSceneRequestSceneLoadConfigConfiguration setAllRpsBegin(Integer allRpsBegin) {
            this.allRpsBegin = allRpsBegin;
            return this;
        }
        public Integer getAllRpsBegin() {
            return this.allRpsBegin;
        }

        public SavePtsSceneRequestSceneLoadConfigConfiguration setAllRpsLimit(Integer allRpsLimit) {
            this.allRpsLimit = allRpsLimit;
            return this;
        }
        public Integer getAllRpsLimit() {
            return this.allRpsLimit;
        }

    }

    public static class SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList extends TeaModel {
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        @NameInMap("RelationId")
        public String relationId;

        public static SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList self = new SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList setConcurrencyBegin(Integer concurrencyBegin) {
            this.concurrencyBegin = concurrencyBegin;
            return this;
        }
        public Integer getConcurrencyBegin() {
            return this.concurrencyBegin;
        }

        public SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList setConcurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        public SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

    }

    public static class SavePtsSceneRequestSceneLoadConfigVpcLoadConfig extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static SavePtsSceneRequestSceneLoadConfigVpcLoadConfig build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneLoadConfigVpcLoadConfig self = new SavePtsSceneRequestSceneLoadConfigVpcLoadConfig();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SavePtsSceneRequestSceneLoadConfig extends TeaModel {
        @NameInMap("AgentCount")
        public Integer agentCount;

        @NameInMap("ApiLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigApiLoadConfigList> apiLoadConfigList;

        @NameInMap("AutoStep")
        public Boolean autoStep;

        @NameInMap("Configuration")
        public SavePtsSceneRequestSceneLoadConfigConfiguration configuration;

        @NameInMap("Increment")
        public Integer increment;

        @NameInMap("KeepTime")
        public Integer keepTime;

        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        @NameInMap("RelationLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList> relationLoadConfigList;

        @NameInMap("TestMode")
        public String testMode;

        @NameInMap("VpcLoadConfig")
        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig vpcLoadConfig;

        public static SavePtsSceneRequestSceneLoadConfig build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneLoadConfig self = new SavePtsSceneRequestSceneLoadConfig();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneLoadConfig setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public SavePtsSceneRequestSceneLoadConfig setApiLoadConfigList(java.util.List<SavePtsSceneRequestSceneLoadConfigApiLoadConfigList> apiLoadConfigList) {
            this.apiLoadConfigList = apiLoadConfigList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneLoadConfigApiLoadConfigList> getApiLoadConfigList() {
            return this.apiLoadConfigList;
        }

        public SavePtsSceneRequestSceneLoadConfig setAutoStep(Boolean autoStep) {
            this.autoStep = autoStep;
            return this;
        }
        public Boolean getAutoStep() {
            return this.autoStep;
        }

        public SavePtsSceneRequestSceneLoadConfig setConfiguration(SavePtsSceneRequestSceneLoadConfigConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public SavePtsSceneRequestSceneLoadConfigConfiguration getConfiguration() {
            return this.configuration;
        }

        public SavePtsSceneRequestSceneLoadConfig setIncrement(Integer increment) {
            this.increment = increment;
            return this;
        }
        public Integer getIncrement() {
            return this.increment;
        }

        public SavePtsSceneRequestSceneLoadConfig setKeepTime(Integer keepTime) {
            this.keepTime = keepTime;
            return this;
        }
        public Integer getKeepTime() {
            return this.keepTime;
        }

        public SavePtsSceneRequestSceneLoadConfig setMaxRunningTime(Integer maxRunningTime) {
            this.maxRunningTime = maxRunningTime;
            return this;
        }
        public Integer getMaxRunningTime() {
            return this.maxRunningTime;
        }

        public SavePtsSceneRequestSceneLoadConfig setRelationLoadConfigList(java.util.List<SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList> relationLoadConfigList) {
            this.relationLoadConfigList = relationLoadConfigList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList> getRelationLoadConfigList() {
            return this.relationLoadConfigList;
        }

        public SavePtsSceneRequestSceneLoadConfig setTestMode(String testMode) {
            this.testMode = testMode;
            return this;
        }
        public String getTestMode() {
            return this.testMode;
        }

        public SavePtsSceneRequestSceneLoadConfig setVpcLoadConfig(SavePtsSceneRequestSceneLoadConfigVpcLoadConfig vpcLoadConfig) {
            this.vpcLoadConfig = vpcLoadConfig;
            return this;
        }
        public SavePtsSceneRequestSceneLoadConfigVpcLoadConfig getVpcLoadConfig() {
            return this.vpcLoadConfig;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListApiListBody extends TeaModel {
        @NameInMap("BodyValue")
        public String bodyValue;

        @NameInMap("ContentType")
        public String contentType;

        public static SavePtsSceneRequestSceneRelationListApiListBody build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListApiListBody self = new SavePtsSceneRequestSceneRelationListApiListBody();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListApiListBody setBodyValue(String bodyValue) {
            this.bodyValue = bodyValue;
            return this;
        }
        public String getBodyValue() {
            return this.bodyValue;
        }

        public SavePtsSceneRequestSceneRelationListApiListBody setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListApiListCheckPointList extends TeaModel {
        @NameInMap("CheckPoint")
        public String checkPoint;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("ExpectValue")
        public String expectValue;

        @NameInMap("Operator")
        public String operator;

        public static SavePtsSceneRequestSceneRelationListApiListCheckPointList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListApiListCheckPointList self = new SavePtsSceneRequestSceneRelationListApiListCheckPointList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListApiListCheckPointList setCheckPoint(String checkPoint) {
            this.checkPoint = checkPoint;
            return this;
        }
        public String getCheckPoint() {
            return this.checkPoint;
        }

        public SavePtsSceneRequestSceneRelationListApiListCheckPointList setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public SavePtsSceneRequestSceneRelationListApiListCheckPointList setExpectValue(String expectValue) {
            this.expectValue = expectValue;
            return this;
        }
        public String getExpectValue() {
            return this.expectValue;
        }

        public SavePtsSceneRequestSceneRelationListApiListCheckPointList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListApiListExportList extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("ExportName")
        public String exportName;

        @NameInMap("ExportType")
        public String exportType;

        @NameInMap("ExportValue")
        public String exportValue;

        public static SavePtsSceneRequestSceneRelationListApiListExportList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListApiListExportList self = new SavePtsSceneRequestSceneRelationListApiListExportList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListApiListExportList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public SavePtsSceneRequestSceneRelationListApiListExportList setExportName(String exportName) {
            this.exportName = exportName;
            return this;
        }
        public String getExportName() {
            return this.exportName;
        }

        public SavePtsSceneRequestSceneRelationListApiListExportList setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public SavePtsSceneRequestSceneRelationListApiListExportList setExportValue(String exportValue) {
            this.exportValue = exportValue;
            return this;
        }
        public String getExportValue() {
            return this.exportValue;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListApiListHeaderList extends TeaModel {
        @NameInMap("HeaderName")
        public String headerName;

        @NameInMap("HeaderValue")
        public String headerValue;

        public static SavePtsSceneRequestSceneRelationListApiListHeaderList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListApiListHeaderList self = new SavePtsSceneRequestSceneRelationListApiListHeaderList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListApiListHeaderList setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public SavePtsSceneRequestSceneRelationListApiListHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListApiList extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("Body")
        public SavePtsSceneRequestSceneRelationListApiListBody body;

        @NameInMap("CheckPointList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListCheckPointList> checkPointList;

        @NameInMap("ExportList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListExportList> exportList;

        @NameInMap("HeaderList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListHeaderList> headerList;

        @NameInMap("Method")
        public String method;

        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        @NameInMap("Url")
        public String url;

        public static SavePtsSceneRequestSceneRelationListApiList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListApiList self = new SavePtsSceneRequestSceneRelationListApiList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListApiList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public SavePtsSceneRequestSceneRelationListApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SavePtsSceneRequestSceneRelationListApiList setBody(SavePtsSceneRequestSceneRelationListApiListBody body) {
            this.body = body;
            return this;
        }
        public SavePtsSceneRequestSceneRelationListApiListBody getBody() {
            return this.body;
        }

        public SavePtsSceneRequestSceneRelationListApiList setCheckPointList(java.util.List<SavePtsSceneRequestSceneRelationListApiListCheckPointList> checkPointList) {
            this.checkPointList = checkPointList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListCheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        public SavePtsSceneRequestSceneRelationListApiList setExportList(java.util.List<SavePtsSceneRequestSceneRelationListApiListExportList> exportList) {
            this.exportList = exportList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListExportList> getExportList() {
            return this.exportList;
        }

        public SavePtsSceneRequestSceneRelationListApiList setHeaderList(java.util.List<SavePtsSceneRequestSceneRelationListApiListHeaderList> headerList) {
            this.headerList = headerList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListHeaderList> getHeaderList() {
            return this.headerList;
        }

        public SavePtsSceneRequestSceneRelationListApiList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SavePtsSceneRequestSceneRelationListApiList setRedirectCountLimit(Integer redirectCountLimit) {
            this.redirectCountLimit = redirectCountLimit;
            return this;
        }
        public Integer getRedirectCountLimit() {
            return this.redirectCountLimit;
        }

        public SavePtsSceneRequestSceneRelationListApiList setTimeoutInSecond(Integer timeoutInSecond) {
            this.timeoutInSecond = timeoutInSecond;
            return this;
        }
        public Integer getTimeoutInSecond() {
            return this.timeoutInSecond;
        }

        public SavePtsSceneRequestSceneRelationListApiList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SavePtsSceneRequestSceneRelationListFileParameterExplainList extends TeaModel {
        @NameInMap("BaseFile")
        public Boolean baseFile;

        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileParamName")
        public String fileParamName;

        public static SavePtsSceneRequestSceneRelationListFileParameterExplainList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationListFileParameterExplainList self = new SavePtsSceneRequestSceneRelationListFileParameterExplainList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationListFileParameterExplainList setBaseFile(Boolean baseFile) {
            this.baseFile = baseFile;
            return this;
        }
        public Boolean getBaseFile() {
            return this.baseFile;
        }

        public SavePtsSceneRequestSceneRelationListFileParameterExplainList setCycleOnce(Boolean cycleOnce) {
            this.cycleOnce = cycleOnce;
            return this;
        }
        public Boolean getCycleOnce() {
            return this.cycleOnce;
        }

        public SavePtsSceneRequestSceneRelationListFileParameterExplainList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SavePtsSceneRequestSceneRelationListFileParameterExplainList setFileParamName(String fileParamName) {
            this.fileParamName = fileParamName;
            return this;
        }
        public String getFileParamName() {
            return this.fileParamName;
        }

    }

    public static class SavePtsSceneRequestSceneRelationList extends TeaModel {
        @NameInMap("ApiList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiList> apiList;

        @NameInMap("FileParameterExplainList")
        public java.util.List<SavePtsSceneRequestSceneRelationListFileParameterExplainList> fileParameterExplainList;

        @NameInMap("RelationId")
        public String relationId;

        @NameInMap("RelationName")
        public String relationName;

        public static SavePtsSceneRequestSceneRelationList build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestSceneRelationList self = new SavePtsSceneRequestSceneRelationList();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestSceneRelationList setApiList(java.util.List<SavePtsSceneRequestSceneRelationListApiList> apiList) {
            this.apiList = apiList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationListApiList> getApiList() {
            return this.apiList;
        }

        public SavePtsSceneRequestSceneRelationList setFileParameterExplainList(java.util.List<SavePtsSceneRequestSceneRelationListFileParameterExplainList> fileParameterExplainList) {
            this.fileParameterExplainList = fileParameterExplainList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationListFileParameterExplainList> getFileParameterExplainList() {
            return this.fileParameterExplainList;
        }

        public SavePtsSceneRequestSceneRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public SavePtsSceneRequestSceneRelationList setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

    }

    public static class SavePtsSceneRequestScene extends TeaModel {
        @NameInMap("AdvanceSetting")
        public SavePtsSceneRequestSceneAdvanceSetting advanceSetting;

        @NameInMap("FileParameterList")
        public java.util.List<SavePtsSceneRequestSceneFileParameterList> fileParameterList;

        @NameInMap("GlobalParameterList")
        public java.util.List<SavePtsSceneRequestSceneGlobalParameterList> globalParameterList;

        @NameInMap("LoadConfig")
        public SavePtsSceneRequestSceneLoadConfig loadConfig;

        @NameInMap("RelationList")
        public java.util.List<SavePtsSceneRequestSceneRelationList> relationList;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        public static SavePtsSceneRequestScene build(java.util.Map<String, ?> map) throws Exception {
            SavePtsSceneRequestScene self = new SavePtsSceneRequestScene();
            return TeaModel.build(map, self);
        }

        public SavePtsSceneRequestScene setAdvanceSetting(SavePtsSceneRequestSceneAdvanceSetting advanceSetting) {
            this.advanceSetting = advanceSetting;
            return this;
        }
        public SavePtsSceneRequestSceneAdvanceSetting getAdvanceSetting() {
            return this.advanceSetting;
        }

        public SavePtsSceneRequestScene setFileParameterList(java.util.List<SavePtsSceneRequestSceneFileParameterList> fileParameterList) {
            this.fileParameterList = fileParameterList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneFileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        public SavePtsSceneRequestScene setGlobalParameterList(java.util.List<SavePtsSceneRequestSceneGlobalParameterList> globalParameterList) {
            this.globalParameterList = globalParameterList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneGlobalParameterList> getGlobalParameterList() {
            return this.globalParameterList;
        }

        public SavePtsSceneRequestScene setLoadConfig(SavePtsSceneRequestSceneLoadConfig loadConfig) {
            this.loadConfig = loadConfig;
            return this;
        }
        public SavePtsSceneRequestSceneLoadConfig getLoadConfig() {
            return this.loadConfig;
        }

        public SavePtsSceneRequestScene setRelationList(java.util.List<SavePtsSceneRequestSceneRelationList> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<SavePtsSceneRequestSceneRelationList> getRelationList() {
            return this.relationList;
        }

        public SavePtsSceneRequestScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public SavePtsSceneRequestScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

}
