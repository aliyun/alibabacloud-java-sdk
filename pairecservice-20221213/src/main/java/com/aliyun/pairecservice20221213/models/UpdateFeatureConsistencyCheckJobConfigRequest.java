// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateFeatureConsistencyCheckJobConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompareFeature")
    public Boolean compareFeature;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EasServiceName")
    public String easServiceName;

    @NameInMap("EasyRecPackagePath")
    public String easyRecPackagePath;

    @NameInMap("EasyRecVersion")
    public String easyRecVersion;

    @NameInMap("FeatureDisplayExclude")
    public String featureDisplayExclude;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FeatureLandingResourceId")
    public String featureLandingResourceId;

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

    @NameInMap("FgJarVersion")
    public String fgJarVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GenerateZip")
    public Boolean generateZip;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsUseFeatureStore")
    public Boolean isUseFeatureStore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemIdField")
    public String itemIdField;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemTable")
    public String itemTable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemTablePartitionField")
    public String itemTablePartitionField;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ItemTablePartitionFieldFormat")
    public String itemTablePartitionFieldFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OssResourceId")
    public String ossResourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SampleRate")
    public Double sampleRate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserIdField")
    public String userIdField;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserTable")
    public String userTable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserTablePartitionField")
    public String userTablePartitionField;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserTablePartitionFieldFormat")
    public String userTablePartitionFieldFormat;

    @NameInMap("WorkflowName")
    public String workflowName;

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

    public UpdateFeatureConsistencyCheckJobConfigRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
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

    public UpdateFeatureConsistencyCheckJobConfigRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
