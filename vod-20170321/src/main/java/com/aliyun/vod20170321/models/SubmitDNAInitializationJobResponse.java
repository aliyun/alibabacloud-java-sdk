// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDNAInitializationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDNAInitializationJobResponseBody body;

    public static SubmitDNAInitializationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDNAInitializationJobResponse self = new SubmitDNAInitializationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDNAInitializationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDNAInitializationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDNAInitializationJobResponse setBody(SubmitDNAInitializationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDNAInitializationJobResponseBody getBody() {
        return this.body;
    }

}
