// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("DatasetIdList")
    public java.util.Map<String, ?> datasetIdList;

    @NameInMap("TestDatasetIdList")
    public java.util.Map<String, ?> testDatasetIdList;

    @NameInMap("IsIncrementalTrain")
    public String isIncrementalTrain;

    @NameInMap("Product")
    public String product;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public CreateModelRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setDatasetIdList(java.util.Map<String, ?> datasetIdList) {
        this.datasetIdList = datasetIdList;
        return this;
    }
    public java.util.Map<String, ?> getDatasetIdList() {
        return this.datasetIdList;
    }

    public CreateModelRequest setTestDatasetIdList(java.util.Map<String, ?> testDatasetIdList) {
        this.testDatasetIdList = testDatasetIdList;
        return this;
    }
    public java.util.Map<String, ?> getTestDatasetIdList() {
        return this.testDatasetIdList;
    }

    public CreateModelRequest setIsIncrementalTrain(String isIncrementalTrain) {
        this.isIncrementalTrain = isIncrementalTrain;
        return this;
    }
    public String getIsIncrementalTrain() {
        return this.isIncrementalTrain;
    }

    public CreateModelRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
