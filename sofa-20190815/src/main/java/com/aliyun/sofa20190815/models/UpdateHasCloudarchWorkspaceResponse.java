// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchWorkspaceResponseBody body;

    public static UpdateHasCloudarchWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchWorkspaceResponse self = new UpdateHasCloudarchWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchWorkspaceResponse setBody(UpdateHasCloudarchWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchWorkspaceResponseBody getBody() {
        return this.body;
    }

}
