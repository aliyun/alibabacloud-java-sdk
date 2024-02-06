// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<java.util.Map<String, ?>> body;

    public static GetLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogsResponse self = new GetLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogsResponse setBody(java.util.List<java.util.Map<String, ?>> body) {
        this.body = body;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getBody() {
        return this.body;
    }

}
