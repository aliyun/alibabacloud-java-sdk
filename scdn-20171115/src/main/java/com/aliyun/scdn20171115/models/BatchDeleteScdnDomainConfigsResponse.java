// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchDeleteScdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteScdnDomainConfigsResponseBody body;

    public static BatchDeleteScdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteScdnDomainConfigsResponse self = new BatchDeleteScdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteScdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteScdnDomainConfigsResponse setBody(BatchDeleteScdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteScdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
