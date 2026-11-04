// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakebaseMountParameterGroupResponseBody body;

    public static DescribeLakebaseMountParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupResponse self = new DescribeLakebaseMountParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakebaseMountParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakebaseMountParameterGroupResponse setBody(DescribeLakebaseMountParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakebaseMountParameterGroupResponseBody getBody() {
        return this.body;
    }

}
