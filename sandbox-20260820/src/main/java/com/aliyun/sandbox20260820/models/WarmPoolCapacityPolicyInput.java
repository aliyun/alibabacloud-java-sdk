// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class WarmPoolCapacityPolicyInput extends TeaModel {
    /**
     * <p>The base target number of ready sandboxes, which is required and can be set to 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("minReadySandboxes")
    public Long minReadySandboxes;

    /**
     * <p>The list of scheduled capacity rules, which is optional.</p>
     */
    @NameInMap("scheduledPolicies")
    public java.util.List<WarmPoolScheduledPolicyInput> scheduledPolicies;

    public static WarmPoolCapacityPolicyInput build(java.util.Map<String, ?> map) throws Exception {
        WarmPoolCapacityPolicyInput self = new WarmPoolCapacityPolicyInput();
        return TeaModel.build(map, self);
    }

    public WarmPoolCapacityPolicyInput setMinReadySandboxes(Long minReadySandboxes) {
        this.minReadySandboxes = minReadySandboxes;
        return this;
    }
    public Long getMinReadySandboxes() {
        return this.minReadySandboxes;
    }

    public WarmPoolCapacityPolicyInput setScheduledPolicies(java.util.List<WarmPoolScheduledPolicyInput> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<WarmPoolScheduledPolicyInput> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
