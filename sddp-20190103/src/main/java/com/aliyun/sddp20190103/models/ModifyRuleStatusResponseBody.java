// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    public String failedIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusResponseBody self = new ModifyRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusResponseBody setFailedIds(String failedIds) {
        this.failedIds = failedIds;
        return this;
    }
    public String getFailedIds() {
        return this.failedIds;
    }

    public ModifyRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
