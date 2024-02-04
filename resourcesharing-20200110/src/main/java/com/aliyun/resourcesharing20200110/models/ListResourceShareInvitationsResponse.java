// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareInvitationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceShareInvitationsResponseBody body;

    public static ListResourceShareInvitationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareInvitationsResponse self = new ListResourceShareInvitationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceShareInvitationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceShareInvitationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceShareInvitationsResponse setBody(ListResourceShareInvitationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceShareInvitationsResponseBody getBody() {
        return this.body;
    }

}
