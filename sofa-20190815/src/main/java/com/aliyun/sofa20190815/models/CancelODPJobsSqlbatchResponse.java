// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelODPJobsSqlbatchResponseBody body;

    public static CancelODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelODPJobsSqlbatchResponse self = new CancelODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public CancelODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelODPJobsSqlbatchResponse setBody(CancelODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
