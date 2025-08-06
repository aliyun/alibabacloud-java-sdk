// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelBucketRedundancyTransitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelBucketRedundancyTransitionResponseBody body;

    public static CancelBucketRedundancyTransitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBucketRedundancyTransitionResponse self = new CancelBucketRedundancyTransitionResponse();
        return TeaModel.build(map, self);
    }

    public CancelBucketRedundancyTransitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelBucketRedundancyTransitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelBucketRedundancyTransitionResponse setBody(CancelBucketRedundancyTransitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelBucketRedundancyTransitionResponseBody getBody() {
        return this.body;
    }

}
