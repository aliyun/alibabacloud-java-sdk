// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class WithdrawScriptReviewRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

    public static WithdrawScriptReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawScriptReviewRequest self = new WithdrawScriptReviewRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawScriptReviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WithdrawScriptReviewRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
