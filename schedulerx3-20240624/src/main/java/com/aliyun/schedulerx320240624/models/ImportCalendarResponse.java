// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportCalendarResponseBody body;

    public static ImportCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCalendarResponse self = new ImportCalendarResponse();
        return TeaModel.build(map, self);
    }

    public ImportCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportCalendarResponse setBody(ImportCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCalendarResponseBody getBody() {
        return this.body;
    }

}
