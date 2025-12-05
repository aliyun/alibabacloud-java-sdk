// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If the operation is successful, N/A is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The structure of the scenario.</p>
     */
    @NameInMap("Scene")
    public GetPtsSceneResponseBodyScene scene;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IPs bound to the domain name.</p>
         */
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
        /**
         * <p>The timeout period of the scenario. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConnectionTimeoutInSecond")
        public Integer connectionTimeoutInSecond;

        /**
         * <p>The IP-domain name bindings.</p>
         */
        @NameInMap("DomainBindingList")
        public java.util.List<GetPtsSceneResponseBodySceneAdvanceSettingDomainBindingList> domainBindingList;

        /**
         * <p>The log sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LogRate")
        public Integer logRate;

        /**
         * <p>The custom success code.</p>
         * 
         * <strong>example:</strong>
         * <p>429,304</p>
         */
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
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>city.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The OSS address of the file. Make sure that the address is accessible from the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>userName</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>lisi</p>
         */
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
        /**
         * <p>The name of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the header.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
        /**
         * <p>The API ID. You can track an API by its ID in sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>GBFDCV8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The starting requests per second (RPS).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RpsBegin")
        public Integer rpsBegin;

        /**
         * <p>The maximum RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
        /**
         * <p>The starting number of concurrent sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllConcurrencyBegin")
        public Integer allConcurrencyBegin;

        /**
         * <p>The maximum number of concurrent sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AllConcurrencyLimit")
        public Integer allConcurrencyLimit;

        /**
         * <p>The starting RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AllRpsBegin")
        public Integer allRpsBegin;

        /**
         * <p>The maximum RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
        /**
         * <p>The starting number of concurrent sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrencyBegin")
        public Integer concurrencyBegin;

        /**
         * <p>The maximum number of concurrent sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ConcurrencyLimit")
        public Integer concurrencyLimit;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>HNBGS7M</p>
         */
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
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-jkasgfieiajidsjakjscb</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-skjfhlahsljkhsfalkjdoiw</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-akjhsdajgjsfggahjkga</p>
         */
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
        /**
         * <p>The number of load generators.</p>
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
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigApiLoadConfigList> apiLoadConfigList;

        /**
         * <p>Indicates whether the load is automatically incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoStep")
        public Boolean autoStep;

        /**
         * <p>The concurrency and RPS settings of the scenario.</p>
         */
        @NameInMap("Configuration")
        public GetPtsSceneResponseBodySceneLoadConfigConfiguration configuration;

        /**
         * <p>The increment percentage. The valid values are 10 to 100, in increments of 10. This parameter is returned only if you set testMode to concurrency_mode and set autoStep to true.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Increment")
        public Integer increment;

        /**
         * <p>The duration during which a specific load level is applied. The duration is less than the value of maxRunningTime. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KeepTime")
        public Integer keepTime;

        /**
         * <p>The maximum duration of load application. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxRunningTime")
        public Integer maxRunningTime;

        /**
         * <p>The session load settings.</p>
         */
        @NameInMap("RelationLoadConfigList")
        public java.util.List<GetPtsSceneResponseBodySceneLoadConfigRelationLoadConfigList> relationLoadConfigList;

        /**
         * <p>The load application mode. Transactions per second (TPS) indicates the RPS mode.</p>
         * <blockquote>
         * <p> The load application mode is CONCURRENCY/TPS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TPS</p>
         */
        @NameInMap("TestMode")
        public String testMode;

        /**
         * <p>The virtual private cloud (VPC) settings. This information is returned only if you set the testing mode to VPC.</p>
         */
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
        /**
         * <p>The body value.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key1\&quot;:\&quot;111\&quot;,\&quot;key2\&quot;:\&quot;222\&quot;}</p>
         */
        @NameInMap("BodyValue")
        public String bodyValue;

        /**
         * <p>The body type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/x-www-form-urlencoded</p>
         */
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
        /**
         * <p>The checked parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("CheckPoint")
        public String checkPoint;

        /**
         * <p>The check type.</p>
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
         * <p>The check operator.</p>
         * 
         * <strong>example:</strong>
         * <p>ctn</p>
         */
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
        /**
         * <p>The number of items or entries related to the export operation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The path where the exported value can be found.</p>
         * 
         * <strong>example:</strong>
         * <p>data.username</p>
         */
        @NameInMap("ExportName")
        public String exportName;

        /**
         * <p>The format in which data is exported.</p>
         * 
         * <strong>example:</strong>
         * <p>BODY_JSON</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The parameter that is exported.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
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
        /**
         * <p>The header name.</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The header value.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
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
        /**
         * <p>The API ID. You can track an API by its ID in sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>GBFDCV8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The request body.</p>
         */
        @NameInMap("Body")
        public GetPtsSceneResponseBodySceneRelationListApiListBody body;

        /**
         * <p>The checkpoints.</p>
         */
        @NameInMap("CheckPointList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListCheckPointList> checkPointList;

        /**
         * <p>The exported parameters.</p>
         */
        @NameInMap("ExportList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListExportList> exportList;

        /**
         * <p>The headers used in the API request.</p>
         */
        @NameInMap("HeaderList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiListHeaderList> headerList;

        /**
         * <p>The request method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The number of redirections.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RedirectCountLimit")
        public Integer redirectCountLimit;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeoutInSecond")
        public Integer timeoutInSecond;

        /**
         * <p>The URL to which the request is sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyundoc.com">https://www.aliyundoc.com</a></p>
         */
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
        /**
         * <p>Indicates whether the file serves as the primary dataset for the test.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaseFile")
        public Boolean baseFile;

        /**
         * <p>Indicates whether the parameters are used for a single test execution.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CycleOnce")
        public Boolean cycleOnce;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>city.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The parameter names in the file.</p>
         * 
         * <strong>example:</strong>
         * <p>userName,age</p>
         */
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
        /**
         * <p>The APIs.</p>
         */
        @NameInMap("ApiList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListApiList> apiList;

        /**
         * <p>The file parameters.</p>
         */
        @NameInMap("FileParameterExplainList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationListFileParameterExplainList> fileParameterExplainList;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>HNBGS7M</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The session name.</p>
         */
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
        /**
         * <p>The advanced settings.</p>
         */
        @NameInMap("AdvanceSetting")
        public GetPtsSceneResponseBodySceneAdvanceSetting advanceSetting;

        /**
         * <p>The creation time of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26 15:30:30</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file parameters.</p>
         */
        @NameInMap("FileParameterList")
        public java.util.List<GetPtsSceneResponseBodySceneFileParameterList> fileParameterList;

        /**
         * <p>Global parameters</p>
         */
        @NameInMap("GlobalParameterList")
        public java.util.List<GetPtsSceneResponseBodySceneGlobalParameterList> globalParameterList;

        /**
         * <p>The global headers for the scenario.</p>
         */
        @NameInMap("Headers")
        public java.util.List<GetPtsSceneResponseBodySceneHeaders> headers;

        /**
         * <p>The load settings.</p>
         */
        @NameInMap("LoadConfig")
        public GetPtsSceneResponseBodySceneLoadConfig loadConfig;

        /**
         * <p>The last modification time of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-26 15:30:30</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The sessions.</p>
         */
        @NameInMap("RelationList")
        public java.util.List<GetPtsSceneResponseBodySceneRelationList> relationList;

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>BGFJ7GV</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scenario</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
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
