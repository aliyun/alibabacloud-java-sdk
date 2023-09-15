// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataParam extends TeaModel {
    @NameInMap("annotationdataId")
    public String annotationdataId;

    @NameInMap("annotations")
    public java.util.Map<String, MLDataParamAnnotationsValue> annotations;

    @NameInMap("config")
    public java.util.Map<String, String> config;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("dataHash")
    public String dataHash;

    @NameInMap("datasetId")
    public String datasetId;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("predictions")
    public java.util.Map<String, MLDataParamPredictionsValue> predictions;

    @NameInMap("value")
    public String value;

    @NameInMap("valueType")
    public String valueType;

    public static MLDataParam build(java.util.Map<String, ?> map) throws Exception {
        MLDataParam self = new MLDataParam();
        return TeaModel.build(map, self);
    }

    public MLDataParam setAnnotationdataId(String annotationdataId) {
        this.annotationdataId = annotationdataId;
        return this;
    }
    public String getAnnotationdataId() {
        return this.annotationdataId;
    }

    public MLDataParam setAnnotations(java.util.Map<String, MLDataParamAnnotationsValue> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, MLDataParamAnnotationsValue> getAnnotations() {
        return this.annotations;
    }

    public MLDataParam setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public MLDataParam setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MLDataParam setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

    public MLDataParam setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public MLDataParam setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public MLDataParam setPredictions(java.util.Map<String, MLDataParamPredictionsValue> predictions) {
        this.predictions = predictions;
        return this;
    }
    public java.util.Map<String, MLDataParamPredictionsValue> getPredictions() {
        return this.predictions;
    }

    public MLDataParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MLDataParam setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
