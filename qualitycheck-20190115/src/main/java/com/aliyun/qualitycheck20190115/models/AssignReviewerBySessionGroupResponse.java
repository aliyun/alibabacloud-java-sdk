// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerBySessionGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignReviewerBySessionGroupResponseBody body;

    public static AssignReviewerBySessionGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerBySessionGroupResponse self = new AssignReviewerBySessionGroupResponse();
        return TeaModel.build(map, self);
    }

    public AssignReviewerBySessionGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignReviewerBySessionGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignReviewerBySessionGroupResponse setBody(AssignReviewerBySessionGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignReviewerBySessionGroupResponseBody getBody() {
        return this.body;
    }

}
