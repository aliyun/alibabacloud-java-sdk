// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnServerRequest extends TeaModel {
    /**
     * <p>The encryption algorithm that is used in the SSL-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>AES-128-CBC</strong> (default)</li>
     * <li><strong>AES-192-CBC</strong></li>
     * <li><strong>AES-256-CBC</strong></li>
     * <li><strong>none</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES-128-CBC</p>
     */
    @NameInMap("Cipher")
    public String cipher;

    /**
     * <p>The client IP address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>10.30.30.0/24</p>
     */
    @NameInMap("ClientIpPool")
    public String clientIpPool;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
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
     * <li><strong>true</strong> (default)</li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Compress")
    public Boolean compress;

    /**
     * <p>Specifies whether to enable two-factor authentication. If you enable two-factor authentication, you must also specify an IDaaS instance ID. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Two-factor authentication supports only IDaaS instances of earlier versions. If you do not have and cannot create IDaaS instances of earlier versions, you cannot enable two-factor authentication.</li>
     * <li>For existing SSL servers, if two-factor authentication is already enabled, you can continue to use two-factor authentication.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiFactorAuth")
    public Boolean enableMultiFactorAuth;

    /**
     * <strong>example:</strong>
     * <p>app_my6g4qmvnwxzj2f****</p>
     */
    @NameInMap("IDaaSApplicationId")
    public String IDaaSApplicationId;

    /**
     * <p>The ID of the Identity as a Service (IDaaS) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-cn-hangzhou-****</p>
     */
    @NameInMap("IDaaSInstanceId")
    public String IDaaSInstanceId;

    /**
     * <p>The ID of the region where the IDaaS instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("IDaaSRegionId")
    public String IDaaSRegionId;

    /**
     * <p>The CIDR block of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>10.20.20.0/24</p>
     */
    @NameInMap("LocalSubnet")
    public String localSubnet;

    /**
     * <p>The name of the SSL server.</p>
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SSL server.</p>
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
