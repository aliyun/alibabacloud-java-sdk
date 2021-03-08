// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppPoliciesForIdentityResponseBody body;

    public static ListAppPoliciesForIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPoliciesForIdentityResponse self = new ListAppPoliciesForIdentityResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPoliciesForIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPoliciesForIdentityResponse setBody(ListAppPoliciesForIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPoliciesForIdentityResponseBody getBody() {
        return this.body;
    }

}
