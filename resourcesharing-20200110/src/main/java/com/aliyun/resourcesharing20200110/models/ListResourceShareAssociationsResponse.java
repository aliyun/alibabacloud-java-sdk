// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListResourceShareAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceShareAssociationsResponse setBody(ListResourceShareAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceShareAssociationsResponseBody getBody() {
        return this.body;
    }

}
