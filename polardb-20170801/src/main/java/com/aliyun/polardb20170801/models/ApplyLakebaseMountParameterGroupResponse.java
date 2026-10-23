// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApplyLakebaseMountParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyLakebaseMountParameterGroupResponseBody body;

    public static ApplyLakebaseMountParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyLakebaseMountParameterGroupResponse self = new ApplyLakebaseMountParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public ApplyLakebaseMountParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyLakebaseMountParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyLakebaseMountParameterGroupResponse setBody(ApplyLakebaseMountParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyLakebaseMountParameterGroupResponseBody getBody() {
        return this.body;
    }

}
