// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SaveOpenJMeterSceneRequest extends TeaModel {
    /**
     * <p>The details of the scenario.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>Specifies whether to clear the cache in each iteration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClearCacheEachIteration")
        public Boolean clearCacheEachIteration;

        /**
         * <p>The DNS servers.</p>
         */
        @NameInMap("DnsServers")
        public java.util.List<String> dnsServers;

        /**
         * <p>The table that contains bound domain names.</p>
         */
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
        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>61232</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the test file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>baidu.jmx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The Object Storage Service (OSS) path that is used to access the test file over the Internet.</p>
         * <blockquote>
         * <p> Only test files in the China (Shanghai) region can be accessed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.cn-shanghai.aliyuncs.com/baidu.jmx">https://test.cn-shanghai.aliyuncs.com/baidu.jmx</a></p>
         */
        @NameInMap("FileOssAddress")
        public String fileOssAddress;

        /**
         * <p>The file size. The total file size cannot exceed 500 MB. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>28880</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The MD5 hash of the test file.</p>
         * 
         * <strong>example:</strong>
         * <p>DA70F97A74D76B6A3BEF9CC8AE0D89EB</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Specifies whether to split the test file. This parameter is valid only for CSV files.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SplitCsv")
        public Boolean splitCsv;

        /**
         * <p>The file tag.</p>
         */
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
        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>https.sessioncontext.shared</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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

    public static class SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition extends TeaModel {
        /**
         * <p>The number of stress tests. The sum of the number of stress tests in all regions must be equal to the AgentCount value of a specified scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition build(java.util.Map<String, ?> map) throws Exception {
            SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition self = new SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition();
            return TeaModel.build(map, self);
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class SaveOpenJMeterSceneRequestOpenJMeterScene extends TeaModel {
        /**
         * <p>The number of stress testers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The maximum concurrency that is determined by the resource plans of users. You must configure this parameter when the mode is set to CONCURRENCY.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The type of the synchronization timer with fixed throughput in JMeter.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("ConstantThroughputTimerType")
        public String constantThroughputTimerType;

        /**
         * <p>The settings of Domain Name System (DNS).</p>
         */
        @NameInMap("DnsCacheConfig")
        public SaveOpenJMeterSceneRequestOpenJMeterSceneDnsCacheConfig dnsCacheConfig;

        /**
         * <p>The stress testing duration. The maximum stress testing duration is no more than one day, Unit: seconds. Valid values: 60 to 86400.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The ID of the environment associated with the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>I8PZIH</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The test files.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileList")
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneFileList> fileList;

        /**
         * <p>Specifies whether the test is a virtual private cloud (VPC) test. The default value is false, which indicates a public network test. VPC-related settings take effect only when you set this parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVpcTest")
        public Boolean isVpcTest;

        /**
         * <p>The JMeter properties.</p>
         */
        @NameInMap("JMeterProperties")
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneJMeterProperties> JMeterProperties;

        /**
         * <p>The JMeter plug-in tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JmeterPluginLabel")
        public String jmeterPluginLabel;

        /**
         * <p>The maximum RPS that takes effect in RPS mode.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxRps")
        public Integer maxRps;

        /**
         * <p>The stress model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONCURRENCY</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The ramp-up period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("RampUp")
        public Integer rampUp;

        /**
         * <p>The region ID that is specified in the VPC test.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The requirements for the regions of the stress testers.</p>
         */
        @NameInMap("RegionalCondition")
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition> regionalCondition;

        /**
         * <p>The scenario ID. If you do not configure this parameter, the system creates a scenario. If you configure this parameter, the system updates the scenario corresponding to the ID specified by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPZIH</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scenario name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The security group ID that is specified in the VPC test.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2zeid0dd7bhahsgdahspaly</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The initial concurrency that takes effect in concurrency mode. You must configure this parameter when the mode is set to CONCURRENCY.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StartConcurrency")
        public Integer startConcurrency;

        /**
         * <p>The initial RPS that takes effect in RPS mode.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StartRps")
        public Integer startRps;

        /**
         * <p>The number of ramp-up steps.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Steps")
        public Integer steps;

        /**
         * <p>The type of the synchronization timer in JMeter.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("SyncTimerType")
        public String syncTimerType;

        /**
         * <p>The test file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>baidu.jmx</p>
         */
        @NameInMap("TestFile")
        public String testFile;

        /**
         * <p>The vSwitch ID that is specified in the VPC test.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zehsgdhsahw1r</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID that is specified in the VPC test.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze2sahjdgahsebjkqhf4pyj</p>
         */
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

        public SaveOpenJMeterSceneRequestOpenJMeterScene setJmeterPluginLabel(String jmeterPluginLabel) {
            this.jmeterPluginLabel = jmeterPluginLabel;
            return this;
        }
        public String getJmeterPluginLabel() {
            return this.jmeterPluginLabel;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setMaxRps(Integer maxRps) {
            this.maxRps = maxRps;
            return this;
        }
        public Integer getMaxRps() {
            return this.maxRps;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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

        public SaveOpenJMeterSceneRequestOpenJMeterScene setRegionalCondition(java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition> regionalCondition) {
            this.regionalCondition = regionalCondition;
            return this;
        }
        public java.util.List<SaveOpenJMeterSceneRequestOpenJMeterSceneRegionalCondition> getRegionalCondition() {
            return this.regionalCondition;
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

        public SaveOpenJMeterSceneRequestOpenJMeterScene setStartConcurrency(Integer startConcurrency) {
            this.startConcurrency = startConcurrency;
            return this;
        }
        public Integer getStartConcurrency() {
            return this.startConcurrency;
        }

        public SaveOpenJMeterSceneRequestOpenJMeterScene setStartRps(Integer startRps) {
            this.startRps = startRps;
            return this;
        }
        public Integer getStartRps() {
            return this.startRps;
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
