// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class InstallRCCloudAssistantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallRCCloudAssistantResponseBody body;

    public static InstallRCCloudAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallRCCloudAssistantResponse self = new InstallRCCloudAssistantResponse();
        return TeaModel.build(map, self);
    }

    public InstallRCCloudAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallRCCloudAssistantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallRCCloudAssistantResponse setBody(InstallRCCloudAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallRCCloudAssistantResponseBody getBody() {
        return this.body;
    }

}
