// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagAlertConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReadyFlagAlertConfigResponseBody body;

    public static GetReadyFlagAlertConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagAlertConfigResponse self = new GetReadyFlagAlertConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagAlertConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReadyFlagAlertConfigResponse setBody(GetReadyFlagAlertConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReadyFlagAlertConfigResponseBody getBody() {
        return this.body;
    }

}
