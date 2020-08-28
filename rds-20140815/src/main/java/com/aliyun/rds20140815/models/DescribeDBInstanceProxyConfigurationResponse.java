// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TransparentSwitchConfiguration")
    @Validation(required = true)
    public String transparentSwitchConfiguration;

    @NameInMap("PersistentConnectionsConfiguration")
    @Validation(required = true)
    public String persistentConnectionsConfiguration;

    @NameInMap("AttacksProtectionConfiguration")
    @Validation(required = true)
    public String attacksProtectionConfiguration;

    public static DescribeDBInstanceProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceProxyConfigurationResponse self = new DescribeDBInstanceProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

}
