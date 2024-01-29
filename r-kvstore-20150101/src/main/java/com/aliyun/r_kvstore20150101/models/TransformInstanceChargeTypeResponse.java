// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TransformInstanceChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformInstanceChargeTypeResponse setBody(TransformInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
