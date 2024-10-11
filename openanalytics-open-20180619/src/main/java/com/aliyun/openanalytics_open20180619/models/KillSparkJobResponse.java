// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class KillSparkJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillSparkJobResponseBody body;

    public static KillSparkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        KillSparkJobResponse self = new KillSparkJobResponse();
        return TeaModel.build(map, self);
    }

    public KillSparkJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillSparkJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillSparkJobResponse setBody(KillSparkJobResponseBody body) {
        this.body = body;
        return this;
    }
    public KillSparkJobResponseBody getBody() {
        return this.body;
    }

}
