// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetOfflineTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOfflineTaskLogResponseBody body;

    public static GetOfflineTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfflineTaskLogResponse self = new GetOfflineTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetOfflineTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfflineTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOfflineTaskLogResponse setBody(GetOfflineTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfflineTaskLogResponseBody getBody() {
        return this.body;
    }

}
