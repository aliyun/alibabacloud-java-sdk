// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobDataParsingTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateJobDataParsingTaskResponseBody body;

    public static CreateJobDataParsingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobDataParsingTaskResponse self = new CreateJobDataParsingTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobDataParsingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobDataParsingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobDataParsingTaskResponse setBody(CreateJobDataParsingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobDataParsingTaskResponseBody getBody() {
        return this.body;
    }

}
