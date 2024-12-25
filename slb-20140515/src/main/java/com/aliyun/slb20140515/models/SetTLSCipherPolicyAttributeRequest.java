// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The cipher suites supported by the TLS version.</p>
     * <p>The specified cipher suites must be supported by at least one TLS protocol version that you specify. For example, if you set the TLSVersions parameter to TLSv1.3, you must specify cipher suites that are supported by this protocol version.</p>
     * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
     * <ul>
     * <li>ECDHE-ECDSA-AES128-SHA</li>
     * <li>ECDHE-ECDSA-AES256-SHA</li>
     * <li>ECDHE-RSA-AES128-SHA</li>
     * <li>ECDHE-RSA-AES256-SHA</li>
     * <li>AES128-SHA AES256-SHA</li>
     * <li>DES-CBC3-SHA</li>
     * </ul>
     * <p>TLS 1.2 supports the following cipher suites:</p>
     * <ul>
     * <li>ECDHE-ECDSA-AES128-SHA</li>
     * <li>ECDHE-ECDSA-AES256-SHA</li>
     * <li>ECDHE-RSA-AES128-SHA</li>
     * <li>ECDHE-RSA-AES256-SHA</li>
     * <li>AES128-SHA AES256-SHA</li>
     * <li>DES-CBC3-SHA</li>
     * <li>ECDHE-ECDSA-AES128-GCM-SHA256</li>
     * <li>ECDHE-ECDSA-AES256-GCM-SHA384</li>
     * <li>ECDHE-ECDSA-AES128-SHA256</li>
     * <li>ECDHE-ECDSA-AES256-SHA384</li>
     * <li>ECDHE-RSA-AES128-GCM-SHA256</li>
     * <li>ECDHE-RSA-AES256-GCM-SHA384</li>
     * <li>ECDHE-RSA-AES128-SHA256</li>
     * <li>ECDHE-RSA-AES256-SHA384</li>
     * <li>AES128-GCM-SHA256</li>
     * <li>AES256-GCM-SHA384</li>
     * <li>AES128-SHA256 AES256-SHA256</li>
     * </ul>
     * <p>TLS 1.3 supports the following cipher suites:</p>
     * <ul>
     * <li>TLS_AES_128_GCM_SHA256</li>
     * <li>TLS_AES_256_GCM_SHA384</li>
     * <li>TLS_CHACHA20_POLY1305_SHA256</li>
     * <li>TLS_AES_128_CCM_SHA256</li>
     * <li>TLS_AES_128_CCM_8_SHA256</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DES-CBC3-SHA</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The name of the TLS policy. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tls-policy*****-test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Server Load Balancer (SLB) instance is deployed.</p>
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
     * <p>The ID of the TLS policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tls-bp1lp2076qx4e******bridp</p>
     */
    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    /**
     * <p>The version of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.0</p>
     */
    @NameInMap("TLSVersions")
    public java.util.List<String> TLSVersions;

    public static SetTLSCipherPolicyAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTLSCipherPolicyAttributeRequest self = new SetTLSCipherPolicyAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetTLSCipherPolicyAttributeRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

    public SetTLSCipherPolicyAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SetTLSCipherPolicyAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetTLSCipherPolicyAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetTLSCipherPolicyAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetTLSCipherPolicyAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetTLSCipherPolicyAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetTLSCipherPolicyAttributeRequest setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    public SetTLSCipherPolicyAttributeRequest setTLSVersions(java.util.List<String> TLSVersions) {
        this.TLSVersions = TLSVersions;
        return this;
    }
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

}
