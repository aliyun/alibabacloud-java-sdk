// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataSetParam extends TeaModel {
    /**
     * <p>创建的对象</p>
     * 
     * <strong>example:</strong>
     * <p>sls-console</p>
     */
    @NameInMap("createBy")
    public String createBy;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>数据类型</p>
     * 
     * <strong>example:</strong>
     * <p>Metric</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>数据集的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>d9bd488f6dd42d294495fb780858e83d</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>数据集的描述</p>
     * 
     * <strong>example:</strong>
     * <p>数据集A</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>数据集对应的标签系统id</p>
     * 
     * <strong>example:</strong>
     * <p>a191ae4ca615b0ccb93c211fc8a998af</p>
     */
    @NameInMap("labelId")
    public String labelId;

    /**
     * <p>最终修改时间</p>
     * 
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>数据集的名称</p>
     * 
     * <strong>example:</strong>
     * <p>sls_builtin_dataset_metric.shapeclassification.anomalydetection</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>label表配置类型</p>
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
