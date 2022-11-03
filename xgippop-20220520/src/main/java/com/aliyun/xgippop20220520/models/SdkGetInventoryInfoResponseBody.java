// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkGetInventoryInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SdkGetInventoryInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static SdkGetInventoryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGetInventoryInfoResponseBody self = new SdkGetInventoryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGetInventoryInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SdkGetInventoryInfoResponseBody setData(SdkGetInventoryInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdkGetInventoryInfoResponseBodyData getData() {
        return this.data;
    }

    public SdkGetInventoryInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SdkGetInventoryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SdkGetInventoryInfoResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public SdkGetInventoryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
