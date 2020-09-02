// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVRouterAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VRouterId")
    @Validation(required = true)
    public String VRouterId;

    @NameInMap("VRouterName")
    public String VRouterName;

    @NameInMap("Description")
    public String description;

    public static ModifyVRouterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVRouterAttributeRequest self = new ModifyVRouterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVRouterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVRouterAttributeRequest setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public ModifyVRouterAttributeRequest setVRouterName(String VRouterName) {
        this.VRouterName = VRouterName;
        return this;
    }
    public String getVRouterName() {
        return this.VRouterName;
    }

    public ModifyVRouterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
