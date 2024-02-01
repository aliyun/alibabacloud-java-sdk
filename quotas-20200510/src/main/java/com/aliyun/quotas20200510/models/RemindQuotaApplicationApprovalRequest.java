// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class RemindQuotaApplicationApprovalRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    public static RemindQuotaApplicationApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        RemindQuotaApplicationApprovalRequest self = new RemindQuotaApplicationApprovalRequest();
        return TeaModel.build(map, self);
    }

    public RemindQuotaApplicationApprovalRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
