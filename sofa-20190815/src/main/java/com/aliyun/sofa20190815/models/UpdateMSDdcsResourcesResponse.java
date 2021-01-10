// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdcsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMSDdcsResourcesResponseBody body;

    public static UpdateMSDdcsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdcsResourcesResponse self = new UpdateMSDdcsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdcsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMSDdcsResourcesResponse setBody(UpdateMSDdcsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMSDdcsResourcesResponseBody getBody() {
        return this.body;
    }

}
