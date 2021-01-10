// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPDbnodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPDbnodesResponseBody body;

    public static BatchqueryODPDbnodesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPDbnodesResponse self = new BatchqueryODPDbnodesResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPDbnodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPDbnodesResponse setBody(BatchqueryODPDbnodesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPDbnodesResponseBody getBody() {
        return this.body;
    }

}
