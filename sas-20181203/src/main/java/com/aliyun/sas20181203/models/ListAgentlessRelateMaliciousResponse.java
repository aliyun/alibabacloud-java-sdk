// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRelateMaliciousResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentlessRelateMaliciousResponseBody body;

    public static ListAgentlessRelateMaliciousResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRelateMaliciousResponse self = new ListAgentlessRelateMaliciousResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRelateMaliciousResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessRelateMaliciousResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessRelateMaliciousResponse setBody(ListAgentlessRelateMaliciousResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessRelateMaliciousResponseBody getBody() {
        return this.body;
    }

}
