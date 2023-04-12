// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AssociateMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateMembersResponseBody body;

    public static AssociateMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateMembersResponse self = new AssociateMembersResponse();
        return TeaModel.build(map, self);
    }

    public AssociateMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateMembersResponse setBody(AssociateMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateMembersResponseBody getBody() {
        return this.body;
    }

}
