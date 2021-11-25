// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetInventoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetInventoryResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static GetInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryResponseBody self = new GetInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInventoryResponseBody setData(GetInventoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInventoryResponseBodyData getData() {
        return this.data;
    }

    public GetInventoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInventoryResponseBodyDataResultObject extends TeaModel {
        @NameInMap("BuyerId")
        public String buyerId;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CurrentInventory")
        public String currentInventory;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InventoryId")
        public String inventoryId;

        @NameInMap("ValidEndTime")
        public String validEndTime;

        @NameInMap("ValidStartTime")
        public String validStartTime;

        public static GetInventoryResponseBodyDataResultObject build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryResponseBodyDataResultObject self = new GetInventoryResponseBodyDataResultObject();
            return TeaModel.build(map, self);
        }

        public GetInventoryResponseBodyDataResultObject setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public GetInventoryResponseBodyDataResultObject setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetInventoryResponseBodyDataResultObject setCurrentInventory(String currentInventory) {
            this.currentInventory = currentInventory;
            return this;
        }
        public String getCurrentInventory() {
            return this.currentInventory;
        }

        public GetInventoryResponseBodyDataResultObject setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInventoryResponseBodyDataResultObject setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }
        public String getInventoryId() {
            return this.inventoryId;
        }

        public GetInventoryResponseBodyDataResultObject setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public GetInventoryResponseBodyDataResultObject setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

    }

    public static class GetInventoryResponseBodyData extends TeaModel {
        @NameInMap("ResultObject")
        public java.util.List<GetInventoryResponseBodyDataResultObject> resultObject;

        public static GetInventoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryResponseBodyData self = new GetInventoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInventoryResponseBodyData setResultObject(java.util.List<GetInventoryResponseBodyDataResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }
        public java.util.List<GetInventoryResponseBodyDataResultObject> getResultObject() {
            return this.resultObject;
        }

    }

}
