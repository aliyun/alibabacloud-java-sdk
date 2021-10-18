// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceStatsResponseBody body;

    public static GetDeviceStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatsResponse self = new GetDeviceStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceStatsResponse setBody(GetDeviceStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceStatsResponseBody getBody() {
        return this.body;
    }

}
