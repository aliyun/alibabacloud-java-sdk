// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricCloudmsgconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmLinkefabricFabricCloudmsgconfigsResponseBody body;

    public static ConfirmLinkefabricFabricCloudmsgconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricCloudmsgconfigsResponse self = new ConfirmLinkefabricFabricCloudmsgconfigsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricCloudmsgconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLinkefabricFabricCloudmsgconfigsResponse setBody(ConfirmLinkefabricFabricCloudmsgconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLinkefabricFabricCloudmsgconfigsResponseBody getBody() {
        return this.body;
    }

}
