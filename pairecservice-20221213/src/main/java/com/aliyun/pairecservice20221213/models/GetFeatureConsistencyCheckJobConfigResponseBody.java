// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CompareFeature")
    public Boolean compareFeature;

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

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    /**
     * <strong>example:</strong>
     * <p>work_flow_1</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

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

    public GetFeatureConsistencyCheckJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetFeatureConsistencyCheckJobConfigResponseBody setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
