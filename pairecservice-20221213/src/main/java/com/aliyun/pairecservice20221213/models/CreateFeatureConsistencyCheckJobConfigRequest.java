// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service_123</p>
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
     * <p>feature1,feature2</p>
     */
    @NameInMap("FeatureDisplayExclude")
    public String featureDisplayExclude;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-********</p>
     */
    @NameInMap("FeatureLandingResourceId")
    public String featureLandingResourceId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.json</p>
     */
    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateZip")
    public Boolean generateZip;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_consistency_check1</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.89</p>
     */
    @NameInMap("SampleRate")
    public Double sampleRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UseFeatureStore")
    public Boolean useFeatureStore;

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

    public static CreateFeatureConsistencyCheckJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobConfigRequest self = new CreateFeatureConsistencyCheckJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setCompareFeature(Boolean compareFeature) {
        this.compareFeature = compareFeature;
        return this;
    }
    public Boolean getCompareFeature() {
        return this.compareFeature;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDatasetMountPath(String datasetMountPath) {
        this.datasetMountPath = datasetMountPath;
        return this;
    }
    public String getDatasetMountPath() {
        return this.datasetMountPath;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDatasetUri(String datasetUri) {
        this.datasetUri = datasetUri;
        return this;
    }
    public String getDatasetUri() {
        return this.datasetUri;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setDefaultRoute(String defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setEasyRecPackagePath(String easyRecPackagePath) {
        this.easyRecPackagePath = easyRecPackagePath;
        return this;
    }
    public String getEasyRecPackagePath() {
        return this.easyRecPackagePath;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setEasyRecVersion(String easyRecVersion) {
        this.easyRecVersion = easyRecVersion;
        return this;
    }
    public String getEasyRecVersion() {
        return this.easyRecVersion;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureDisplayExclude(String featureDisplayExclude) {
        this.featureDisplayExclude = featureDisplayExclude;
        return this;
    }
    public String getFeatureDisplayExclude() {
        return this.featureDisplayExclude;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureLandingResourceId(String featureLandingResourceId) {
        this.featureLandingResourceId = featureLandingResourceId;
        return this;
    }
    public String getFeatureLandingResourceId() {
        return this.featureLandingResourceId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeaturePriority(String featurePriority) {
        this.featurePriority = featurePriority;
        return this;
    }
    public String getFeaturePriority() {
        return this.featurePriority;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreItemId(String featureStoreItemId) {
        this.featureStoreItemId = featureStoreItemId;
        return this;
    }
    public String getFeatureStoreItemId() {
        return this.featureStoreItemId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreModelId(String featureStoreModelId) {
        this.featureStoreModelId = featureStoreModelId;
        return this;
    }
    public String getFeatureStoreModelId() {
        return this.featureStoreModelId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreProjectId(String featureStoreProjectId) {
        this.featureStoreProjectId = featureStoreProjectId;
        return this;
    }
    public String getFeatureStoreProjectId() {
        return this.featureStoreProjectId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreProjectName(String featureStoreProjectName) {
        this.featureStoreProjectName = featureStoreProjectName;
        return this;
    }
    public String getFeatureStoreProjectName() {
        return this.featureStoreProjectName;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
        this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
        return this;
    }
    public String getFeatureStoreSeqFeatureView() {
        return this.featureStoreSeqFeatureView;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFeatureStoreUserId(String featureStoreUserId) {
        this.featureStoreUserId = featureStoreUserId;
        return this;
    }
    public String getFeatureStoreUserId() {
        return this.featureStoreUserId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFgJarVersion(String fgJarVersion) {
        this.fgJarVersion = fgJarVersion;
        return this;
    }
    public String getFgJarVersion() {
        return this.fgJarVersion;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setFgJsonFileName(String fgJsonFileName) {
        this.fgJsonFileName = fgJsonFileName;
        return this;
    }
    public String getFgJsonFileName() {
        return this.fgJsonFileName;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setGenerateZip(Boolean generateZip) {
        this.generateZip = generateZip;
        return this;
    }
    public Boolean getGenerateZip() {
        return this.generateZip;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setItemIdField(String itemIdField) {
        this.itemIdField = itemIdField;
        return this;
    }
    public String getItemIdField() {
        return this.itemIdField;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setItemTable(String itemTable) {
        this.itemTable = itemTable;
        return this;
    }
    public String getItemTable() {
        return this.itemTable;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setItemTablePartitionField(String itemTablePartitionField) {
        this.itemTablePartitionField = itemTablePartitionField;
        return this;
    }
    public String getItemTablePartitionField() {
        return this.itemTablePartitionField;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
        this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
        return this;
    }
    public String getItemTablePartitionFieldFormat() {
        return this.itemTablePartitionFieldFormat;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setOssResourceId(String ossResourceId) {
        this.ossResourceId = ossResourceId;
        return this;
    }
    public String getOssResourceId() {
        return this.ossResourceId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setPredictWorkerCount(Integer predictWorkerCount) {
        this.predictWorkerCount = predictWorkerCount;
        return this;
    }
    public Integer getPredictWorkerCount() {
        return this.predictWorkerCount;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setPredictWorkerCpu(Integer predictWorkerCpu) {
        this.predictWorkerCpu = predictWorkerCpu;
        return this;
    }
    public Integer getPredictWorkerCpu() {
        return this.predictWorkerCpu;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setPredictWorkerMemory(Integer predictWorkerMemory) {
        this.predictWorkerMemory = predictWorkerMemory;
        return this;
    }
    public Integer getPredictWorkerMemory() {
        return this.predictWorkerMemory;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setResourceConfig(String resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public String getResourceConfig() {
        return this.resourceConfig;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Double getSampleRate() {
        return this.sampleRate;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setUseFeatureStore(Boolean useFeatureStore) {
        this.useFeatureStore = useFeatureStore;
        return this;
    }
    public Boolean getUseFeatureStore() {
        return this.useFeatureStore;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setUserIdField(String userIdField) {
        this.userIdField = userIdField;
        return this;
    }
    public String getUserIdField() {
        return this.userIdField;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setUserTable(String userTable) {
        this.userTable = userTable;
        return this;
    }
    public String getUserTable() {
        return this.userTable;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setUserTablePartitionField(String userTablePartitionField) {
        this.userTablePartitionField = userTablePartitionField;
        return this;
    }
    public String getUserTablePartitionField() {
        return this.userTablePartitionField;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
        this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
        return this;
    }
    public String getUserTablePartitionFieldFormat() {
        return this.userTablePartitionFieldFormat;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

    public CreateFeatureConsistencyCheckJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
