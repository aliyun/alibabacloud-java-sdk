// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMtIntervenePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMtIntervenePackageResponseBody body;

    public static AddMtIntervenePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMtIntervenePackageResponse self = new AddMtIntervenePackageResponse();
        return TeaModel.build(map, self);
    }

    public AddMtIntervenePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMtIntervenePackageResponse setBody(AddMtIntervenePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMtIntervenePackageResponseBody getBody() {
        return this.body;
    }

}
