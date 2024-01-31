// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateParameterGroupResponseBody body;

    public static CreateParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupResponse self = new CreateParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParameterGroupResponse setBody(CreateParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParameterGroupResponseBody getBody() {
        return this.body;
    }

}
