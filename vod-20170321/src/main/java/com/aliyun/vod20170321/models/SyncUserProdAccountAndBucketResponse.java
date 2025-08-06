// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SyncUserProdAccountAndBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncUserProdAccountAndBucketResponseBody body;

    public static SyncUserProdAccountAndBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncUserProdAccountAndBucketResponse self = new SyncUserProdAccountAndBucketResponse();
        return TeaModel.build(map, self);
    }

    public SyncUserProdAccountAndBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncUserProdAccountAndBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncUserProdAccountAndBucketResponse setBody(SyncUserProdAccountAndBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncUserProdAccountAndBucketResponseBody getBody() {
        return this.body;
    }

}
