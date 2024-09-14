// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSessionClusterResponseBody body;

    public static UpdateSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionClusterResponse self = new UpdateSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSessionClusterResponse setBody(UpdateSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSessionClusterResponseBody getBody() {
        return this.body;
    }

}
