// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseMountParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLakebaseMountParameterGroupResponseBody body;

    public static CreateLakebaseMountParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseMountParameterGroupResponse self = new CreateLakebaseMountParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseMountParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLakebaseMountParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLakebaseMountParameterGroupResponse setBody(CreateLakebaseMountParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLakebaseMountParameterGroupResponseBody getBody() {
        return this.body;
    }

}
