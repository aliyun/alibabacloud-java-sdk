// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchWorkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchWorkspacegroupResponseBody body;

    public static UpdateHasCloudarchWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchWorkspacegroupResponse self = new UpdateHasCloudarchWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchWorkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchWorkspacegroupResponse setBody(UpdateHasCloudarchWorkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchWorkspacegroupResponseBody getBody() {
        return this.body;
    }

}
