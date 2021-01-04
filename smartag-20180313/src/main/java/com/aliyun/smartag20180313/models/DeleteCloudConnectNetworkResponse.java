// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteCloudConnectNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCloudConnectNetworkResponseBody body;

    public static DeleteCloudConnectNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudConnectNetworkResponse self = new DeleteCloudConnectNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudConnectNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudConnectNetworkResponse setBody(DeleteCloudConnectNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudConnectNetworkResponseBody getBody() {
        return this.body;
    }

}
