// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PullLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogGroupList body;

    public static PullLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        PullLogsResponse self = new PullLogsResponse();
        return TeaModel.build(map, self);
    }

    public PullLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PullLogsResponse setBody(LogGroupList body) {
        this.body = body;
        return this;
    }
    public LogGroupList getBody() {
        return this.body;
    }

}
