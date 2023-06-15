// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   Postpaid: pay-as-you-go</p>
     * <p>*   Prepaid: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription method of the instance. This parameter must be specified when PayType is set to Prepaid.</p>
     * <br>
     * <p>*   Year</p>
     * <p>*   Month</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Valid values when Period is set to Year: 1 to 9. Valid values when Period is set to Month: 1, 2, and 3.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static ModifyDBInstancePayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeRequest self = new ModifyDBInstancePayTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstancePayTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstancePayTypeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyDBInstancePayTypeRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public ModifyDBInstancePayTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstancePayTypeRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
