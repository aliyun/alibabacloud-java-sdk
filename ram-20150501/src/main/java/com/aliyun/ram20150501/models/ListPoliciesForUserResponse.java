// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPoliciesForUserResponseBody body;

    public static ListPoliciesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForUserResponse self = new ListPoliciesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesForUserResponse setBody(ListPoliciesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesForUserResponseBody getBody() {
        return this.body;
    }

}
