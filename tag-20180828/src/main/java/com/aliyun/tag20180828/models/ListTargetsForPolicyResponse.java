// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTargetsForPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTargetsForPolicyResponseBody body;

    public static ListTargetsForPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTargetsForPolicyResponse self = new ListTargetsForPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListTargetsForPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTargetsForPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTargetsForPolicyResponse setBody(ListTargetsForPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTargetsForPolicyResponseBody getBody() {
        return this.body;
    }

}
