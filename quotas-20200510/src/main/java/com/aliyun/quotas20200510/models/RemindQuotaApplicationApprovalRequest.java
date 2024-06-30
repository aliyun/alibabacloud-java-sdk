// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class RemindQuotaApplicationApprovalRequest extends TeaModel {
    /**
     * <p>The quota application ID.</p>
     * <p>For more information about how to obtain the ID of a quota application, see <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>219f1ff6-6205-495f-bda7-90d2fe945e****</p>
     */
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
