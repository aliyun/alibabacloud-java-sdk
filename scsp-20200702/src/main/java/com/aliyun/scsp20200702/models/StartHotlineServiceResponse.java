// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartHotlineServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartHotlineServiceResponseBody body;

    public static StartHotlineServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineServiceResponse self = new StartHotlineServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartHotlineServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartHotlineServiceResponse setBody(StartHotlineServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartHotlineServiceResponseBody getBody() {
        return this.body;
    }

}
