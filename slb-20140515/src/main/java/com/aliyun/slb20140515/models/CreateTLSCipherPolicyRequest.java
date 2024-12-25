// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateTLSCipherPolicyRequest extends TeaModel {
    /**
     * <p>The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.</p>
     * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
     * <ul>
     * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
     * <li><strong>AES128-SHA</strong></li>
     * <li><strong>AES256-SHA</strong></li>
     * <li><strong>DES-CBC3-SHA</strong></li>
     * </ul>
     * <p>TLS 1.2 supports the following cipher suites:</p>
     * <ul>
     * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
     * <li><strong>AES128-SHA</strong></li>
     * <li><strong>AES256-SHA</strong></li>
     * <li><strong>DES-CBC3-SHA</strong></li>
     * <li><strong>ECDHE-ECDSA-AES128-GCM-SHA256</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-GCM-SHA384</strong></li>
     * <li><strong>ECDHE-ECDSA-AES128-SHA256</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-SHA384</strong></li>
     * <li><strong>ECDHE-RSA-AES128-GCM-SHA256</strong></li>
     * <li><strong>ECDHE-RSA-AES256-GCM-SHA384</strong></li>
     * <li><strong>ECDHE-RSA-AES128-SHA256</strong></li>
     * <li><strong>ECDHE-RSA-AES256-SHA384</strong></li>
     * <li><strong>AES128-GCM-SHA256</strong></li>
     * <li><strong>AES256-GCM-SHA384</strong></li>
     * <li><strong>AES128-SHA256</strong></li>
     * <li><strong>AES256-SHA256</strong></li>
     * </ul>
     * <p>TLS 1.3 supports the following cipher suites:</p>
     * <ul>
     * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
     * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
     * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AES256-SHA256</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The name of the TLS policy. The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSPolicy-test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Server Load Balancer (SLB) instance is created.</p>
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
     * <p>The version of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>. You can specify at most four TLS versions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.0</p>
     */
    @NameInMap("TLSVersions")
    public java.util.List<String> TLSVersions;

    public static CreateTLSCipherPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTLSCipherPolicyRequest self = new CreateTLSCipherPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTLSCipherPolicyRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

    public CreateTLSCipherPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTLSCipherPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTLSCipherPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTLSCipherPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTLSCipherPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTLSCipherPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTLSCipherPolicyRequest setTLSVersions(java.util.List<String> TLSVersions) {
        this.TLSVersions = TLSVersions;
        return this;
    }
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

}
