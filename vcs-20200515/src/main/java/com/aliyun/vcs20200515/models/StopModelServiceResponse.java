// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopModelServiceResponseBody body;

    public static StopModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopModelServiceResponse self = new StopModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public StopModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopModelServiceResponse setBody(StopModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopModelServiceResponseBody getBody() {
        return this.body;
    }

}
