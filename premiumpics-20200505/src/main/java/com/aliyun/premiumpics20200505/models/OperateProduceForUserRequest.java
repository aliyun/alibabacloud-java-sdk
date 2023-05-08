// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class OperateProduceForUserRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OperateType")
    public String operateType;

    public static OperateProduceForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForUserRequest self = new OperateProduceForUserRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceForUserRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceForUserRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceForUserRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public OperateProduceForUserRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
