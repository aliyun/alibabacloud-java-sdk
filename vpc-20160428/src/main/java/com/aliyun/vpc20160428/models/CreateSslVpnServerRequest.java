// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerRequest extends TeaModel {
    /**
     * <p>The encryption algorithm used by the SSL-VPN connection.</p>
     * <ul>
     * <li><p>If the client uses Tunnelblick or OpenVPN 2.4.0 or later, the SSL server and the client dynamically negotiate the encryption algorithm and preferentially use the encryption algorithm with the highest security level that is supported by both parties. The encryption algorithm that you specify for the SSL server does not take effect.</p>
     * </li>
     * <li><p>If the client uses OpenVPN earlier than 2.4.0, the SSL server and the client use the encryption algorithm that you specify for the SSL server. The SSL server supports the following encryption algorithms:</p>
     * <ul>
     * <li><p><strong>AES-128-CBC</strong> (default): AES-128-CBC algorithm.</p>
     * </li>
     * <li><p><strong>AES-192-CBC</strong>: AES-192-CBC algorithm.</p>
     * </li>
     * <li><p><strong>AES-256-CBC</strong>: AES-256-CBC algorithm.</p>
     * </li>
     * <li><p><strong>none</strong>: no encryption algorithm is used.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES-128-CBC</p>
     */
    @NameInMap("Cipher")
    public String cipher;

    /**
     * <p>The client CIDR block.</p>
     * <p>The client CIDR block is used to allocate IP addresses to virtual network interface controllers (NICs) of clients. It does not refer to the existing internal network CIDR block of the client.</p>
     * <p>When a client accesses the local network through an SSL-VPN connection, the VPN gateway allocates an IP address from the specified client CIDR block to the client. The client uses the allocated IP address to access cloud resources.</p>
     * <p>When you specify the client CIDR block, make sure that the number of IP addresses in the client CIDR block is at least four times the number of SSL-VPN connections supported by the VPN gateway.</p>
     * <details>
     * <summary>Click to view the reason</summary>
     * 
     * <p>For example, if you specify 192.168.0.0/24 as the client CIDR block, the system first divides a subnet with a 30-bit subnet mask from the 192.168.0.0/24 CIDR block, such as 192.168.0.4/30, and then allocates one IP address from 192.168.0.4/30 to the client. The remaining three IP addresses are used by the system to ensure network communication. In this case, one client consumes four IP addresses. Therefore, to ensure that all clients can be allocated IP addresses, make sure that the number of IP addresses in the client CIDR block is at least four times the number of SSL-VPN connections supported by the VPN gateway.</p>
     * </details>
     * 
     * <details>
     * <summary>Click to view unsupported CIDR blocks</summary>
     * 
     * <ul>
     * <li>100.64.0.0 to 100.127.255.255</li>
     * <li>127.0.0.0 to 127.255.255.255</li>
     * <li>169.254.0.0 to 169.254.255.255</li>
     * <li>224.0.0.0 to 239.255.255.255</li>
     * <li>255.0.0.0 to 255.255.255.255</details></li>
     * </ul>
     * <details>
     * <summary>Click to view recommended client CIDR blocks for each number of SSL-VPN connections</summary>
     * 
     * <ul>
     * <li>If the number of SSL-VPN connections is 5, the subnet mask of the client CIDR block must be 27 bits or less. Example: 10.0.0.0/27 or 10.0.0.0/26.</li>
     * <li>If the number of SSL-VPN connections is 10, the subnet mask of the client CIDR block must be 26 bits or less. Example: 10.0.0.0/26 or 10.0.0.0/25.</li>
     * <li>If the number of SSL-VPN connections is 20, the subnet mask of the client CIDR block must be 25 bits or less. Example: 10.0.0.0/25 or 10.0.0.0/24.</li>
     * <li>If the number of SSL-VPN connections is 50, the subnet mask of the client CIDR block must be 24 bits or less. Example: 10.0.0.0/24 or 10.0.0.0/23.</li>
     * <li>If the number of SSL-VPN connections is 100, the subnet mask of the client CIDR block must be 23 bits or less. Example: 10.0.0.0/23 or 10.0.0.0/22.</li>
     * <li>If the number of SSL-VPN connections is 200, the subnet mask of the client CIDR block must be 22 bits or less. Example: 10.0.0.0/22 or 10.0.0.0/21.</li>
     * <li>If the number of SSL-VPN connections is 500, the subnet mask of the client CIDR block must be 21 bits or less. Example: 10.0.0.0/21 or 10.0.0.0/20.</li>
     * <li>If the number of SSL-VPN connections is 1000, the subnet mask of the client CIDR block must be 20 bits or less. Example: 10.0.0.0/20 or 10.0.0.0/19.</li>
     * </ul>
     * </details>
     * 
     * <blockquote>
     * <ul>
     * <li>The subnet mask of the client CIDR block must be 16 to 29 bits.</li>
     * <li>Make sure that the client CIDR block does not overlap with the local CIDR block, the virtual private cloud (VPC) CIDR block, or any routing CIDR block associated with the client terminal.</li>
     * <li>When you specify the client CIDR block, use 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16, or their subnets. If you want to specify a public CIDR block as the client CIDR block, set the public CIDR block as a user CIDR block of the VPC to ensure that the VPC can access the public CIDR block. For more information about user CIDR blocks, see <a href="https://help.aliyun.com/document_detail/185311.html">VPC FAQ</a>.</li>
     * <li>After the SSL server is created, the system automatically adds the routing of the client CIDR block to the route table of the VPC instance. Do not manually add the routing of the client CIDR block to the route table of the VPC instance. Otherwise, SSL-VPN connection traffic may be abnormal.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to compress communication data. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: compresses communication data.</p>
     * </li>
     * <li><p><strong>false</strong> (default): does not compress communication data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("DnsServers")
    public String dnsServers;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without performing the actual request. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable two-factor authentication. If you enable two-factor authentication, you must also configure <code>IDaaSInstanceId</code>, <code>IDaaSRegionId</code>, and <code>IDaaSApplicationId</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you use two-factor authentication for the first time, complete <a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22%3A%5B%7B%22Service%22%3A%22VPN%22%2C%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunVpnAccessingIdaasRole%22%2C%22TemplateId%22%3A%22IdaasRole%22%7D%5D%7D%5D%2C%22ReturnUrl%22%3A%22https%3A%2F%2Fvpc.console.aliyun.com%2Fsslvpn%2Fcn-shanghai%2Fvpn-servers%22%7D">authorization</a> before creating the SSL server.</li>
     * <li>When you create an SSL server in the UAE (Dubai) region, bind an IDaaS EIAM 2.0 instance in the Singapore region to reduce cross-region latency.</li>
     * <li>IDaaS EIAM 1.0 instances are no longer available for purchase. If your Alibaba Cloud account has IDaaS EIAM 1.0 instances, you can still bind IDaaS EIAM 1.0 instances after enabling two-factor authentication. If your Alibaba Cloud account does not have IDaaS EIAM 1.0 instances, you can bind only IDaaS EIAM 2.0 instances after enabling two-factor authentication.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    /**
     * <p>The ID of the IDaaS application.</p>
     * <ul>
     * <li>If you bind an IDaaS EIAM 2.0 instance, enter the IDaaS application ID.</li>
     * <li>If you bind an IDaaS EIAM 1.0 instance, you do not need to enter the IDaaS application ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>app_my6g4qmvnwxzj2f****</p>
     */
    @NameInMap("IDaaSApplicationId")
    public String IDaaSApplicationId;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-cn-hangzhou-p****</p>
     */
    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    /**
     * <p>The region ID of the IDaaS EIAM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("IDaaSRegionId")
    public String IDaaSRegionId;

    /**
     * <p>The local CIDR block.</p>
     * <p>The local CIDR block is the CIDR block that the client needs to access through the SSL-VPN connection.</p>
     * <p>The local CIDR block can be the CIDR block of a VPC, the CIDR block of a vSwitch, the CIDR block of an on-premises data center that is connected to a VPC through an Express Connect circuit, or the CIDR block of a cloud service such as Object Storage Service (OSS).</p>
     * <p>The subnet mask of the local CIDR block must be 8 to 32 bits. The following CIDR blocks cannot be specified as the local CIDR block:</p>
     * <ul>
     * <li>127.0.0.0 to 127.255.255.255</li>
     * <li>169.254.0.0 to 169.254.255.255</li>
     * <li>224.0.0.0 to 239.255.255.255</li>
     * <li>255.0.0.0 to 255.255.255.255.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the SSL server.</p>
     * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>sslvpnname</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port used by the SSL server. Valid values: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>1194</strong>.</p>
     * <p>The following ports are not supported: <strong>22</strong>, <strong>2222</strong>, <strong>22222</strong>, <strong>9000</strong>, <strong>9001</strong>, <strong>9002</strong>, <strong>7505</strong>, <strong>80</strong>, <strong>443</strong>, <strong>53</strong>, <strong>68</strong>, <strong>123</strong>, <strong>4510</strong>, <strong>4560</strong>, <strong>500</strong>, or <strong>4500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1194</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The protocol used by the SSL server. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong> (default): TCP protocol.</li>
     * <li><strong>UDP</strong>: UDP protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1hgim8by0kc9nga****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static CreateSslVpnServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnServerRequest self = new CreateSslVpnServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnServerRequest setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

    public CreateSslVpnServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public CreateSslVpnServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSslVpnServerRequest setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public CreateSslVpnServerRequest setDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public String getDnsServers() {
        return this.dnsServers;
    }

    public CreateSslVpnServerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSslVpnServerRequest setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
        this.enableMultiFactorAuth = enableMultiFactorAuth;
        return this;
    }
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    public CreateSslVpnServerRequest setIDaaSApplicationId(String IDaaSApplicationId) {
        this.IDaaSApplicationId = IDaaSApplicationId;
        return this;
    }
    public String getIDaaSApplicationId() {
        return this.IDaaSApplicationId;
    }

    public CreateSslVpnServerRequest setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

    public CreateSslVpnServerRequest setIDaaSRegionId(String IDaaSRegionId) {
        this.IDaaSRegionId = IDaaSRegionId;
        return this;
    }
    public String getIDaaSRegionId() {
        return this.IDaaSRegionId;
    }

    public CreateSslVpnServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public CreateSslVpnServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSslVpnServerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSslVpnServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSslVpnServerRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateSslVpnServerRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public CreateSslVpnServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSslVpnServerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSslVpnServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSslVpnServerRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
