// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @NameInMap("CompareFeature")
    public Boolean compareFeature;

    @NameInMap("EasServiceName")
    public String easServiceName;

    @NameInMap("EasyRecPackagePath")
    public String easyRecPackagePath;

    @NameInMap("EasyRecVersion")
    public String easyRecVersion;

    @NameInMap("FeatureDisplayExclude")
    public String featureDisplayExclude;

    @NameInMap("FeatureLandingResourceId")
    public String featureLandingResourceId;

    @NameInMap("FeatureLandingResourceUri")
    public String featureLandingResourceUri;

    @NameInMap("FeaturePriority")
    public String featurePriority;

    @NameInMap("FgJarVersion")
    public String fgJarVersion;

    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    @NameInMap("GenerateZip")
    public Boolean generateZip;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("ItemIdField")
    public String itemIdField;

    @NameInMap("ItemTable")
    public String itemTable;

    @NameInMap("ItemTablePartitionField")
    public String itemTablePartitionField;

    @NameInMap("ItemTablePartitionFieldFormat")
    public String itemTablePartitionFieldFormat;

    @NameInMap("LatestJobGmtSamplingEndTime")
    public String latestJobGmtSamplingEndTime;

    @NameInMap("LatestJobGmtSamplingStartTime")
    public String latestJobGmtSamplingStartTime;

    @NameInMap("LatestJobId")
    public String latestJobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssResourceId")
    public String ossResourceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SampleRate")
    public String sampleRate;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserIdField")
    public String userIdField;

    @NameInMap("UserTable")
    public String userTable;

    @NameInMap("UserTablePartitionField")
    public String userTablePartitionField;

    @NameInMap("UserTablePartitionFieldFormat")
    public String userTablePartitionFieldFormat;

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
