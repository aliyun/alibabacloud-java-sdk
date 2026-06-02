// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOrCreateInvitationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrCreateInvitationCodeResponseBody body;

    public static GetOrCreateInvitationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrCreateInvitationCodeResponse self = new GetOrCreateInvitationCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetOrCreateInvitationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrCreateInvitationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrCreateInvitationCodeResponse setBody(GetOrCreateInvitationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrCreateInvitationCodeResponseBody getBody() {
        return this.body;
    }

}
