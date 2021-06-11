// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotVehicleTableItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiotVehicleTableItemResponseBody body;

    public static UpdateAiotVehicleTableItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotVehicleTableItemResponse self = new UpdateAiotVehicleTableItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiotVehicleTableItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiotVehicleTableItemResponse setBody(UpdateAiotVehicleTableItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiotVehicleTableItemResponseBody getBody() {
        return this.body;
    }

}
