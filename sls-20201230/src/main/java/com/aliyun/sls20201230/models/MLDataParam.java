// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataParam extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dc74b0f569126bb310e1ba6454c351ac</p>
     */
    @NameInMap("annotationdataId")
    public String annotationdataId;

    @NameInMap("annotations")
    public java.util.Map<String, MLDataParamAnnotationsValue> annotations;

    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <strong>example:</strong>
     * <p>1695094335</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>59db060bd89468245d76416a68a510ac</p>
     */
    @NameInMap("dataHash")
    public String dataHash;

    /**
     * <strong>example:</strong>
     * <p>a9bd488f6dd42d294495fb780858e83d</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>1695094335</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("predictions")
    public java.util.Map<String, MLDataParamPredictionsValue> predictions;

    /**
     * <strong>example:</strong>
     * <p>xxx/xxx/xxx/</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
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
