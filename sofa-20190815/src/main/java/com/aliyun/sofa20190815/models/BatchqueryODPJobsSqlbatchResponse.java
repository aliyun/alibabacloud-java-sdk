// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPJobsSqlbatchResponseBody body;

    public static BatchqueryODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPJobsSqlbatchResponse self = new BatchqueryODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPJobsSqlbatchResponse setBody(BatchqueryODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
