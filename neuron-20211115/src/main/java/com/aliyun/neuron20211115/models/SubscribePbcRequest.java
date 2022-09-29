// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SubscribePbcRequest extends TeaModel {
    @NameInMap("body")
    public PbcSubscribe body;

    public static SubscribePbcRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribePbcRequest self = new SubscribePbcRequest();
        return TeaModel.build(map, self);
    }

    public SubscribePbcRequest setBody(PbcSubscribe body) {
        this.body = body;
        return this;
    }
    public PbcSubscribe getBody() {
        return this.body;
    }

}
