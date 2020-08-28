// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    @NameInMap("Expired")
    public String expired;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("ConnectionMode")
    public String connectionMode;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("InstanceLevel")
    public Integer instanceLevel;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

}
