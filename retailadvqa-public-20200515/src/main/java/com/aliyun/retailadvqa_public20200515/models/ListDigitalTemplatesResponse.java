// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListDigitalTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDigitalTemplatesResponseBody body;

    public static ListDigitalTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalTemplatesResponse self = new ListDigitalTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDigitalTemplatesResponse setBody(ListDigitalTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDigitalTemplatesResponseBody getBody() {
        return this.body;
    }

}
