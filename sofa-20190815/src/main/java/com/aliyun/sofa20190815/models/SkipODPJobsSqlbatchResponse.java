// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipODPJobsSqlbatchResponseBody body;

    public static SkipODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipODPJobsSqlbatchResponse self = new SkipODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public SkipODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipODPJobsSqlbatchResponse setBody(SkipODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
