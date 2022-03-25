// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SavePtsSceneRequest extends TeaModel {
    // 场景详细信息
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
        // 域名
        @NameInMap("Domain")
        public String domain;

        // 对应的IP
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
        // 超时时间，单位秒
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        // 域名绑定IP关系
        @NameInMap("DomainBindingList")
        public java.util.List<SavePtsSceneRequestSceneAdvanceSettingDomainBindingList> domainBindingList;

        // 日志采样率，[1,50]，且是10的倍数
        @NameInMap("LogRate")
        public Integer logRate;

        // 新增成功状态码，多个用英文逗号隔开
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
        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件的oss地址，必须是公网可访问的
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
        // 参数名
        @NameInMap("ParamName")
        public String paramName;

        // 全局参数值，不可参数化
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
        // apiId
        @NameInMap("ApiId")
        public String apiId;

        // 起始RPS值
        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        // 最大RPS值
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
        // 所有链路的起始并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        // 所有链路的最大并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        // 所有API的起始RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        // 所有API的最大RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
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
        // concurrencyBegin
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        // 最大并发
        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        // 链路id
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
        // regionId
        @NameInMap("RegionId")
        public String regionId;

        // 安全组的Id
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // 交换机的Id
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // vpcId
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
        // 指定机器数，并发必须大于250(RPS大于2000)才能使用，最大扩展机器数不能超过 最大并发/250(最大RPS/2000)
        @NameInMap("AgentCount")
        public Integer agentCount;

        // API的起始、最大RPS值设置，在RPS模式下使用
        @NameInMap("ApiLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigApiLoadConfigList> apiLoadConfigList;

        // 是否自动递增，只有在并发模式下有效，即 testMode=concurrency_mode 时
        @NameInMap("AutoStep")
        public Boolean autoStep;

        // 场景施压量级配置信息
        @NameInMap("Configuration")
        public SavePtsSceneRequestSceneLoadConfigConfiguration configuration;

        // 递增百分比，取值范围[10,100]，且是整十倍；只有在并发模式且是自动递增模式下有效，即 testMode=concurrency_mode 且 autoStep=true 时
        @NameInMap("Increment")
        public Integer increment;

        // 单量级持续时长，单位分钟，一定是小于施压时长 maxRunningTime
        @NameInMap("KeepTime")
        public Integer keepTime;

        // 施压时长，单位分钟，[1-1440]
        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        // 链路的起始、最大并发值设置，在并发模式下使用
        @NameInMap("RelationLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList> relationLoadConfigList;

        // 施压模式，并发模式(concurrency_mode) 和RPS模式(tps_mode)
        @NameInMap("TestMode")
        public String testMode;

        // VPC配置
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
        // body 的实际内容 形式 {"key1":"value2","key2":"value2"}
        @NameInMap("BodyValue")
        public String bodyValue;

        // body 类型，默认 application/x-www-form-urlencoded
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
        // 检查对象 type=HEADER 时，表示header中的字段，type=EXPORTED_PARAM ，表示出参名
        @NameInMap("CheckPoint")
        public String checkPoint;

        // 检查点类型 响应body(BODY_TEXT)，响应header(HEADER)， 响应状态码(STATUS_CODE) ，出参（EXPORTED_PARAM）
        @NameInMap("CheckType")
        public String checkType;

        // 检查内容，即期望值
        @NameInMap("ExpectValue")
        public String expectValue;

        // 检查条件 CheckPointOperator 中
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
        // 第几个匹配项，可以是数字 或 random（ BODY_TEXT情况下才需要count）
        @NameInMap("Count")
        public String count;

        // 出参名
        @NameInMap("ExportName")
        public String exportName;

        // 出参来源 请求体(BODY_TEXT)，请求体(BODY_JSON)，请求头(HEADER)，响应状态码(STATUS_CODE)
        @NameInMap("ExportType")
        public String exportType;

        // 出参的解析表达式
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
        // header参数名
        @NameInMap("HeaderName")
        public String headerName;

        // 参数对应的值
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
        // API的id
        @NameInMap("ApiId")
        public String apiId;

        // API名
        @NameInMap("ApiName")
        public String apiName;

        // 请求body
        @NameInMap("Body")
        public SavePtsSceneRequestSceneRelationListApiListBody body;

        // 检查点
        @NameInMap("CheckPointList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListCheckPointList> checkPointList;

        // 出参
        @NameInMap("ExportList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListExportList> exportList;

        // headerList
        @NameInMap("HeaderList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListHeaderList> headerList;

        // 请求方法
        @NameInMap("Method")
        public String method;

        // 重定向次数，只能是0（允许重定向）或者10（不允许重定向）
        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        // API超时时间，单位秒，默认5s，范围[1-60]
        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        // 压测URL
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
        // 是否作为基准文件
        @NameInMap("BaseFile")
        public Boolean baseFile;

        // 文件是否轮询一次
        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件使用的参数列名
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
        // 链路下的API信息
        @NameInMap("ApiList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiList> apiList;

        // 链路中的文件参数配置信息
        @NameInMap("FileParameterExplainList")
        public java.util.List<SavePtsSceneRequestSceneRelationListFileParameterExplainList> fileParameterExplainList;

        // 链路id
        @NameInMap("RelationId")
        public String relationId;

        // 链路名
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
        // 高级设置
        @NameInMap("AdvanceSetting")
        public SavePtsSceneRequestSceneAdvanceSetting advanceSetting;

        // 文件参数
        @NameInMap("FileParameterList")
        public java.util.List<SavePtsSceneRequestSceneFileParameterList> fileParameterList;

        // 全局自定义参数
        @NameInMap("GlobalParameterList")
        public java.util.List<SavePtsSceneRequestSceneGlobalParameterList> globalParameterList;

        // 施压配置
        @NameInMap("LoadConfig")
        public SavePtsSceneRequestSceneLoadConfig loadConfig;

        // 链路配置
        @NameInMap("RelationList")
        public java.util.List<SavePtsSceneRequestSceneRelationList> relationList;

        // 场景ID，不传为新建，传递为修改
        @NameInMap("SceneId")
        public String sceneId;

        // 场景名
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
