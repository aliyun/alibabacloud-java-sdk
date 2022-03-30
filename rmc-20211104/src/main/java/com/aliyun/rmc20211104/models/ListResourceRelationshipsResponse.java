// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceRelationshipsResponseBody body;

    public static ListResourceRelationshipsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipsResponse self = new ListResourceRelationshipsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceRelationshipsResponse setBody(ListResourceRelationshipsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceRelationshipsResponseBody getBody() {
        return this.body;
    }

}
