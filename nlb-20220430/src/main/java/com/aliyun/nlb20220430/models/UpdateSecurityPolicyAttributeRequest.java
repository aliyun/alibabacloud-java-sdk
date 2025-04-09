// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateSecurityPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The supported cipher suites. Valid values of this parameter vary base on the value of TlsVersions. You can specify up to 32 cipher suites.</p>
     * <p>TLSv1.0 and TLSv1.1 support the following cipher suites:</p>
     * <ul>
     * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
     * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
     * <li><strong>AES128-SHA</strong></li>
     * <li><strong>AES256-SHA</strong></li>
     * <li><strong>DES-CBC3-SHA</strong></li>
     * </ul>
     * <p>TLSv1.2 supports the following cipher suites:</p>
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
     * <p>TLSv1.3 supports the following cipher suites:</p>
     * <ul>
     * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
     * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
     * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
     * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
     * </ul>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the TLS security policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tls-bp14bb1e7dll4f****</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The name of the security policy.</p>
     * <p>The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TLSCipherPolicy</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>The supported TLS versions. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>. You can specify up to four TLS versions.</p>
     */
    @NameInMap("TlsVersions")
    public java.util.List<String> tlsVersions;

    public static UpdateSecurityPolicyAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityPolicyAttributeRequest self = new UpdateSecurityPolicyAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityPolicyAttributeRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

    public UpdateSecurityPolicyAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSecurityPolicyAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateSecurityPolicyAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSecurityPolicyAttributeRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public UpdateSecurityPolicyAttributeRequest setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
        return this;
    }
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    public UpdateSecurityPolicyAttributeRequest setTlsVersions(java.util.List<String> tlsVersions) {
        this.tlsVersions = tlsVersions;
        return this;
    }
    public java.util.List<String> getTlsVersions() {
        return this.tlsVersions;
    }

}
