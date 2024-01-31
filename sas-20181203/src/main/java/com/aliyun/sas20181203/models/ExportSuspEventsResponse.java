// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportSuspEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ExportSuspEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportSuspEventsResponse setBody(ExportSuspEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSuspEventsResponseBody getBody() {
        return this.body;
    }

}
