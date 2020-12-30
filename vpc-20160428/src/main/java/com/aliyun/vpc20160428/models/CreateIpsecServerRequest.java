// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIpsecServerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("LocalSubnet")
    public String localSubnet;

    @NameInMap("ClientIpPool")
    public String clientIpPool;

    @NameInMap("IpSecServerName")
    public String ipSecServerName;

    @NameInMap("EffectImmediately")
    public Boolean effectImmediately;

    @NameInMap("IkeConfig")
    public String ikeConfig;

    @NameInMap("IpsecConfig")
    public String ipsecConfig;

    @NameInMap("PskEnabled")
    public Boolean pskEnabled;

    @NameInMap("Psk")
    public String psk;

    @NameInMap("MultiFactorAuthEnabled")
    public Boolean multiFactorAuthEnabled;

    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("callerBid")
    public String callerBid;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateIpsecServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsecServerRequest self = new CreateIpsecServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpsecServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpsecServerRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public CreateIpsecServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public CreateIpsecServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public CreateIpsecServerRequest setIpSecServerName(String ipSecServerName) {
        this.ipSecServerName = ipSecServerName;
        return this;
    }
    public String getIpSecServerName() {
        return this.ipSecServerName;
    }

    public CreateIpsecServerRequest setEffectImmediately(Boolean effectImmediately) {
        this.effectImmediately = effectImmediately;
        return this;
    }
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    public CreateIpsecServerRequest setIkeConfig(String ikeConfig) {
        this.ikeConfig = ikeConfig;
        return this;
    }
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    public CreateIpsecServerRequest setIpsecConfig(String ipsecConfig) {
        this.ipsecConfig = ipsecConfig;
        return this;
    }
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    public CreateIpsecServerRequest setPskEnabled(Boolean pskEnabled) {
        this.pskEnabled = pskEnabled;
        return this;
    }
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    public CreateIpsecServerRequest setPsk(String psk) {
        this.psk = psk;
        return this;
    }
    public String getPsk() {
        return this.psk;
    }

    public CreateIpsecServerRequest setMultiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
        this.multiFactorAuthEnabled = multiFactorAuthEnabled;
        return this;
    }
    public Boolean getMultiFactorAuthEnabled() {
        return this.multiFactorAuthEnabled;
    }

    public CreateIpsecServerRequest setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

    public CreateIpsecServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpsecServerRequest setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public CreateIpsecServerRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CreateIpsecServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
