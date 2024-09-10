// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureAlarmListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureAlarmListResponseBody body;

    public static DescribeDomainSecureAlarmListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureAlarmListResponse self = new DescribeDomainSecureAlarmListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureAlarmListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureAlarmListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureAlarmListResponse setBody(DescribeDomainSecureAlarmListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureAlarmListResponseBody getBody() {
        return this.body;
    }

}
