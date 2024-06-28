// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersResponseBody extends TeaModel {
    /**
     * <p>The list of IPsec servers.</p>
     */
    @NameInMap("IpsecServers")
    public java.util.List<ListIpsecServersResponseBodyIpsecServers> ipsecServers;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpsecServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServersResponseBody self = new ListIpsecServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpsecServersResponseBody setIpsecServers(java.util.List<ListIpsecServersResponseBodyIpsecServers> ipsecServers) {
        this.ipsecServers = ipsecServers;
        return this;
    }
    public java.util.List<ListIpsecServersResponseBodyIpsecServers> getIpsecServers() {
        return this.ipsecServers;
    }

    public ListIpsecServersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpsecServersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpsecServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpsecServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpsecServersResponseBodyIpsecServersIkeConfig extends TeaModel {
        /**
         * <p>The IKE authentication algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IkeAuthAlg")
        public String ikeAuthAlg;

        /**
         * <p>The IKE encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IkeEncAlg")
        public String ikeEncAlg;

        /**
         * <p>The IKE lifetime. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IkeLifetime")
        public Long ikeLifetime;

        /**
         * <p>The IKE negotiation mode. Valid values:</p>
         * <p><strong>main</strong>: This mode offers higher security during negotiations.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("IkeMode")
        public String ikeMode;

        /**
         * <p>The Diffie-Hellman key exchange algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IkePfs")
        public String ikePfs;

        /**
         * <p>The IKE version.</p>
         * 
         * <strong>example:</strong>
         * <p>ikev2</p>
         */
        @NameInMap("IkeVersion")
        public String ikeVersion;

        /**
         * <p>The ID of the IPsec server. The default value is the public IP address of the VPN gateway. Both FQDNs and IP addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>116.64.XX.XX</p>
         */
        @NameInMap("LocalId")
        public String localId;

        /**
         * <p>The identifier of the customer gateway. Both fully qualified domain names (FQDNs) and IP addresses are supported. By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>139.67.XX.XX</p>
         */
        @NameInMap("RemoteId")
        public String remoteId;

        public static ListIpsecServersResponseBodyIpsecServersIkeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServersIkeConfig self = new ListIpsecServersResponseBodyIpsecServersIkeConfig();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeAuthAlg(String ikeAuthAlg) {
            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeEncAlg(String ikeEncAlg) {
            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeLifetime(Long ikeLifetime) {
            this.ikeLifetime = ikeLifetime;
            return this;
        }
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeMode(String ikeMode) {
            this.ikeMode = ikeMode;
            return this;
        }
        public String getIkeMode() {
            return this.ikeMode;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkePfs(String ikePfs) {
            this.ikePfs = ikePfs;
            return this;
        }
        public String getIkePfs() {
            return this.ikePfs;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setIkeVersion(String ikeVersion) {
            this.ikeVersion = ikeVersion;
            return this;
        }
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setLocalId(String localId) {
            this.localId = localId;
            return this;
        }
        public String getLocalId() {
            return this.localId;
        }

        public ListIpsecServersResponseBodyIpsecServersIkeConfig setRemoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }
        public String getRemoteId() {
            return this.remoteId;
        }

    }

    public static class ListIpsecServersResponseBodyIpsecServersIpsecConfig extends TeaModel {
        /**
         * <p>The IPsec authentication algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        @NameInMap("IpsecAuthAlg")
        public String ipsecAuthAlg;

        /**
         * <p>The IPsec encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>aes</p>
         */
        @NameInMap("IpsecEncAlg")
        public String ipsecEncAlg;

        /**
         * <p>The IPsec lifetime. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("IpsecLifetime")
        public Long ipsecLifetime;

        /**
         * <p>The Diffie-Hellman key exchange algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>group2</p>
         */
        @NameInMap("IpsecPfs")
        public String ipsecPfs;

        public static ListIpsecServersResponseBodyIpsecServersIpsecConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServersIpsecConfig self = new ListIpsecServersResponseBodyIpsecServersIpsecConfig();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecLifetime(Long ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Long getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        public ListIpsecServersResponseBodyIpsecServersIpsecConfig setIpsecPfs(String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

    }

    public static class ListIpsecServersResponseBodyIpsecServers extends TeaModel {
        /**
         * <p>The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("ClientIpPool")
        public String clientIpPool;

        /**
         * <p>The time when the IPsec server was created.</p>
         * <p>T is used as a delimiter. Z indicates that the time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-03T10:11:55Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the current IPsec tunnel is deleted and negotiations are reinitiated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: immediately initiates negotiations after the configuration is completed.</li>
         * <li><strong>false</strong>: initiates negotiations when inbound traffic is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EffectImmediately")
        public Boolean effectImmediately;

        /**
         * <p>The ID of the IDaaS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-cn-hangzhou-****</p>
         */
        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        /**
         * <p>The configurations of Phase 1 negotiations.</p>
         */
        @NameInMap("IkeConfig")
        public ListIpsecServersResponseBodyIpsecServersIkeConfig ikeConfig;

        /**
         * <p>The public IP address of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>47.22.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The configurations of Phase 2 negotiations.</p>
         */
        @NameInMap("IpsecConfig")
        public ListIpsecServersResponseBodyIpsecServersIpsecConfig ipsecConfig;

        /**
         * <p>The IPsec server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-bp1bo3xuvcxo7ixll****</p>
         */
        @NameInMap("IpsecServerId")
        public String ipsecServerId;

        /**
         * <p>The name of the IPsec server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpsecServerName")
        public String ipsecServerName;

        /**
         * <p>The local CIDR blocks, which refer to the CIDR blocks on the virtual private cloud (VPC) side.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16,172.17.0.0/16</p>
         */
        @NameInMap("LocalSubnet")
        public String localSubnet;

        /**
         * <p>The number of SSL-VPN connections supported by the VPN gateway.</p>
         * <blockquote>
         * <p> The number of SSL-VPN connections specified in this parameter includes both SSL-VPN and IPsec-VPN connections. For example, you have five SSL-VPN connections and three SSL clients occupy three SSL-VPN connections. In this case, two clients can connect to the IPsec server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>Indicates whether two-factor authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong>: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MultiFactorAuthEnabled")
        public Boolean multiFactorAuthEnabled;

        /**
         * <p>The number of clients that are connected to the IPsec server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineClientCount")
        public Integer onlineClientCount;

        /**
         * <p>The pre-shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>pgw6dy7d****</p>
         */
        @NameInMap("Psk")
        public String psk;

        /**
         * <p>Indicates whether pre-shared key authentication is enabled. Only <strong>true</strong> may be returned, which indicates that pre-shared key authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PskEnabled")
        public Boolean pskEnabled;

        /**
         * <p>The ID of the region where the IPsec server is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the IPsec server belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group information.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
         */
        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        public static ListIpsecServersResponseBodyIpsecServers build(java.util.Map<String, ?> map) throws Exception {
            ListIpsecServersResponseBodyIpsecServers self = new ListIpsecServersResponseBodyIpsecServers();
            return TeaModel.build(map, self);
        }

        public ListIpsecServersResponseBodyIpsecServers setClientIpPool(String clientIpPool) {
            this.clientIpPool = clientIpPool;
            return this;
        }
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        public ListIpsecServersResponseBodyIpsecServers setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListIpsecServersResponseBodyIpsecServers setEffectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        public ListIpsecServersResponseBodyIpsecServers setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        public ListIpsecServersResponseBodyIpsecServers setIkeConfig(ListIpsecServersResponseBodyIpsecServersIkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }
        public ListIpsecServersResponseBodyIpsecServersIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        public ListIpsecServersResponseBodyIpsecServers setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecConfig(ListIpsecServersResponseBodyIpsecServersIpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }
        public ListIpsecServersResponseBodyIpsecServersIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecServerId(String ipsecServerId) {
            this.ipsecServerId = ipsecServerId;
            return this;
        }
        public String getIpsecServerId() {
            return this.ipsecServerId;
        }

        public ListIpsecServersResponseBodyIpsecServers setIpsecServerName(String ipsecServerName) {
            this.ipsecServerName = ipsecServerName;
            return this;
        }
        public String getIpsecServerName() {
            return this.ipsecServerName;
        }

        public ListIpsecServersResponseBodyIpsecServers setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public ListIpsecServersResponseBodyIpsecServers setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public ListIpsecServersResponseBodyIpsecServers setMultiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
            this.multiFactorAuthEnabled = multiFactorAuthEnabled;
            return this;
        }
        public Boolean getMultiFactorAuthEnabled() {
            return this.multiFactorAuthEnabled;
        }

        public ListIpsecServersResponseBodyIpsecServers setOnlineClientCount(Integer onlineClientCount) {
            this.onlineClientCount = onlineClientCount;
            return this;
        }
        public Integer getOnlineClientCount() {
            return this.onlineClientCount;
        }

        public ListIpsecServersResponseBodyIpsecServers setPsk(String psk) {
            this.psk = psk;
            return this;
        }
        public String getPsk() {
            return this.psk;
        }

        public ListIpsecServersResponseBodyIpsecServers setPskEnabled(Boolean pskEnabled) {
            this.pskEnabled = pskEnabled;
            return this;
        }
        public Boolean getPskEnabled() {
            return this.pskEnabled;
        }

        public ListIpsecServersResponseBodyIpsecServers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpsecServersResponseBodyIpsecServers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpsecServersResponseBodyIpsecServers setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

    }

}
