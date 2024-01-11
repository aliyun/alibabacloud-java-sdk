// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class BillingProcessMessageRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static BillingProcessMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingProcessMessageRequest self = new BillingProcessMessageRequest();
        return TeaModel.build(map, self);
    }

    public BillingProcessMessageRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
