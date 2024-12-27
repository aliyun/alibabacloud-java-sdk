// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListClusterAgentInstallRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterAgentInstallRecordsResponseBody body;

    public static ListClusterAgentInstallRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAgentInstallRecordsResponse self = new ListClusterAgentInstallRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterAgentInstallRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterAgentInstallRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterAgentInstallRecordsResponse setBody(ListClusterAgentInstallRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterAgentInstallRecordsResponseBody getBody() {
        return this.body;
    }

}
