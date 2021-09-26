// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class RemoveLogMaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLogMaskConfigResponseBody body;

    public static RemoveLogMaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLogMaskConfigResponse self = new RemoveLogMaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLogMaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLogMaskConfigResponse setBody(RemoveLogMaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLogMaskConfigResponseBody getBody() {
        return this.body;
    }

}
