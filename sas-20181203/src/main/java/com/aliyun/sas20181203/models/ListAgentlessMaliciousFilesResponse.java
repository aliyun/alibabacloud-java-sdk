// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessMaliciousFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentlessMaliciousFilesResponseBody body;

    public static ListAgentlessMaliciousFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessMaliciousFilesResponse self = new ListAgentlessMaliciousFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessMaliciousFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessMaliciousFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessMaliciousFilesResponse setBody(ListAgentlessMaliciousFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessMaliciousFilesResponseBody getBody() {
        return this.body;
    }

}
