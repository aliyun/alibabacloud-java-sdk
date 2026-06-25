// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerRequest extends TeaModel {
    /**
     * <p>The encryption algorithm used by SSL-VPN. Valid values:</p>
     * <ul>
     * <li><p><strong>AES-128-CBC</strong> (default): AES-128-CBC algorithm.</p>
     * </li>
     * <li><p><strong>AES-192-CBC</strong>: AES-192-CBC algorithm.</p>
     * </li>
     * <li><p><strong>AES-256-CBC</strong>: AES-256-CBC algorithm.</p>
     * </li>
     * <li><p><strong>none</strong>: No encryption algorithm is used.</p>
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
     * <p>This is the CIDR block used to allocate IP addresses to the virtual network interface of the client, not the existing internal CIDR block of the client.</p>
     * <p>When the client accesses the local end through an SSL-VPN connection, the VPN gateway allocates an IP address from the specified client CIDR block to the client. The client uses the allocated IP address to access cloud resources.</p>
     * <p>When you specify the client CIDR block, make sure that the number of IP addresses in the client CIDR block is at least four times the number of SSL connections of the current VPN gateway.</p>
     * <details>
     * <summary>Click to view the reason.</summary>
     * For example, if the client CIDR block you specify is 192.168.0.0/24, when the system allocates IP addresses to the client, it first divides a subnet with a 30-bit subnet mask from the 192.168.0.0/24 CIDR block, such as 192.168.0.4/30, and then allocates one IP address from 192.168.0.4/30 for the client to use. The remaining three IP addresses are occupied by the system to ensure network communication. In this case, one client consumes 4 IP addresses. Therefore, to ensure that all your clients can be allocated IP addresses, make sure that the number of IP addresses in the client CIDR block you specify is at least four times the number of SSL connections of the VPN gateway.
     * </details>
     * 
     * <details>
     * <summary>Click to view unsupported CIDR blocks.</summary>
     * 
     * <ul>
     * <li>100.64.0.0~100.127.255.255</li>
     * <li>127.0.0.0~127.255.255.255</li>
     * <li>169.254.0.0~169.254.255.255</li>
     * <li>224.0.0.0~239.255.255.255</li>
     * <li>255.0.0.0~255.255.255.255</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>Click to view recommended client CIDR blocks for each SSL connection count.</summary>
     * 
     * <ul>
     * <li>If the number of SSL connections is 5, the subnet mask of the client CIDR block should be less than or equal to 27 bits. For example: 10.0.0.0/27 or 10.0.0.0/26.</li>
     * <li>If the number of SSL connections is 10, the subnet mask of the client CIDR block should be less than or equal to 26 bits. For example: 10.0.0.0/26 or 10.0.0.0/25.</li>
     * <li>If the number of SSL connections is 20, the subnet mask of the client CIDR block should be less than or equal to 25 bits. For example: 10.0.0.0/25 or 10.0.0.0/24.</li>
     * <li>If the number of SSL connections is 50, the subnet mask of the client CIDR block should be less than or equal to 24 bits. For example: 10.0.0.0/24 or 10.0.0.0/23.</li>
     * <li>If the number of SSL connections is 100, the subnet mask of the client CIDR block should be less than or equal to 23 bits. For example: 10.0.0.0/23 or 10.0.0.0/22.</li>
     * <li>If the number of SSL connections is 200, the subnet mask of the client CIDR block should be less than or equal to 22 bits. For example: 10.0.0.0/22 or 10.0.0.0/21.</li>
     * <li>If the number of SSL connections is 500, the subnet mask of the client CIDR block should be less than or equal to 21 bits. For example: 10.0.0.0/21 or 10.0.0.0/20.</li>
     * <li>If the number of SSL connections is 1000, the subnet mask of the client CIDR block should be less than or equal to 20 bits. For example: 10.0.0.0/20 or 10.0.0.0/19.</li>
     * </ul>
     * </details>
     * 
     * <blockquote>
     * <ul>
     * <li>The subnet mask of the client CIDR block must be between 16 and 29 bits.</li>
     * <li>Make sure that the client CIDR block does not overlap with the local subnet, VPC CIDR block, or any route CIDR blocks associated with the client terminal.</li>
     * <li>When specifying the client CIDR block, we recommend that you use the 10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16 CIDR blocks and their subnets. If you need to specify a public CIDR block as the client CIDR block, you must set the public CIDR block as a user CIDR block of the VPC to ensure that the VPC can access the public CIDR block. For more information about user CIDR blocks, see <a href="https://help.aliyun.com/document_detail/185311.html">VPC FAQ</a>.</li>
     * <li>After the SSL server is created, the system automatically adds routes for the client CIDR block to the route table of the VPC instance. Do not manually add routes for the client CIDR block to the route table of the VPC instance. Otherwise, SSL-VPN connection traffic transmission will be abnormal.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.30.30.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotency of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to compress the communication. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Compresses the communication.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not compress the communication.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Compress")
    public Boolean compress;

    @NameInMap("DnsServers")
    public String dnsServers;

    /**
     * <p>Specifies whether to perform only a dry run, without actually modifying the configuration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a check request without modifying the SSL server configuration. The check items include whether all required parameters are specified, request format, and service limits. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): Sends a normal request. After the check passes, an HTTP 2xx status code is returned, and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable two-factor authentication. If you choose to enable two-factor authentication, you also need to configure <strong>IDaaSInstanceId</strong>, <strong>IDaaSRegionId</strong>, and <strong>IDaaSApplicationId</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Not enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you are using the two-factor authentication feature for the first time, complete the <a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22%3A%5B%7B%22Service%22%3A%22VPN%22%2C%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunVpnAccessingIdaasRole%22%2C%22TemplateId%22%3A%22IdaasRole%22%7D%5D%7D%5D%2C%22ReturnUrl%22%3A%22https%3A%2F%2Fvpc.console.aliyun.com%2Fsslvpn%2Fcn-shanghai%2Fvpn-servers%22%7D">authorization</a> before creating the SSL server.</li>
     * <li>When creating an SSL server in the UAE (Dubai) region, we recommend that you bind an IDaaS EIAM 2.0 instance in the Singapore region to reduce cross-region latency.</li>
     * <li>IDaaS EIAM 1.0 instances are no longer available for purchase. If your Alibaba Cloud account has existing IDaaS EIAM 1.0 instances, you can still bind them after enabling two-factor authentication. If your Alibaba Cloud account does not have IDaaS EIAM 1.0 instances, only IDaaS EIAM 2.0 instances can be bound after enabling two-factor authentication.</li>
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
     * <li>If you bind an IDaaS EIAM 2.0 instance, you must enter the IDaaS application ID.</li>
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
     * <p>idaas-cn-hangzhou-****</p>
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
     * <p>The local subnet.</p>
     * <p>The CIDR block that the client needs to access through the SSL-VPN connection.</p>
     * <p>The local subnet can be the CIDR block of a VPC, a vSwitch, an IDC interconnected with the VPC through Express Connect, or a cloud service such as Object Storage Service (OSS).</p>
     * <p>The subnet mask of the local subnet must be between 8 and 32 bits. The following CIDR blocks cannot be specified as local subnets:</p>
     * <ul>
     * <li>127.0.0.0~127.255.255.255</li>
     * <li>169.254.0.0~169.254.255.255</li>
     * <li>224.0.0.0~239.255.255.255</li>
     * <li>255.0.0.0~255.255.255.255</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.20.20.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the SSL-VPN server.</p>
     * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The port used by the SSL-VPN server. Valid values: <strong>1</strong> to <strong>65535</strong>. Default value: <strong>1194</strong>.</p>
     * <p>The following ports are not supported: <strong>22</strong>, <strong>2222</strong>, <strong>22222</strong>, <strong>9000</strong>, <strong>9001</strong>, <strong>9002</strong>, <strong>7505</strong>, <strong>80</strong>, <strong>443</strong>, <strong>53</strong>, <strong>68</strong>, <strong>123</strong>, <strong>4510</strong>, <strong>4560</strong>, <strong>500</strong>, and <strong>4500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1194</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The protocol used by the SSL-VPN server. Valid values:</p>
     * <ul>
     * <li><p><strong>TCP</strong> (default): TCP protocol.</p>
     * </li>
     * <li><p><strong>UDP</strong>: UDP protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SSL-VPN server instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vss-bp18q7hzj6largv4v****</p>
     */
    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    public static ModifySslVpnServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnServerRequest self = new ModifySslVpnServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnServerRequest setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

    public ModifySslVpnServerRequest setClientIpPool(String clientIpPool) {
        this.clientIpPool = clientIpPool;
        return this;
    }
    public String getClientIpPool() {
        return this.clientIpPool;
    }

    public ModifySslVpnServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySslVpnServerRequest setCompress(Boolean compress) {
        this.compress = compress;
        return this;
    }
    public Boolean getCompress() {
        return this.compress;
    }

    public ModifySslVpnServerRequest setDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public String getDnsServers() {
        return this.dnsServers;
    }

    public ModifySslVpnServerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifySslVpnServerRequest setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
        this.enableMultiFactorAuth = enableMultiFactorAuth;
        return this;
    }
    public Boolean getEnableMultiFactorAuth() {
        return this.enableMultiFactorAuth;
    }

    public ModifySslVpnServerRequest setIDaaSApplicationId(String IDaaSApplicationId) {
        this.IDaaSApplicationId = IDaaSApplicationId;
        return this;
    }
    public String getIDaaSApplicationId() {
        return this.IDaaSApplicationId;
    }

    public ModifySslVpnServerRequest setIDaaSInstanceId(String IDaaSInstanceId) {
        this.IDaaSInstanceId = IDaaSInstanceId;
        return this;
    }
    public String getIDaaSInstanceId() {
        return this.IDaaSInstanceId;
    }

    public ModifySslVpnServerRequest setIDaaSRegionId(String IDaaSRegionId) {
        this.IDaaSRegionId = IDaaSRegionId;
        return this;
    }
    public String getIDaaSRegionId() {
        return this.IDaaSRegionId;
    }

    public ModifySslVpnServerRequest setLocalSubnet(String localSubnet) {
        this.localSubnet = localSubnet;
        return this;
    }
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    public ModifySslVpnServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySslVpnServerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySslVpnServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySslVpnServerRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifySslVpnServerRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifySslVpnServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySslVpnServerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySslVpnServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySslVpnServerRequest setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

}
