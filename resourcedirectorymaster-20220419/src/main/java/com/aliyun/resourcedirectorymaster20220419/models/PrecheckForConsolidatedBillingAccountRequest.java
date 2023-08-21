// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class PrecheckForConsolidatedBillingAccountRequest extends TeaModel {
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
