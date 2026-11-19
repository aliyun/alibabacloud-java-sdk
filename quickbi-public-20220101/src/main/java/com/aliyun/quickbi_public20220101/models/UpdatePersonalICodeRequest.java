// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdatePersonalICodeRequest extends TeaModel {
    /**
     * <p>The user ID in Quick BI.</p>
     * 
     * <strong>example:</strong>
     * <p>sasdasasd</p>
     */
    @NameInMap("QuickBIUserId")
    public String quickBIUserId;

    public static UpdatePersonalICodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePersonalICodeRequest self = new UpdatePersonalICodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePersonalICodeRequest setQuickBIUserId(String quickBIUserId) {
        this.quickBIUserId = quickBIUserId;
        return this;
    }
    public String getQuickBIUserId() {
        return this.quickBIUserId;
    }

}
