// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeLogMaskConfigStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeLogMaskConfigStateResponseBody body;

    public static ChangeLogMaskConfigStateResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogMaskConfigStateResponse self = new ChangeLogMaskConfigStateResponse();
        return TeaModel.build(map, self);
    }

    public ChangeLogMaskConfigStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeLogMaskConfigStateResponse setBody(ChangeLogMaskConfigStateResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeLogMaskConfigStateResponseBody getBody() {
        return this.body;
    }

}
