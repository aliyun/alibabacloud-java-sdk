// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetOfflineTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOfflineTaskResponseBody body;

    public static GetOfflineTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfflineTaskResponse self = new GetOfflineTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetOfflineTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfflineTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOfflineTaskResponse setBody(GetOfflineTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfflineTaskResponseBody getBody() {
        return this.body;
    }

}
