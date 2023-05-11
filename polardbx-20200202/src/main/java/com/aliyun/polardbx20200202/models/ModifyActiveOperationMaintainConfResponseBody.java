// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfResponseBody self = new ModifyActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
