// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteLakebaseMountParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLakebaseMountParameterGroupResponseBody body;

    public static DeleteLakebaseMountParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakebaseMountParameterGroupResponse self = new DeleteLakebaseMountParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLakebaseMountParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLakebaseMountParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLakebaseMountParameterGroupResponse setBody(DeleteLakebaseMountParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLakebaseMountParameterGroupResponseBody getBody() {
        return this.body;
    }

}
