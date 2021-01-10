// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmGrayDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmGrayDataResponseBody body;

    public static AddMsDrmGrayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmGrayDataResponse self = new AddMsDrmGrayDataResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmGrayDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmGrayDataResponse setBody(AddMsDrmGrayDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmGrayDataResponseBody getBody() {
        return this.body;
    }

}
