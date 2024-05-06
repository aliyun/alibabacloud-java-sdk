// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisassociateMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateMembersResponseBody body;

    public static DisassociateMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMembersResponse self = new DisassociateMembersResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateMembersResponse setBody(DisassociateMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateMembersResponseBody getBody() {
        return this.body;
    }

}
