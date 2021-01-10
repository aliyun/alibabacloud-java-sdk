// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjecttemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktProjecttemplatesResponseBody body;

    public static ListLinkeLinktProjecttemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjecttemplatesResponse self = new ListLinkeLinktProjecttemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjecttemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktProjecttemplatesResponse setBody(ListLinkeLinktProjecttemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktProjecttemplatesResponseBody getBody() {
        return this.body;
    }

}
