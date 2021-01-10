// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class HandleComplaintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HandleComplaintResponseBody body;

    public static HandleComplaintResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleComplaintResponse self = new HandleComplaintResponse();
        return TeaModel.build(map, self);
    }

    public HandleComplaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleComplaintResponse setBody(HandleComplaintResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleComplaintResponseBody getBody() {
        return this.body;
    }

}
