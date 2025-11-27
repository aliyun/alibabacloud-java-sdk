// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCElasticScalingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCElasticScalingResponseBody body;

    public static ModifyRCElasticScalingResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCElasticScalingResponse self = new ModifyRCElasticScalingResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCElasticScalingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCElasticScalingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCElasticScalingResponse setBody(ModifyRCElasticScalingResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCElasticScalingResponseBody getBody() {
        return this.body;
    }

}
