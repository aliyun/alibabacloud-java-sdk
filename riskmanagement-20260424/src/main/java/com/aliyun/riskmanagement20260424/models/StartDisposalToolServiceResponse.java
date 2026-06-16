// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class StartDisposalToolServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDisposalToolServiceResponseBody body;

    public static StartDisposalToolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDisposalToolServiceResponse self = new StartDisposalToolServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartDisposalToolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDisposalToolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDisposalToolServiceResponse setBody(StartDisposalToolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDisposalToolServiceResponseBody getBody() {
        return this.body;
    }

}
