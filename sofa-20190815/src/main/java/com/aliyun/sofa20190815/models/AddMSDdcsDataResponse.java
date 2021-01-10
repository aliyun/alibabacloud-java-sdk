// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMSDdcsDataResponseBody body;

    public static AddMSDdcsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsDataResponse self = new AddMSDdcsDataResponse();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMSDdcsDataResponse setBody(AddMSDdcsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMSDdcsDataResponseBody getBody() {
        return this.body;
    }

}
