// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ApplyConfigToMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static ApplyConfigToMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyConfigToMachineGroupResponse self = new ApplyConfigToMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public ApplyConfigToMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyConfigToMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
