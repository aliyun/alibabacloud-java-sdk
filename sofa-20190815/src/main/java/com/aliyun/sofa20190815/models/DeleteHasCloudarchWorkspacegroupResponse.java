// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchWorkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchWorkspacegroupResponseBody body;

    public static DeleteHasCloudarchWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchWorkspacegroupResponse self = new DeleteHasCloudarchWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchWorkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchWorkspacegroupResponse setBody(DeleteHasCloudarchWorkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchWorkspacegroupResponseBody getBody() {
        return this.body;
    }

}
