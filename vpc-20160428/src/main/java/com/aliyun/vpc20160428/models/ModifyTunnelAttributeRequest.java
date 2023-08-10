// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyTunnelAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("TunnelOptionsSpecification")
    public ModifyTunnelAttributeRequestTunnelOptionsSpecification tunnelOptionsSpecification;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static ModifyTunnelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTunnelAttributeRequest self = new ModifyTunnelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTunnelAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTunnelAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTunnelAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTunnelAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTunnelAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTunnelAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTunnelAttributeRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public ModifyTunnelAttributeRequest setTunnelOptionsSpecification(ModifyTunnelAttributeRequestTunnelOptionsSpecification tunnelOptionsSpecification) {
        this.tunnelOptionsSpecification = tunnelOptionsSpecification;
        return this;
    }
    public ModifyTunnelAttributeRequestTunnelOptionsSpecification getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    public ModifyTunnelAttributeRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig extends TeaModel {
        @NameInMap("LocalAsn")
        public Long localAsn;

        @NameInMap("LocalBgpIp")
        public String localBgpIp;

        @NameInMap("TunnelCidr")
        public String tunnelCidr;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalAsn(Long localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public Long getLocalAsn() {
            return this.localAsn;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setLocalBgpIp(String localBgpIp) {
            this.localBgpIp = localBgpIp;
            return this;
        }
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig setTunnelCidr(String tunnelCidr) {
            this.tunnelCidr = tunnelCidr;
            return this;
        }
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig extends TeaModel {
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        @NameInMap("IkeMode")
        public String ikeMode;

        @NameInMap("IkePfs")
        public String ikePfs;

        @NameInMap("IkeVersion")
        public String ikeVersion;

        @NameInMap("LocalId")
        public String localId;

        @NameInMap("Psk")
        public String psk;

        @NameInMap("RemoteId")
        public String remoteId;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig self = new ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ModifyTunnelAttributeRequestTunnelOptionsSpecification extends TeaModel {
        @NameInMap("EnableDpd")
        public Boolean enableDpd;

        @NameInMap("EnableNatTraversal")
        public Boolean enableNatTraversal;

        @NameInMap("RemoteCaCertificate")
        public String remoteCaCertificate;

        @NameInMap("TunnelBgpConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig;

        @NameInMap("TunnelIkeConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig;

        @NameInMap("TunnelIpsecConfig")
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig;

        public static ModifyTunnelAttributeRequestTunnelOptionsSpecification build(java.util.Map<String, ?> map) throws Exception {
            ModifyTunnelAttributeRequestTunnelOptionsSpecification self = new ModifyTunnelAttributeRequestTunnelOptionsSpecification();
            return TeaModel.build(map, self);
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setEnableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setEnableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setRemoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelBgpConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelIkeConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        public ModifyTunnelAttributeRequestTunnelOptionsSpecification setTunnelIpsecConfig(ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }
        public ModifyTunnelAttributeRequestTunnelOptionsSpecificationTunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

    }

}
