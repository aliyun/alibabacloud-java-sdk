// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EnableLogMaskConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableLogMaskConfigsResponseBody body;

    public static EnableLogMaskConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableLogMaskConfigsResponse self = new EnableLogMaskConfigsResponse();
        return TeaModel.build(map, self);
    }

    public EnableLogMaskConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableLogMaskConfigsResponse setBody(EnableLogMaskConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableLogMaskConfigsResponseBody getBody() {
        return this.body;
    }

}
