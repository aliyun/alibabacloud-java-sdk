// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetPersonalICodeRequest extends TeaModel {
    /**
     * <p>The Quick BI user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>asdasda</p>
     */
    @NameInMap("QuickBIUserId")
    public String quickBIUserId;

    public static GetPersonalICodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalICodeRequest self = new GetPersonalICodeRequest();
        return TeaModel.build(map, self);
    }

    public GetPersonalICodeRequest setQuickBIUserId(String quickBIUserId) {
        this.quickBIUserId = quickBIUserId;
        return this;
    }
    public String getQuickBIUserId() {
        return this.quickBIUserId;
    }

}
