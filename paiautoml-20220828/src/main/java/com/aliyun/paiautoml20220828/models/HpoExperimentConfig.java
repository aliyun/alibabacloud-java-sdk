// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class HpoExperimentConfig extends TeaModel {
    @NameInMap("dlc_config")
    public HpoExperimentConfigDlcConfig dlcConfig;

    @NameInMap("k8s_config")
    public HpoExperimentConfigK8sConfig k8sConfig;

    @NameInMap("metric_config")
    public HpoExperimentConfigMetricConfig metricConfig;

    @NameInMap("monitor_config")
    public HpoExperimentConfigMonitorConfig monitorConfig;

    @NameInMap("odps_config")
    public HpoExperimentConfigOdpsConfig odpsConfig;

    @NameInMap("oss_config")
    public HpoExperimentConfigOssConfig ossConfig;

    @NameInMap("output_config")
    public HpoExperimentConfigOutputConfig outputConfig;

    @NameInMap("paiflow_config")
    public HpoExperimentConfigPaiflowConfig paiflowConfig;

    @NameInMap("params_config")
    public HpoExperimentConfigParamsConfig paramsConfig;

    @NameInMap("platform_config")
    public HpoExperimentConfigPlatformConfig platformConfig;

    @NameInMap("schedule_config")
    public HpoExperimentConfigScheduleConfig scheduleConfig;

    @NameInMap("search_space")
    public java.util.Map<String, ?> searchSpace;

    @NameInMap("ts_config")
    public HpoExperimentConfigTsConfig tsConfig;

    @NameInMap("yml_config")
    public HpoExperimentConfigYmlConfig ymlConfig;

    public static HpoExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
        HpoExperimentConfig self = new HpoExperimentConfig();
        return TeaModel.build(map, self);
    }

    public HpoExperimentConfig setDlcConfig(HpoExperimentConfigDlcConfig dlcConfig) {
        this.dlcConfig = dlcConfig;
        return this;
    }
    public HpoExperimentConfigDlcConfig getDlcConfig() {
        return this.dlcConfig;
    }

    public HpoExperimentConfig setK8sConfig(HpoExperimentConfigK8sConfig k8sConfig) {
        this.k8sConfig = k8sConfig;
        return this;
    }
    public HpoExperimentConfigK8sConfig getK8sConfig() {
        return this.k8sConfig;
    }

    public HpoExperimentConfig setMetricConfig(HpoExperimentConfigMetricConfig metricConfig) {
        this.metricConfig = metricConfig;
        return this;
    }
    public HpoExperimentConfigMetricConfig getMetricConfig() {
        return this.metricConfig;
    }

    public HpoExperimentConfig setMonitorConfig(HpoExperimentConfigMonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
        return this;
    }
    public HpoExperimentConfigMonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    public HpoExperimentConfig setOdpsConfig(HpoExperimentConfigOdpsConfig odpsConfig) {
        this.odpsConfig = odpsConfig;
        return this;
    }
    public HpoExperimentConfigOdpsConfig getOdpsConfig() {
        return this.odpsConfig;
    }

    public HpoExperimentConfig setOssConfig(HpoExperimentConfigOssConfig ossConfig) {
        this.ossConfig = ossConfig;
        return this;
    }
    public HpoExperimentConfigOssConfig getOssConfig() {
        return this.ossConfig;
    }

    public HpoExperimentConfig setOutputConfig(HpoExperimentConfigOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public HpoExperimentConfigOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public HpoExperimentConfig setPaiflowConfig(HpoExperimentConfigPaiflowConfig paiflowConfig) {
        this.paiflowConfig = paiflowConfig;
        return this;
    }
    public HpoExperimentConfigPaiflowConfig getPaiflowConfig() {
        return this.paiflowConfig;
    }

    public HpoExperimentConfig setParamsConfig(HpoExperimentConfigParamsConfig paramsConfig) {
        this.paramsConfig = paramsConfig;
        return this;
    }
    public HpoExperimentConfigParamsConfig getParamsConfig() {
        return this.paramsConfig;
    }

    public HpoExperimentConfig setPlatformConfig(HpoExperimentConfigPlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        return this;
    }
    public HpoExperimentConfigPlatformConfig getPlatformConfig() {
        return this.platformConfig;
    }

    public HpoExperimentConfig setScheduleConfig(HpoExperimentConfigScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public HpoExperimentConfigScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public HpoExperimentConfig setSearchSpace(java.util.Map<String, ?> searchSpace) {
        this.searchSpace = searchSpace;
        return this;
    }
    public java.util.Map<String, ?> getSearchSpace() {
        return this.searchSpace;
    }

    public HpoExperimentConfig setTsConfig(HpoExperimentConfigTsConfig tsConfig) {
        this.tsConfig = tsConfig;
        return this;
    }
    public HpoExperimentConfigTsConfig getTsConfig() {
        return this.tsConfig;
    }

    public HpoExperimentConfig setYmlConfig(HpoExperimentConfigYmlConfig ymlConfig) {
        this.ymlConfig = ymlConfig;
        return this;
    }
    public HpoExperimentConfigYmlConfig getYmlConfig() {
        return this.ymlConfig;
    }

    public static class HpoExperimentConfigDlcConfig extends TeaModel {
        @NameInMap("access_id")
        public String accessId;

        @NameInMap("access_key")
        public String accessKey;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("region")
        public String region;

        public static HpoExperimentConfigDlcConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigDlcConfig self = new HpoExperimentConfigDlcConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigDlcConfig setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public HpoExperimentConfigDlcConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public HpoExperimentConfigDlcConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public HpoExperimentConfigDlcConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HpoExperimentConfigDlcConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class HpoExperimentConfigK8sConfig extends TeaModel {
        @NameInMap("nni_container_cpu_limit")
        public String nniContainerCpuLimit;

        @NameInMap("nni_container_memory_limit")
        public String nniContainerMemoryLimit;

        @NameInMap("nni_container_requested_cpu")
        public String nniContainerRequestedCpu;

        @NameInMap("nni_container_requested_memory")
        public String nniContainerRequestedMemory;

        public static HpoExperimentConfigK8sConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigK8sConfig self = new HpoExperimentConfigK8sConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigK8sConfig setNniContainerCpuLimit(String nniContainerCpuLimit) {
            this.nniContainerCpuLimit = nniContainerCpuLimit;
            return this;
        }
        public String getNniContainerCpuLimit() {
            return this.nniContainerCpuLimit;
        }

        public HpoExperimentConfigK8sConfig setNniContainerMemoryLimit(String nniContainerMemoryLimit) {
            this.nniContainerMemoryLimit = nniContainerMemoryLimit;
            return this;
        }
        public String getNniContainerMemoryLimit() {
            return this.nniContainerMemoryLimit;
        }

        public HpoExperimentConfigK8sConfig setNniContainerRequestedCpu(String nniContainerRequestedCpu) {
            this.nniContainerRequestedCpu = nniContainerRequestedCpu;
            return this;
        }
        public String getNniContainerRequestedCpu() {
            return this.nniContainerRequestedCpu;
        }

        public HpoExperimentConfigK8sConfig setNniContainerRequestedMemory(String nniContainerRequestedMemory) {
            this.nniContainerRequestedMemory = nniContainerRequestedMemory;
            return this;
        }
        public String getNniContainerRequestedMemory() {
            return this.nniContainerRequestedMemory;
        }

    }

    public static class HpoExperimentConfigMetricConfig extends TeaModel {
        @NameInMap("final_mode")
        public String finalMode;

        @NameInMap("metric_dict")
        public java.util.Map<String, ?> metricDict;

        @NameInMap("metric_source")
        public java.util.List<String> metricSource;

        @NameInMap("metric_type")
        public String metricType;

        @NameInMap("source_list_final_mode")
        public String sourceListFinalMode;

        public static HpoExperimentConfigMetricConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigMetricConfig self = new HpoExperimentConfigMetricConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigMetricConfig setFinalMode(String finalMode) {
            this.finalMode = finalMode;
            return this;
        }
        public String getFinalMode() {
            return this.finalMode;
        }

        public HpoExperimentConfigMetricConfig setMetricDict(java.util.Map<String, ?> metricDict) {
            this.metricDict = metricDict;
            return this;
        }
        public java.util.Map<String, ?> getMetricDict() {
            return this.metricDict;
        }

        public HpoExperimentConfigMetricConfig setMetricSource(java.util.List<String> metricSource) {
            this.metricSource = metricSource;
            return this;
        }
        public java.util.List<String> getMetricSource() {
            return this.metricSource;
        }

        public HpoExperimentConfigMetricConfig setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public HpoExperimentConfigMetricConfig setSourceListFinalMode(String sourceListFinalMode) {
            this.sourceListFinalMode = sourceListFinalMode;
            return this;
        }
        public String getSourceListFinalMode() {
            return this.sourceListFinalMode;
        }

    }

    public static class HpoExperimentConfigMonitorConfig extends TeaModel {
        @NameInMap("at_mobiles")
        public String atMobiles;

        @NameInMap("at_user_ids")
        public String atUserIds;

        @NameInMap("is_at_all")
        public String isAtAll;

        @NameInMap("keyword")
        public String keyword;

        @NameInMap("url")
        public String url;

        public static HpoExperimentConfigMonitorConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigMonitorConfig self = new HpoExperimentConfigMonitorConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigMonitorConfig setAtMobiles(String atMobiles) {
            this.atMobiles = atMobiles;
            return this;
        }
        public String getAtMobiles() {
            return this.atMobiles;
        }

        public HpoExperimentConfigMonitorConfig setAtUserIds(String atUserIds) {
            this.atUserIds = atUserIds;
            return this;
        }
        public String getAtUserIds() {
            return this.atUserIds;
        }

        public HpoExperimentConfigMonitorConfig setIsAtAll(String isAtAll) {
            this.isAtAll = isAtAll;
            return this;
        }
        public String getIsAtAll() {
            return this.isAtAll;
        }

        public HpoExperimentConfigMonitorConfig setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public HpoExperimentConfigMonitorConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class HpoExperimentConfigOdpsConfig extends TeaModel {
        @NameInMap("access_id")
        public String accessId;

        @NameInMap("access_key")
        public String accessKey;

        @NameInMap("end_point")
        public String endPoint;

        @NameInMap("log_view_host")
        public String logViewHost;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("region")
        public String region;

        @NameInMap("role_arn")
        public String roleArn;

        public static HpoExperimentConfigOdpsConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigOdpsConfig self = new HpoExperimentConfigOdpsConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigOdpsConfig setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public HpoExperimentConfigOdpsConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public HpoExperimentConfigOdpsConfig setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public HpoExperimentConfigOdpsConfig setLogViewHost(String logViewHost) {
            this.logViewHost = logViewHost;
            return this;
        }
        public String getLogViewHost() {
            return this.logViewHost;
        }

        public HpoExperimentConfigOdpsConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public HpoExperimentConfigOdpsConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public HpoExperimentConfigOdpsConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class HpoExperimentConfigOssConfig extends TeaModel {
        @NameInMap("accessKeyID")
        public String accessKeyID;

        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("role_arn")
        public String roleArn;

        public static HpoExperimentConfigOssConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigOssConfig self = new HpoExperimentConfigOssConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigOssConfig setAccessKeyID(String accessKeyID) {
            this.accessKeyID = accessKeyID;
            return this;
        }
        public String getAccessKeyID() {
            return this.accessKeyID;
        }

        public HpoExperimentConfigOssConfig setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public HpoExperimentConfigOssConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public HpoExperimentConfigOssConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class HpoExperimentConfigOutputConfig extends TeaModel {
        @NameInMap("model_path")
        public String modelPath;

        @NameInMap("summary_path")
        public String summaryPath;

        public static HpoExperimentConfigOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigOutputConfig self = new HpoExperimentConfigOutputConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigOutputConfig setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public HpoExperimentConfigOutputConfig setSummaryPath(String summaryPath) {
            this.summaryPath = summaryPath;
            return this;
        }
        public String getSummaryPath() {
            return this.summaryPath;
        }

    }

    public static class HpoExperimentConfigPaiflowConfig extends TeaModel {
        @NameInMap("access_key_id")
        public String accessKeyId;

        @NameInMap("access_key_secret")
        public String accessKeySecret;

        @NameInMap("region_id")
        public String regionId;

        @NameInMap("workspace_id")
        public String workspaceId;

        public static HpoExperimentConfigPaiflowConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigPaiflowConfig self = new HpoExperimentConfigPaiflowConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigPaiflowConfig setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public HpoExperimentConfigPaiflowConfig setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public HpoExperimentConfigPaiflowConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public HpoExperimentConfigPaiflowConfig setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class HpoExperimentConfigParamsConfig extends TeaModel {
        @NameInMap("params_src_dst_filepath")
        public java.util.List<String> paramsSrcDstFilepath;

        public static HpoExperimentConfigParamsConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigParamsConfig self = new HpoExperimentConfigParamsConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigParamsConfig setParamsSrcDstFilepath(java.util.List<String> paramsSrcDstFilepath) {
            this.paramsSrcDstFilepath = paramsSrcDstFilepath;
            return this;
        }
        public java.util.List<String> getParamsSrcDstFilepath() {
            return this.paramsSrcDstFilepath;
        }

    }

    public static class HpoExperimentConfigPlatformConfig extends TeaModel {
        @NameInMap("cmd")
        public java.util.List<String> cmd;

        @NameInMap("name")
        public String name;

        @NameInMap("resume")
        public String resume;

        public static HpoExperimentConfigPlatformConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigPlatformConfig self = new HpoExperimentConfigPlatformConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigPlatformConfig setCmd(java.util.List<String> cmd) {
            this.cmd = cmd;
            return this;
        }
        public java.util.List<String> getCmd() {
            return this.cmd;
        }

        public HpoExperimentConfigPlatformConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HpoExperimentConfigPlatformConfig setResume(String resume) {
            this.resume = resume;
            return this;
        }
        public String getResume() {
            return this.resume;
        }

    }

    public static class HpoExperimentConfigScheduleConfig extends TeaModel {
        @NameInMap("day")
        public String day;

        @NameInMap("end_time")
        public String endTime;

        @NameInMap("start_time")
        public String startTime;

        public static HpoExperimentConfigScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigScheduleConfig self = new HpoExperimentConfigScheduleConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigScheduleConfig setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public HpoExperimentConfigScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public HpoExperimentConfigScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class HpoExperimentConfigTsConfig extends TeaModel {
        @NameInMap("access_key_id")
        public String accessKeyId;

        @NameInMap("access_key_secret")
        public String accessKeySecret;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("region_id")
        public String regionId;

        public static HpoExperimentConfigTsConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigTsConfig self = new HpoExperimentConfigTsConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigTsConfig setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public HpoExperimentConfigTsConfig setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public HpoExperimentConfigTsConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public HpoExperimentConfigTsConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class HpoExperimentConfigYmlConfigAssessorClassArgs extends TeaModel {
        @NameInMap("earlystop")
        public Boolean earlystop;

        @NameInMap("moving_avg")
        public String movingAvg;

        @NameInMap("optimize_mode")
        public String optimizeMode;

        @NameInMap("proportion")
        public Float proportion;

        @NameInMap("start_step")
        public Integer startStep;

        public static HpoExperimentConfigYmlConfigAssessorClassArgs build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigYmlConfigAssessorClassArgs self = new HpoExperimentConfigYmlConfigAssessorClassArgs();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigYmlConfigAssessorClassArgs setEarlystop(Boolean earlystop) {
            this.earlystop = earlystop;
            return this;
        }
        public Boolean getEarlystop() {
            return this.earlystop;
        }

        public HpoExperimentConfigYmlConfigAssessorClassArgs setMovingAvg(String movingAvg) {
            this.movingAvg = movingAvg;
            return this;
        }
        public String getMovingAvg() {
            return this.movingAvg;
        }

        public HpoExperimentConfigYmlConfigAssessorClassArgs setOptimizeMode(String optimizeMode) {
            this.optimizeMode = optimizeMode;
            return this;
        }
        public String getOptimizeMode() {
            return this.optimizeMode;
        }

        public HpoExperimentConfigYmlConfigAssessorClassArgs setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

        public HpoExperimentConfigYmlConfigAssessorClassArgs setStartStep(Integer startStep) {
            this.startStep = startStep;
            return this;
        }
        public Integer getStartStep() {
            return this.startStep;
        }

    }

    public static class HpoExperimentConfigYmlConfigAssessor extends TeaModel {
        @NameInMap("class_args")
        public HpoExperimentConfigYmlConfigAssessorClassArgs classArgs;

        @NameInMap("name")
        public String name;

        public static HpoExperimentConfigYmlConfigAssessor build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigYmlConfigAssessor self = new HpoExperimentConfigYmlConfigAssessor();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigYmlConfigAssessor setClassArgs(HpoExperimentConfigYmlConfigAssessorClassArgs classArgs) {
            this.classArgs = classArgs;
            return this;
        }
        public HpoExperimentConfigYmlConfigAssessorClassArgs getClassArgs() {
            return this.classArgs;
        }

        public HpoExperimentConfigYmlConfigAssessor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HpoExperimentConfigYmlConfigTuner extends TeaModel {
        @NameInMap("class_args")
        public java.util.Map<String, ?> classArgs;

        @NameInMap("name")
        public String name;

        public static HpoExperimentConfigYmlConfigTuner build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigYmlConfigTuner self = new HpoExperimentConfigYmlConfigTuner();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigYmlConfigTuner setClassArgs(java.util.Map<String, ?> classArgs) {
            this.classArgs = classArgs;
            return this;
        }
        public java.util.Map<String, ?> getClassArgs() {
            return this.classArgs;
        }

        public HpoExperimentConfigYmlConfigTuner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HpoExperimentConfigYmlConfig extends TeaModel {
        @NameInMap("assessor")
        public HpoExperimentConfigYmlConfigAssessor assessor;

        @NameInMap("debug")
        public Boolean debug;

        @NameInMap("experiment_name")
        public String experimentName;

        @NameInMap("log_level")
        public String logLevel;

        @NameInMap("max_trial_number")
        public Integer maxTrialNumber;

        @NameInMap("trial_concurrency")
        public Integer trialConcurrency;

        @NameInMap("tuner")
        public HpoExperimentConfigYmlConfigTuner tuner;

        public static HpoExperimentConfigYmlConfig build(java.util.Map<String, ?> map) throws Exception {
            HpoExperimentConfigYmlConfig self = new HpoExperimentConfigYmlConfig();
            return TeaModel.build(map, self);
        }

        public HpoExperimentConfigYmlConfig setAssessor(HpoExperimentConfigYmlConfigAssessor assessor) {
            this.assessor = assessor;
            return this;
        }
        public HpoExperimentConfigYmlConfigAssessor getAssessor() {
            return this.assessor;
        }

        public HpoExperimentConfigYmlConfig setDebug(Boolean debug) {
            this.debug = debug;
            return this;
        }
        public Boolean getDebug() {
            return this.debug;
        }

        public HpoExperimentConfigYmlConfig setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public HpoExperimentConfigYmlConfig setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public HpoExperimentConfigYmlConfig setMaxTrialNumber(Integer maxTrialNumber) {
            this.maxTrialNumber = maxTrialNumber;
            return this;
        }
        public Integer getMaxTrialNumber() {
            return this.maxTrialNumber;
        }

        public HpoExperimentConfigYmlConfig setTrialConcurrency(Integer trialConcurrency) {
            this.trialConcurrency = trialConcurrency;
            return this;
        }
        public Integer getTrialConcurrency() {
            return this.trialConcurrency;
        }

        public HpoExperimentConfigYmlConfig setTuner(HpoExperimentConfigYmlConfigTuner tuner) {
            this.tuner = tuner;
            return this;
        }
        public HpoExperimentConfigYmlConfigTuner getTuner() {
            return this.tuner;
        }

    }

}
