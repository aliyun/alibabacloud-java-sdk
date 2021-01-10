// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTSJobResponseBody body;

    public static AddTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTSJobResponse self = new AddTSJobResponse();
        return TeaModel.build(map, self);
    }

    public AddTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTSJobResponse setBody(AddTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTSJobResponseBody getBody() {
        return this.body;
    }

}
