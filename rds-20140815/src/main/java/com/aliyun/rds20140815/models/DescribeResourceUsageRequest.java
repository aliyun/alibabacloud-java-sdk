// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeResourceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageRequest self = new DescribeResourceUsageRequest();
        return TeaModel.build(map, self);
    }

}
