// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether feature comparison is enabled.</p>
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
     * <p>s-xxx</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The mount path of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>mnt/xxx</p>
     */
    @NameInMap("DatasetMountPath")
    public String datasetMountPath;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>oss-xxx</p>
     */
    @NameInMap("DatasetUri")
    public String datasetUri;

    /**
     * <p>The default gateway. Eth0 indicates the public gateway. Eth1 indicates the dedicated gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Eth0</p>
     */
    @NameInMap("DefaultRoute")
    public String defaultRoute;

    /**
     * <p>The EAS service name.</p>
     * 
     * <strong>example:</strong>
     * <p>eas_service_1</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    /**
     * <p>The path of the EasyRec package.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://*******</p>
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
     * <p>The feature display filter. Separate multiple features with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>feature1,feature2</p>
     */
    @NameInMap("FeatureDisplayExclude")
    public String featureDisplayExclude;

    /**
     * <p>The ID of the data source for data backflow.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-********</p>
     */
    @NameInMap("FeatureLandingResourceId")
    public String featureLandingResourceId;

    /**
     * <p>The URI of the data source for data backflow.</p>
     * 
     * <strong>example:</strong>
     * <p>mc_project_1</p>
     */
    @NameInMap("FeatureLandingResourceUri")
    public String featureLandingResourceUri;

    /**
     * <p>The feature priority. Separate multiple features with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>feature1,feature2,feature3</p>
     */
    @NameInMap("FeaturePriority")
    public String featurePriority;

    /**
     * <p>The primary key on the item side in Feature Store.</p>
     * 
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("FeatureStoreItemId")
    public String featureStoreItemId;

    /**
     * <p>The feature store model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureStoreModelId")
    public String featureStoreModelId;

    /**
     * <p>The ID of the Feature Store project.</p>
     * 
     * <strong>example:</strong>
     * <p>prj-01</p>
     */
    @NameInMap("FeatureStoreProjectId")
    public String featureStoreProjectId;

    /**
     * <p>The name of the Feature Store project.</p>
     * 
     * <strong>example:</strong>
     * <p>project-1</p>
     */
    @NameInMap("FeatureStoreProjectName")
    public String featureStoreProjectName;

    /**
     * <p>The name of the feature view to which the item feature belongs in the sequence feature.</p>
     * 
     * <strong>example:</strong>
     * <p>item-1</p>
     */
    @NameInMap("FeatureStoreSeqFeatureView")
    public String featureStoreSeqFeatureView;

    /**
     * <p>The primary key on the user side in Feature Store.</p>
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
     * <p>The name of the fg_json file.</p>
     * 
     * <strong>example:</strong>
     * <p>file.json</p>
     */
    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    /**
     * <p>Indicates whether a ZIP package needs to be generated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GenerateZip")
    public Boolean generateZip;

    /**
     * <p>The creation time. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The update time. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The name of the item_id field.</p>
     * 
     * <strong>example:</strong>
     * <p>item_id</p>
     */
    @NameInMap("ItemIdField")
    public String itemIdField;

    /**
     * <p>The name of the item table.</p>
     * 
     * <strong>example:</strong>
     * <p>item_table</p>
     */
    @NameInMap("ItemTable")
    public String itemTable;

    /**
     * <p>The partition field of the item table.</p>
     * 
     * <strong>example:</strong>
     * <p>ds</p>
     */
    @NameInMap("ItemTablePartitionField")
    public String itemTablePartitionField;

    /**
     * <p>The format of the partition field in the item table. Valid values:</p>
     * <ul>
     * <li>yyyymmdd</li>
     * <li>yyyy-mm-dd</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yyyymmdd</p>
     */
    @NameInMap("ItemTablePartitionFieldFormat")
    public String itemTablePartitionFieldFormat;

    /**
     * <p>The end time of the latest job. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("LatestJobGmtSamplingEndTime")
    public String latestJobGmtSamplingEndTime;

    /**
     * <p>The start time of the latest job. The time is in ISO 8601 format and includes a time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("LatestJobGmtSamplingStartTime")
    public String latestJobGmtSamplingStartTime;

    /**
     * <p>The ID of the latest job created based on this configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LatestJobId")
    public String latestJobId;

    /**
     * <p>The name of the feature consistency check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>feature_consistency_check1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>oss_bucket_1</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The ID of the OSS data source.</p>
     * 
     * <strong>example:</strong>
     * <p>reso-********</p>
     */
    @NameInMap("OssResourceId")
    public String ossResourceId;

    /**
     * <p>The number of workers used to execute the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PredictWorkerCount")
    public Integer predictWorkerCount;

    /**
     * <p>The CPU resources allocated to workers when executing the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PredictWorkerCpu")
    public Integer predictWorkerCpu;

    /**
     * <p>The memory resources allocated to workers when executing the prediction script.</p>
     * 
     * <strong>example:</strong>
     * <p>32000</p>
     */
    @NameInMap("PredictWorkerMemory")
    public Integer predictWorkerMemory;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResourceConfig")
    public String resourceConfig;

    /**
     * <p>The sampling rate. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.89</p>
     */
    @NameInMap("SampleRate")
    public String sampleRate;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The scene name.</p>
     * 
     * <strong>example:</strong>
     * <p>scene1</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

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
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>service1</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>Editable: The configuration is editable.</li>
     * <li>Uneditable: The configuration is not editable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Editable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vswitch-xxx</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>Indicates whether to use Feature Store. Valid values:</p>
     * <ul>
     * <li>true: Feature Store is used. In this case, FeatureStoreProjectId, FeatureStoreProjectName, FeatureStoreModelId, FeatureStoreUserId, and FeatureStoreItemId are returned.</li>
     * <li>false: Feature Store is not used. In this case, UserTable, UserIdField, UserTablePartitionField, UserTablePartitionFieldFormat, ItemTable, ItemIdField, ItemTablePartitionField, and ItemTablePartitionFieldFormat are required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFeatureStore")
    public Boolean useFeatureStore;

    /**
     * <p>The name of the user_id field.</p>
     * 
     * <strong>example:</strong>
     * <p>user_id</p>
     */
    @NameInMap("UserIdField")
    public String userIdField;

    /**
     * <p>The name of the user table.</p>
     * 
     * <strong>example:</strong>
     * <p>user_table</p>
     */
    @NameInMap("UserTable")
    public String userTable;

    /**
     * <p>The partition field of the user table.</p>
     * 
     * <strong>example:</strong>
     * <p>ds</p>
     */
    @NameInMap("UserTablePartitionField")
    public String userTablePartitionField;

    /**
     * <p>The format of the partition field in the user table. Valid values:</p>
     * <ul>
     * <li>yyyymmdd</li>
     * <li>yyyy-mm-dd</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yyyymmdd</p>
     */
    @NameInMap("UserTablePartitionFieldFormat")
    public String userTablePartitionFieldFormat;

    /**
     * <p>The VPC ID.</p>
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
     * <p>The ID of the PAI workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetFeatureConsistencyCheckJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobConfigResponseBody self = new GetFeatureConsistencyCheckJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setCompareFeature(Boolean compareFeature) {
        this.compareFeature = compareFeature;
        return this;
    }
    public Boolean getCompareFeature() {
        return this.compareFeature;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDatasetMountPath(String datasetMountPath) {
        this.datasetMountPath = datasetMountPath;
        return this;
    }
    public String getDatasetMountPath() {
        return this.datasetMountPath;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDatasetUri(String datasetUri) {
        this.datasetUri = datasetUri;
        return this;
    }
    public String getDatasetUri() {
        return this.datasetUri;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setDefaultRoute(String defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setEasServiceName(String easServiceName) {
        this.easServiceName = easServiceName;
        return this;
    }
    public String getEasServiceName() {
        return this.easServiceName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setEasyRecPackagePath(String easyRecPackagePath) {
        this.easyRecPackagePath = easyRecPackagePath;
        return this;
    }
    public String getEasyRecPackagePath() {
        return this.easyRecPackagePath;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setEasyRecVersion(String easyRecVersion) {
        this.easyRecVersion = easyRecVersion;
        return this;
    }
    public String getEasyRecVersion() {
        return this.easyRecVersion;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureDisplayExclude(String featureDisplayExclude) {
        this.featureDisplayExclude = featureDisplayExclude;
        return this;
    }
    public String getFeatureDisplayExclude() {
        return this.featureDisplayExclude;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureLandingResourceId(String featureLandingResourceId) {
        this.featureLandingResourceId = featureLandingResourceId;
        return this;
    }
    public String getFeatureLandingResourceId() {
        return this.featureLandingResourceId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureLandingResourceUri(String featureLandingResourceUri) {
        this.featureLandingResourceUri = featureLandingResourceUri;
        return this;
    }
    public String getFeatureLandingResourceUri() {
        return this.featureLandingResourceUri;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeaturePriority(String featurePriority) {
        this.featurePriority = featurePriority;
        return this;
    }
    public String getFeaturePriority() {
        return this.featurePriority;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreItemId(String featureStoreItemId) {
        this.featureStoreItemId = featureStoreItemId;
        return this;
    }
    public String getFeatureStoreItemId() {
        return this.featureStoreItemId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreModelId(String featureStoreModelId) {
        this.featureStoreModelId = featureStoreModelId;
        return this;
    }
    public String getFeatureStoreModelId() {
        return this.featureStoreModelId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreProjectId(String featureStoreProjectId) {
        this.featureStoreProjectId = featureStoreProjectId;
        return this;
    }
    public String getFeatureStoreProjectId() {
        return this.featureStoreProjectId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreProjectName(String featureStoreProjectName) {
        this.featureStoreProjectName = featureStoreProjectName;
        return this;
    }
    public String getFeatureStoreProjectName() {
        return this.featureStoreProjectName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
        this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
        return this;
    }
    public String getFeatureStoreSeqFeatureView() {
        return this.featureStoreSeqFeatureView;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFeatureStoreUserId(String featureStoreUserId) {
        this.featureStoreUserId = featureStoreUserId;
        return this;
    }
    public String getFeatureStoreUserId() {
        return this.featureStoreUserId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFgJarVersion(String fgJarVersion) {
        this.fgJarVersion = fgJarVersion;
        return this;
    }
    public String getFgJarVersion() {
        return this.fgJarVersion;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setFgJsonFileName(String fgJsonFileName) {
        this.fgJsonFileName = fgJsonFileName;
        return this;
    }
    public String getFgJsonFileName() {
        return this.fgJsonFileName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setGenerateZip(Boolean generateZip) {
        this.generateZip = generateZip;
        return this;
    }
    public Boolean getGenerateZip() {
        return this.generateZip;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setItemIdField(String itemIdField) {
        this.itemIdField = itemIdField;
        return this;
    }
    public String getItemIdField() {
        return this.itemIdField;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setItemTable(String itemTable) {
        this.itemTable = itemTable;
        return this;
    }
    public String getItemTable() {
        return this.itemTable;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setItemTablePartitionField(String itemTablePartitionField) {
        this.itemTablePartitionField = itemTablePartitionField;
        return this;
    }
    public String getItemTablePartitionField() {
        return this.itemTablePartitionField;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setItemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
        this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
        return this;
    }
    public String getItemTablePartitionFieldFormat() {
        return this.itemTablePartitionFieldFormat;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setLatestJobGmtSamplingEndTime(String latestJobGmtSamplingEndTime) {
        this.latestJobGmtSamplingEndTime = latestJobGmtSamplingEndTime;
        return this;
    }
    public String getLatestJobGmtSamplingEndTime() {
        return this.latestJobGmtSamplingEndTime;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setLatestJobGmtSamplingStartTime(String latestJobGmtSamplingStartTime) {
        this.latestJobGmtSamplingStartTime = latestJobGmtSamplingStartTime;
        return this;
    }
    public String getLatestJobGmtSamplingStartTime() {
        return this.latestJobGmtSamplingStartTime;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setLatestJobId(String latestJobId) {
        this.latestJobId = latestJobId;
        return this;
    }
    public String getLatestJobId() {
        return this.latestJobId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setOssResourceId(String ossResourceId) {
        this.ossResourceId = ossResourceId;
        return this;
    }
    public String getOssResourceId() {
        return this.ossResourceId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setPredictWorkerCount(Integer predictWorkerCount) {
        this.predictWorkerCount = predictWorkerCount;
        return this;
    }
    public Integer getPredictWorkerCount() {
        return this.predictWorkerCount;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setPredictWorkerCpu(Integer predictWorkerCpu) {
        this.predictWorkerCpu = predictWorkerCpu;
        return this;
    }
    public Integer getPredictWorkerCpu() {
        return this.predictWorkerCpu;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setPredictWorkerMemory(Integer predictWorkerMemory) {
        this.predictWorkerMemory = predictWorkerMemory;
        return this;
    }
    public Integer getPredictWorkerMemory() {
        return this.predictWorkerMemory;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setResourceConfig(String resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public String getResourceConfig() {
        return this.resourceConfig;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setUseFeatureStore(Boolean useFeatureStore) {
        this.useFeatureStore = useFeatureStore;
        return this;
    }
    public Boolean getUseFeatureStore() {
        return this.useFeatureStore;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setUserIdField(String userIdField) {
        this.userIdField = userIdField;
        return this;
    }
    public String getUserIdField() {
        return this.userIdField;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setUserTable(String userTable) {
        this.userTable = userTable;
        return this;
    }
    public String getUserTable() {
        return this.userTable;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setUserTablePartitionField(String userTablePartitionField) {
        this.userTablePartitionField = userTablePartitionField;
        return this;
    }
    public String getUserTablePartitionField() {
        return this.userTablePartitionField;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setUserTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
        this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
        return this;
    }
    public String getUserTablePartitionFieldFormat() {
        return this.userTablePartitionFieldFormat;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

    public GetFeatureConsistencyCheckJobConfigResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
