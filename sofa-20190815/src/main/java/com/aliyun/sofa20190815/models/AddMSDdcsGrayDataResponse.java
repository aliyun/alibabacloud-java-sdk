// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsGrayDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMSDdcsGrayDataResponseBody body;

    public static AddMSDdcsGrayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsGrayDataResponse self = new AddMSDdcsGrayDataResponse();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsGrayDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMSDdcsGrayDataResponse setBody(AddMSDdcsGrayDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMSDdcsGrayDataResponseBody getBody() {
        return this.body;
    }

}
