// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPoliciesForGroupResponseBody body;

    public static ListPoliciesForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupResponse self = new ListPoliciesForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesForGroupResponse setBody(ListPoliciesForGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesForGroupResponseBody getBody() {
        return this.body;
    }

}
