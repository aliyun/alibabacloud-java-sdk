// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DisableLogMaskConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableLogMaskConfigsResponseBody body;

    public static DisableLogMaskConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableLogMaskConfigsResponse self = new DisableLogMaskConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DisableLogMaskConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableLogMaskConfigsResponse setBody(DisableLogMaskConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableLogMaskConfigsResponseBody getBody() {
        return this.body;
    }

}
