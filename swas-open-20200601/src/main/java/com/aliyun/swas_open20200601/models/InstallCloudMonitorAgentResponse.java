// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallCloudMonitorAgentResponseBody body;

    public static InstallCloudMonitorAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudMonitorAgentResponse self = new InstallCloudMonitorAgentResponse();
        return TeaModel.build(map, self);
    }

    public InstallCloudMonitorAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCloudMonitorAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallCloudMonitorAgentResponse setBody(InstallCloudMonitorAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCloudMonitorAgentResponseBody getBody() {
        return this.body;
    }

}
