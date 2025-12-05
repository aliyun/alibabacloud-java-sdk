// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SavePtsSceneRequest extends TeaModel {
    /**
     * <p>The information about the scenario.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IP addresses.</p>
         */
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
        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        /**
         * <p>The domain name-IP address binding relationships</p>
         */
        @NameInMap("DomainBindingList")
        public java.util.List<SavePtsSceneRequestSceneAdvanceSettingDomainBindingList> domainBindingList;

        /**
         * <p>The log sampling rate. Valid values: 1, 10, 20, 30, 40, and 50.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LogRate")
        public Integer logRate;

        /**
         * <p>The success status code. Separate multiple status codes with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
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
        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The OSS URL of the file, which must be accessible over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://jmeter-pts-testing-version.oss-cn-shanghai.aliyuncs.com/param-file.csv">https://jmeter-pts-testing-version.oss-cn-shanghai.aliyuncs.com/param-file.csv</a></p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
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
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The starting RPS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        /**
         * <p>The maximum RPS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The starting total number of concurrent virtual users in all sessions.</p>
         * <p>The value is evenly distributed among all sessions if you set TestMode to concurrency_mode. If you do not specify this parameter, you must configure <strong>relationLoadConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        /**
         * <p>The maximum total number of concurrent virtual users in all sessions.</p>
         * <p>The value is evenly distributed among all sessions if you set TestMode to concurrency_mode. If you do not specify this parameter, you must configure <strong>relationLoadConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        /**
         * <p>The starting RPS for all APIs.</p>
         * <p>The value is evenly distributed among all APIs if you set TestMode to RPS. If you do not specify this parameter, you must specify <strong>apiLoadConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        /**
         * <p>The maximum RPS for all APIs.</p>
         * <p>The value is evenly distributed among all APIs if you set TestMode to RPS. If you do not specify this parameter, you must specify <strong>apiLoadConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The starting number of concurrent virtual users.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        /**
         * <p>The maximum number of concurrent virtual users.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-jkasgfieiajidsjakjscb</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-skjfhlahsljkhsfalkjdoiw</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-akjhsdajgjsfggahjkga</p>
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
        /**
         * <p>The number of load generators. If the number of concurrent virtual users exceeds 250 or the RPS exceeds 2,000, you can use multiple load generators. The maximum number of load generators is limited to the total number of concurrent virtual users divided by 250 or the total RPS divided by 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The API request load settings.</p>
         */
        @NameInMap("ApiLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigApiLoadConfigList> apiLoadConfigList;

        /**
         * <p>Specifies whether the load is automatically incremented. This parameter takes effect only if you set <code>TestMode=concurrency_mode</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoStep")
        public Boolean autoStep;

        /**
         * <p>The load level settings of the scenario.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Configuration")
        public SavePtsSceneRequestSceneLoadConfigConfiguration configuration;

        /**
         * <p>The increment percentage. Valid values: 10 to 100, in increments of 10.</p>
         * <p>This parameter takes effect only if you set <code>testMode=concurrency_mode</code>and <code>autoStep=true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Increment")
        public Integer increment;

        /**
         * <p>The duration of a specific load level. Unit: minutes. The value must be less than the value of <strong>maxRunningTime</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KeepTime")
        public Integer keepTime;

        /**
         * <p>The duration of load application. Unit: minutes. Valid values: 1 to 1440.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        /**
         * <p>The session settings.</p>
         */
        @NameInMap("RelationLoadConfigList")
        public java.util.List<SavePtsSceneRequestSceneLoadConfigRelationLoadConfigList> relationLoadConfigList;

        /**
         * <p>The load application mode. Valid values:</p>
         * <ul>
         * <li>concurrency_mode: concurrency mode</li>
         * <li>tps_mode: RPS mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>concurrency_mode</p>
         */
        @NameInMap("TestMode")
        public String testMode;

        /**
         * <p>The VPC settings.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The data in the body. For example, {&quot;key1&quot;:&quot;value2&quot;,&quot;key2&quot;:&quot;value2&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;global\&quot;:\&quot;${global}\&quot;,\&quot;name\&quot;:\&quot;${name}\&quot;}</p>
         */
        @NameInMap("BodyValue")
        public String bodyValue;

        /**
         * <p>The body type. Default: <code>application/x-www-form-urlencoded</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded</p>
         */
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
        /**
         * <p>The checked item.</p>
         * <p>This parameter specifies the fields in the header if you specify <code>CheckType=HEADER</code> or the name of the export parameter if you specify <code>CheckType=EXPORTED_PARAM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("CheckPoint")
        public String checkPoint;

        /**
         * <p>The type of check. Valid values:</p>
         * <ul>
         * <li>BODY_TEXT: the response body</li>
         * <li>HEADER: the response headers</li>
         * <li>STATUS_CODE: the HTTP status code returned by the API</li>
         * <li>EXPORTED_PARAM: a specific export parameter</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPORTED_PARAM</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ExpectValue")
        public String expectValue;

        /**
         * <p>The operation or condition that is checked against the expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>ctn</p>
         */
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
        /**
         * <p>The index of the matched item. You can specify a number or &quot;Random&quot;. If you set ExportType to BODY_TEXT, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the export parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExportName")
        public String exportName;

        /**
         * <p>The source of the export parameter. Valid values:</p>
         * <ul>
         * <li>BODY_TEXT: the request body in the BODY_TEXT format</li>
         * <li>BODY_JSON: the request body in the BODY_JSON format.</li>
         * <li>HEADER: the request header</li>
         * <li>STATUS_CODE: the HTTP status code returned by the API</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BODY_JSON</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The actual path from which you want to extract the export parameter values.</p>
         * 
         * <strong>example:</strong>
         * <p>data.itemlist[0]</p>
         */
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
        /**
         * <p>The name of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept-Encoding</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The value of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>gzip, deflate, br</p>
         */
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
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The name of the API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The request body.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Body")
        public SavePtsSceneRequestSceneRelationListApiListBody body;

        /**
         * <p>The checkpoints.</p>
         */
        @NameInMap("CheckPointList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListCheckPointList> checkPointList;

        /**
         * <p>The export parameters.</p>
         */
        @NameInMap("ExportList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListExportList> exportList;

        /**
         * <p>The headers.</p>
         */
        @NameInMap("HeaderList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiListHeaderList> headerList;

        /**
         * <p>The request method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The number of redirections. The value can be 0, which specifies that redirection is allowed, or 10, which specifies that redirection is not allowed. You can specify a value based on your business requirements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        /**
         * <p>The timeout period of the API operation. Unit: seconds. Default: 5. Valid values: 1 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        /**
         * <p>The URL to which the API request is sent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
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
        /**
         * <p>Specifies whether the file is used as the baseline file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaseFile")
        public Boolean baseFile;

        /**
         * <p>Specifies whether the file is used for a single execution of the test.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        /**
         * <p>The name of the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileName.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The parameter names in the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name,uid,age</p>
         */
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
        /**
         * <p>The API operations on the session.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ApiList")
        public java.util.List<SavePtsSceneRequestSceneRelationListApiList> apiList;

        /**
         * <p>The file parameters of the session.</p>
         */
        @NameInMap("FileParameterExplainList")
        public java.util.List<SavePtsSceneRequestSceneRelationListFileParameterExplainList> fileParameterExplainList;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The name of the session.</p>
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>The advanced settings.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("AdvanceSetting")
        public SavePtsSceneRequestSceneAdvanceSetting advanceSetting;

        /**
         * <p>The file parameters.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("FileParameterList")
        public java.util.List<SavePtsSceneRequestSceneFileParameterList> fileParameterList;

        /**
         * <p>The global customization parameters.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalParameterList")
        public java.util.List<SavePtsSceneRequestSceneGlobalParameterList> globalParameterList;

        /**
         * <p>The load settings.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LoadConfig")
        public SavePtsSceneRequestSceneLoadConfig loadConfig;

        /**
         * <p>The sessions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<SavePtsSceneRequestSceneRelationList> relationList;

        /**
         * <p>The ID of the scenario. To save a new scenario, leave this parameter empty. To update an existing scenario, specify the ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>IUYAHGJ</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
