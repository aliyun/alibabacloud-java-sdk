// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class CheckRefundRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static CheckRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRefundRequest self = new CheckRefundRequest();
        return TeaModel.build(map, self);
    }

    public CheckRefundRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
