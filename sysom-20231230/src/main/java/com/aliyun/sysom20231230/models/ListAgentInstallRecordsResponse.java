// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentInstallRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentInstallRecordsResponseBody body;

    public static ListAgentInstallRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstallRecordsResponse self = new ListAgentInstallRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentInstallRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentInstallRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentInstallRecordsResponse setBody(ListAgentInstallRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentInstallRecordsResponseBody getBody() {
        return this.body;
    }

}
