// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventUserSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspEventUserSettingResponseBody body;

    public static DescribeSuspEventUserSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventUserSettingResponse self = new DescribeSuspEventUserSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventUserSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventUserSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventUserSettingResponse setBody(DescribeSuspEventUserSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventUserSettingResponseBody getBody() {
        return this.body;
    }

}
