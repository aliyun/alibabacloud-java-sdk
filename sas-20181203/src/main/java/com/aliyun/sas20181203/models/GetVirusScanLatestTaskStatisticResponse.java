// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVirusScanLatestTaskStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVirusScanLatestTaskStatisticResponseBody body;

    public static GetVirusScanLatestTaskStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanLatestTaskStatisticResponse self = new GetVirusScanLatestTaskStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetVirusScanLatestTaskStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirusScanLatestTaskStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVirusScanLatestTaskStatisticResponse setBody(GetVirusScanLatestTaskStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirusScanLatestTaskStatisticResponseBody getBody() {
        return this.body;
    }

}
