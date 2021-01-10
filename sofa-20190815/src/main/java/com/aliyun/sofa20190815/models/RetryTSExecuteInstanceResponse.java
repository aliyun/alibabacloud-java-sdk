// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSExecuteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTSExecuteInstanceResponseBody body;

    public static RetryTSExecuteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTSExecuteInstanceResponse self = new RetryTSExecuteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RetryTSExecuteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTSExecuteInstanceResponse setBody(RetryTSExecuteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTSExecuteInstanceResponseBody getBody() {
        return this.body;
    }

}
