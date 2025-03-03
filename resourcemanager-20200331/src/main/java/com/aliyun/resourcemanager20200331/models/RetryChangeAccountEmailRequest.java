// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RetryChangeAccountEmailRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>181761095690****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static RetryChangeAccountEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryChangeAccountEmailRequest self = new RetryChangeAccountEmailRequest();
        return TeaModel.build(map, self);
    }

    public RetryChangeAccountEmailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
