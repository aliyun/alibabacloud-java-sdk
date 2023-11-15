// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class OperateProduceRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtMap")
    public String extMap;

    @NameInMap("OperateType")
    public String operateType;

    public static OperateProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceRequest self = new OperateProduceRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceRequest setExtMap(String extMap) {
        this.extMap = extMap;
        return this;
    }
    public String getExtMap() {
        return this.extMap;
    }

    public OperateProduceRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
