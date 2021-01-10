// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportDSTSlsTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDSTSlsTokenResponseBody body;

    public static ImportDSTSlsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDSTSlsTokenResponse self = new ImportDSTSlsTokenResponse();
        return TeaModel.build(map, self);
    }

    public ImportDSTSlsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDSTSlsTokenResponse setBody(ImportDSTSlsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDSTSlsTokenResponseBody getBody() {
        return this.body;
    }

}
