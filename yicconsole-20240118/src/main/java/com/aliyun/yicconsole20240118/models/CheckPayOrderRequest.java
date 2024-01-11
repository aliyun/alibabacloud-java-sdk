// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class CheckPayOrderRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static CheckPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPayOrderRequest self = new CheckPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public CheckPayOrderRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
