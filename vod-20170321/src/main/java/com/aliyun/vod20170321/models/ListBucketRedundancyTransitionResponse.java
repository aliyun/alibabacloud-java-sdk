// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListBucketRedundancyTransitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBucketRedundancyTransitionResponseBody body;

    public static ListBucketRedundancyTransitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBucketRedundancyTransitionResponse self = new ListBucketRedundancyTransitionResponse();
        return TeaModel.build(map, self);
    }

    public ListBucketRedundancyTransitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBucketRedundancyTransitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBucketRedundancyTransitionResponse setBody(ListBucketRedundancyTransitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBucketRedundancyTransitionResponseBody getBody() {
        return this.body;
    }

}
