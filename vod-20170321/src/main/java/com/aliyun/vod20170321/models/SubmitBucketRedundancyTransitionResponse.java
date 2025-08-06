// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitBucketRedundancyTransitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBucketRedundancyTransitionResponseBody body;

    public static SubmitBucketRedundancyTransitionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBucketRedundancyTransitionResponse self = new SubmitBucketRedundancyTransitionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBucketRedundancyTransitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBucketRedundancyTransitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBucketRedundancyTransitionResponse setBody(SubmitBucketRedundancyTransitionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBucketRedundancyTransitionResponseBody getBody() {
        return this.body;
    }

}
