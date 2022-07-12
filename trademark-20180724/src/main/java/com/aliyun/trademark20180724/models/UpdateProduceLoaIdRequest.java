// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceLoaIdRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LoaOssKey")
    public String loaOssKey;

    public static UpdateProduceLoaIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceLoaIdRequest self = new UpdateProduceLoaIdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProduceLoaIdRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateProduceLoaIdRequest setLoaOssKey(String loaOssKey) {
        this.loaOssKey = loaOssKey;
        return this;
    }
    public String getLoaOssKey() {
        return this.loaOssKey;
    }

}
