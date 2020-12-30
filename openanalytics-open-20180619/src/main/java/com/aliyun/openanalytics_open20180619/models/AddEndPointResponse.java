// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddEndPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEndPointResponseBody body;

    public static AddEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEndPointResponse self = new AddEndPointResponse();
        return TeaModel.build(map, self);
    }

    public AddEndPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEndPointResponse setBody(AddEndPointResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEndPointResponseBody getBody() {
        return this.body;
    }

}
