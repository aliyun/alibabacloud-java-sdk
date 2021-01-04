// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReplicationJobAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeResponseBody self = new ModifyReplicationJobAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReplicationJobAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
