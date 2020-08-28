// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponse extends TeaModel {
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

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("EnableDpd")
    @Validation(required = true)
    public Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    @Validation(required = true)
    public Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseIkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseIpsecConfig ipsecConfig;

    @NameInMap("VcoHealthCheck")
    @Validation(required = true)
    public DescribeVpnConnectionResponseVcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    @Validation(required = true)
    public DescribeVpnConnectionResponseVpnBgpConfig vpnBgpConfig;

    public static DescribeVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionResponse self = new DescribeVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnConnectionResponseIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionResponseIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseIkeConfig self = new DescribeVpnConnectionResponseIkeConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionResponseIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionResponseIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseIpsecConfig self = new DescribeVpnConnectionResponseIpsecConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionResponseVcoHealthCheck extends TeaModel {
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

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVpnConnectionResponseVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseVcoHealthCheck self = new DescribeVpnConnectionResponseVcoHealthCheck();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionResponseVpnBgpConfig extends TeaModel {
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
        public String localAsn;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public String peerAsn;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeVpnConnectionResponseVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionResponseVpnBgpConfig self = new DescribeVpnConnectionResponseVpnBgpConfig();
            return TeaModel.build(map, self);
        }

    }

}
