// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransformInstanceChargeTypeResponseBody body;

    public static TransformInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformInstanceChargeTypeResponse self = new TransformInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public TransformInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformInstanceChargeTypeResponse setBody(TransformInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
