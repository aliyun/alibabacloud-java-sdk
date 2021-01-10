// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchRegionResponseBody body;

    public static UpdateHasCloudarchRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchRegionResponse self = new UpdateHasCloudarchRegionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchRegionResponse setBody(UpdateHasCloudarchRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchRegionResponseBody getBody() {
        return this.body;
    }

}
