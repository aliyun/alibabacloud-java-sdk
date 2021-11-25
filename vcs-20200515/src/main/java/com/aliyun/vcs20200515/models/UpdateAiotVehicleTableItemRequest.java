// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotVehicleTableItemRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItem")
    public UpdateAiotVehicleTableItemRequestVehicleTableItem vehicleTableItem;

    public static UpdateAiotVehicleTableItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotVehicleTableItemRequest self = new UpdateAiotVehicleTableItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotVehicleTableItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotVehicleTableItemRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public UpdateAiotVehicleTableItemRequest setVehicleTableItem(UpdateAiotVehicleTableItemRequestVehicleTableItem vehicleTableItem) {
        this.vehicleTableItem = vehicleTableItem;
        return this;
    }
    public UpdateAiotVehicleTableItemRequestVehicleTableItem getVehicleTableItem() {
        return this.vehicleTableItem;
    }

    public static class UpdateAiotVehicleTableItemRequestVehicleTableItem extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("VehicleTableItemId")
        public String vehicleTableItemId;

        public static UpdateAiotVehicleTableItemRequestVehicleTableItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotVehicleTableItemRequestVehicleTableItem self = new UpdateAiotVehicleTableItemRequestVehicleTableItem();
            return TeaModel.build(map, self);
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public UpdateAiotVehicleTableItemRequestVehicleTableItem setVehicleTableItemId(String vehicleTableItemId) {
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

    }

}
