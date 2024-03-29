// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupRequest self = new DeleteResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
