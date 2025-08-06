// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisplayAIAuditSwitchResponseBody extends TeaModel {
    @NameInMap("IsDisplay")
    public Boolean isDisplay;

    @NameInMap("RequestId")
    public String requestId;

    public static DisplayAIAuditSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisplayAIAuditSwitchResponseBody self = new DisplayAIAuditSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DisplayAIAuditSwitchResponseBody setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
        return this;
    }
    public Boolean getIsDisplay() {
        return this.isDisplay;
    }

    public DisplayAIAuditSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
