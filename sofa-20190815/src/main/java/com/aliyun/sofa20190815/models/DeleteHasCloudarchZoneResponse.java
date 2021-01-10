// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasCloudarchZoneResponseBody body;

    public static DeleteHasCloudarchZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchZoneResponse self = new DeleteHasCloudarchZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasCloudarchZoneResponse setBody(DeleteHasCloudarchZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasCloudarchZoneResponseBody getBody() {
        return this.body;
    }

}
