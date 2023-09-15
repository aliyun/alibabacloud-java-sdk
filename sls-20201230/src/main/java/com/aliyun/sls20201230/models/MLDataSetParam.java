// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataSetParam extends TeaModel {
    @NameInMap("createBy")
    public String createBy;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("dataType")
    public String dataType;

    @NameInMap("datasetId")
    public String datasetId;

    @NameInMap("description")
    public String description;

    @NameInMap("labelId")
    public String labelId;

    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    @NameInMap("name")
    public String name;

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
