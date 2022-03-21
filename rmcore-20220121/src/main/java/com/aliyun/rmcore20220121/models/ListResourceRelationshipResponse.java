// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class ListResourceRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceRelationshipResponseBody body;

    public static ListResourceRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRelationshipResponse self = new ListResourceRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceRelationshipResponse setBody(ListResourceRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceRelationshipResponseBody getBody() {
        return this.body;
    }

}
