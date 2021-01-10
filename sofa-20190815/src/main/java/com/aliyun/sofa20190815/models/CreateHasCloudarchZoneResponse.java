// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchZoneResponseBody body;

    public static CreateHasCloudarchZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchZoneResponse self = new CreateHasCloudarchZoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchZoneResponse setBody(CreateHasCloudarchZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchZoneResponseBody getBody() {
        return this.body;
    }

}
