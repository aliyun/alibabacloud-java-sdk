// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefaultHttpsRequest extends TeaModel {
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
     * <p>The cipher suite type.</p>
     * <blockquote>
     * <p>This parameter is required. You must specify this parameter when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CipherSuite")
    public Integer cipherSuite;

    /**
     * <p>The custom cipher suites to add. This parameter is used only when <strong>CipherSuite</strong> is set to <strong>99</strong>.</p>
     */
    @NameInMap("CustomCiphers")
    public java.util.List<String> customCiphers;

    /**
     * <p>Specifies whether TLS 1.3 is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
     * </li>
     * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is used only when HttpsPorts is not empty, which indicates that the domain name uses the HTTPS protocol. If TLSVersion is set to tlsv1.3, this value must be true.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTLSv3")
    public Boolean enableTLSv3;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The TLS version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tlsv1</p>
     */
    @NameInMap("TLSVersion")
    public String TLSVersion;

    public static ModifyDefaultHttpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultHttpsRequest self = new ModifyDefaultHttpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultHttpsRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public ModifyDefaultHttpsRequest setCipherSuite(Integer cipherSuite) {
        this.cipherSuite = cipherSuite;
        return this;
    }
    public Integer getCipherSuite() {
        return this.cipherSuite;
    }

    public ModifyDefaultHttpsRequest setCustomCiphers(java.util.List<String> customCiphers) {
        this.customCiphers = customCiphers;
        return this;
    }
    public java.util.List<String> getCustomCiphers() {
        return this.customCiphers;
    }

    public ModifyDefaultHttpsRequest setEnableTLSv3(Boolean enableTLSv3) {
        this.enableTLSv3 = enableTLSv3;
        return this;
    }
    public Boolean getEnableTLSv3() {
        return this.enableTLSv3;
    }

    public ModifyDefaultHttpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefaultHttpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefaultHttpsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyDefaultHttpsRequest setTLSVersion(String TLSVersion) {
        this.TLSVersion = TLSVersion;
        return this;
    }
    public String getTLSVersion() {
        return this.TLSVersion;
    }

}
