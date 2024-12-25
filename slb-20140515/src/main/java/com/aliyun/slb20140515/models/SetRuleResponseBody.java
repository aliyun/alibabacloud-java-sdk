// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRuleResponseBody self = new SetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
