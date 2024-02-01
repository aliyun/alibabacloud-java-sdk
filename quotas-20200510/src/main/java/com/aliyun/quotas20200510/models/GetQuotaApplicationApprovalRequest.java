// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationApprovalRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    public static GetQuotaApplicationApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationApprovalRequest self = new GetQuotaApplicationApprovalRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationApprovalRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
