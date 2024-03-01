// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ExportAnnotationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportAnnotationsResponseBody body;

    public static ExportAnnotationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportAnnotationsResponse self = new ExportAnnotationsResponse();
        return TeaModel.build(map, self);
    }

    public ExportAnnotationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportAnnotationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportAnnotationsResponse setBody(ExportAnnotationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportAnnotationsResponseBody getBody() {
        return this.body;
    }

}
