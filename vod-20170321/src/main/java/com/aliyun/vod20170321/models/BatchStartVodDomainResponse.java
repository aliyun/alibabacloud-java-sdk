// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStartVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStartVodDomainResponseBody body;

    public static BatchStartVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartVodDomainResponse self = new BatchStartVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartVodDomainResponse setBody(BatchStartVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartVodDomainResponseBody getBody() {
        return this.body;
    }

}
