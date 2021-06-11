// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotVehicleTableItemsShrinkRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItem")
    public String vehicleTableItemShrink;

    public static AddAiotVehicleTableItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotVehicleTableItemsShrinkRequest self = new AddAiotVehicleTableItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotVehicleTableItemsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddAiotVehicleTableItemsShrinkRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public AddAiotVehicleTableItemsShrinkRequest setVehicleTableItemShrink(String vehicleTableItemShrink) {
        this.vehicleTableItemShrink = vehicleTableItemShrink;
        return this;
    }
    public String getVehicleTableItemShrink() {
        return this.vehicleTableItemShrink;
    }

}
