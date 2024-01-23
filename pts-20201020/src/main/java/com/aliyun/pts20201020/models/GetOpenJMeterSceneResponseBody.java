// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetOpenJMeterSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scene")
    public GetOpenJMeterSceneResponseBodyScene scene;

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
        @NameInMap("CreateName")
        public String createName;

        @NameInMap("ModifyName")
        public String modifyName;

        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("Principal")
        public String principal;

        @NameInMap("Remark")
        public String remark;

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
        @NameInMap("ClearCacheEachIteration")
        public Boolean clearCacheEachIteration;

        @NameInMap("DnsServers")
        public java.util.List<String> dnsServers;

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
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Md5")
        public String md5;

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
        @NameInMap("Amount")
        public Integer amount;

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
        @NameInMap("AgentCount")
        public Integer agentCount;

        @NameInMap("BaseInfo")
        public GetOpenJMeterSceneResponseBodySceneBaseInfo baseInfo;

        @NameInMap("Concurrency")
        public Integer concurrency;

        @NameInMap("ConstantThroughputTimerType")
        public String constantThroughputTimerType;

        @NameInMap("DnsCacheConfig")
        public GetOpenJMeterSceneResponseBodySceneDnsCacheConfig dnsCacheConfig;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EnvironmentId")
        public String environmentId;

        @NameInMap("FileList")
        public java.util.List<GetOpenJMeterSceneResponseBodySceneFileList> fileList;

        @NameInMap("IsVpcTest")
        public Boolean isVpcTest;

        @NameInMap("MaxRps")
        public Integer maxRps;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Pool")
        public String pool;

        @NameInMap("RampUp")
        public Integer rampUp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionalCondition")
        public java.util.List<GetOpenJMeterSceneResponseBodySceneRegionalCondition> regionalCondition;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("StartConcurrency")
        public Integer startConcurrency;

        @NameInMap("StartRps")
        public Integer startRps;

        @NameInMap("Steps")
        public Integer steps;

        @NameInMap("SyncTimerType")
        public String syncTimerType;

        @NameInMap("TestFile")
        public String testFile;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
