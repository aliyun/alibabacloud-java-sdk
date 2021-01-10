// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchRegionResponseBody body;

    public static CreateHasCloudarchRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchRegionResponse self = new CreateHasCloudarchRegionResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchRegionResponse setBody(CreateHasCloudarchRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchRegionResponseBody getBody() {
        return this.body;
    }

}
