// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSimilarSecurityEventsQueryTaskResponseBody body;

    public static CreateSimilarSecurityEventsQueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarSecurityEventsQueryTaskResponse self = new CreateSimilarSecurityEventsQueryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimilarSecurityEventsQueryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimilarSecurityEventsQueryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimilarSecurityEventsQueryTaskResponse setBody(CreateSimilarSecurityEventsQueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimilarSecurityEventsQueryTaskResponseBody getBody() {
        return this.body;
    }

}
