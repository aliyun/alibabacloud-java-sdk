// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportTemplateEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportTemplateEventResponseBody body;

    public static ImportTemplateEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportTemplateEventResponse self = new ImportTemplateEventResponse();
        return TeaModel.build(map, self);
    }

    public ImportTemplateEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportTemplateEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportTemplateEventResponse setBody(ImportTemplateEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportTemplateEventResponseBody getBody() {
        return this.body;
    }

}
