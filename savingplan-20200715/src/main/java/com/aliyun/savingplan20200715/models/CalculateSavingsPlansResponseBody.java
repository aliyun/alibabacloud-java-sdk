// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CalculateSavingsPlansResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<CalculateSavingsPlansResponseBodyData> data;

    public static CalculateSavingsPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalculateSavingsPlansResponseBody self = new CalculateSavingsPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public CalculateSavingsPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CalculateSavingsPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CalculateSavingsPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalculateSavingsPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CalculateSavingsPlansResponseBody setData(java.util.List<CalculateSavingsPlansResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CalculateSavingsPlansResponseBodyData> getData() {
        return this.data;
    }

    public static class CalculateSavingsPlansResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("InstanceFamily")
        public String instanceFamily;

        @NameInMap("Region")
        public String region;

        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("SpnType")
        public String spnType;

        @NameInMap("PoolValue")
        public Float poolValue;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PayMode")
        public String payMode;

        public static CalculateSavingsPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CalculateSavingsPlansResponseBodyData self = new CalculateSavingsPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CalculateSavingsPlansResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CalculateSavingsPlansResponseBodyData setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public CalculateSavingsPlansResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CalculateSavingsPlansResponseBodyData setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public CalculateSavingsPlansResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CalculateSavingsPlansResponseBodyData setSpnType(String spnType) {
            this.spnType = spnType;
            return this;
        }
        public String getSpnType() {
            return this.spnType;
        }

        public CalculateSavingsPlansResponseBodyData setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public CalculateSavingsPlansResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CalculateSavingsPlansResponseBodyData setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

    }

}
