// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMetricStoreMeteringModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static UpdateMetricStoreMeteringModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricStoreMeteringModeResponse self = new UpdateMetricStoreMeteringModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetricStoreMeteringModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetricStoreMeteringModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
