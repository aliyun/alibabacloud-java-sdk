// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelChangeAccountEmailRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>181761095690****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static CancelChangeAccountEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelChangeAccountEmailRequest self = new CancelChangeAccountEmailRequest();
        return TeaModel.build(map, self);
    }

    public CancelChangeAccountEmailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
