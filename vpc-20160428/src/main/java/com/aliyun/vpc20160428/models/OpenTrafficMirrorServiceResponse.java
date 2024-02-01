// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenTrafficMirrorServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenTrafficMirrorServiceResponseBody body;

    public static OpenTrafficMirrorServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenTrafficMirrorServiceResponse self = new OpenTrafficMirrorServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenTrafficMirrorServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenTrafficMirrorServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenTrafficMirrorServiceResponse setBody(OpenTrafficMirrorServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenTrafficMirrorServiceResponseBody getBody() {
        return this.body;
    }

}
