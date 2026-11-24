// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class WithdrawQuotaApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the quota application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d42****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The reason for withdrawing the quota increase request.</p>
     * 
     * <strong>example:</strong>
     * <p>DesireValue is wrong</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static WithdrawQuotaApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawQuotaApplicationRequest self = new WithdrawQuotaApplicationRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawQuotaApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public WithdrawQuotaApplicationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
