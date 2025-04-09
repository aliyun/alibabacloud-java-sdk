// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class WithdrawScriptReviewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>38d2e8ed-04e9-4dac-83b5-a8e57642ef13</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e4e2a770-b97b-465a-80d8-06dca008c503</p>
     */
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
