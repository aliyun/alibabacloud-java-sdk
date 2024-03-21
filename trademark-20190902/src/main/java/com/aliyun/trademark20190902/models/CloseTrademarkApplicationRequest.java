// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CloseTrademarkApplicationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static CloseTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTrademarkApplicationRequest self = new CloseTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CloseTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
