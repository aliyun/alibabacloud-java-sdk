// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBudgetPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBudgetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBudgetPolicyResponseBody self = new ModifyBudgetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBudgetPolicyResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyBudgetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
