// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    public String globalAccelerationInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyGlobalAccelerationInstanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesRequest self = new ModifyGlobalAccelerationInstanceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
