// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateDhcpOptionsSetAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDhcpOptionsSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDhcpOptionsSetAttributeResponse self = new UpdateDhcpOptionsSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDhcpOptionsSetAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
