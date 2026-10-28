// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSessionResponseBody body;

    public static UpdateSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionResponse self = new UpdateSessionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSessionResponse setBody(UpdateSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSessionResponseBody getBody() {
        return this.body;
    }

}
