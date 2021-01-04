// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateCloudConnectNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCloudConnectNetworkResponseBody body;

    public static CreateCloudConnectNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudConnectNetworkResponse self = new CreateCloudConnectNetworkResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudConnectNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudConnectNetworkResponse setBody(CreateCloudConnectNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudConnectNetworkResponseBody getBody() {
        return this.body;
    }

}
