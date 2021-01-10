// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchWorkspaceResponseBody body;

    public static CreateHasCloudarchWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchWorkspaceResponse self = new CreateHasCloudarchWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchWorkspaceResponse setBody(CreateHasCloudarchWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchWorkspaceResponseBody getBody() {
        return this.body;
    }

}
