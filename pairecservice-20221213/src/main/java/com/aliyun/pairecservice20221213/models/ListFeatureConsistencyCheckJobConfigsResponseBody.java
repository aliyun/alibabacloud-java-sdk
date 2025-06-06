// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobConfigsResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckConfigs")
    public java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs;

    /**
     * <strong>example:</strong>
     * <p>FCF741D8-9C30-578E-807F-B935487DB34A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFeatureConsistencyCheckJobConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobConfigsResponseBody self = new ListFeatureConsistencyCheckJobConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setFeatureConsistencyCheckConfigs(java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs) {
        this.featureConsistencyCheckConfigs = featureConsistencyCheckConfigs;
        return this;
    }
    public java.util.List<ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs> getFeatureConsistencyCheckConfigs() {
        return this.featureConsistencyCheckConfigs;
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureConsistencyCheckJobConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompareFeature")
        public Boolean compareFeature;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetMountPath")
        public String datasetMountPath;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("DatasetType")
        public String datasetType;

        @NameInMap("DatasetUri")
        public String datasetUri;

        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <strong>example:</strong>
         * <p>eas_service_1</p>
         */
        @NameInMap("EasServiceName")
        public String easServiceName;

        /**
         * <strong>example:</strong>
         * <p>oss://*******</p>
         */
        @NameInMap("EasyRecPackagePath")
        public String easyRecPackagePath;

        /**
         * <strong>example:</strong>
         * <p>1.3.60</p>
         */
        @NameInMap("EasyRecVersion")
        public String easyRecVersion;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureConsistencyCheckJobConfigId")
        public String featureConsistencyCheckJobConfigId;

        /**
         * <strong>example:</strong>
         * <p>feature1,feature2</p>
         */
        @NameInMap("FeatureDisplayExclude")
        public String featureDisplayExclude;

        /**
         * <strong>example:</strong>
         * <p>reso-********</p>
         */
        @NameInMap("FeatureLandingResourceId")
        public String featureLandingResourceId;

        /**
         * <strong>example:</strong>
         * <p>mc_project_1</p>
         */
        @NameInMap("FeatureLandingResourceUri")
        public String featureLandingResourceUri;

        /**
         * <strong>example:</strong>
         * <p>feature1,feature2,feature3</p>
         */
        @NameInMap("FeaturePriority")
        public String featurePriority;

        @NameInMap("FeatureStoreItemId")
        public String featureStoreItemId;

        @NameInMap("FeatureStoreModelId")
        public String featureStoreModelId;

        @NameInMap("FeatureStoreProjectId")
        public String featureStoreProjectId;

        @NameInMap("FeatureStoreProjectName")
        public String featureStoreProjectName;

        @NameInMap("FeatureStoreSeqFeatureView")
        public String featureStoreSeqFeatureView;

        @NameInMap("FeatureStoreUserId")
        public String featureStoreUserId;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("FgJarVersion")
        public String fgJarVersion;

        /**
         * <strong>example:</strong>
         * <p>file.json</p>
         */
        @NameInMap("FgJsonFileName")
        public String fgJsonFileName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateZip")
        public Boolean generateZip;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("ItemIdField")
        public String itemIdField;

        /**
         * <strong>example:</strong>
         * <p>item_table</p>
         */
        @NameInMap("ItemTable")
        public String itemTable;

        /**
         * <strong>example:</strong>
         * <p>ds</p>
         */
        @NameInMap("ItemTablePartitionField")
        public String itemTablePartitionField;

        /**
         * <strong>example:</strong>
         * <p>yyyymmdd</p>
         */
        @NameInMap("ItemTablePartitionFieldFormat")
        public String itemTablePartitionFieldFormat;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("LatestJobGmtSamplingEndTime")
        public String latestJobGmtSamplingEndTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("LatestJobGmtSamplingStartTime")
        public String latestJobGmtSamplingStartTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LatestJobId")
        public String latestJobId;

        /**
         * <strong>example:</strong>
         * <p>feature_consistency_check1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>oss_bucket_1</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>reso-********</p>
         */
        @NameInMap("OssResourceId")
        public String ossResourceId;

        @NameInMap("PredictWorkerCount")
        public Integer predictWorkerCount;

        @NameInMap("PredictWorkerCpu")
        public Integer predictWorkerCpu;

        @NameInMap("PredictWorkerMemory")
        public Integer predictWorkerMemory;

        @NameInMap("ResourceConfig")
        public String resourceConfig;

        /**
         * <strong>example:</strong>
         * <p>0.89</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>scene1</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>service1</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>Editable</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("UseFeatureStore")
        public String useFeatureStore;

        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("UserIdField")
        public String userIdField;

        /**
         * <strong>example:</strong>
         * <p>user_table</p>
         */
        @NameInMap("UserTable")
        public String userTable;

        /**
         * <strong>example:</strong>
         * <p>ds</p>
         */
        @NameInMap("UserTablePartitionField")
        public String userTablePartitionField;

        /**
         * <strong>example:</strong>
         * <p>yyyymmdd</p>
         */
        @NameInMap("UserTablePartitionFieldFormat")
        public String userTablePartitionFieldFormat;

        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>work_flow_1</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs self = new ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs();
            return TeaModel.build(map, self);
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setCompareFeature(Boolean compareFeature) {
            this.compareFeature = compareFeature;
            return this;
        }
        public Boolean getCompareFeature() {
            return this.compareFeature;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDatasetMountPath(String datasetMountPath) {
            this.datasetMountPath = datasetMountPath;
            return this;
        }
        public String getDatasetMountPath() {
            return this.datasetMountPath;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDatasetUri(String datasetUri) {
            this.datasetUri = datasetUri;
            return this;
        }
        public String getDatasetUri() {
            return this.datasetUri;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasyRecPackagePath(String easyRecPackagePath) {
            this.easyRecPackagePath = easyRecPackagePath;
            return this;
        }
        public String getEasyRecPackagePath() {
            return this.easyRecPackagePath;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setEasyRecVersion(String easyRecVersion) {
            this.easyRecVersion = easyRecVersion;
            return this;
        }
        public String getEasyRecVersion() {
            return this.easyRecVersion;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }
        public String getFeatureConsistencyCheckJobConfigId() {
            return this.featureConsistencyCheckJobConfigId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureDisplayExclude(String featureDisplayExclude) {
            this.featureDisplayExclude = featureDisplayExclude;
            return this;
        }
        public String getFeatureDisplayExclude() {
            return this.featureDisplayExclude;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureLandingResourceId(String featureLandingResourceId) {
            this.featureLandingResourceId = featureLandingResourceId;
            return this;
        }
        public String getFeatureLandingResourceId() {
            return this.featureLandingResourceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureLandingResourceUri(String featureLandingResourceUri) {
            this.featureLandingResourceUri = featureLandingResourceUri;
            return this;
        }
        public String getFeatureLandingResourceUri() {
            return this.featureLandingResourceUri;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeaturePriority(String featurePriority) {
            this.featurePriority = featurePriority;
            return this;
        }
        public String getFeaturePriority() {
            return this.featurePriority;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreItemId(String featureStoreItemId) {
            this.featureStoreItemId = featureStoreItemId;
            return this;
        }
        public String getFeatureStoreItemId() {
            return this.featureStoreItemId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreModelId(String featureStoreModelId) {
            this.featureStoreModelId = featureStoreModelId;
            return this;
        }
        public String getFeatureStoreModelId() {
            return this.featureStoreModelId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreProjectId(String featureStoreProjectId) {
            this.featureStoreProjectId = featureStoreProjectId;
            return this;
        }
        public String getFeatureStoreProjectId() {
            return this.featureStoreProjectId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreProjectName(String featureStoreProjectName) {
            this.featureStoreProjectName = featureStoreProjectName;
            return this;
        }
        public String getFeatureStoreProjectName() {
            return this.featureStoreProjectName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
            this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
            return this;
        }
        public String getFeatureStoreSeqFeatureView() {
            return this.featureStoreSeqFeatureView;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFeatureStoreUserId(String featureStoreUserId) {
            this.featureStoreUserId = featureStoreUserId;
            return this;
        }
        public String getFeatureStoreUserId() {
            return this.featureStoreUserId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFgJarVersion(String fgJarVersion) {
            this.fgJarVersion = fgJarVersion;
            return this;
        }
        public String getFgJarVersion() {
            return this.fgJarVersion;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setFgJsonFileName(String fgJsonFileName) {
            this.fgJsonFileName = fgJsonFileName;
            return this;
        }
        public String getFgJsonFileName() {
            return this.fgJsonFileName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGenerateZip(Boolean generateZip) {
            this.generateZip = generateZip;
            return this;
        }
        public Boolean getGenerateZip() {
            return this.generateZip;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemIdField(String itemIdField) {
            this.itemIdField = itemIdField;
            return this;
        }
        public String getItemIdField() {
            return this.itemIdField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTable(String itemTable) {
            this.itemTable = itemTable;
            return this;
        }
        public String getItemTable() {
            return this.itemTable;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTablePartitionField(String itemTablePartitionField) {
            this.itemTablePartitionField = itemTablePartitionField;
            return this;
        }
        public String getItemTablePartitionField() {
            return this.itemTablePartitionField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
            this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
            return this;
        }
        public String getItemTablePartitionFieldFormat() {
            return this.itemTablePartitionFieldFormat;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobGmtSamplingEndTime(String latestJobGmtSamplingEndTime) {
            this.latestJobGmtSamplingEndTime = latestJobGmtSamplingEndTime;
            return this;
        }
        public String getLatestJobGmtSamplingEndTime() {
            return this.latestJobGmtSamplingEndTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobGmtSamplingStartTime(String latestJobGmtSamplingStartTime) {
            this.latestJobGmtSamplingStartTime = latestJobGmtSamplingStartTime;
            return this;
        }
        public String getLatestJobGmtSamplingStartTime() {
            return this.latestJobGmtSamplingStartTime;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setLatestJobId(String latestJobId) {
            this.latestJobId = latestJobId;
            return this;
        }
        public String getLatestJobId() {
            return this.latestJobId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setOssResourceId(String ossResourceId) {
            this.ossResourceId = ossResourceId;
            return this;
        }
        public String getOssResourceId() {
            return this.ossResourceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setPredictWorkerCount(Integer predictWorkerCount) {
            this.predictWorkerCount = predictWorkerCount;
            return this;
        }
        public Integer getPredictWorkerCount() {
            return this.predictWorkerCount;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setPredictWorkerCpu(Integer predictWorkerCpu) {
            this.predictWorkerCpu = predictWorkerCpu;
            return this;
        }
        public Integer getPredictWorkerCpu() {
            return this.predictWorkerCpu;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setPredictWorkerMemory(Integer predictWorkerMemory) {
            this.predictWorkerMemory = predictWorkerMemory;
            return this;
        }
        public Integer getPredictWorkerMemory() {
            return this.predictWorkerMemory;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setResourceConfig(String resourceConfig) {
            this.resourceConfig = resourceConfig;
            return this;
        }
        public String getResourceConfig() {
            return this.resourceConfig;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUseFeatureStore(String useFeatureStore) {
            this.useFeatureStore = useFeatureStore;
            return this;
        }
        public String getUseFeatureStore() {
            return this.useFeatureStore;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }
        public String getUserIdField() {
            return this.userIdField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTable(String userTable) {
            this.userTable = userTable;
            return this;
        }
        public String getUserTable() {
            return this.userTable;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTablePartitionField(String userTablePartitionField) {
            this.userTablePartitionField = userTablePartitionField;
            return this;
        }
        public String getUserTablePartitionField() {
            return this.userTablePartitionField;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
            this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
            return this;
        }
        public String getUserTablePartitionFieldFormat() {
            return this.userTablePartitionFieldFormat;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBodyFeatureConsistencyCheckConfigs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
