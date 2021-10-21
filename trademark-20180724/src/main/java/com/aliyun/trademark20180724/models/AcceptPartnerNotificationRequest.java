// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class AcceptPartnerNotificationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("Material")
    public String material;

    @NameInMap("Remark")
    public String remark;

    public static AcceptPartnerNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptPartnerNotificationRequest self = new AcceptPartnerNotificationRequest();
        return TeaModel.build(map, self);
    }

    public AcceptPartnerNotificationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AcceptPartnerNotificationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AcceptPartnerNotificationRequest setMaterial(String material) {
        this.material = material;
        return this;
    }
    public String getMaterial() {
        return this.material;
    }

    public AcceptPartnerNotificationRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
