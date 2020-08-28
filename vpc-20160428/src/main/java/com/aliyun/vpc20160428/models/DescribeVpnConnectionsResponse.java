// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("VpnConnections")
    @Validation(required = true)
    public DescribeVpnConnectionsResponseVpnConnections vpnConnections;

    public static DescribeVpnConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsResponse self = new DescribeVpnConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig extends TeaModel {
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

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnectionsVpnConnection extends TeaModel {
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
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionIpsecConfig ipsecConfig;

        @NameInMap("VcoHealthCheck")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVcoHealthCheck vcoHealthCheck;

        @NameInMap("VpnBgpConfig")
        @Validation(required = true)
        public DescribeVpnConnectionsResponseVpnConnectionsVpnConnectionVpnBgpConfig vpnBgpConfig;

        public static DescribeVpnConnectionsResponseVpnConnectionsVpnConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnectionsVpnConnection self = new DescribeVpnConnectionsResponseVpnConnectionsVpnConnection();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVpnConnectionsResponseVpnConnections extends TeaModel {
        @NameInMap("VpnConnection")
        @Validation(required = true)
        public java.util.List<DescribeVpnConnectionsResponseVpnConnectionsVpnConnection> vpnConnection;

        public static DescribeVpnConnectionsResponseVpnConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnConnectionsResponseVpnConnections self = new DescribeVpnConnectionsResponseVpnConnections();
            return TeaModel.build(map, self);
        }

    }

}
