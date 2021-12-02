// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListSlbAPsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlbAPsResponseBody body;

    public static ListSlbAPsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlbAPsResponse self = new ListSlbAPsResponse();
        return TeaModel.build(map, self);
    }

    public ListSlbAPsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlbAPsResponse setBody(ListSlbAPsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlbAPsResponseBody getBody() {
        return this.body;
    }

}
