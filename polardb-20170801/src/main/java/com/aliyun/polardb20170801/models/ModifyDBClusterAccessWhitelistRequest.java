// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("SecurityIps")
    public String securityIps;

    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    @NameInMap("WhiteListType")
    public String whiteListType;

    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    @NameInMap("ModifyMode")
    public String modifyMode;

    public static ModifyDBClusterAccessWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhitelistRequest self = new ModifyDBClusterAccessWhitelistRequest();
        return TeaModel.build(map, self);
    }

}
