// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BatchGrantRolesToDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static BatchGrantRolesToDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantRolesToDeveloperResponse self = new BatchGrantRolesToDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public BatchGrantRolesToDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGrantRolesToDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
