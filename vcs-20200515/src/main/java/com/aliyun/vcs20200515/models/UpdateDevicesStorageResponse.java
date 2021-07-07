// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDevicesStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevicesStorageResponseBody body;

    public static UpdateDevicesStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesStorageResponse self = new UpdateDevicesStorageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevicesStorageResponse setBody(UpdateDevicesStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevicesStorageResponseBody getBody() {
        return this.body;
    }

}
