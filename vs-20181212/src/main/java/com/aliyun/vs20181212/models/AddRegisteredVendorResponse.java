// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRegisteredVendorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRegisteredVendorResponseBody body;

    public static AddRegisteredVendorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRegisteredVendorResponse self = new AddRegisteredVendorResponse();
        return TeaModel.build(map, self);
    }

    public AddRegisteredVendorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRegisteredVendorResponse setBody(AddRegisteredVendorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRegisteredVendorResponseBody getBody() {
        return this.body;
    }

}
