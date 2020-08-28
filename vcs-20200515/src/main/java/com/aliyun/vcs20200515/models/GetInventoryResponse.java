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

    }

    public static class GetInventoryResponseData extends TeaModel {
        @NameInMap("ResultObject")
        @Validation(required = true)
        public java.util.List<GetInventoryResponseDataResultObject> resultObject;

        public static GetInventoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryResponseData self = new GetInventoryResponseData();
            return TeaModel.build(map, self);
        }

    }

}
