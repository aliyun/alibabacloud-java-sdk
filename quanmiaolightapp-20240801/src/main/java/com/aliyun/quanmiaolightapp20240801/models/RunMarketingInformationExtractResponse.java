// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunMarketingInformationExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunMarketingInformationExtractResponseBody body;

    public static RunMarketingInformationExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMarketingInformationExtractResponse self = new RunMarketingInformationExtractResponse();
        return TeaModel.build(map, self);
    }

    public RunMarketingInformationExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMarketingInformationExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunMarketingInformationExtractResponse setBody(RunMarketingInformationExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMarketingInformationExtractResponseBody getBody() {
        return this.body;
    }

}
