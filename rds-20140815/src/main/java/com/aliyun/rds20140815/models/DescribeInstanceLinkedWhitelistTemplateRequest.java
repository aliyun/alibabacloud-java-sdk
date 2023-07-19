// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceLinkedWhitelistTemplateRequest extends TeaModel {
    @NameInMap("InsName")
    public String insName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceLinkedWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLinkedWhitelistTemplateRequest self = new DescribeInstanceLinkedWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
