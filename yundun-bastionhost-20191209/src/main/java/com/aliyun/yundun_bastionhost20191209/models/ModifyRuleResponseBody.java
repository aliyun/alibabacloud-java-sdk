// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67EB57AD-5C83-537B-B2A1-6082798965F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponseBody self = new ModifyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
