// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The billing method.</p>
     * <ul>
     * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
     * <li><strong>PREPAY</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The time when the instance expires.</p>
     * <blockquote>
     * <p> If you change the billing method from subscription to pay-as-you-go, this parameter is not returned.</p>
     * </blockquote>
     */
    @NameInMap("ExpiredTime")
    public java.util.List<String> expiredTime;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     */
    @NameInMap("FeeOfInstances")
    public java.util.List<ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances> feeOfInstances;

    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2133400000****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceChargeTypeResponseBody self = new ModifyRCInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceChargeTypeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyRCInstanceChargeTypeResponseBody setExpiredTime(java.util.List<String> expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public java.util.List<String> getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyRCInstanceChargeTypeResponseBody setFeeOfInstances(java.util.List<ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances> feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public java.util.List<ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances> getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public ModifyRCInstanceChargeTypeResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyRCInstanceChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyRCInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances extends TeaModel {
        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Fee")
        public String fee;

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances self = new ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public ModifyRCInstanceChargeTypeResponseBodyFeeOfInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
