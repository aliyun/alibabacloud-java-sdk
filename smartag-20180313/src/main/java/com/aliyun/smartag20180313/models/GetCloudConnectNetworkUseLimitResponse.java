// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetCloudConnectNetworkUseLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCloudConnectNetworkUseLimitResponseBody body;

    public static GetCloudConnectNetworkUseLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudConnectNetworkUseLimitResponse self = new GetCloudConnectNetworkUseLimitResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudConnectNetworkUseLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudConnectNetworkUseLimitResponse setBody(GetCloudConnectNetworkUseLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudConnectNetworkUseLimitResponseBody getBody() {
        return this.body;
    }

}
