// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListControlPoliciesResponseBody body;

    public static ListControlPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListControlPoliciesResponse self = new ListControlPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListControlPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListControlPoliciesResponse setBody(ListControlPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListControlPoliciesResponseBody getBody() {
        return this.body;
    }

}
