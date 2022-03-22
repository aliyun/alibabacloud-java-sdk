// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchStartScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStartScdnDomainResponseBody body;

    public static BatchStartScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartScdnDomainResponse self = new BatchStartScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartScdnDomainResponse setBody(BatchStartScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartScdnDomainResponseBody getBody() {
        return this.body;
    }

}
