// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeCollationTimeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesRequest self = new DescribeCollationTimeZonesRequest();
        return TeaModel.build(map, self);
    }

}
