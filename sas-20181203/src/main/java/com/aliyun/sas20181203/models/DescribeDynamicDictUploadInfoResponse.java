// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDynamicDictUploadInfoResponseBody body;

    public static DescribeDynamicDictUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictUploadInfoResponse self = new DescribeDynamicDictUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDynamicDictUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDynamicDictUploadInfoResponse setBody(DescribeDynamicDictUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDynamicDictUploadInfoResponseBody getBody() {
        return this.body;
    }

}
