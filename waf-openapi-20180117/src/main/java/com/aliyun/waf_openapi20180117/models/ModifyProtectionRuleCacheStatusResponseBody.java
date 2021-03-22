// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("WafTaskId")
    public Integer wafTaskId;

    public static ModifyProtectionRuleCacheStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusResponseBody self = new ModifyProtectionRuleCacheStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyProtectionRuleCacheStatusResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ModifyProtectionRuleCacheStatusResponseBody setWafTaskId(Integer wafTaskId) {
        this.wafTaskId = wafTaskId;
        return this;
    }
    public Integer getWafTaskId() {
        return this.wafTaskId;
    }

}
