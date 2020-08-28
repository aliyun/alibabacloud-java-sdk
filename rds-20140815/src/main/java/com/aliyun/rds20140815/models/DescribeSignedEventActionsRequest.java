// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BeginEventId")
    public Integer beginEventId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSignedEventActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsRequest self = new DescribeSignedEventActionsRequest();
        return TeaModel.build(map, self);
    }

}
