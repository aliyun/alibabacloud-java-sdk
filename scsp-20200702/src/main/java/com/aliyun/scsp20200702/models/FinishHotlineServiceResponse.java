// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class FinishHotlineServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishHotlineServiceResponseBody body;

    public static FinishHotlineServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishHotlineServiceResponse self = new FinishHotlineServiceResponse();
        return TeaModel.build(map, self);
    }

    public FinishHotlineServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishHotlineServiceResponse setBody(FinishHotlineServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishHotlineServiceResponseBody getBody() {
        return this.body;
    }

}
