// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupChangeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakebaseMountParameterGroupChangeLogsResponseBody body;

    public static DescribeLakebaseMountParameterGroupChangeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupChangeLogsResponse self = new DescribeLakebaseMountParameterGroupChangeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupChangeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakebaseMountParameterGroupChangeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakebaseMountParameterGroupChangeLogsResponse setBody(DescribeLakebaseMountParameterGroupChangeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakebaseMountParameterGroupChangeLogsResponseBody getBody() {
        return this.body;
    }

}
