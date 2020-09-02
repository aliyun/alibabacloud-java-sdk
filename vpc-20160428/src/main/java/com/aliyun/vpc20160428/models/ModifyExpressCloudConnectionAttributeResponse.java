// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyExpressCloudConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeResponse self = new ModifyExpressCloudConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
