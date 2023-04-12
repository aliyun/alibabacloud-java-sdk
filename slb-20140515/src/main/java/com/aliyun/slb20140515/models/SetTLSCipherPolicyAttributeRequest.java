// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The cipher suites supported by the TLS version.</p>
     * <br>
     * <p>The specified cipher suites must be supported by at least one TLS protocol version that you specify. For example, if you set the TLSVersions parameter to TLSv1.3, you must specify cipher suites that are supported by this protocol version.</p>
     * <br>
     * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
     * <br>
     * <p>*   ECDHE-ECDSA-AES128-SHA</p>
     * <p>*   ECDHE-ECDSA-AES256-SHA</p>
     * <p>*   ECDHE-RSA-AES128-SHA</p>
     * <p>*   ECDHE-RSA-AES256-SHA</p>
     * <p>*   AES128-SHA AES256-SHA</p>
     * <p>*   DES-CBC3-SHA</p>
     * <br>
     * <p>TLS 1.2 supports the following cipher suites:</p>
     * <br>
     * <p>*   ECDHE-ECDSA-AES128-SHA</p>
     * <p>*   ECDHE-ECDSA-AES256-SHA</p>
     * <p>*   ECDHE-RSA-AES128-SHA</p>
     * <p>*   ECDHE-RSA-AES256-SHA</p>
     * <p>*   AES128-SHA AES256-SHA</p>
     * <p>*   DES-CBC3-SHA</p>
     * <p>*   ECDHE-ECDSA-AES128-GCM-SHA256</p>
     * <p>*   ECDHE-ECDSA-AES256-GCM-SHA384</p>
     * <p>*   ECDHE-ECDSA-AES128-SHA256</p>
     * <p>*   ECDHE-ECDSA-AES256-SHA384</p>
     * <p>*   ECDHE-RSA-AES128-GCM-SHA256</p>
     * <p>*   ECDHE-RSA-AES256-GCM-SHA384</p>
     * <p>*   ECDHE-RSA-AES128-SHA256</p>
     * <p>*   ECDHE-RSA-AES256-SHA384</p>
     * <p>*   AES128-GCM-SHA256</p>
     * <p>*   AES256-GCM-SHA384</p>
     * <p>*   AES128-SHA256 AES256-SHA256</p>
     * <br>
     * <p>TLS 1.3 supports the following cipher suites:</p>
     * <br>
     * <p>*   TLS_AES\_128\_GCM_SHA256</p>
     * <p>*   TLS_AES\_256\_GCM_SHA384</p>
     * <p>*   TLS_CHACHA20\_POLY1305\_SHA256</p>
     * <p>*   TLS_AES\_128\_CCM_SHA256</p>
     * <p>*   TLS_AES\_128\_CCM\_8\_SHA256</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The name of the TLS policy. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Server Load Balancer (SLB) instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the TLS policy.</p>
     */
    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    /**
     * <p>The version of the TLS protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.</p>
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
