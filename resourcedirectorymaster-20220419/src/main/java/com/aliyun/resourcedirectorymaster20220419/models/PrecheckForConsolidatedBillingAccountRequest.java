// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class PrecheckForConsolidatedBillingAccountRequest extends TeaModel {
    /**
     * <p>The ID of the management account or member to be used as a main financial account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111***089</p>
     */
    @NameInMap("BillingAccountId")
    public String billingAccountId;

    public static PrecheckForConsolidatedBillingAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckForConsolidatedBillingAccountRequest self = new PrecheckForConsolidatedBillingAccountRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckForConsolidatedBillingAccountRequest setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
        return this;
    }
    public String getBillingAccountId() {
        return this.billingAccountId;
    }

}
