// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsDrmResourcesResponseBody body;

    public static UpdateMsDrmResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmResourcesResponse self = new UpdateMsDrmResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsDrmResourcesResponse setBody(UpdateMsDrmResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsDrmResourcesResponseBody getBody() {
        return this.body;
    }

}
