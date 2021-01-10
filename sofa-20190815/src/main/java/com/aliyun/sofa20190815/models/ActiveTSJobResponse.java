// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ActiveTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveTSJobResponseBody body;

    public static ActiveTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveTSJobResponse self = new ActiveTSJobResponse();
        return TeaModel.build(map, self);
    }

    public ActiveTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveTSJobResponse setBody(ActiveTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveTSJobResponseBody getBody() {
        return this.body;
    }

}
