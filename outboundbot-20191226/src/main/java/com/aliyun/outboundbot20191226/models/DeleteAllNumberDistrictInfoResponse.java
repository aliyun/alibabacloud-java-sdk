// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteAllNumberDistrictInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAllNumberDistrictInfoResponseBody body;

    public static DeleteAllNumberDistrictInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllNumberDistrictInfoResponse self = new DeleteAllNumberDistrictInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllNumberDistrictInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllNumberDistrictInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAllNumberDistrictInfoResponse setBody(DeleteAllNumberDistrictInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllNumberDistrictInfoResponseBody getBody() {
        return this.body;
    }

}
