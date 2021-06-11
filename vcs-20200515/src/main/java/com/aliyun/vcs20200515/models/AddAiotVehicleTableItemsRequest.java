// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotVehicleTableItemsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItem")
    public AddAiotVehicleTableItemsRequestVehicleTableItem vehicleTableItem;

    public static AddAiotVehicleTableItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotVehicleTableItemsRequest self = new AddAiotVehicleTableItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotVehicleTableItemsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddAiotVehicleTableItemsRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public AddAiotVehicleTableItemsRequest setVehicleTableItem(AddAiotVehicleTableItemsRequestVehicleTableItem vehicleTableItem) {
        this.vehicleTableItem = vehicleTableItem;
        return this;
    }
    public AddAiotVehicleTableItemsRequestVehicleTableItem getVehicleTableItem() {
        return this.vehicleTableItem;
    }

    public static class AddAiotVehicleTableItemsRequestVehicleTableItem extends TeaModel {
        @NameInMap("VehicleTableItemId")
        public String vehicleTableItemId;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Remarks")
        public String remarks;

        public static AddAiotVehicleTableItemsRequestVehicleTableItem build(java.util.Map<String, ?> map) throws Exception {
            AddAiotVehicleTableItemsRequestVehicleTableItem self = new AddAiotVehicleTableItemsRequestVehicleTableItem();
            return TeaModel.build(map, self);
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setVehicleTableItemId(String vehicleTableItemId) {
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public AddAiotVehicleTableItemsRequestVehicleTableItem setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

}
