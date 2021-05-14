// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportRecordResponseBody body;

    public static ExportRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRecordResponse self = new ExportRecordResponse();
        return TeaModel.build(map, self);
    }

    public ExportRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRecordResponse setBody(ExportRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRecordResponseBody getBody() {
        return this.body;
    }

}
