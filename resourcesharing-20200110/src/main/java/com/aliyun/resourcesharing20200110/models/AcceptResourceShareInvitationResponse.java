// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AcceptResourceShareInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptResourceShareInvitationResponseBody body;

    public static AcceptResourceShareInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptResourceShareInvitationResponse self = new AcceptResourceShareInvitationResponse();
        return TeaModel.build(map, self);
    }

    public AcceptResourceShareInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptResourceShareInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptResourceShareInvitationResponse setBody(AcceptResourceShareInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptResourceShareInvitationResponseBody getBody() {
        return this.body;
    }

}
