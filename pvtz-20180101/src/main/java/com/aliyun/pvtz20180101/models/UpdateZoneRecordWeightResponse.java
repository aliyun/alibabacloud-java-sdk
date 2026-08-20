// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateZoneRecordWeightResponseBody body;

    public static UpdateZoneRecordWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordWeightResponse self = new UpdateZoneRecordWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZoneRecordWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateZoneRecordWeightResponse setBody(UpdateZoneRecordWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZoneRecordWeightResponseBody getBody() {
        return this.body;
    }

}
