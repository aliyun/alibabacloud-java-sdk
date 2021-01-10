// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeLinktSimpleprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryLinkeLinktSimpleprojectsResponseBody body;

    public static BatchqueryLinkeLinktSimpleprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeLinktSimpleprojectsResponse self = new BatchqueryLinkeLinktSimpleprojectsResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeLinktSimpleprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponse setBody(BatchqueryLinkeLinktSimpleprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryLinkeLinktSimpleprojectsResponseBody getBody() {
        return this.body;
    }

}
