// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDynamicTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDynamicTagResponseBody body;

    public static ListDynamicTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicTagResponse self = new ListDynamicTagResponse();
        return TeaModel.build(map, self);
    }

    public ListDynamicTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDynamicTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDynamicTagResponse setBody(ListDynamicTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDynamicTagResponseBody getBody() {
        return this.body;
    }

}
