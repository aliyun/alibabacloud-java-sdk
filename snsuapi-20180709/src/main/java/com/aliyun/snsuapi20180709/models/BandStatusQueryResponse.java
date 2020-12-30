// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStatusQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BandStatusQueryResponseBody body;

    public static BandStatusQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        BandStatusQueryResponse self = new BandStatusQueryResponse();
        return TeaModel.build(map, self);
    }

    public BandStatusQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BandStatusQueryResponse setBody(BandStatusQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public BandStatusQueryResponseBody getBody() {
        return this.body;
    }

}
