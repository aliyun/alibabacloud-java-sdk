// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("WafTaskId")
    public Integer wafTaskId;

    public static ModifyProtectionRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleStatusResponseBody self = new ModifyProtectionRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyProtectionRuleStatusResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ModifyProtectionRuleStatusResponseBody setWafTaskId(Integer wafTaskId) {
        this.wafTaskId = wafTaskId;
        return this;
    }
    public Integer getWafTaskId() {
        return this.wafTaskId;
    }

}
