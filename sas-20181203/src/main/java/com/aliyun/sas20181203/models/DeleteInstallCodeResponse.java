// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInstallCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstallCodeResponseBody body;

    public static DeleteInstallCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstallCodeResponse self = new DeleteInstallCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstallCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstallCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstallCodeResponse setBody(DeleteInstallCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstallCodeResponseBody getBody() {
        return this.body;
    }

}
