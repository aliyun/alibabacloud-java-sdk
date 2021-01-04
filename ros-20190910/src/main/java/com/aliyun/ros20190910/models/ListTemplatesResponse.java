// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplatesResponseBody body;

    public static ListTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponse self = new ListTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplatesResponse setBody(ListTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplatesResponseBody getBody() {
        return this.body;
    }

}
