// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotVehicleTableItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAiotVehicleTableItemsResponseBody body;

    public static AddAiotVehicleTableItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAiotVehicleTableItemsResponse self = new AddAiotVehicleTableItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddAiotVehicleTableItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAiotVehicleTableItemsResponse setBody(AddAiotVehicleTableItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAiotVehicleTableItemsResponseBody getBody() {
        return this.body;
    }

}
