// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResolveLinkeLinktImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResolveLinkeLinktImportResponseBody body;

    public static ResolveLinkeLinktImportResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveLinkeLinktImportResponse self = new ResolveLinkeLinktImportResponse();
        return TeaModel.build(map, self);
    }

    public ResolveLinkeLinktImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveLinkeLinktImportResponse setBody(ResolveLinkeLinktImportResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveLinkeLinktImportResponseBody getBody() {
        return this.body;
    }

}
