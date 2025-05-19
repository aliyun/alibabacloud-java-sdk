// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSampleConsistencyJobRequest extends TeaModel {
    @NameInMap("Duration")
    public String duration;

    @NameInMap("EasModelServiceName")
    public String easModelServiceName;

    @NameInMap("FeatureSaveResourceId")
    public String featureSaveResourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemIdField")
    public String itemIdField;

    @NameInMap("Name")
    public String name;

    @NameInMap("PartitionField")
    public String partitionField;

    @NameInMap("PartitionFieldFormat")
    public String partitionFieldFormat;

    @NameInMap("RequestIdField")
    public String requestIdField;

    @NameInMap("SampleRate")
    public String sampleRate;

    @NameInMap("SampleTableName")
    public String sampleTableName;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("UserIdField")
    public String userIdField;

    public static CreateSampleConsistencyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleConsistencyJobRequest self = new CreateSampleConsistencyJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleConsistencyJobRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateSampleConsistencyJobRequest setEasModelServiceName(String easModelServiceName) {
        this.easModelServiceName = easModelServiceName;
        return this;
    }
    public String getEasModelServiceName() {
        return this.easModelServiceName;
    }

    public CreateSampleConsistencyJobRequest setFeatureSaveResourceId(String featureSaveResourceId) {
        this.featureSaveResourceId = featureSaveResourceId;
        return this;
    }
    public String getFeatureSaveResourceId() {
        return this.featureSaveResourceId;
    }

    public CreateSampleConsistencyJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSampleConsistencyJobRequest setItemIdField(String itemIdField) {
        this.itemIdField = itemIdField;
        return this;
    }
    public String getItemIdField() {
        return this.itemIdField;
    }

    public CreateSampleConsistencyJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSampleConsistencyJobRequest setPartitionField(String partitionField) {
        this.partitionField = partitionField;
        return this;
    }
    public String getPartitionField() {
        return this.partitionField;
    }

    public CreateSampleConsistencyJobRequest setPartitionFieldFormat(String partitionFieldFormat) {
        this.partitionFieldFormat = partitionFieldFormat;
        return this;
    }
    public String getPartitionFieldFormat() {
        return this.partitionFieldFormat;
    }

    public CreateSampleConsistencyJobRequest setRequestIdField(String requestIdField) {
        this.requestIdField = requestIdField;
        return this;
    }
    public String getRequestIdField() {
        return this.requestIdField;
    }

    public CreateSampleConsistencyJobRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

    public CreateSampleConsistencyJobRequest setSampleTableName(String sampleTableName) {
        this.sampleTableName = sampleTableName;
        return this;
    }
    public String getSampleTableName() {
        return this.sampleTableName;
    }

    public CreateSampleConsistencyJobRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateSampleConsistencyJobRequest setUserIdField(String userIdField) {
        this.userIdField = userIdField;
        return this;
    }
    public String getUserIdField() {
        return this.userIdField;
    }

}
