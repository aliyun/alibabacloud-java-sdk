// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAppointOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppointOperationResponseBody body;

    public static GetAppointOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppointOperationResponse self = new GetAppointOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetAppointOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppointOperationResponse setBody(GetAppointOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppointOperationResponseBody getBody() {
        return this.body;
    }

}
