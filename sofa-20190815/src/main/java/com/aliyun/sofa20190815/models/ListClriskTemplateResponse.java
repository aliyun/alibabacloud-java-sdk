// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskTemplateResponseBody body;

    public static ListClriskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateResponse self = new ListClriskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskTemplateResponse setBody(ListClriskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskTemplateResponseBody getBody() {
        return this.body;
    }

}
