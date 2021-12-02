// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenTrafficMirrorServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenTrafficMirrorServiceResponse setBody(OpenTrafficMirrorServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenTrafficMirrorServiceResponseBody getBody() {
        return this.body;
    }

}
