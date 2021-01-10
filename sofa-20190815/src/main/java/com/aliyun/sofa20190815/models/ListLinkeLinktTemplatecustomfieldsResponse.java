// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktTemplatecustomfieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktTemplatecustomfieldsResponseBody body;

    public static ListLinkeLinktTemplatecustomfieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktTemplatecustomfieldsResponse self = new ListLinkeLinktTemplatecustomfieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktTemplatecustomfieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktTemplatecustomfieldsResponse setBody(ListLinkeLinktTemplatecustomfieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktTemplatecustomfieldsResponseBody getBody() {
        return this.body;
    }

}
