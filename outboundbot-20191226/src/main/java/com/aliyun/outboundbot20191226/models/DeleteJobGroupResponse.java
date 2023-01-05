// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteJobGroupResponseBody body;

    public static DeleteJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobGroupResponse self = new DeleteJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobGroupResponse setBody(DeleteJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobGroupResponseBody getBody() {
        return this.body;
    }

}
