// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetInventoryResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetInventoryResponseData data;

    public static GetInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryResponse self = new GetInventoryResponse();
        return TeaModel.build(map, self);
    }

    public GetInventoryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInventoryResponse setData(GetInventoryResponseData data) {
        this.data = data;
        return this;
    }
    public GetInventoryResponseData getData() {
        return this.data;
    }

    public static class GetInventoryResponseDataResultObject extends TeaModel {
        @NameInMap("BuyerId")
        @Validation(required = true)
        public String buyerId;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("CurrentInventory")
        @Validation(required = true)
        public String currentInventory;

        @NameInMap("ValidEndTime")
        @Validation(required = true)
        public String validEndTime;

        @NameInMap("ValidStartTime")
        @Validation(required = true)
        public String validStartTime;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InventoryId")
        @Validation(required = true)
        public String inventoryId;

        public static GetInventoryResponseDataResultObject build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryResponseDataResultObject self = new GetInventoryResponseDataResultObject();
            return TeaModel.build(map, self);
        }

        public GetInventoryResponseDataResultObject setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public GetInventoryResponseDataResultObject setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetInventoryResponseDataResultObject setCurrentInventory(String currentInventory) {
            this.currentInventory = currentInventory;
            return this;
        }
        public String getCurrentInventory() {
            return this.currentInventory;
        }

        public GetInventoryResponseDataResultObject setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public GetInventoryResponseDataResultObject setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

        public GetInventoryResponseDataResultObject setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInventoryResponseDataResultObject setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }
        public String getInventoryId() {
            return this.inventoryId;
        }

    }

    public static class GetInventoryResponseData extends TeaModel {
        @NameInMap("ResultObject")
        @Validation(required = true)
        public java.util.List<GetInventoryResponseDataResultObject> resultObject;

        public static GetInventoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryResponseData self = new GetInventoryResponseData();
            return TeaModel.build(map, self);
        }

        public GetInventoryResponseData setResultObject(java.util.List<GetInventoryResponseDataResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }
        public java.util.List<GetInventoryResponseDataResultObject> getResultObject() {
            return this.resultObject;
        }

    }

}
