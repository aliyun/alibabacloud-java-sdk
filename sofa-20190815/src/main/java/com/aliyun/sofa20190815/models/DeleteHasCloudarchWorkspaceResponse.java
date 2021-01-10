// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchWorkspaceResponseBody body;

    public static DeleteHasCloudarchWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchWorkspaceResponse self = new DeleteHasCloudarchWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchWorkspaceResponse setBody(DeleteHasCloudarchWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchWorkspaceResponseBody getBody() {
        return this.body;
    }

}
