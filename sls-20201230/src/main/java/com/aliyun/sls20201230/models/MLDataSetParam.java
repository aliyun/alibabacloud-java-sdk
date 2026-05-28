// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataSetParam extends TeaModel {
    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-console</p>
     */
    @NameInMap("createBy")
    public String createBy;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The type of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>Metric</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The unique identifier of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d9bd488f6dd42d294495fb780858e83d</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The description of the dataset.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the tag system that corresponds to the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>a191ae4ca615b0ccb93c211fc8a998af</p>
     */
    @NameInMap("labelId")
    public String labelId;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>sls_builtin_dataset_metric.shapeclassification.anomalydetection</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The configuration type of the tag table.</p>
     * 
     * <strong>example:</strong>
     * <p>Metric.ShapeClassification.AnomalyDetection</p>
     */
    @NameInMap("settingType")
    public String settingType;

    public static MLDataSetParam build(java.util.Map<String, ?> map) throws Exception {
        MLDataSetParam self = new MLDataSetParam();
        return TeaModel.build(map, self);
    }

    public MLDataSetParam setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }
    public String getCreateBy() {
        return this.createBy;
    }

    public MLDataSetParam setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public MLDataSetParam setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public MLDataSetParam setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public MLDataSetParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MLDataSetParam setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public MLDataSetParam setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public MLDataSetParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MLDataSetParam setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

}
