// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakebaseMountParameterGroupsResponseBody body;

    public static DescribeLakebaseMountParameterGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupsResponse self = new DescribeLakebaseMountParameterGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakebaseMountParameterGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakebaseMountParameterGroupsResponse setBody(DescribeLakebaseMountParameterGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakebaseMountParameterGroupsResponseBody getBody() {
        return this.body;
    }

}
