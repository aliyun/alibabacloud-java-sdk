// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParameterGroupResponseBody body;

    public static DeleteParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterGroupResponse self = new DeleteParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParameterGroupResponse setBody(DeleteParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParameterGroupResponseBody getBody() {
        return this.body;
    }

}
