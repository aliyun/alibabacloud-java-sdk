// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchCSGClientsReverseSyncConfigurationRequest extends TeaModel {
    @NameInMap("ClientIds")
    public java.util.List<String> clientIds;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("IsReverseSync")
    public Boolean isReverseSync;

    @NameInMap("ReverseSyncInternalSecond")
    public Integer reverseSyncInternalSecond;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SwitchCSGClientsReverseSyncConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchCSGClientsReverseSyncConfigurationRequest self = new SwitchCSGClientsReverseSyncConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SwitchCSGClientsReverseSyncConfigurationRequest setClientIds(java.util.List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public java.util.List<String> getClientIds() {
        return this.clientIds;
    }

    public SwitchCSGClientsReverseSyncConfigurationRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public SwitchCSGClientsReverseSyncConfigurationRequest setIsReverseSync(Boolean isReverseSync) {
        this.isReverseSync = isReverseSync;
        return this;
    }
    public Boolean getIsReverseSync() {
        return this.isReverseSync;
    }

    public SwitchCSGClientsReverseSyncConfigurationRequest setReverseSyncInternalSecond(Integer reverseSyncInternalSecond) {
        this.reverseSyncInternalSecond = reverseSyncInternalSecond;
        return this;
    }
    public Integer getReverseSyncInternalSecond() {
        return this.reverseSyncInternalSecond;
    }

    public SwitchCSGClientsReverseSyncConfigurationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
