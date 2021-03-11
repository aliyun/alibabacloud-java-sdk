// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OpenVsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenVsServiceResponseBody body;

    public static OpenVsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenVsServiceResponse self = new OpenVsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenVsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenVsServiceResponse setBody(OpenVsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenVsServiceResponseBody getBody() {
        return this.body;
    }

}
