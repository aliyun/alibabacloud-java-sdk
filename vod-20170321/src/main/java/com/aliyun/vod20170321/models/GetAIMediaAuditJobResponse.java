// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIMediaAuditJobResponseBody body;

    public static GetAIMediaAuditJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobResponse self = new GetAIMediaAuditJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAIMediaAuditJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIMediaAuditJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIMediaAuditJobResponse setBody(GetAIMediaAuditJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIMediaAuditJobResponseBody getBody() {
        return this.body;
    }

}
