// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqCompleteCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSofamqCompleteCommodityResponseBody body;

    public static PushSofamqCompleteCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqCompleteCommodityResponse self = new PushSofamqCompleteCommodityResponse();
        return TeaModel.build(map, self);
    }

    public PushSofamqCompleteCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSofamqCompleteCommodityResponse setBody(PushSofamqCompleteCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSofamqCompleteCommodityResponseBody getBody() {
        return this.body;
    }

}
