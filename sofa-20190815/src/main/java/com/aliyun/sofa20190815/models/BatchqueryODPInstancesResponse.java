// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPInstancesResponseBody body;

    public static BatchqueryODPInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesResponse self = new BatchqueryODPInstancesResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPInstancesResponse setBody(BatchqueryODPInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPInstancesResponseBody getBody() {
        return this.body;
    }

}
