// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CrossBackupId")
    @Validation(required = true)
    public Integer crossBackupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAvailableRecoveryTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeRequest self = new DescribeAvailableRecoveryTimeRequest();
        return TeaModel.build(map, self);
    }

}
