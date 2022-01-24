// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceShareAssociationsResponseBody body;

    public static ListResourceShareAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareAssociationsResponse self = new ListResourceShareAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceShareAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceShareAssociationsResponse setBody(ListResourceShareAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceShareAssociationsResponseBody getBody() {
        return this.body;
    }

}
