// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchSetScdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetScdnDomainConfigsResponseBody body;

    public static BatchSetScdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetScdnDomainConfigsResponse self = new BatchSetScdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetScdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetScdnDomainConfigsResponse setBody(BatchSetScdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetScdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
