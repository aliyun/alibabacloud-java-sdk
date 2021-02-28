// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchUpdateScdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUpdateScdnDomainResponseBody body;

    public static BatchUpdateScdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateScdnDomainResponse self = new BatchUpdateScdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateScdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateScdnDomainResponse setBody(BatchUpdateScdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateScdnDomainResponseBody getBody() {
        return this.body;
    }

}
