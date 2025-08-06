// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarksConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWatermarksConsoleResponseBody body;

    public static GetWatermarksConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarksConsoleResponse self = new GetWatermarksConsoleResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarksConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarksConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWatermarksConsoleResponse setBody(GetWatermarksConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarksConsoleResponseBody getBody() {
        return this.body;
    }

}
