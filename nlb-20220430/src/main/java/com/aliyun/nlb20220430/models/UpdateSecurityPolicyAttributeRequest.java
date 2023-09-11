// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateSecurityPolicyAttributeRequest extends TeaModel {
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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to obtain the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the TLS security policy.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The name of the security policy.</p>
     * <br>
     * <p>The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>The supported versions of the Transport Layer Security (TLS) protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**. You can specify at most four TLS protocol versions.</p>
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
