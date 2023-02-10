// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStrategyTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyTargetResponseBody self = new ModifyStrategyTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
