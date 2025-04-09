// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchRepeatJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBatchRepeatJobResponseBody body;

    public static CreateBatchRepeatJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchRepeatJobResponse self = new CreateBatchRepeatJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateBatchRepeatJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBatchRepeatJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBatchRepeatJobResponse setBody(CreateBatchRepeatJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBatchRepeatJobResponseBody getBody() {
        return this.body;
    }

}
