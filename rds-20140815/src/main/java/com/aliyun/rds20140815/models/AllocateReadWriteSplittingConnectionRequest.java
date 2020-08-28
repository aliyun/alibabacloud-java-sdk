// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("Port")
    public String port;

    @NameInMap("MaxDelayTime")
    public String maxDelayTime;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("DistributionType")
    public String distributionType;

    @NameInMap("Weight")
    public String weight;

    public static AllocateReadWriteSplittingConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateReadWriteSplittingConnectionRequest self = new AllocateReadWriteSplittingConnectionRequest();
        return TeaModel.build(map, self);
    }

}
