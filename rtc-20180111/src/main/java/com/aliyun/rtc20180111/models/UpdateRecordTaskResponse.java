// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRecordTaskResponseBody body;

    public static UpdateRecordTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTaskResponse self = new UpdateRecordTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordTaskResponse setBody(UpdateRecordTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordTaskResponseBody getBody() {
        return this.body;
    }

}
