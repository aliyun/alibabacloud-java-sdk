// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SetGatewayAutoUpgradeConfigurationRequest extends TeaModel {
    @NameInMap("AutoUpgradeEndHour")
    public Integer autoUpgradeEndHour;

    @NameInMap("AutoUpgradeStartHour")
    public Integer autoUpgradeStartHour;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IsAutoUpgrade")
    public Boolean isAutoUpgrade;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetGatewayAutoUpgradeConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGatewayAutoUpgradeConfigurationRequest self = new SetGatewayAutoUpgradeConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetGatewayAutoUpgradeConfigurationRequest setAutoUpgradeEndHour(Integer autoUpgradeEndHour) {
        this.autoUpgradeEndHour = autoUpgradeEndHour;
        return this;
    }
    public Integer getAutoUpgradeEndHour() {
        return this.autoUpgradeEndHour;
    }

    public SetGatewayAutoUpgradeConfigurationRequest setAutoUpgradeStartHour(Integer autoUpgradeStartHour) {
        this.autoUpgradeStartHour = autoUpgradeStartHour;
        return this;
    }
    public Integer getAutoUpgradeStartHour() {
        return this.autoUpgradeStartHour;
    }

    public SetGatewayAutoUpgradeConfigurationRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public SetGatewayAutoUpgradeConfigurationRequest setIsAutoUpgrade(Boolean isAutoUpgrade) {
        this.isAutoUpgrade = isAutoUpgrade;
        return this;
    }
    public Boolean getIsAutoUpgrade() {
        return this.isAutoUpgrade;
    }

    public SetGatewayAutoUpgradeConfigurationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
