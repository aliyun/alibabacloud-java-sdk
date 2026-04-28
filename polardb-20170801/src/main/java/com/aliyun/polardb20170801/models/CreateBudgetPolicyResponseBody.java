// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBudgetPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>05a5a8603df444a8a605af712ffexxx</p>
     */
    @NameInMap("BudgetPolicyId")
    public String budgetPolicyId;

    /**
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBudgetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetPolicyResponseBody self = new CreateBudgetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBudgetPolicyResponseBody setBudgetPolicyId(String budgetPolicyId) {
        this.budgetPolicyId = budgetPolicyId;
        return this;
    }
    public String getBudgetPolicyId() {
        return this.budgetPolicyId;
    }

    public CreateBudgetPolicyResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateBudgetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
