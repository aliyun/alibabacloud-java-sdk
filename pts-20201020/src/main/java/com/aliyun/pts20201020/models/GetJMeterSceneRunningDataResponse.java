// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSceneRunningDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJMeterSceneRunningDataResponseBody body;

    public static GetJMeterSceneRunningDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSceneRunningDataResponse self = new GetJMeterSceneRunningDataResponse();
        return TeaModel.build(map, self);
    }

    public GetJMeterSceneRunningDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJMeterSceneRunningDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJMeterSceneRunningDataResponse setBody(GetJMeterSceneRunningDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterSceneRunningDataResponseBody getBody() {
        return this.body;
    }

}
