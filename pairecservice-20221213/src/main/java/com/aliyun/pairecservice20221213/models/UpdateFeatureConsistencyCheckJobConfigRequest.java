// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateFeatureConsistencyCheckJobConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether feature comparison is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompareFeature")
    public Boolean compareFeature;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-xxx</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The mount path of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data/</p>
     */
    @NameInMap("DatasetMountPath")
    public String datasetMountPath;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>dateset-test</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The dataset type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>The URI of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://xxxx</p>
     */
    @NameInMap("DatasetUri")
    public String datasetUri;

    /**
     * <p>The default gateway. Valid values:</p>
     * <ul>
     * <li>Eth0: public gateway.</li>
     * <li>Eth1: dedicated gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Eth0</p>
     */
    @NameInMap("DefaultRoute")
    public String defaultRoute;

    /**
     * <p>The PAI-EAS service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service_123</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    /**
     * <p>The EasyRec package path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://********</p>
     */
    @NameInMap("EasyRecPackagePath")
    public String easyRecPackagePath;

    /**
     * <p>The EasyRec version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.3.60</p>
     */
    @NameInMap("EasyRecVersion")
    public String easyRecVersion;

    /**
     * <p>The features to exclude from display. Separate multiple features with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>feature1,feature2</p>
     */
    @NameInMap("FeatureDisplayExclude")
    public String featureDisplayExclude;

    /**
     * <p>The data fallback data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-********</p>
     */
    @NameInMap("FeatureLandingResourceId")
    public String featureLandingResourceId;

    /**
     * <p>The feature priority. Separate multiple features with commas (,). This parameter specifies which features are preferentially read from the user table. If the user table is empty, the features are queried from the behavior table.</p>
     * 
     * <strong>example:</strong>
     * <p>feature1,feature2,feature3</p>
     */
    @NameInMap("FeaturePriority")
    public String featurePriority;

    /**
     * <p>The Feature Store item-side primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("FeatureStoreItemId")
    public String featureStoreItemId;

    /**
     * <p>feature store model id</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureStoreModelId")
    public String featureStoreModelId;

    /**
     * <p>The Feature Store project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureStoreProjectId")
    public String featureStoreProjectId;

    /**
     * <p>The Feature Store project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project-1</p>
     */
    @NameInMap("FeatureStoreProjectName")
    public String featureStoreProjectName;

    /**
     * <p>The name of the feature view that contains the item features in the sequence feature.</p>
     * 
     * <strong>example:</strong>
     * <p>seq_item_view</p>
     */
    @NameInMap("FeatureStoreSeqFeatureView")
    public String featureStoreSeqFeatureView;

    /**
     * <p>The Feature Store user-side primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("FeatureStoreUserId")
    public String featureStoreUserId;

    /**
     * <p>The fg_jar version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("FgJarVersion")
    public String fgJarVersion;

    /**
     * <p>The fg_json file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.json</p>
     */
    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    /**
     * <p>Specifies whether to generate a ZIP package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateZip")
    public Boolean generateZip;

    /**
     * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to use Feature Store.</p>
     */
    @NameInMap("IsUseFeatureStore")
    public Boolean isUseFeatureStore;

    /**
     * <p>The item_id field name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>item_id</p>
     */
    @NameInMap("ItemIdField")
    public String itemIdField;

    /**
     * <p>The item table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>item_table</p>
     */
    @NameInMap("ItemTable")
    public String itemTable;

    /**
     * <p>The item table partition field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds</p>
     */
    @NameInMap("ItemTablePartitionField")
    public String itemTablePartitionField;

    /**
     * <p>The item table partition field format. Valid values:</p>
     * <ul>
     * <li>yyyymmdd</li>
     * <li>yyyy-mm-dd</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyymmdd</p>
     */
    @NameInMap("ItemTablePartitionFieldFormat")
    public String itemTablePartitionFieldFormat;

    /**
     * <p>maxcompute schema</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <p>The feature consistency check name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_consistency_check1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-********</p>
     */
    @NameInMap("OssResourceId")
    public String ossResourceId;

    /**
     * <p>The number of workers for running the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PredictWorkerCount")
    public Integer predictWorkerCount;

    /**
     * <p>The CPU specification of workers for running the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PredictWorkerCpu")
    public Integer predictWorkerCpu;

    /**
     * <p>The memory specification of workers for running the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>32000(32G)</p>
     */
    @NameInMap("PredictWorkerMemory")
    public Integer predictWorkerMemory;

    /**
     * <p>The resource configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResourceConfig")
    public String resourceConfig;

    /**
     * <p>The sampling ratio (0-1).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.89</p>
     */
    @NameInMap("SampleRate")
    public Double sampleRate;

    /**
     * <p>The scene ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxx</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxx</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>The user_id field name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("UserIdField")
    public String userIdField;

    /**
     * <p>The user table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_table</p>
     */
    @NameInMap("UserTable")
    public String userTable;

    /**
     * <p>The user table partition field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds</p>
     */
    @NameInMap("UserTablePartitionField")
    public String userTablePartitionField;

    /**
     * <p>The user table partition field format. Valid values:</p>
     * <ul>
     * <li>yyyymmdd</li>
     * <li>yyyy-mm-dd</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyymmdd</p>
     */
    @NameInMap("UserTablePartitionFieldFormat")
    public String userTablePartitionFieldFormat;

    /**
     * <p>VpcID。</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>work_flow_1</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    /**
     * <p>The PAI workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34597***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateFeatureConsistencyCheckJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureConsistencyCheckJobConfigRequest self = new UpdateFeatureConsistencyCheckJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setCompareFeature(Boolean compareFeature) {
        this.compareFeature = compareFeature;
        return this;
    }
    public Boolean getCompareFeature() {
        return this.compareFeature;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDatasetMountPath(String datasetMountPath) {
        this.datasetMountPath = datasetMountPath;
        return this;
    }
    public String getDatasetMountPath() {
        return this.datasetMountPath;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDatasetUri(String datasetUri) {
        this.datasetUri = datasetUri;
        return this;
    }
    public String getDatasetUri() {
        return this.datasetUri;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setDefaultRoute(String defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setEasyRecPackagePath(String easyRecPackagePath) {
        this.easyRecPackagePath = easyRecPackagePath;
        return this;
    }
    public String getEasyRecPackagePath() {
        return this.easyRecPackagePath;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setEasyRecVersion(String easyRecVersion) {
        this.easyRecVersion = easyRecVersion;
        return this;
    }
    public String getEasyRecVersion() {
        return this.easyRecVersion;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureDisplayExclude(String featureDisplayExclude) {
        this.featureDisplayExclude = featureDisplayExclude;
        return this;
    }
    public String getFeatureDisplayExclude() {
        return this.featureDisplayExclude;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureLandingResourceId(String featureLandingResourceId) {
        this.featureLandingResourceId = featureLandingResourceId;
        return this;
    }
    public String getFeatureLandingResourceId() {
        return this.featureLandingResourceId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeaturePriority(String featurePriority) {
        this.featurePriority = featurePriority;
        return this;
    }
    public String getFeaturePriority() {
        return this.featurePriority;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreItemId(String featureStoreItemId) {
        this.featureStoreItemId = featureStoreItemId;
        return this;
    }
    public String getFeatureStoreItemId() {
        return this.featureStoreItemId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreModelId(String featureStoreModelId) {
        this.featureStoreModelId = featureStoreModelId;
        return this;
    }
    public String getFeatureStoreModelId() {
        return this.featureStoreModelId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreProjectId(String featureStoreProjectId) {
        this.featureStoreProjectId = featureStoreProjectId;
        return this;
    }
    public String getFeatureStoreProjectId() {
        return this.featureStoreProjectId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreProjectName(String featureStoreProjectName) {
        this.featureStoreProjectName = featureStoreProjectName;
        return this;
    }
    public String getFeatureStoreProjectName() {
        return this.featureStoreProjectName;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
        this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
        return this;
    }
    public String getFeatureStoreSeqFeatureView() {
        return this.featureStoreSeqFeatureView;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFeatureStoreUserId(String featureStoreUserId) {
        this.featureStoreUserId = featureStoreUserId;
        return this;
    }
    public String getFeatureStoreUserId() {
        return this.featureStoreUserId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFgJarVersion(String fgJarVersion) {
        this.fgJarVersion = fgJarVersion;
        return this;
    }
    public String getFgJarVersion() {
        return this.fgJarVersion;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setFgJsonFileName(String fgJsonFileName) {
        this.fgJsonFileName = fgJsonFileName;
        return this;
    }
    public String getFgJsonFileName() {
        return this.fgJsonFileName;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setGenerateZip(Boolean generateZip) {
        this.generateZip = generateZip;
        return this;
    }
    public Boolean getGenerateZip() {
        return this.generateZip;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setIsUseFeatureStore(Boolean isUseFeatureStore) {
        this.isUseFeatureStore = isUseFeatureStore;
        return this;
    }
    public Boolean getIsUseFeatureStore() {
        return this.isUseFeatureStore;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setItemIdField(String itemIdField) {
        this.itemIdField = itemIdField;
        return this;
    }
    public String getItemIdField() {
        return this.itemIdField;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setItemTable(String itemTable) {
        this.itemTable = itemTable;
        return this;
    }
    public String getItemTable() {
        return this.itemTable;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setItemTablePartitionField(String itemTablePartitionField) {
        this.itemTablePartitionField = itemTablePartitionField;
        return this;
    }
    public String getItemTablePartitionField() {
        return this.itemTablePartitionField;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
        this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
        return this;
    }
    public String getItemTablePartitionFieldFormat() {
        return this.itemTablePartitionFieldFormat;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setMaxcomputeSchema(String maxcomputeSchema) {
        this.maxcomputeSchema = maxcomputeSchema;
        return this;
    }
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setOssResourceId(String ossResourceId) {
        this.ossResourceId = ossResourceId;
        return this;
    }
    public String getOssResourceId() {
        return this.ossResourceId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setPredictWorkerCount(Integer predictWorkerCount) {
        this.predictWorkerCount = predictWorkerCount;
        return this;
    }
    public Integer getPredictWorkerCount() {
        return this.predictWorkerCount;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setPredictWorkerCpu(Integer predictWorkerCpu) {
        this.predictWorkerCpu = predictWorkerCpu;
        return this;
    }
    public Integer getPredictWorkerCpu() {
        return this.predictWorkerCpu;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setPredictWorkerMemory(Integer predictWorkerMemory) {
        this.predictWorkerMemory = predictWorkerMemory;
        return this;
    }
    public Integer getPredictWorkerMemory() {
        return this.predictWorkerMemory;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setResourceConfig(String resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public String getResourceConfig() {
        return this.resourceConfig;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setSampleRate(Double sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Double getSampleRate() {
        return this.sampleRate;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setUserIdField(String userIdField) {
        this.userIdField = userIdField;
        return this;
    }
    public String getUserIdField() {
        return this.userIdField;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setUserTable(String userTable) {
        this.userTable = userTable;
        return this;
    }
    public String getUserTable() {
        return this.userTable;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setUserTablePartitionField(String userTablePartitionField) {
        this.userTablePartitionField = userTablePartitionField;
        return this;
    }
    public String getUserTablePartitionField() {
        return this.userTablePartitionField;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
        this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
        return this;
    }
    public String getUserTablePartitionFieldFormat() {
        return this.userTablePartitionFieldFormat;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

    public UpdateFeatureConsistencyCheckJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
