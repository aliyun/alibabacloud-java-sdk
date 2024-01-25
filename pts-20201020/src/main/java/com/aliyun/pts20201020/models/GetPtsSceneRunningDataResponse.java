// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsSceneRunningDataResponseBody body;

    public static GetPtsSceneRunningDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningDataResponse self = new GetPtsSceneRunningDataResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsSceneRunningDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsSceneRunningDataResponse setBody(GetPtsSceneRunningDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsSceneRunningDataResponseBody getBody() {
        return this.body;
    }

}
