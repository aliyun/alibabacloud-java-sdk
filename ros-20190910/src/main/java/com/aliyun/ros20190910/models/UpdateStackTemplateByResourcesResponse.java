// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStackTemplateByResourcesResponseBody body;

    public static UpdateStackTemplateByResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesResponse self = new UpdateStackTemplateByResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackTemplateByResourcesResponse setBody(UpdateStackTemplateByResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackTemplateByResourcesResponseBody getBody() {
        return this.body;
    }

}
