// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveOpenJMeterSceneRequest extends TeaModel {
    // 场景详情
    @NameInMap("OpenJMeterScene")
    public SaveOpenJMeterSceneRequestOpenJMeterScene openJMeterScene;

    public static SaveOpenJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOpenJMeterSceneRequest self = new SaveOpenJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public SaveOpenJMeterSceneRequest setOpenJMeterScene(SaveOpenJMeterSceneRequestOpenJMeterScene openJMeterScene) {
        this.openJMeterScene = openJMeterScene;
        return this;
    }
    public SaveOpenJMeterSceneRequestOpenJMeterScene getOpenJMeterScene() {
        return this.openJMeterScene;
    }

    public static class SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig extends TeaModel {
        @NameInMap("ClearCacheEachIteration")
        public Boolean clearCacheEachIteration;

        @NameInMap("DnsServers")
        public java.util.List<String> dnsServers;

        @NameInMap("HostTable")
        public java.util.Map<String, String> hostTable;

        public static SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig self = new SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig();
            return TeaModel.build(map, self);
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig setClearCacheEachIteration(Boolean clearCacheEachIteration) {
            this.clearCacheEachIteration = clearCacheEachIteration;
            return this;
        }
        public Boolean getClearCacheEachIteration() {
            return this.clearCacheEachIteration;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig setDnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig setHostTable(java.util.Map<String, String> hostTable) {
            this.hostTable = hostTable;
            return this;
        }
        public java.util.Map<String, String> getHostTable() {
            return this.hostTable;
        }

    }

    public static class SaveOpenJMeterSceneRequestOpenJMeterSceneFileList extends TeaModel {
        // 文件id
        @NameInMap("FileId")
        public Long fileId;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件公网可访问的oss地址
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        // 文件大小，单位byte
        @NameInMap("FileSize")
        public Long fileSize;

        // 文件的MD5
        @NameInMap("Md5")
        public String md5;

        // 是否切分，仅针对csv有效
        @NameInMap("SplitCsv")
        public Boolean splitCsv;

        // 文件tag
        @NameInMap("Tags")
        public String tags;

        public static SaveOpenJMeterSceneRequestOpenJMeterSceneFileList build(java.util.Map<String, ?> map) throws Exception {
            SaveOpenJMeterSceneRequestOpenJMeterSceneFileList self = new SaveOpenJMeterSceneRequestOpenJMeterSceneFileList();
            return TeaModel.build(map, self);
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setFileOssAddress(String fileOssAddress) {
            this.fileOssAddress = fileOssAddress;
            return this;
        }
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setSplitCsv(Boolean splitCsv) {
            this.splitCsv = splitCsv;
            return this;
        }
        public Boolean getSplitCsv() {
            return this.splitCsv;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneFileList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties build(java.util.Map<String, ?> map) throws Exception {
            SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties self = new SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties();
            return TeaModel.build(map, self);
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SaveOpenJMeterSceneRequestOpenJMeterScene extends TeaModel {
        // 施压引擎数量
        @NameInMap("AgentCount")
        public Integer agentCount;

        // 最大并发
        @NameInMap("Concurrency")
        public Integer concurrency;

        // constantThroughputTimerType
        @NameInMap("ConstantThroughputTimerType")
        public String constantThroughputTimerType;

        // DNS配置
        @NameInMap("DnsCacheConfig")
        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig dnsCacheConfig;

        // 压测持续时间
        @NameInMap("Duration")
        public Integer duration;

        // 关联的环境id
        @NameInMap("EnvironmentId")
        public String environmentId;

        // 文件列表
        @NameInMap("FileList")
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneFileList> fileList;

        // 是否为VPC测试，默认为false表示公网测试，此值为true时VPC相关配置才生效
        @NameInMap("IsVpcTest")
        public Boolean isVpcTest;

        // Jmeter属性
        @NameInMap("JMeterProperties")
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties> JMeterProperties;

        // 预热时间
        @NameInMap("RampUp")
        public Integer rampUp;

        // region的id，VPC压测时配置
        @NameInMap("RegionId")
        public String regionId;

        // 场景ID
        @NameInMap("SceneId")
        public String sceneId;

        // 场景名
        @NameInMap("SceneName")
        public String sceneName;

        // 安全组id，VPC压测时配置
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // 预热阶段
        @NameInMap("Steps")
        public Integer steps;

        // synchronizing timer 类型
        @NameInMap("SyncTimerType")
        public String syncTimerType;

        // 测试文件
        @NameInMap("TestFile")
        public String testFile;

        // 交换机id，VPC压测时配置
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // vpc的id，VPC压测时配置
        @NameInMap("VpcId")
        public String vpcId;

        public static SaveOpenJMeterSceneRequestOpenJMeterScene build(java.util.Map<String, ?> map) throws Exception {
            SaveOpenJMeterSceneRequestOpenJMeterScene self = new SaveOpenJMeterSceneRequestOpenJMeterScene();
            return TeaModel.build(map, self);
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setConstantThroughputTimerType(String constantThroughputTimerType) {
            this.constantThroughputTimerType = constantThroughputTimerType;
            return this;
        }
        public String getConstantThroughputTimerType() {
            return this.constantThroughputTimerType;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setDnsCacheConfig(SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }
        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig getDnsCacheConfig() {
            return this.dnsCacheConfig;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setFileList(java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneFileList> getFileList() {
            return this.fileList;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setIsVpcTest(Boolean isVpcTest) {
            this.isVpcTest = isVpcTest;
            return this;
        }
        public Boolean getIsVpcTest() {
            return this.isVpcTest;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setJMeterProperties(java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties> JMeterProperties) {
            this.JMeterProperties = JMeterProperties;
            return this;
        }
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties> getJMeterProperties() {
            return this.JMeterProperties;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setRampUp(Integer rampUp) {
            this.rampUp = rampUp;
            return this;
        }
        public Integer getRampUp() {
            return this.rampUp;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setSteps(Integer steps) {
            this.steps = steps;
            return this;
        }
        public Integer getSteps() {
            return this.steps;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setSyncTimerType(String syncTimerType) {
            this.syncTimerType = syncTimerType;
            return this;
        }
        public String getSyncTimerType() {
            return this.syncTimerType;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setTestFile(String testFile) {
            this.testFile = testFile;
            return this;
        }
        public String getTestFile() {
            return this.testFile;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
