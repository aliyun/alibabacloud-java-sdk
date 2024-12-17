// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body;

    public static DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse self = new DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse setBody(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponseBody getBody() {
        return this.body;
    }

}
