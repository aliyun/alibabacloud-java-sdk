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

    public DescribeDBInstanceProxyConfigurationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceProxyConfigurationResponse setTransparentSwitchConfiguration(String transparentSwitchConfiguration) {
        this.transparentSwitchConfiguration = transparentSwitchConfiguration;
        return this;
    }
    public String getTransparentSwitchConfiguration() {
        return this.transparentSwitchConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponse setPersistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
        this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
        return this;
    }
    public String getPersistentConnectionsConfiguration() {
        return this.persistentConnectionsConfiguration;
    }

    public DescribeDBInstanceProxyConfigurationResponse setAttacksProtectionConfiguration(String attacksProtectionConfiguration) {
        this.attacksProtectionConfiguration = attacksProtectionConfiguration;
        return this;
    }
    public String getAttacksProtectionConfiguration() {
        return this.attacksProtectionConfiguration;
    }

}
