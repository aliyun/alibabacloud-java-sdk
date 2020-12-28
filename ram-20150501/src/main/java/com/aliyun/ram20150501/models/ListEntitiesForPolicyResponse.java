// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEntitiesForPolicyResponseBody body;

    public static ListEntitiesForPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesForPolicyResponse self = new ListEntitiesForPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesForPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesForPolicyResponse setBody(ListEntitiesForPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesForPolicyResponseBody getBody() {
        return this.body;
    }

}
