// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmDissentOriginalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmDissentOriginalResponseBody body;

    public static ConfirmDissentOriginalResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDissentOriginalResponse self = new ConfirmDissentOriginalResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDissentOriginalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDissentOriginalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmDissentOriginalResponse setBody(ConfirmDissentOriginalResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmDissentOriginalResponseBody getBody() {
        return this.body;
    }

}
