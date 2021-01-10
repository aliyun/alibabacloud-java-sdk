// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDTXAppNamesResponseBody body;

    public static ListDTXAppNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppNamesResponse self = new ListDTXAppNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListDTXAppNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDTXAppNamesResponse setBody(ListDTXAppNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDTXAppNamesResponseBody getBody() {
        return this.body;
    }

}
