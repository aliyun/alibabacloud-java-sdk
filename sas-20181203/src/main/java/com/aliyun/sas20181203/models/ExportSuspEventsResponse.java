// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportSuspEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportSuspEventsResponseBody body;

    public static ExportSuspEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSuspEventsResponse self = new ExportSuspEventsResponse();
        return TeaModel.build(map, self);
    }

    public ExportSuspEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportSuspEventsResponse setBody(ExportSuspEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSuspEventsResponseBody getBody() {
        return this.body;
    }

}
