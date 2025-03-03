// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountRequest extends TeaModel {
    /**
     * <p>The ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177242285274****</p>
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
