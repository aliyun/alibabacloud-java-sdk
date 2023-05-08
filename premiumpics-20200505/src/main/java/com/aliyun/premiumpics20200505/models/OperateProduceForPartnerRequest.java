// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class OperateProduceForPartnerRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <p>OperateType</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    public static OperateProduceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForPartnerRequest self = new OperateProduceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceForPartnerRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public OperateProduceForPartnerRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
