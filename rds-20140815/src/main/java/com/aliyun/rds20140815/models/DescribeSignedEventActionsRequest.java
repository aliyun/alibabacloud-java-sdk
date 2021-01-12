// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BeginEventId")
    public Integer beginEventId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSignedEventActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsRequest self = new DescribeSignedEventActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSignedEventActionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSignedEventActionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSignedEventActionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSignedEventActionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSignedEventActionsRequest setBeginEventId(Integer beginEventId) {
        this.beginEventId = beginEventId;
        return this;
    }
    public Integer getBeginEventId() {
        return this.beginEventId;
    }

    public DescribeSignedEventActionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
