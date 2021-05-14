// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSimilarSecurityEventsQueryTaskResponse setBody(CreateSimilarSecurityEventsQueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimilarSecurityEventsQueryTaskResponseBody getBody() {
        return this.body;
    }

}
