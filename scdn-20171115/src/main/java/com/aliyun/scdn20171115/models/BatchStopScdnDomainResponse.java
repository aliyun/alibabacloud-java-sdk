// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchStopScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopScdnDomainResponseBody body;

    public static BatchStopScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopScdnDomainResponse self = new BatchStopScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopScdnDomainResponse setBody(BatchStopScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopScdnDomainResponseBody getBody() {
        return this.body;
    }

}
