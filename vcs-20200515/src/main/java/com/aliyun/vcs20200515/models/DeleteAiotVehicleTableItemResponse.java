// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotVehicleTableItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAiotVehicleTableItemResponseBody body;

    public static DeleteAiotVehicleTableItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotVehicleTableItemResponse self = new DeleteAiotVehicleTableItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiotVehicleTableItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiotVehicleTableItemResponse setBody(DeleteAiotVehicleTableItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiotVehicleTableItemResponseBody getBody() {
        return this.body;
    }

}
