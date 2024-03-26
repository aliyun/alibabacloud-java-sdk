// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStopVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStopVodDomainResponseBody body;

    public static BatchStopVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopVodDomainResponse self = new BatchStopVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopVodDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStopVodDomainResponse setBody(BatchStopVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopVodDomainResponseBody getBody() {
        return this.body;
    }

}
