// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class RefundRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static RefundRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundRequest self = new RefundRequest();
        return TeaModel.build(map, self);
    }

    public RefundRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
