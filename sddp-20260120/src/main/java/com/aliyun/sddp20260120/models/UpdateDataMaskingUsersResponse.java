// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataMaskingUsersResponseBody body;

    public static UpdateDataMaskingUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataMaskingUsersResponse self = new UpdateDataMaskingUsersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataMaskingUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataMaskingUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataMaskingUsersResponse setBody(UpdateDataMaskingUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataMaskingUsersResponseBody getBody() {
        return this.body;
    }

}
