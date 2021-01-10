// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasCloudarchZoneResponseBody body;

    public static UpdateHasCloudarchZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchZoneResponse self = new UpdateHasCloudarchZoneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasCloudarchZoneResponse setBody(UpdateHasCloudarchZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasCloudarchZoneResponseBody getBody() {
        return this.body;
    }

}
