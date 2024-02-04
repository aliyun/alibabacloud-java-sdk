// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class RejectResourceShareInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectResourceShareInvitationResponseBody body;

    public static RejectResourceShareInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectResourceShareInvitationResponse self = new RejectResourceShareInvitationResponse();
        return TeaModel.build(map, self);
    }

    public RejectResourceShareInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectResourceShareInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectResourceShareInvitationResponse setBody(RejectResourceShareInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectResourceShareInvitationResponseBody getBody() {
        return this.body;
    }

}
