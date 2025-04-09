// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJobGroupResponseBody body;

    public static CreateJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobGroupResponse self = new CreateJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobGroupResponse setBody(CreateJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobGroupResponseBody getBody() {
        return this.body;
    }

}
