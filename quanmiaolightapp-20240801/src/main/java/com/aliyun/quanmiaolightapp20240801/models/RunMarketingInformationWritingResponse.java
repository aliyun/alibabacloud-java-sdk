// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationWritingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunMarketingInformationWritingResponseBody body;

    public static RunMarketingInformationWritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationWritingResponse self = new RunMarketingInformationWritingResponse();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationWritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMarketingInformationWritingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunMarketingInformationWritingResponse setBody(RunMarketingInformationWritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMarketingInformationWritingResponseBody getBody() {
        return this.body;
    }

}
