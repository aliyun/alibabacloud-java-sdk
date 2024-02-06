// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<java.util.Map<String, String>> body;

    public static GetProjectLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectLogsResponse self = new GetProjectLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectLogsResponse setBody(java.util.List<java.util.Map<String, String>> body) {
        this.body = body;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getBody() {
        return this.body;
    }

}
