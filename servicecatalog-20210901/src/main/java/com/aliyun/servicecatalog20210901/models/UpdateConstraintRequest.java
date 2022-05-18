// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateConstraintRequest extends TeaModel {
    // 约束配置
    @NameInMap("Config")
    public String config;

    // 约束ID
    @NameInMap("ConstraintId")
    public String constraintId;

    // 约束描述
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConstraintRequest self = new UpdateConstraintRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConstraintRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateConstraintRequest setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

    public UpdateConstraintRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConstraintRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
