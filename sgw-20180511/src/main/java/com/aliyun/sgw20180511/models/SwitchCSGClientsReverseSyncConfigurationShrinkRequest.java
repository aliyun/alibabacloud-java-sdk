// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchCSGClientsReverseSyncConfigurationShrinkRequest extends TeaModel {
    @NameInMap("ClientIds")
    public String clientIdsShrink;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("IsReverseSync")
    public Boolean isReverseSync;

    @NameInMap("ReverseSyncInternalSecond")
    public Integer reverseSyncInternalSecond;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SwitchCSGClientsReverseSyncConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchCSGClientsReverseSyncConfigurationShrinkRequest self = new SwitchCSGClientsReverseSyncConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SwitchCSGClientsReverseSyncConfigurationShrinkRequest setClientIdsShrink(String clientIdsShrink) {
        this.clientIdsShrink = clientIdsShrink;
        return this;
    }
    public String getClientIdsShrink() {
        return this.clientIdsShrink;
    }

    public SwitchCSGClientsReverseSyncConfigurationShrinkRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public SwitchCSGClientsReverseSyncConfigurationShrinkRequest setIsReverseSync(Boolean isReverseSync) {
        this.isReverseSync = isReverseSync;
        return this;
    }
    public Boolean getIsReverseSync() {
        return this.isReverseSync;
    }

    public SwitchCSGClientsReverseSyncConfigurationShrinkRequest setReverseSyncInternalSecond(Integer reverseSyncInternalSecond) {
        this.reverseSyncInternalSecond = reverseSyncInternalSecond;
        return this;
    }
    public Integer getReverseSyncInternalSecond() {
        return this.reverseSyncInternalSecond;
    }

    public SwitchCSGClientsReverseSyncConfigurationShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
