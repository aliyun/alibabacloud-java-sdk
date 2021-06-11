// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotVehicleTableItemRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItemId")
    public String vehicleTableItemId;

    public static DeleteAiotVehicleTableItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotVehicleTableItemRequest self = new DeleteAiotVehicleTableItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiotVehicleTableItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAiotVehicleTableItemRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public DeleteAiotVehicleTableItemRequest setVehicleTableItemId(String vehicleTableItemId) {
        this.vehicleTableItemId = vehicleTableItemId;
        return this;
    }
    public String getVehicleTableItemId() {
        return this.vehicleTableItemId;
    }

}
