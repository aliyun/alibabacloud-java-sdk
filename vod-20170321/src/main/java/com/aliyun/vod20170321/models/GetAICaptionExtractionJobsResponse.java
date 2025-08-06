// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAICaptionExtractionJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICaptionExtractionJobsResponseBody body;

    public static GetAICaptionExtractionJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICaptionExtractionJobsResponse self = new GetAICaptionExtractionJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetAICaptionExtractionJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICaptionExtractionJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICaptionExtractionJobsResponse setBody(GetAICaptionExtractionJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICaptionExtractionJobsResponseBody getBody() {
        return this.body;
    }

}
