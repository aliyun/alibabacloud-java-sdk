// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static RemoveCloudAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveCloudAccountRequest self = new RemoveCloudAccountRequest();
        return TeaModel.build(map, self);
    }

    public RemoveCloudAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
