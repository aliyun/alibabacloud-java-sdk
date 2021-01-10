// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportHasInspectSingledayreportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportHasInspectSingledayreportResponseBody body;

    public static ExportHasInspectSingledayreportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportHasInspectSingledayreportResponse self = new ExportHasInspectSingledayreportResponse();
        return TeaModel.build(map, self);
    }

    public ExportHasInspectSingledayreportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportHasInspectSingledayreportResponse setBody(ExportHasInspectSingledayreportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportHasInspectSingledayreportResponseBody getBody() {
        return this.body;
    }

}
