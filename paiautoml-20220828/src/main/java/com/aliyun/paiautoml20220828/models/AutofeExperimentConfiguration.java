// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class AutofeExperimentConfiguration extends TeaModel {
    @NameInMap("odps_config")
    public AutofeExperimentConfigurationOdpsConfig odpsConfig;

    @NameInMap("oss_config")
    public AutofeExperimentConfigurationOssConfig ossConfig;

    @NameInMap("yml_config")
    public AutofeExperimentConfigurationYmlConfig ymlConfig;

    public static AutofeExperimentConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AutofeExperimentConfiguration self = new AutofeExperimentConfiguration();
        return TeaModel.build(map, self);
    }

    public AutofeExperimentConfiguration setOdpsConfig(AutofeExperimentConfigurationOdpsConfig odpsConfig) {
        this.odpsConfig = odpsConfig;
        return this;
    }
    public AutofeExperimentConfigurationOdpsConfig getOdpsConfig() {
        return this.odpsConfig;
    }

    public AutofeExperimentConfiguration setOssConfig(AutofeExperimentConfigurationOssConfig ossConfig) {
        this.ossConfig = ossConfig;
        return this;
    }
    public AutofeExperimentConfigurationOssConfig getOssConfig() {
        return this.ossConfig;
    }

    public AutofeExperimentConfiguration setYmlConfig(AutofeExperimentConfigurationYmlConfig ymlConfig) {
        this.ymlConfig = ymlConfig;
        return this;
    }
    public AutofeExperimentConfigurationYmlConfig getYmlConfig() {
        return this.ymlConfig;
    }

    public static class AutofeExperimentConfigurationOdpsConfig extends TeaModel {
        @NameInMap("odps_access_id")
        public String odpsAccessId;

        @NameInMap("odps_access_key")
        public String odpsAccessKey;

        @NameInMap("odps_endpoint")
        public String odpsEndpoint;

        @NameInMap("odps_project_name")
        public String odpsProjectName;

        @NameInMap("odps_region_id")
        public String odpsRegionId;

        @NameInMap("odps_role_arn")
        public String odpsRoleArn;

        public static AutofeExperimentConfigurationOdpsConfig build(java.util.Map<String, ?> map) throws Exception {
            AutofeExperimentConfigurationOdpsConfig self = new AutofeExperimentConfigurationOdpsConfig();
            return TeaModel.build(map, self);
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsAccessId(String odpsAccessId) {
            this.odpsAccessId = odpsAccessId;
            return this;
        }
        public String getOdpsAccessId() {
            return this.odpsAccessId;
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsAccessKey(String odpsAccessKey) {
            this.odpsAccessKey = odpsAccessKey;
            return this;
        }
        public String getOdpsAccessKey() {
            return this.odpsAccessKey;
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsEndpoint(String odpsEndpoint) {
            this.odpsEndpoint = odpsEndpoint;
            return this;
        }
        public String getOdpsEndpoint() {
            return this.odpsEndpoint;
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsProjectName(String odpsProjectName) {
            this.odpsProjectName = odpsProjectName;
            return this;
        }
        public String getOdpsProjectName() {
            return this.odpsProjectName;
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsRegionId(String odpsRegionId) {
            this.odpsRegionId = odpsRegionId;
            return this;
        }
        public String getOdpsRegionId() {
            return this.odpsRegionId;
        }

        public AutofeExperimentConfigurationOdpsConfig setOdpsRoleArn(String odpsRoleArn) {
            this.odpsRoleArn = odpsRoleArn;
            return this;
        }
        public String getOdpsRoleArn() {
            return this.odpsRoleArn;
        }

    }

    public static class AutofeExperimentConfigurationOssConfig extends TeaModel {
        @NameInMap("oss_access_id")
        public String ossAccessId;

        @NameInMap("oss_access_key")
        public String ossAccessKey;

        @NameInMap("oss_bucket")
        public String ossBucket;

        @NameInMap("oss_endpoint")
        public String ossEndpoint;

        @NameInMap("oss_role_arn")
        public String ossRoleArn;

        public static AutofeExperimentConfigurationOssConfig build(java.util.Map<String, ?> map) throws Exception {
            AutofeExperimentConfigurationOssConfig self = new AutofeExperimentConfigurationOssConfig();
            return TeaModel.build(map, self);
        }

        public AutofeExperimentConfigurationOssConfig setOssAccessId(String ossAccessId) {
            this.ossAccessId = ossAccessId;
            return this;
        }
        public String getOssAccessId() {
            return this.ossAccessId;
        }

        public AutofeExperimentConfigurationOssConfig setOssAccessKey(String ossAccessKey) {
            this.ossAccessKey = ossAccessKey;
            return this;
        }
        public String getOssAccessKey() {
            return this.ossAccessKey;
        }

        public AutofeExperimentConfigurationOssConfig setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public AutofeExperimentConfigurationOssConfig setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public AutofeExperimentConfigurationOssConfig setOssRoleArn(String ossRoleArn) {
            this.ossRoleArn = ossRoleArn;
            return this;
        }
        public String getOssRoleArn() {
            return this.ossRoleArn;
        }

    }

    public static class AutofeExperimentConfigurationYmlConfig extends TeaModel {
        @NameInMap("action")
        public String action;

        @NameInMap("aggregate_only")
        public String aggregateOnly;

        @NameInMap("analyze_exp_id")
        public String analyzeExpId;

        @NameInMap("cpu")
        public String cpu;

        @NameInMap("data_partition")
        public String dataPartition;

        @NameInMap("data_source")
        public String dataSource;

        @NameInMap("data_type")
        public String dataType;

        @NameInMap("debug_mode")
        public String debugMode;

        @NameInMap("exclude_columns")
        public String excludeColumns;

        @NameInMap("feature_selection")
        public String featureSelection;

        @NameInMap("filter_thresh")
        public String filterThresh;

        @NameInMap("iv_thresh")
        public String ivThresh;

        @NameInMap("label")
        public String label;

        @NameInMap("memory")
        public String memory;

        @NameInMap("output_config_oss_dir")
        public String outputConfigOssDir;

        @NameInMap("pipeline_exp_id")
        public String pipelineExpId;

        @NameInMap("reuse_results")
        public String reuseResults;

        @NameInMap("sample_ratio")
        public String sampleRatio;

        @NameInMap("sample_size")
        public String sampleSize;

        @NameInMap("selection_exp_id")
        public String selectionExpId;

        @NameInMap("skip_select")
        public String skipSelect;

        @NameInMap("workers")
        public String workers;

        @NameInMap("workspace_name")
        public String workspaceName;

        public static AutofeExperimentConfigurationYmlConfig build(java.util.Map<String, ?> map) throws Exception {
            AutofeExperimentConfigurationYmlConfig self = new AutofeExperimentConfigurationYmlConfig();
            return TeaModel.build(map, self);
        }

        public AutofeExperimentConfigurationYmlConfig setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public AutofeExperimentConfigurationYmlConfig setAggregateOnly(String aggregateOnly) {
            this.aggregateOnly = aggregateOnly;
            return this;
        }
        public String getAggregateOnly() {
            return this.aggregateOnly;
        }

        public AutofeExperimentConfigurationYmlConfig setAnalyzeExpId(String analyzeExpId) {
            this.analyzeExpId = analyzeExpId;
            return this;
        }
        public String getAnalyzeExpId() {
            return this.analyzeExpId;
        }

        public AutofeExperimentConfigurationYmlConfig setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public AutofeExperimentConfigurationYmlConfig setDataPartition(String dataPartition) {
            this.dataPartition = dataPartition;
            return this;
        }
        public String getDataPartition() {
            return this.dataPartition;
        }

        public AutofeExperimentConfigurationYmlConfig setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public AutofeExperimentConfigurationYmlConfig setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public AutofeExperimentConfigurationYmlConfig setDebugMode(String debugMode) {
            this.debugMode = debugMode;
            return this;
        }
        public String getDebugMode() {
            return this.debugMode;
        }

        public AutofeExperimentConfigurationYmlConfig setExcludeColumns(String excludeColumns) {
            this.excludeColumns = excludeColumns;
            return this;
        }
        public String getExcludeColumns() {
            return this.excludeColumns;
        }

        public AutofeExperimentConfigurationYmlConfig setFeatureSelection(String featureSelection) {
            this.featureSelection = featureSelection;
            return this;
        }
        public String getFeatureSelection() {
            return this.featureSelection;
        }

        public AutofeExperimentConfigurationYmlConfig setFilterThresh(String filterThresh) {
            this.filterThresh = filterThresh;
            return this;
        }
        public String getFilterThresh() {
            return this.filterThresh;
        }

        public AutofeExperimentConfigurationYmlConfig setIvThresh(String ivThresh) {
            this.ivThresh = ivThresh;
            return this;
        }
        public String getIvThresh() {
            return this.ivThresh;
        }

        public AutofeExperimentConfigurationYmlConfig setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public AutofeExperimentConfigurationYmlConfig setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public AutofeExperimentConfigurationYmlConfig setOutputConfigOssDir(String outputConfigOssDir) {
            this.outputConfigOssDir = outputConfigOssDir;
            return this;
        }
        public String getOutputConfigOssDir() {
            return this.outputConfigOssDir;
        }

        public AutofeExperimentConfigurationYmlConfig setPipelineExpId(String pipelineExpId) {
            this.pipelineExpId = pipelineExpId;
            return this;
        }
        public String getPipelineExpId() {
            return this.pipelineExpId;
        }

        public AutofeExperimentConfigurationYmlConfig setReuseResults(String reuseResults) {
            this.reuseResults = reuseResults;
            return this;
        }
        public String getReuseResults() {
            return this.reuseResults;
        }

        public AutofeExperimentConfigurationYmlConfig setSampleRatio(String sampleRatio) {
            this.sampleRatio = sampleRatio;
            return this;
        }
        public String getSampleRatio() {
            return this.sampleRatio;
        }

        public AutofeExperimentConfigurationYmlConfig setSampleSize(String sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }
        public String getSampleSize() {
            return this.sampleSize;
        }

        public AutofeExperimentConfigurationYmlConfig setSelectionExpId(String selectionExpId) {
            this.selectionExpId = selectionExpId;
            return this;
        }
        public String getSelectionExpId() {
            return this.selectionExpId;
        }

        public AutofeExperimentConfigurationYmlConfig setSkipSelect(String skipSelect) {
            this.skipSelect = skipSelect;
            return this;
        }
        public String getSkipSelect() {
            return this.skipSelect;
        }

        public AutofeExperimentConfigurationYmlConfig setWorkers(String workers) {
            this.workers = workers;
            return this;
        }
        public String getWorkers() {
            return this.workers;
        }

        public AutofeExperimentConfigurationYmlConfig setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
