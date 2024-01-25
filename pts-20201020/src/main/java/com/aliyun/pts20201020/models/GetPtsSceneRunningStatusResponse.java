// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsSceneRunningStatusResponseBody body;

    public static GetPtsSceneRunningStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningStatusResponse self = new GetPtsSceneRunningStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsSceneRunningStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsSceneRunningStatusResponse setBody(GetPtsSceneRunningStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsSceneRunningStatusResponseBody getBody() {
        return this.body;
    }

}
