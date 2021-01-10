// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportLinkeLinktWorkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportLinkeLinktWorkitemResponseBody body;

    public static ExportLinkeLinktWorkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportLinkeLinktWorkitemResponse self = new ExportLinkeLinktWorkitemResponse();
        return TeaModel.build(map, self);
    }

    public ExportLinkeLinktWorkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportLinkeLinktWorkitemResponse setBody(ExportLinkeLinktWorkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportLinkeLinktWorkitemResponseBody getBody() {
        return this.body;
    }

}
