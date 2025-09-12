// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ValidateKnowLedgeRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<String> body;

    public static ValidateKnowLedgeRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateKnowLedgeRequest self = new ValidateKnowLedgeRequest();
        return TeaModel.build(map, self);
    }

    public ValidateKnowLedgeRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

}
