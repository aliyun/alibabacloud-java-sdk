// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ApplyFirewallTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the execution to apply the template.</p>
     * 
     * <strong>example:</strong>
     * <p>aft-ikgt0bynitvs3****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ApplyFirewallTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyFirewallTemplateResponseBody self = new ApplyFirewallTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyFirewallTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyFirewallTemplateResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
