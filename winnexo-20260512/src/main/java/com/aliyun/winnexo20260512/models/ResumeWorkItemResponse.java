// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResumeWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeWorkItemResponseBody body;

    public static ResumeWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeWorkItemResponse self = new ResumeWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public ResumeWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeWorkItemResponse setBody(ResumeWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeWorkItemResponseBody getBody() {
        return this.body;
    }

}
