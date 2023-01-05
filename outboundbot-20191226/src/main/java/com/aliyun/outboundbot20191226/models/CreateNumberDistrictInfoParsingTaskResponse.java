// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberDistrictInfoParsingTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNumberDistrictInfoParsingTaskResponseBody body;

    public static CreateNumberDistrictInfoParsingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberDistrictInfoParsingTaskResponse self = new CreateNumberDistrictInfoParsingTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateNumberDistrictInfoParsingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNumberDistrictInfoParsingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNumberDistrictInfoParsingTaskResponse setBody(CreateNumberDistrictInfoParsingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNumberDistrictInfoParsingTaskResponseBody getBody() {
        return this.body;
    }

}
