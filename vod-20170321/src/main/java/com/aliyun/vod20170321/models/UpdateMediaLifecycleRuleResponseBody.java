// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("ForbiddenRuleIds")
    public java.util.List<String> forbiddenRuleIds;

    @NameInMap("NonExistRuleIds")
    public java.util.List<String> nonExistRuleIds;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLifecycleRuleResponseBody self = new UpdateMediaLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLifecycleRuleResponseBody setForbiddenRuleIds(java.util.List<String> forbiddenRuleIds) {
        this.forbiddenRuleIds = forbiddenRuleIds;
        return this;
    }
    public java.util.List<String> getForbiddenRuleIds() {
        return this.forbiddenRuleIds;
    }

    public UpdateMediaLifecycleRuleResponseBody setNonExistRuleIds(java.util.List<String> nonExistRuleIds) {
        this.nonExistRuleIds = nonExistRuleIds;
        return this;
    }
    public java.util.List<String> getNonExistRuleIds() {
        return this.nonExistRuleIds;
    }

    public UpdateMediaLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
