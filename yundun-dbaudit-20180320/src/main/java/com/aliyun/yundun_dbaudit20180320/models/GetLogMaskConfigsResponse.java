// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogMaskConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogMaskConfigsResponseBody body;

    public static GetLogMaskConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogMaskConfigsResponse self = new GetLogMaskConfigsResponse();
        return TeaModel.build(map, self);
    }

    public GetLogMaskConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogMaskConfigsResponse setBody(GetLogMaskConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogMaskConfigsResponseBody getBody() {
        return this.body;
    }

}
