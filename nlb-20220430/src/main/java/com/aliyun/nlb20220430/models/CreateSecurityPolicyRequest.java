// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.</p>
     * <br>
     * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
     * <br>
     * <p>*   **ECDHE-ECDSA-AES128-SHA**</p>
     * <p>*   **ECDHE-ECDSA-AES256-SHA**</p>
     * <p>*   **ECDHE-RSA-AES128-SHA**</p>
     * <p>*   **ECDHE-RSA-AES256-SHA**</p>
     * <p>*   **AES128-SHA**</p>
     * <p>*   **AES256-SHA**</p>
     * <p>*   **DES-CBC3-SHA**</p>
     * <br>
     * <p>TLS 1.2 supports the following cipher suites:</p>
     * <br>
     * <p>*   **ECDHE-ECDSA-AES128-SHA**</p>
     * <p>*   **ECDHE-ECDSA-AES256-SHA**</p>
     * <p>*   **ECDHE-RSA-AES128-SHA**</p>
     * <p>*   **ECDHE-RSA-AES256-SHA**</p>
     * <p>*   **AES128-SHA**</p>
     * <p>*   **AES256-SHA**</p>
     * <p>*   **DES-CBC3-SHA**</p>
     * <p>*   **ECDHE-ECDSA-AES128-GCM-SHA256**</p>
     * <p>*   **ECDHE-ECDSA-AES256-GCM-SHA384**</p>
     * <p>*   **ECDHE-ECDSA-AES128-SHA256**</p>
     * <p>*   **ECDHE-ECDSA-AES256-SHA384**</p>
     * <p>*   **ECDHE-RSA-AES128-GCM-SHA256**</p>
     * <p>*   **ECDHE-RSA-AES256-GCM-SHA384**</p>
     * <p>*   **ECDHE-RSA-AES128-SHA256**</p>
     * <p>*   **ECDHE-RSA-AES256-SHA384**</p>
     * <p>*   **AES128-GCM-SHA256**</p>
     * <p>*   **AES256-GCM-SHA384**</p>
     * <p>*   **AES128-SHA256**</p>
     * <p>*   **AES256-SHA256**</p>
     * <br>
     * <p>TLS 1.3 supports the following cipher suites:</p>
     * <br>
     * <p>*   **TLS_AES\_128\_GCM_SHA256**</p>
     * <p>*   **TLS_AES\_256\_GCM_SHA384**</p>
     * <p>*   **TLS_CHACHA20\_POLY1305\_SHA256**</p>
     * <p>*   **TLS_AES\_128\_CCM_SHA256**</p>
     * <p>*   **TLS_AES\_128\_CCM\_8\_SHA256**</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request but does not create the security policy. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the security policy.</p>
     * <br>
     * <p>The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>标签列表。</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSecurityPolicyRequestTag> tag;

    /**
     * <p>The supported versions of the Transport Layer Security (TLS) protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.</p>
     */
    @NameInMap("TlsVersions")
    public java.util.List<String> tlsVersions;

    public static CreateSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityPolicyRequest self = new CreateSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityPolicyRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

    public CreateSecurityPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecurityPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSecurityPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSecurityPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSecurityPolicyRequest setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
        return this;
    }
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    public CreateSecurityPolicyRequest setTag(java.util.List<CreateSecurityPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSecurityPolicyRequestTag> getTag() {
        return this.tag;
    }

    public CreateSecurityPolicyRequest setTlsVersions(java.util.List<String> tlsVersions) {
        this.tlsVersions = tlsVersions;
        return this;
    }
    public java.util.List<String> getTlsVersions() {
        return this.tlsVersions;
    }

    public static class CreateSecurityPolicyRequestTag extends TeaModel {
        /**
         * <p>标签键。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。</p>
         * <br>
         * <p>一次调用最多支持添加20个标签。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。</p>
         * <br>
         * <p>一次调用最多支持添加20个标签。</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSecurityPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityPolicyRequestTag self = new CreateSecurityPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSecurityPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSecurityPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
