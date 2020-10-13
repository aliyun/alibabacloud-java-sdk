// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropTableResponseBody body;

    public static DropTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DropTableResponse self = new DropTableResponse();
        return TeaModel.build(map, self);
    }

    public DropTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropTableResponse setBody(DropTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DropTableResponseBody getBody() {
        return this.body;
    }

}
