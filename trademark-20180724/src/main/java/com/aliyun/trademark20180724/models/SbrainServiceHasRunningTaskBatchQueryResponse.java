// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbrainServiceHasRunningTaskBatchQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SbrainServiceHasRunningTaskBatchQueryResponseBody body;

    public static SbrainServiceHasRunningTaskBatchQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SbrainServiceHasRunningTaskBatchQueryResponse self = new SbrainServiceHasRunningTaskBatchQueryResponse();
        return TeaModel.build(map, self);
    }

    public SbrainServiceHasRunningTaskBatchQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SbrainServiceHasRunningTaskBatchQueryResponse setBody(SbrainServiceHasRunningTaskBatchQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SbrainServiceHasRunningTaskBatchQueryResponseBody getBody() {
        return this.body;
    }

}
