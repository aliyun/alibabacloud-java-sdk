// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class XixiServicerMockServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XixiServicerMockServiceResponseBody body;

    public static XixiServicerMockServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XixiServicerMockServiceResponse self = new XixiServicerMockServiceResponse();
        return TeaModel.build(map, self);
    }

    public XixiServicerMockServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XixiServicerMockServiceResponse setBody(XixiServicerMockServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XixiServicerMockServiceResponseBody getBody() {
        return this.body;
    }

}
