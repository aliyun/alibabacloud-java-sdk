// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuditHistoryResponseBody body;

    public static GetAuditHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditHistoryResponse self = new GetAuditHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditHistoryResponse setBody(GetAuditHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditHistoryResponseBody getBody() {
        return this.body;
    }

}
