// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDasInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasInstanceConfigResponse self = new ModifyDasInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDasInstanceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
