// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ImportSpecialPersonnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportSpecialPersonnelResponseBody body;

    public static ImportSpecialPersonnelResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportSpecialPersonnelResponse self = new ImportSpecialPersonnelResponse();
        return TeaModel.build(map, self);
    }

    public ImportSpecialPersonnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportSpecialPersonnelResponse setBody(ImportSpecialPersonnelResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportSpecialPersonnelResponseBody getBody() {
        return this.body;
    }

}
