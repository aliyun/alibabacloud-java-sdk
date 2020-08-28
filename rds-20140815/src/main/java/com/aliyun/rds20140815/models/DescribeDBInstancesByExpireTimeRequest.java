// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByExpireTimeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("ExpirePeriod")
    public Integer expirePeriod;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeDBInstancesByExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByExpireTimeRequest self = new DescribeDBInstancesByExpireTimeRequest();
        return TeaModel.build(map, self);
    }

}
