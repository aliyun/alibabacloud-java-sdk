// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktImportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktImportResponseBody body;

    public static ExecLinkeLinktImportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktImportResponse self = new ExecLinkeLinktImportResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktImportResponse setBody(ExecLinkeLinktImportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktImportResponseBody getBody() {
        return this.body;
    }

}
