// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataParam extends TeaModel {
    /**
     * <p>数据的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>dc74b0f569126bb310e1ba6454c351ac</p>
     */
    @NameInMap("annotationdataId")
    public String annotationdataId;

    /**
     * <p>标注信息</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, MLDataParamAnnotationsValue> annotations;

    /**
     * <p>数据的配置信息</p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <p>创建的时间</p>
     * 
     * <strong>example:</strong>
     * <p>1695094335</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>数据内容的hash值</p>
     * 
     * <strong>example:</strong>
     * <p>59db060bd89468245d76416a68a510ac</p>
     */
    @NameInMap("dataHash")
    public String dataHash;

    /**
     * <p>关联的数据集的id</p>
     * 
     * <strong>example:</strong>
     * <p>cb8cc4eb51a85e823471cdb368fae9be</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>最后一次修改的时间</p>
     * 
     * <strong>example:</strong>
     * <p>1695094335</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>模型预览结果信息</p>
     */
    @NameInMap("predictions")
    public java.util.Map<String, MLDataParamPredictionsValue> predictions;

    /**
     * <p>数据来源</p>
     * 
     * <strong>example:</strong>
     * <p>xxx/xxx/xxx/</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>数据来源格式</p>
     * 
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
