// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateSendMaterialNumRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Num")
    public String num;

    @NameInMap("OperateType")
    public Integer operateType;

    public static UpdateSendMaterialNumRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSendMaterialNumRequest self = new UpdateSendMaterialNumRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSendMaterialNumRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateSendMaterialNumRequest setNum(String num) {
        this.num = num;
        return this;
    }
    public String getNum() {
        return this.num;
    }

    public UpdateSendMaterialNumRequest setOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }
    public Integer getOperateType() {
        return this.operateType;
    }

}
