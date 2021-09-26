// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AddLogMaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLogMaskConfigResponseBody body;

    public static AddLogMaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLogMaskConfigResponse self = new AddLogMaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLogMaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLogMaskConfigResponse setBody(AddLogMaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLogMaskConfigResponseBody getBody() {
        return this.body;
    }

}
