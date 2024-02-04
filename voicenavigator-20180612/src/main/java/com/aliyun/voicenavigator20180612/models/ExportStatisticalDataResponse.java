// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportStatisticalDataResponseBody body;

    public static ExportStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportStatisticalDataResponse self = new ExportStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportStatisticalDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportStatisticalDataResponse setBody(ExportStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportStatisticalDataResponseBody getBody() {
        return this.body;
    }

}
