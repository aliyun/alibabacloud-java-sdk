// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteSchedulerxNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The name of the notification policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-weekdays</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSchedulerxNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerxNotificationPolicyRequest self = new DeleteSchedulerxNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerxNotificationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DeleteSchedulerxNotificationPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
