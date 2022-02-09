// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckUserInServiceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserInServiceWhiteListResponseBody body;

    public static CheckUserInServiceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInServiceWhiteListResponse self = new CheckUserInServiceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserInServiceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserInServiceWhiteListResponse setBody(CheckUserInServiceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserInServiceWhiteListResponseBody getBody() {
        return this.body;
    }

}
