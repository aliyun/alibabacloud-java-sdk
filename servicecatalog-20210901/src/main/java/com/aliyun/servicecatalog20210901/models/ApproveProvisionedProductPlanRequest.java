// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ApproveProvisionedProductPlanRequest extends TeaModel {
    @NameInMap("ApprovalAction")
    public String approvalAction;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("PlanId")
    public String planId;

    public static ApproveProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveProvisionedProductPlanRequest self = new ApproveProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public ApproveProvisionedProductPlanRequest setApprovalAction(String approvalAction) {
        this.approvalAction = approvalAction;
        return this;
    }
    public String getApprovalAction() {
        return this.approvalAction;
    }

    public ApproveProvisionedProductPlanRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ApproveProvisionedProductPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
