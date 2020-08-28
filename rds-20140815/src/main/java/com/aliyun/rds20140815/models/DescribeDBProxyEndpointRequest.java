// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointRequest extends TeaModel {
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

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeDBProxyEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointRequest self = new DescribeDBProxyEndpointRequest();
        return TeaModel.build(map, self);
    }

}
