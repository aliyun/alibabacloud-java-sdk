// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetNotaryOrderRequest extends TeaModel {
    @NameInMap("NotaryOrderId")
    public Long notaryOrderId;

    public static GetNotaryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryOrderRequest self = new GetNotaryOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetNotaryOrderRequest setNotaryOrderId(Long notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public Long getNotaryOrderId() {
        return this.notaryOrderId;
    }

}
