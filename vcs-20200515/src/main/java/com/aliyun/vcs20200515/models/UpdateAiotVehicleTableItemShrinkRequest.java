// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotVehicleTableItemShrinkRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItem")
    public String vehicleTableItemShrink;

    public static UpdateAiotVehicleTableItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotVehicleTableItemShrinkRequest self = new UpdateAiotVehicleTableItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotVehicleTableItemShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotVehicleTableItemShrinkRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public UpdateAiotVehicleTableItemShrinkRequest setVehicleTableItemShrink(String vehicleTableItemShrink) {
        this.vehicleTableItemShrink = vehicleTableItemShrink;
        return this;
    }
    public String getVehicleTableItemShrink() {
        return this.vehicleTableItemShrink;
    }

}
