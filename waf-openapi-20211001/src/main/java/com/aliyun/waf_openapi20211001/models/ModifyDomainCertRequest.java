// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainCertRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123-cn-hangzhou</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The type of the cipher suite. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: all cipher suites.</p>
     * </li>
     * <li><p><strong>2</strong>: strong cipher suites.</p>
     * </li>
     * <li><p><strong>99</strong>: custom cipher suites.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CipherSuite")
    public String cipherSuite;

    /**
     * <p>The custom cipher suites. This parameter is available only when you set <strong>CipherSuite</strong> to <strong>99</strong>.</p>
     */
    @NameInMap("CustomCiphers")
    public java.util.List<String> customCiphers;

    /**
     * <p>The domain name that is added to WAF in CNAME record mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Indicates whether to enable TLS 1.3. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: TLS 1.3 is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: TLS 1.3 is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableTLSv3")
    public Boolean enableTLSv3;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-ww**b06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Transport Layer Security (TLS) version. Valid values:</p>
     * <ul>
     * <li><p><strong>tlsv1</strong></p>
     * </li>
     * <li><p><strong>tlsv1.1</strong></p>
     * </li>
     * <li><p><strong>tlsv1.2</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tlsv1</p>
     */
    @NameInMap("TLSVersion")
    public String TLSVersion;

    public static ModifyDomainCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainCertRequest self = new ModifyDomainCertRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainCertRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public ModifyDomainCertRequest setCipherSuite(String cipherSuite) {
        this.cipherSuite = cipherSuite;
        return this;
    }
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    public ModifyDomainCertRequest setCustomCiphers(java.util.List<String> customCiphers) {
        this.customCiphers = customCiphers;
        return this;
    }
    public java.util.List<String> getCustomCiphers() {
        return this.customCiphers;
    }

    public ModifyDomainCertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainCertRequest setEnableTLSv3(Boolean enableTLSv3) {
        this.enableTLSv3 = enableTLSv3;
        return this;
    }
    public Boolean getEnableTLSv3() {
        return this.enableTLSv3;
    }

    public ModifyDomainCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDomainCertRequest setTLSVersion(String TLSVersion) {
        this.TLSVersion = TLSVersion;
        return this;
    }
    public String getTLSVersion() {
        return this.TLSVersion;
    }

}
