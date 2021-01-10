// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeLsifdefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeantcodeAntcodeLsifdefinitionResponseBody body;

    public static ListLinkeantcodeAntcodeLsifdefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeLsifdefinitionResponse self = new ListLinkeantcodeAntcodeLsifdefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeLsifdefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeantcodeAntcodeLsifdefinitionResponse setBody(ListLinkeantcodeAntcodeLsifdefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeantcodeAntcodeLsifdefinitionResponseBody getBody() {
        return this.body;
    }

}
