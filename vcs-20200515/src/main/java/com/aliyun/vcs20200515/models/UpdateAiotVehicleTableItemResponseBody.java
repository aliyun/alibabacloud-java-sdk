// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotVehicleTableItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VehicleTableItem")
    public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem vehicleTableItem;

    public static UpdateAiotVehicleTableItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotVehicleTableItemResponseBody self = new UpdateAiotVehicleTableItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiotVehicleTableItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiotVehicleTableItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiotVehicleTableItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAiotVehicleTableItemResponseBody setVehicleTableItem(UpdateAiotVehicleTableItemResponseBodyVehicleTableItem vehicleTableItem) {
        this.vehicleTableItem = vehicleTableItem;
        return this;
    }
    public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem getVehicleTableItem() {
        return this.vehicleTableItem;
    }

    public static class UpdateAiotVehicleTableItemResponseBodyVehicleTableItem extends TeaModel {
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

        @NameInMap("VehicleTableId")
        public String vehicleTableId;

        @NameInMap("VehicleTableItemId")
        public String vehicleTableItemId;

        public static UpdateAiotVehicleTableItemResponseBodyVehicleTableItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotVehicleTableItemResponseBodyVehicleTableItem self = new UpdateAiotVehicleTableItemResponseBodyVehicleTableItem();
            return TeaModel.build(map, self);
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setVehicleTableId(String vehicleTableId) {
            this.vehicleTableId = vehicleTableId;
            return this;
        }
        public String getVehicleTableId() {
            return this.vehicleTableId;
        }

        public UpdateAiotVehicleTableItemResponseBodyVehicleTableItem setVehicleTableItemId(String vehicleTableItemId) {
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

    }

}
