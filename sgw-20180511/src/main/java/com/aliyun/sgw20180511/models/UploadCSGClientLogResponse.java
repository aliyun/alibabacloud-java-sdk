// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UploadCSGClientLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadCSGClientLogResponseBody body;

    public static UploadCSGClientLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCSGClientLogResponse self = new UploadCSGClientLogResponse();
        return TeaModel.build(map, self);
    }

    public UploadCSGClientLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCSGClientLogResponse setBody(UploadCSGClientLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCSGClientLogResponseBody getBody() {
        return this.body;
    }

}
