// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The supported cipher suites, which depend on the TLSVersion value. You can add up to 32 cipher suites.</p>
     * <p>Supported by TLSv1.0 and TLSv1.1:</p>
     * <ul>
     * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
     * <li><strong>AES128-SHA</strong></li>
     * <li><strong>AES256-SHA</strong></li>
     * <li><strong>DES-CBC3-SHA</strong></li>
     * </ul>
     * <p>Supported by TLSv1.2:</p>
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
     * <li><strong>ECDHE-ECDSA-CHACHA20-POLY1305</strong></li>
     * <li><strong>ECDHE-RSA-CHACHA20-POLY1305</strong></li>
     * </ul>
     * <p>Supported by TLSv1.3:</p>
     * <ul>
     * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
     * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
     * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the custom security policy. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the precheck, an error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the Network Load Balancer (NLB) instance. </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Policy Name of the security policy.</p>
     * <p>Policy Name must be 1 to 200 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TLSCipherPolicy</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSecurityPolicyRequestTag> tag;

    /**
     * <p>The supported TLS versions. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
     * <p>This parameter is required.</p>
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
         * <p>The tag key. The key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
         * <p>You can add up to 20 tags in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>ValueTest</p>
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
