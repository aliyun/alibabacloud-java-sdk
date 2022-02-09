// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaDownloadCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmaDownloadCollectorResponseBody body;

    public static OmaDownloadCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        OmaDownloadCollectorResponse self = new OmaDownloadCollectorResponse();
        return TeaModel.build(map, self);
    }

    public OmaDownloadCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmaDownloadCollectorResponse setBody(OmaDownloadCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public OmaDownloadCollectorResponseBody getBody() {
        return this.body;
    }

}
