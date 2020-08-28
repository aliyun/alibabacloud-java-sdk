// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    public String vpnConnectionId;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    public String vpnGatewayId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("LocalSubnet")
    @Validation(required = true)
    public String localSubnet;

    @NameInMap("RemoteSubnet")
    @Validation(required = true)
    public String remoteSubnet;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("EffectImmediately")
    @Validation(required = true)
    public Boolean effectImmediately;

    @NameInMap("EnableDpd")
    @Validation(required = true)
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    @Validation(required = true)
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseIkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseIpsecConfig ipsecConfig;

    @NameInMap("VcoHealthCheck")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseVpnBgpConfig vpnBgpConfig;

    public static ModifyVpnConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeResponse self = new ModifyVpnConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyVpnConnectionAttributeResponseIkeConfig extends TeaModel {
        @NameInMap("Psk")
        @Validation(required = true)
        public String psk;

        @NameInMap("IkeVersion")
        @Validation(required = true)
        public String ikeVersion;

        @NameInMap("IkeMode")
        @Validation(required = true)
        public String ikeMode;

        @NameInMap("IkeEncAlg")
        @Validation(required = true)
        public String ikeEncAlg;

        @NameInMap("IkeAuthAlg")
        @Validation(required = true)
        public String ikeAuthAlg;

        @NameInMap("IkePfs")
        @Validation(required = true)
        public String ikePfs;

        @NameInMap("IkeLifetime")
        @Validation(required = true)
        public Long ikeLifetime;

        @NameInMap("LocalId")
        @Validation(required = true)
        public String localId;

        @NameInMap("RemoteId")
        @Validation(required = true)
        public String remoteId;

        public static ModifyVpnConnectionAttributeResponseIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseIkeConfig self = new ModifyVpnConnectionAttributeResponseIkeConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyVpnConnectionAttributeResponseIpsecConfig extends TeaModel {
        @NameInMap("IpsecEncAlg")
        @Validation(required = true)
        public String ipsecEncAlg;

        @NameInMap("IpsecAuthAlg")
        @Validation(required = true)
        public String ipsecAuthAlg;

        @NameInMap("IpsecPfs")
        @Validation(required = true)
        public String ipsecPfs;

        @NameInMap("IpsecLifetime")
        @Validation(required = true)
        public Long ipsecLifetime;

        public static ModifyVpnConnectionAttributeResponseIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseIpsecConfig self = new ModifyVpnConnectionAttributeResponseIpsecConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyVpnConnectionAttributeResponseVcoHealthCheck extends TeaModel {
        @NameInMap("Enable")
        @Validation(required = true)
        public String enable;

        @NameInMap("Sip")
        @Validation(required = true)
        public String sip;

        @NameInMap("Dip")
        @Validation(required = true)
        public String dip;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Retry")
        @Validation(required = true)
        public Integer retry;

        public static ModifyVpnConnectionAttributeResponseVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseVcoHealthCheck self = new ModifyVpnConnectionAttributeResponseVcoHealthCheck();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyVpnConnectionAttributeResponseVpnBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        @Validation(required = true)
        public String enableBgp;

        @NameInMap("TunnelCidr")
        @Validation(required = true)
        public String tunnelCidr;

        @NameInMap("LocalBgpIp")
        @Validation(required = true)
        public String localBgpIp;

        @NameInMap("PeerBgpIp")
        @Validation(required = true)
        public String peerBgpIp;

        @NameInMap("LocalAsn")
        @Validation(required = true)
        public Integer localAsn;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public Integer peerAsn;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ModifyVpnConnectionAttributeResponseVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyVpnConnectionAttributeResponseVpnBgpConfig self = new ModifyVpnConnectionAttributeResponseVpnBgpConfig();
            return TeaModel.build(map, self);
        }

    }

}
