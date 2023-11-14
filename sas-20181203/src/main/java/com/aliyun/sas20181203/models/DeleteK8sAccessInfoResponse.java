// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteK8sAccessInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteK8sAccessInfoResponseBody body;

    public static DeleteK8sAccessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sAccessInfoResponse self = new DeleteK8sAccessInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteK8sAccessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteK8sAccessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteK8sAccessInfoResponse setBody(DeleteK8sAccessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteK8sAccessInfoResponseBody getBody() {
        return this.body;
    }

}
