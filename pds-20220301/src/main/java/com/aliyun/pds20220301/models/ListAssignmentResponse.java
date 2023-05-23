// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssignmentResponseBody body;

    public static ListAssignmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssignmentResponse self = new ListAssignmentResponse();
        return TeaModel.build(map, self);
    }

    public ListAssignmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssignmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssignmentResponse setBody(ListAssignmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssignmentResponseBody getBody() {
        return this.body;
    }

}
