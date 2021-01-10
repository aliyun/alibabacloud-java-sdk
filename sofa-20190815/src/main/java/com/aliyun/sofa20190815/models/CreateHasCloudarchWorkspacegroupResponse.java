// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchWorkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchWorkspacegroupResponseBody body;

    public static CreateHasCloudarchWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchWorkspacegroupResponse self = new CreateHasCloudarchWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchWorkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchWorkspacegroupResponse setBody(CreateHasCloudarchWorkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchWorkspacegroupResponseBody getBody() {
        return this.body;
    }

}
