// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtMap")
    public String extMap;

    public static UpdateProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceRequest self = new UpdateProduceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProduceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateProduceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateProduceRequest setExtMap(String extMap) {
        this.extMap = extMap;
        return this;
    }
    public String getExtMap() {
        return this.extMap;
    }

}
