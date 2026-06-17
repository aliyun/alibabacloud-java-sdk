// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCronJobPolicyServerlessResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1401250-910B-57A6-8A6A-D9988A62B1CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCronJobPolicyServerlessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCronJobPolicyServerlessResponseBody self = new ModifyCronJobPolicyServerlessResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCronJobPolicyServerlessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
