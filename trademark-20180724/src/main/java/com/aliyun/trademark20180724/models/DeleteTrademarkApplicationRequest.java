// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteTrademarkApplicationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static DeleteTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrademarkApplicationRequest self = new DeleteTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
