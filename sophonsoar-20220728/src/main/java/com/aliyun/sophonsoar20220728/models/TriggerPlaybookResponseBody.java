// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerPlaybookResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The running UUID of the playbook. This parameter is used to query the running result of the playbook.</p>
     */
    @NameInMap("TriggerUuid")
    public String triggerUuid;

    public static TriggerPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerPlaybookResponseBody self = new TriggerPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerPlaybookResponseBody setTriggerUuid(String triggerUuid) {
        this.triggerUuid = triggerUuid;
        return this;
    }
    public String getTriggerUuid() {
        return this.triggerUuid;
    }

}
