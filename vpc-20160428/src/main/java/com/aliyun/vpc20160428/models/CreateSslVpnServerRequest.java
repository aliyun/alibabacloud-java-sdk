// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerRequest extends TeaModel {
    /**
     * <p>The encryption algorithm that is used by the SSL-VPN connection.</p>
     * <ul>
     * <li><p>If the client uses Tunnelblick or OpenVPN 2.4.0 or later, the SSL server dynamically negotiates with the client about the encryption algorithm and uses the most secure encryption algorithm that is supported by the SSL server and the client. The encryption algorithm that you specify for the SSL server does not take effect.</p>
     * </li>
     * <li><p>If the client uses OpenVPN of a version that is earlier than 2.4.0, the SSL server and the client use the encryption algorithm that you specify for the SSL server. You can specify one of the following encryption algorithms for the SSL server:</p>
     * <ul>
     * <li><strong>AES-128-CBC</strong> (default)</li>
     * <li><strong>AES-192-CBC</strong></li>
     * <li><strong>AES-256-CBC</strong></li>
     * <li><strong>none</strong></li>
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
     * <p>The CIDR block from which an IP address is allocated to the virtual network interface controller (NIC) of the client, rather than the private CIDR block.</p>
     * <p>If the client accesses the SSL server over an SSL-VPN connection, the VPN gateway assigns an IP address from the specified client CIDR block for the client to access cloud resources.</p>
     * <p>Make sure that the number of IP addresses in the client CIDR block is at least four times the maximum number of SSL-VPN connections supported by the VPN gateway.</p>
     * <p><strong>Click to view the reason.</strong></p>
     * <p>For example, if you specify 192.168.0.0/24 as the client CIDR block, the system first divides a subnet CIDR block with a subnet mask of 30 from 192.168.0.0/24, such as 192.168.0.4/30. This subnet provides up to four IP addresses. Then, the system allocates an IP address from 192.168.0.4/30 to the client and uses the other three IP addresses to ensure network communication. In this case, one client consumes four IP addresses. Therefore, to ensure that an IP address is assigned to your client, the number of IP addresses in the client CIDR block must be at least four times the maximum number of SSL-VPN connections supported by the VPN gateway with which the SSL server is associated.</p>
     * <p><strong>Click to view the CIDR blocks that are not supported.</strong></p>
     * <ul>
     * <li>100.64.0.0~100.127.255.255</li>
     * <li>127.0.0.0~127.255.255.255</li>
     * <li>169.254.0.0~169.254.255.255</li>
     * <li>224.0.0.0~239.255.255.255</li>
     * <li>255.0.0.0~255.255.255.255</li>
     * </ul>
     * <p><strong>Click to view the recommended client CIDR blocks for different numbers of SSL-VPN connections.</strong></p>
     * <ul>
     * <li>If the number of SSL-VPN connections is 5, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 27 bits in length. Examples: 10.0.0.0/27 and 10.0.0.0/26.</li>
     * <li>If the number of SSL-VPN connections is 10, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 26 bits in length. Examples: 10.0.0.0/26 and 10.0.0.0/25.</li>
     * <li>If the number of SSL-VPN connections is 20, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 25 bits in length. Examples: 10.0.0.0/25 and 10.0.0.0/24.</li>
     * <li>If the number of SSL-VPN connections is 50, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 24 bits in length. Examples: 10.0.0.0/24 and 10.0.0.0/23.</li>
     * <li>If the number of SSL-VPN connections is 100, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 23 bits in length. Examples: 10.0.0.0/23 and 10.0.0.0/22.</li>
     * <li>If the number of SSL-VPN connections is 200, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 22 bits in length. Examples: 10.0.0.0/22 and 10.0.0.0/21.</li>
     * <li>If the number of SSL-VPN connections is 500, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 21 bits in length. Examples: 10.0.0.0/21 and 10.0.0.0/20.</li>
     * <li>If the number of SSL-VPN connections is 1,000, we recommend that you specify a client CIDR block with a subnet mask that is less than or equal to 20 bits in length. Examples: 10.0.0.0/20 and 10.0.0.0/19.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The subnet mask of the client CIDR block must be 16 to 29 bits in length.</p>
     * </li>
     * <li><p>Make sure that the client CIDR block does not overlap with the local CIDR block, the VPC CIDR block, or route CIDR blocks associated with the client.</p>
     * </li>
     * <li><p>We recommend that you use 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16, or one of their subnets as the client CIDR block. If you want to specify a public CIDR block as the client CIDR block, you must specify the public CIDR block as the user CIDR block of the virtual private cloud (VPC). This way, the VPC can access the public CIDR block. For more information, see <a href="https://help.aliyun.com/document_detail/185311.html">VPC FAQs</a>.</p>
     * </li>
     * <li><p>After you create an SSL server, the system automatically adds routes that point to the client CIDR block to the VPC route table. Do not manually add routes that point to the client CIDR block. Otherwise, SSL-VPN connections cannot work as expected.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable data compression. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable two-factor authentication. To enable two-factor authentication, you need to specify <code>IDaaSInstanceId</code>, <code>IDaaSRegionId</code>, and <code>IDaaSApplicationId</code>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables this feature.</li>
     * <li><strong>false</strong> (default): disables this feature.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you use two-factor authentication for the first time, you must first complete <a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22%3A%5B%7B%22Service%22%3A%22VPN%22%2C%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunVpnAccessingIdaasRole%22%2C%22TemplateId%22%3A%22IdaasRole%22%7D%5D%7D%5D%2C%22ReturnUrl%22%3A%22https%3A%2F%2Fvpc.console.aliyun.com%2Fsslvpn%2Fcn-shanghai%2Fvpn-servers%22%7D">authorization</a> .</p>
     * </li>
     * <li><p>When you create an SSL server in the UAE (Dubai) region, we recommend that you associate the SSL server with an IDaaS EIAM 2.0 instance in Singapore to reduce latency.</p>
     * </li>
     * <li><p>IDaaS EIAM 1.0 instances are no longer for purchase. If your Alibaba Cloud account has IDaaS EIAM 1.0 instances, the IDaaS EIAM 1.0 instances can be associated after two-factor authentication is enabled. If your Alibaba Cloud account does not have IDaaS EIAM 1.0 instances, only IDaaS EIAM 2.0 instances can be associated after two-factor authentication is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    /**
     * <p>The ID of the IDaaS application.</p>
     * <ul>
     * <li>If an IDaaS EIAM 2.0 instance is associated, you need to specify an IDaaS application ID.</li>
     * <li>If an IDaaS EIAM 1.0 instance is associated, you do not need to specify an IDaaS application ID.</li>
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
     * <p>The CIDR block that your client needs to access by using the SSL-VPN connection.</p>
     * <p>This value can be the CIDR block of a VPC, a vSwitch, a data center that is connected to a VPC by using an Express Connect circuit, or an Alibaba Cloud service such as Object Storage Service (OSS).</p>
     * <p>The subnet mask of the specified local CIDR block must be 8 to 32 bits in length. You cannot specify the following CIDR blocks as the local CIDR blocks:</p>
     * <ul>
     * <li>127.0.0.0~127.255.255.255</li>
     * <li>169.254.0.0~169.254.255.255</li>
     * <li>224.0.0.0~239.255.255.255</li>
     * <li>255.0.0.0~255.255.255.255</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The SSL server name.</p>
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
     * <p>The port that is used by the SSL server. Valid values of port numbers: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>1194</strong>.</p>
     * <p>The following ports are not supported: <strong>22</strong>, <strong>2222</strong>, <strong>22222</strong>, <strong>9000</strong>, <strong>9001</strong>, <strong>9002</strong>, <strong>7505</strong>, <strong>80</strong>, <strong>443</strong>, <strong>53</strong>, <strong>68</strong>, <strong>123</strong>, <strong>4510</strong>, <strong>4560</strong>, <strong>500</strong>, and <strong>4500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1194</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The protocol that is used by the SSL server. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong> (default)</li>
     * <li><strong>UDP</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
