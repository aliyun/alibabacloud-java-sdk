// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateModelShrinkRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("DatasetIdList")
    public String datasetIdListShrink;

    @NameInMap("TestDatasetIdList")
    public String testDatasetIdListShrink;

    @NameInMap("IsIncrementalTrain")
    public String isIncrementalTrain;

    @NameInMap("Product")
    public String product;

    public static CreateModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelShrinkRequest self = new CreateModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelShrinkRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public CreateModelShrinkRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateModelShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelShrinkRequest setDatasetIdListShrink(String datasetIdListShrink) {
        this.datasetIdListShrink = datasetIdListShrink;
        return this;
    }
    public String getDatasetIdListShrink() {
        return this.datasetIdListShrink;
    }

    public CreateModelShrinkRequest setTestDatasetIdListShrink(String testDatasetIdListShrink) {
        this.testDatasetIdListShrink = testDatasetIdListShrink;
        return this;
    }
    public String getTestDatasetIdListShrink() {
        return this.testDatasetIdListShrink;
    }

    public CreateModelShrinkRequest setIsIncrementalTrain(String isIncrementalTrain) {
        this.isIncrementalTrain = isIncrementalTrain;
        return this;
    }
    public String getIsIncrementalTrain() {
        return this.isIncrementalTrain;
    }

    public CreateModelShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
