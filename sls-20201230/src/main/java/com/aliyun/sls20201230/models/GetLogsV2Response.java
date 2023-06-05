// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogsV2ResponseBody body;

    public static GetLogsV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetLogsV2Response self = new GetLogsV2Response();
        return TeaModel.build(map, self);
    }

    public GetLogsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogsV2Response setBody(GetLogsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogsV2ResponseBody getBody() {
        return this.body;
    }

}
