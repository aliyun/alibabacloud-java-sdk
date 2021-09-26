// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class RefundInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefundInstanceResponseBody body;

    public static RefundInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceResponse self = new RefundInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RefundInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundInstanceResponse setBody(RefundInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundInstanceResponseBody getBody() {
        return this.body;
    }

}
