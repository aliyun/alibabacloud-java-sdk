// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ChargeFlowRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemCode")
    public String itemCode;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("UId")
    public Long UId;

    public static ChargeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ChargeFlowRequest self = new ChargeFlowRequest();
        return TeaModel.build(map, self);
    }

    public ChargeFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChargeFlowRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public ChargeFlowRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ChargeFlowRequest setUId(Long UId) {
        this.UId = UId;
        return this;
    }
    public Long getUId() {
        return this.UId;
    }

}
