// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationRequest extends TeaModel {
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

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    public static ModifySecurityGroupConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationRequest self = new ModifySecurityGroupConfigurationRequest();
        return TeaModel.build(map, self);
    }

}
