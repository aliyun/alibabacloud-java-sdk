// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetOpenJMeterSceneResponseBody extends TeaModel {
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
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the scenario.</p>
     */
    @NameInMap("Scene")
    public GetOpenJMeterSceneResponseBodyScene scene;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOpenJMeterSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenJMeterSceneResponseBody self = new GetOpenJMeterSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenJMeterSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpenJMeterSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOpenJMeterSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpenJMeterSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenJMeterSceneResponseBody setScene(GetOpenJMeterSceneResponseBodyScene scene) {
        this.scene = scene;
        return this;
    }
    public GetOpenJMeterSceneResponseBodyScene getScene() {
        return this.scene;
    }

    public GetOpenJMeterSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpenJMeterSceneResponseBodySceneBaseInfo extends TeaModel {
        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CreateName")
        public String createName;

        /**
         * <p>The name of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>里斯</p>
         */
        @NameInMap("ModifyName")
        public String modifyName;

        /**
         * <p>The type of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>保存去压测</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The person who takes charge of the performance testing.</p>
         * 
         * <strong>example:</strong>
         * <p>test-person</p>
         */
        @NameInMap("Principal")
        public String principal;

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>小心压测</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The origin of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static GetOpenJMeterSceneResponseBodySceneBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOpenJMeterSceneResponseBodySceneBaseInfo self = new GetOpenJMeterSceneResponseBodySceneBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setCreateName(String createName) {
            this.createName = createName;
            return this;
        }
        public String getCreateName() {
            return this.createName;
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setModifyName(String modifyName) {
            this.modifyName = modifyName;
            return this;
        }
        public String getModifyName() {
            return this.modifyName;
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setPrincipal(String principal) {
            this.principal = principal;
            return this;
        }
        public String getPrincipal() {
            return this.principal;
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetOpenJMeterSceneResponseBodySceneBaseInfo setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class GetOpenJMeterSceneResponseBodySceneDnsCacheConfig extends TeaModel {
        /**
         * <p>Indicates whether the cache is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ClearCacheEachIteration")
        public Boolean clearCacheEachIteration;

        /**
         * <p>The DNS servers</p>
         */
        @NameInMap("DnsServers")
        public java.util.List<String> dnsServers;

        /**
         * <p>The domain name and its bounded IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;server.com&quot;:&quot;6.6.6.6&quot;}</p>
         */
        @NameInMap("HostTable")
        public java.util.Map<String, ?> hostTable;

        public static GetOpenJMeterSceneResponseBodySceneDnsCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            GetOpenJMeterSceneResponseBodySceneDnsCacheConfig self = new GetOpenJMeterSceneResponseBodySceneDnsCacheConfig();
            return TeaModel.build(map, self);
        }

        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig setClearCacheEachIteration(Boolean clearCacheEachIteration) {
            this.clearCacheEachIteration = clearCacheEachIteration;
            return this;
        }
        public Boolean getClearCacheEachIteration() {
            return this.clearCacheEachIteration;
        }

        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig setDnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig setHostTable(java.util.Map<String, ?> hostTable) {
            this.hostTable = hostTable;
            return this;
        }
        public java.util.Map<String, ?> getHostTable() {
            return this.hostTable;
        }

    }

    public static class GetOpenJMeterSceneResponseBodySceneFileList extends TeaModel {
        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>json.jar</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
         */
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>jar</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>61660</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The MD5 value of the JAR package.</p>
         * 
         * <strong>example:</strong>
         * <p>43B584026CE5E570F3DE638FA7EEF9E0</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Indicates whether the file is split.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SplitCsv")
        public Boolean splitCsv;

        public static GetOpenJMeterSceneResponseBodySceneFileList build(java.util.Map<String, ?> map) throws Exception {
            GetOpenJMeterSceneResponseBodySceneFileList self = new GetOpenJMeterSceneResponseBodySceneFileList();
            return TeaModel.build(map, self);
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetOpenJMeterSceneResponseBodySceneFileList setSplitCsv(Boolean splitCsv) {
            this.splitCsv = splitCsv;
            return this;
        }
        public Boolean getSplitCsv() {
            return this.splitCsv;
        }

    }

    public static class GetOpenJMeterSceneResponseBodySceneRegionalCondition extends TeaModel {
        /**
         * <p>The number of load generators.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetOpenJMeterSceneResponseBodySceneRegionalCondition build(java.util.Map<String, ?> map) throws Exception {
            GetOpenJMeterSceneResponseBodySceneRegionalCondition self = new GetOpenJMeterSceneResponseBodySceneRegionalCondition();
            return TeaModel.build(map, self);
        }

        public GetOpenJMeterSceneResponseBodySceneRegionalCondition setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public GetOpenJMeterSceneResponseBodySceneRegionalCondition setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetOpenJMeterSceneResponseBodyScene extends TeaModel {
        /**
         * <p>The number of load generators. A load generator supports up to 500 concurrent virtual users.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The basic information.</p>
         */
        @NameInMap("BaseInfo")
        public GetOpenJMeterSceneResponseBodySceneBaseInfo baseInfo;

        /**
         * <p>The maximum number of concurrent virtual users.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The type of the constant throughput timer.</p>
         * 
         * <strong>example:</strong>
         * <p>STAND_ALONE</p>
         */
        @NameInMap("ConstantThroughputTimerType")
        public String constantThroughputTimerType;

        /**
         * <p>The DNS settings.</p>
         */
        @NameInMap("DnsCacheConfig")
        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig dnsCacheConfig;

        /**
         * <p>The duration of the performance testing. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The ID of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>EEDT7</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The files.</p>
         */
        @NameInMap("FileList")
        public java.util.List<GetOpenJMeterSceneResponseBodySceneFileList> fileList;

        /**
         * <p>Indicates whether the load is from a virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVpcTest")
        public Boolean isVpcTest;

        /**
         * <p>The maximum RPS. This parameter is returned if you set Mode to tps_mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MaxRps")
        public Integer maxRps;

        /**
         * <p>The load application mode. Valid values: concurrency_mode and tps_mode.</p>
         * 
         * <strong>example:</strong>
         * <p>concurrency_mode</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The origin of the load. &quot;&quot; indicates the Internet and intranet-vpc indicates the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Pool")
        public String pool;

        /**
         * <p>The period of time during which the load is gradually increased to the desired level. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RampUp")
        public Integer rampUp;

        /**
         * <p>The region ID. This parameter is returned if the load is from a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Customized load generator settings for regions</p>
         */
        @NameInMap("RegionalCondition")
        public java.util.List<GetOpenJMeterSceneResponseBodySceneRegionalCondition> regionalCondition;

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPZIH</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The ID of the security group. This parameter is returned if the load is from a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeid0dd7bhahsgdahspaly</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The start number of concurrent virtual users.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StartConcurrency")
        public Integer startConcurrency;

        /**
         * <p>The start requests per second (RPS). This parameter is returned if you set Mode to tps_mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StartRps")
        public Integer startRps;

        /**
         * <p>The number of incremented users per step. If RampUp or Steps is not specified, the fixed load is used. If RampUp is specified but Steps is not specified, the load increases uniformly based on the value of RampUp. If RampUp and Steps are specified and Steps is less than RampUp, the load increases based on the value of Steps. You cannot specify Steps without specifying RampUp. If you do so, the fixed load is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Steps")
        public Integer steps;

        /**
         * <p>The type of the synchronization timer.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("SyncTimerType")
        public String syncTimerType;

        /**
         * <p>The test file.</p>
         * 
         * <strong>example:</strong>
         * <p>baidu.jmx</p>
         */
        @NameInMap("TestFile")
        public String testFile;

        /**
         * <p>The ID of the vSwitch. This parameter is returned if the load is from a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zehsgdhsahw1r</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC. This parameter is returned if the load is from a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze2sahjdgahsebjkqhf4pyj</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetOpenJMeterSceneResponseBodyScene build(java.util.Map<String, ?> map) throws Exception {
            GetOpenJMeterSceneResponseBodyScene self = new GetOpenJMeterSceneResponseBodyScene();
            return TeaModel.build(map, self);
        }

        public GetOpenJMeterSceneResponseBodyScene setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetOpenJMeterSceneResponseBodyScene setBaseInfo(GetOpenJMeterSceneResponseBodySceneBaseInfo baseInfo) {
            this.baseInfo = baseInfo;
            return this;
        }
        public GetOpenJMeterSceneResponseBodySceneBaseInfo getBaseInfo() {
            return this.baseInfo;
        }

        public GetOpenJMeterSceneResponseBodyScene setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetOpenJMeterSceneResponseBodyScene setConstantThroughputTimerType(String constantThroughputTimerType) {
            this.constantThroughputTimerType = constantThroughputTimerType;
            return this;
        }
        public String getConstantThroughputTimerType() {
            return this.constantThroughputTimerType;
        }

        public GetOpenJMeterSceneResponseBodyScene setDnsCacheConfig(GetOpenJMeterSceneResponseBodySceneDnsCacheConfig dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }
        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig getDnsCacheConfig() {
            return this.dnsCacheConfig;
        }

        public GetOpenJMeterSceneResponseBodyScene setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetOpenJMeterSceneResponseBodyScene setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetOpenJMeterSceneResponseBodyScene setFileList(java.util.List<GetOpenJMeterSceneResponseBodySceneFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<GetOpenJMeterSceneResponseBodySceneFileList> getFileList() {
            return this.fileList;
        }

        public GetOpenJMeterSceneResponseBodyScene setIsVpcTest(Boolean isVpcTest) {
            this.isVpcTest = isVpcTest;
            return this;
        }
        public Boolean getIsVpcTest() {
            return this.isVpcTest;
        }

        public GetOpenJMeterSceneResponseBodyScene setMaxRps(Integer maxRps) {
            this.maxRps = maxRps;
            return this;
        }
        public Integer getMaxRps() {
            return this.maxRps;
        }

        public GetOpenJMeterSceneResponseBodyScene setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetOpenJMeterSceneResponseBodyScene setPool(String pool) {
            this.pool = pool;
            return this;
        }
        public String getPool() {
            return this.pool;
        }

        public GetOpenJMeterSceneResponseBodyScene setRampUp(Integer rampUp) {
            this.rampUp = rampUp;
            return this;
        }
        public Integer getRampUp() {
            return this.rampUp;
        }

        public GetOpenJMeterSceneResponseBodyScene setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetOpenJMeterSceneResponseBodyScene setRegionalCondition(java.util.List<GetOpenJMeterSceneResponseBodySceneRegionalCondition> regionalCondition) {
            this.regionalCondition = regionalCondition;
            return this;
        }
        public java.util.List<GetOpenJMeterSceneResponseBodySceneRegionalCondition> getRegionalCondition() {
            return this.regionalCondition;
        }

        public GetOpenJMeterSceneResponseBodyScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetOpenJMeterSceneResponseBodyScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetOpenJMeterSceneResponseBodyScene setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetOpenJMeterSceneResponseBodyScene setStartConcurrency(Integer startConcurrency) {
            this.startConcurrency = startConcurrency;
            return this;
        }
        public Integer getStartConcurrency() {
            return this.startConcurrency;
        }

        public GetOpenJMeterSceneResponseBodyScene setStartRps(Integer startRps) {
            this.startRps = startRps;
            return this;
        }
        public Integer getStartRps() {
            return this.startRps;
        }

        public GetOpenJMeterSceneResponseBodyScene setSteps(Integer steps) {
            this.steps = steps;
            return this;
        }
        public Integer getSteps() {
            return this.steps;
        }

        public GetOpenJMeterSceneResponseBodyScene setSyncTimerType(String syncTimerType) {
            this.syncTimerType = syncTimerType;
            return this;
        }
        public String getSyncTimerType() {
            return this.syncTimerType;
        }

        public GetOpenJMeterSceneResponseBodyScene setTestFile(String testFile) {
            this.testFile = testFile;
            return this;
        }
        public String getTestFile() {
            return this.testFile;
        }

        public GetOpenJMeterSceneResponseBodyScene setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetOpenJMeterSceneResponseBodyScene setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
