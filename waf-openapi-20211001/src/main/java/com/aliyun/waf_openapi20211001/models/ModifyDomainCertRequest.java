// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainCertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123-cn-hangzhou</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CipherSuite")
    public String cipherSuite;

    @NameInMap("CustomCiphers")
    public java.util.List<String> customCiphers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableTLSv3")
    public Boolean enableTLSv3;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-ww**b06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
