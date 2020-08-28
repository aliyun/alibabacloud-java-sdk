// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyRequest extends TeaModel {
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

    @NameInMap("ConfigDBProxyService")
    @Validation(required = true)
    public String configDBProxyService;

    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String VSwitchId;

    public static ModifyDBProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyRequest self = new ModifyDBProxyRequest();
        return TeaModel.build(map, self);
    }

}
