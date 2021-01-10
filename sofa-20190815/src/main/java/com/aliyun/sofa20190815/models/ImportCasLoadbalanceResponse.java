// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportCasLoadbalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportCasLoadbalanceResponseBody body;

    public static ImportCasLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCasLoadbalanceResponse self = new ImportCasLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public ImportCasLoadbalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCasLoadbalanceResponse setBody(ImportCasLoadbalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCasLoadbalanceResponseBody getBody() {
        return this.body;
    }

}
