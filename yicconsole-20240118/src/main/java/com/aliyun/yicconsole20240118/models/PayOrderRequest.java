// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class PayOrderRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static PayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderRequest self = new PayOrderRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
