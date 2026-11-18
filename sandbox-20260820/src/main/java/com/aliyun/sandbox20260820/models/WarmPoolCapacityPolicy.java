// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class WarmPoolCapacityPolicy extends TeaModel {
    /**
     * <p>The base target number of ready sandboxes. This parameter is required and can be set to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("minReadySandboxes")
    public Long minReadySandboxes;

    /**
     * <p>The list of scheduled capacity rules. This parameter is optional.</p>
     */
    @NameInMap("scheduledPolicies")
    public java.util.List<WarmPoolScheduledPolicy> scheduledPolicies;

    public static WarmPoolCapacityPolicy build(java.util.Map<String, ?> map) throws Exception {
        WarmPoolCapacityPolicy self = new WarmPoolCapacityPolicy();
        return TeaModel.build(map, self);
    }

    public WarmPoolCapacityPolicy setMinReadySandboxes(Long minReadySandboxes) {
        this.minReadySandboxes = minReadySandboxes;
        return this;
    }
    public Long getMinReadySandboxes() {
        return this.minReadySandboxes;
    }

    public WarmPoolCapacityPolicy setScheduledPolicies(java.util.List<WarmPoolScheduledPolicy> scheduledPolicies) {
        this.scheduledPolicies = scheduledPolicies;
        return this;
    }
    public java.util.List<WarmPoolScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

}
