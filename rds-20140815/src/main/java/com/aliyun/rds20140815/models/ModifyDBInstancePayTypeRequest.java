// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The billing method of the instance. Valid values: Postpaid: pay-as-you-go Prepaid: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription method of the instance. Valid values: Year and Month. If you set the PayType parameter to Prepaid, you must specify whether to use yearly subscription or monthly subscription for the instance.</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>If the Period parameter is set to Year, the value of the UsedTime parameter ranges from 1 to 9. If the Period parameter is set to Month, the value of the UsedTime parameter can be 1, 2, or 3.</p>
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
