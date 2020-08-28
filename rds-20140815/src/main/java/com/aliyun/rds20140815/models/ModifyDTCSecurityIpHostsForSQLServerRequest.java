// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("SecurityToken")
    public String securityToken;

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

    @NameInMap("SecurityIpHosts")
    @Validation(required = true)
    public String securityIpHosts;

    @NameInMap("WhiteListGroupName")
    @Validation(required = true)
    public String whiteListGroupName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyDTCSecurityIpHostsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerRequest self = new ModifyDTCSecurityIpHostsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

}
