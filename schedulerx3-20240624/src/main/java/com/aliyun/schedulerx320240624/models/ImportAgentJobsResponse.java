// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportAgentJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportAgentJobsResponseBody body;

    public static ImportAgentJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAgentJobsResponse self = new ImportAgentJobsResponse();
        return TeaModel.build(map, self);
    }

    public ImportAgentJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportAgentJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportAgentJobsResponse setBody(ImportAgentJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportAgentJobsResponseBody getBody() {
        return this.body;
    }

}
