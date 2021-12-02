// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateIpsecServerRequest extends TeaModel {
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("IkeConfig")
    public String ikeConfig;

    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("Psk")
    public String psk;

    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpsecServerRequest self = new UpdateIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpsecServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public UpdateIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UpdateIpsecServerRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public UpdateIpsecServerRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public UpdateIpsecServerRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public UpdateIpsecServerRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public UpdateIpsecServerRequest setIpsecServerName(String ipsecServerName) {
        this.ipsecServerName = ipsecServerName;
        return this;
    }
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    public UpdateIpsecServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public UpdateIpsecServerRequest setPsk(String psk) {
        this.psk = psk;
        return this;
    }
    public String getPsk() {
        return this.psk;
    }

    public UpdateIpsecServerRequest setPskEnabled(Boolean pskEnabled) {
        this.pskEnabled = pskEnabled;
        return this;
    }
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    public UpdateIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
