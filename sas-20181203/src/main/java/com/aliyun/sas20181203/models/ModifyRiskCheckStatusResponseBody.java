// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskCheckStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRiskCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskCheckStatusResponseBody self = new ModifyRiskCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRiskCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
