// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateRecordIndexFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRecordIndexFileResponseBody body;

    public static CreateRecordIndexFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordIndexFileResponse self = new CreateRecordIndexFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecordIndexFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecordIndexFileResponse setBody(CreateRecordIndexFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecordIndexFileResponseBody getBody() {
        return this.body;
    }

}
