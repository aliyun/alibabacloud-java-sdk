// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobConfigRequest extends TeaModel {
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

    @NameInMap("FeaturePriority")
    public String featurePriority;

    @NameInMap("FgJarVersion")
    public String fgJarVersion;

    @NameInMap("FgJsonFileName")
    public String fgJsonFileName;

    @NameInMap("GenerateZip")
    public Boolean generateZip;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemIdField")
    public String itemIdField;

    @NameInMap("ItemTable")
    public String itemTable;

    @NameInMap("ItemTablePartitionField")
    public String itemTablePartitionField;

    @NameInMap("ItemTablePartitionFieldFormat")
    public String itemTablePartitionFieldFormat;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssResourceId")
    public String ossResourceId;

    @NameInMap("SampleRate")
    public Double sampleRate;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("ServiceId")
    public String serviceId;

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

    public CreateFeatureConsistencyCheckJobConfigRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
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

    public CreateFeatureConsistencyCheckJobConfigRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
