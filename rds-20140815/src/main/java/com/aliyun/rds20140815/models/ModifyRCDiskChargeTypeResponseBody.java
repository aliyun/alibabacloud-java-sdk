// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskChargeTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ExpiredTime")
    public java.util.List<String> expiredTime;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>2133400000****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCDiskChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskChargeTypeResponseBody self = new ModifyRCDiskChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskChargeTypeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ModifyRCDiskChargeTypeResponseBody setExpiredTime(java.util.List<String> expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public java.util.List<String> getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyRCDiskChargeTypeResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyRCDiskChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyRCDiskChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
