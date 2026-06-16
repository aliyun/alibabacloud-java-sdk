// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetDisposalToolStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDisposalToolStatusResponseBody body;

    public static GetDisposalToolStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDisposalToolStatusResponse self = new GetDisposalToolStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDisposalToolStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDisposalToolStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDisposalToolStatusResponse setBody(GetDisposalToolStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDisposalToolStatusResponseBody getBody() {
        return this.body;
    }

}
