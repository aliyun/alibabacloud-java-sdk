// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishCronResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublishCronResponseBody body;

    public static UpdatePublishCronResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishCronResponse self = new UpdatePublishCronResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublishCronResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublishCronResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublishCronResponse setBody(UpdatePublishCronResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublishCronResponseBody getBody() {
        return this.body;
    }

}
