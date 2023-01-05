// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListResourceTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceTagsResponseBody body;

    public static ListResourceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsResponse self = new ListResourceTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceTagsResponse setBody(ListResourceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceTagsResponseBody getBody() {
        return this.body;
    }

}
