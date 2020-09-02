// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouteTableAttributesRequest extends TeaModel {
    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyRouteTableAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteTableAttributesRequest self = new ModifyRouteTableAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouteTableAttributesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public ModifyRouteTableAttributesRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public ModifyRouteTableAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyRouteTableAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
