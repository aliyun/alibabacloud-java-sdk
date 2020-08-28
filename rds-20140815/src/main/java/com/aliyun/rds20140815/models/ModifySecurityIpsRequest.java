// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SecurityIps")
    @Validation(required = true)
    public String securityIps;

    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    @NameInMap("SecurityIPType")
    public String securityIPType;

    @NameInMap("WhitelistNetworkType")
    public String whitelistNetworkType;

    @NameInMap("ModifyMode")
    public String modifyMode;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

}
