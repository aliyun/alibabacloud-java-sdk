// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallCloudMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallCloudMonitorResponseBody body;

    public static InstallCloudMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudMonitorResponse self = new InstallCloudMonitorResponse();
        return TeaModel.build(map, self);
    }

    public InstallCloudMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCloudMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallCloudMonitorResponse setBody(InstallCloudMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCloudMonitorResponseBody getBody() {
        return this.body;
    }

}
