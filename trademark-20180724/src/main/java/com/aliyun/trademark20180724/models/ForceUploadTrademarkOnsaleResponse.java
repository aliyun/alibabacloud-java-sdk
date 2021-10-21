// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ForceUploadTrademarkOnsaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ForceUploadTrademarkOnsaleResponseBody body;

    public static ForceUploadTrademarkOnsaleResponse build(java.util.Map<String, ?> map) throws Exception {
        ForceUploadTrademarkOnsaleResponse self = new ForceUploadTrademarkOnsaleResponse();
        return TeaModel.build(map, self);
    }

    public ForceUploadTrademarkOnsaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForceUploadTrademarkOnsaleResponse setBody(ForceUploadTrademarkOnsaleResponseBody body) {
        this.body = body;
        return this;
    }
    public ForceUploadTrademarkOnsaleResponseBody getBody() {
        return this.body;
    }

}
