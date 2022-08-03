// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CreateResourceAccountRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnableConsolidatedBilling")
    public Boolean enableConsolidatedBilling;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("PayerAccountId")
    public String payerAccountId;

    public static CreateResourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAccountRequest self = new CreateResourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceAccountRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateResourceAccountRequest setEnableConsolidatedBilling(Boolean enableConsolidatedBilling) {
        this.enableConsolidatedBilling = enableConsolidatedBilling;
        return this;
    }
    public Boolean getEnableConsolidatedBilling() {
        return this.enableConsolidatedBilling;
    }

    public CreateResourceAccountRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateResourceAccountRequest setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

}
