// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationApprovalRequest extends TeaModel {
    /**
     * <p>The quota application ID.</p>
     * <p>For more information about how to obtain the ID of a quota application, see <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>d314d6ae-867d-484c-9009-3d42****</p>
     */
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
