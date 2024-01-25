// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportsBySceneIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsReportsBySceneIdResponseBody body;

    public static GetPtsReportsBySceneIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportsBySceneIdResponse self = new GetPtsReportsBySceneIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsReportsBySceneIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsReportsBySceneIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsReportsBySceneIdResponse setBody(GetPtsReportsBySceneIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsReportsBySceneIdResponseBody getBody() {
        return this.body;
    }

}
