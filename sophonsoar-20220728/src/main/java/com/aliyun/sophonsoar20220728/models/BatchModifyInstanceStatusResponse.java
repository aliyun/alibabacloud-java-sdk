// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchModifyInstanceStatusResponseBody body;

    public static BatchModifyInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyInstanceStatusResponse self = new BatchModifyInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchModifyInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchModifyInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchModifyInstanceStatusResponse setBody(BatchModifyInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchModifyInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
