// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetInventoryInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInventoryInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetInventoryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryInfoResponseBody self = new GetInventoryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInventoryInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInventoryInfoResponseBody setData(GetInventoryInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInventoryInfoResponseBodyData getData() {
        return this.data;
    }

    public GetInventoryInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInventoryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInventoryInfoResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetInventoryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInventoryInfoResponseBodyData extends TeaModel {
        @NameInMap("Inventory")
        public Long inventory;

        @NameInMap("ResidualInventory")
        public Long residualInventory;

        @NameInMap("UsedStock")
        public Long usedStock;

        public static GetInventoryInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInventoryInfoResponseBodyData self = new GetInventoryInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInventoryInfoResponseBodyData setInventory(Long inventory) {
            this.inventory = inventory;
            return this;
        }
        public Long getInventory() {
            return this.inventory;
        }

        public GetInventoryInfoResponseBodyData setResidualInventory(Long residualInventory) {
            this.residualInventory = residualInventory;
            return this;
        }
        public Long getResidualInventory() {
            return this.residualInventory;
        }

        public GetInventoryInfoResponseBodyData setUsedStock(Long usedStock) {
            this.usedStock = usedStock;
            return this;
        }
        public Long getUsedStock() {
            return this.usedStock;
        }

    }

    public static class SdkGetInventoryInfoResponseBodyData extends TeaModel {
        @NameInMap("Inventory")
        public Long inventory;

        @NameInMap("ResidualInventory")
        public Long residualInventory;

        @NameInMap("UsedStock")
        public Long usedStock;

        public static SdkGetInventoryInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdkGetInventoryInfoResponseBodyData self = new SdkGetInventoryInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdkGetInventoryInfoResponseBodyData setInventory(Long inventory) {
            this.inventory = inventory;
            return this;
        }
        public Long getInventory() {
            return this.inventory;
        }

        public SdkGetInventoryInfoResponseBodyData setResidualInventory(Long residualInventory) {
            this.residualInventory = residualInventory;
            return this;
        }
        public Long getResidualInventory() {
            return this.residualInventory;
        }

        public SdkGetInventoryInfoResponseBodyData setUsedStock(Long usedStock) {
            this.usedStock = usedStock;
            return this;
        }
        public Long getUsedStock() {
            return this.usedStock;
        }

    }

}
