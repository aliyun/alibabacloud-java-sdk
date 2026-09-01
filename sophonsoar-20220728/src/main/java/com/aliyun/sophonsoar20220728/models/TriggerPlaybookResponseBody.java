// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerPlaybookResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BD5A8DB6-A42C-532B-BCE8-83E69550CD59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The UUID of the playbook run. You can use this UUID to obtain the results of the playbook run.</p>
     * 
     * <strong>example:</strong>
     * <p>55E63C57-D6C8-5036-A770-5CB10AC807AA</p>
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
