// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ListTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagsResponseBody body;

    public static ListTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponse self = new ListTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagsResponse setBody(ListTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsResponseBody getBody() {
        return this.body;
    }

}
