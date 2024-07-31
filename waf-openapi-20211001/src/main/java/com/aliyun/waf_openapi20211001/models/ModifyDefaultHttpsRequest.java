// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefaultHttpsRequest extends TeaModel {
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
     * <p>0</p>
     */
    @NameInMap("CipherSuite")
    public Integer cipherSuite;

    @NameInMap("CustomCiphers")
    public java.util.List<String> customCiphers;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTLSv3")
    public Boolean enableTLSv3;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
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
