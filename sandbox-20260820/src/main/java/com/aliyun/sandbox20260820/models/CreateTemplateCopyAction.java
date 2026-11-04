// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCopyAction extends TeaModel {
    /**
     * <p>The ID of the destination Container Registry Enterprise instance. This field does not inherit the instance ID of the source image.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>Specifies whether to enable the image replication action. This parameter is required when this action block is passed.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The destination image address for the push operation. If this parameter is not provided, the service derives a new tag in the repository where the source image is located.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12-envd</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The credentials, TLS settings, and network configurations required to access the destination image repository.</p>
     */
    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <p>The type of the destination image repository. Valid values: oci (standard OCI repository), acr (Container Registry Personal Edition), and acree (Container Registry Enterprise Edition). By default, the value is derived from the destination image address.</p>
     * 
     * <strong>example:</strong>
     * <p>acree</p>
     */
    @NameInMap("registryType")
    public String registryType;

    public static CreateTemplateCopyAction build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCopyAction self = new CreateTemplateCopyAction();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCopyAction setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateTemplateCopyAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateTemplateCopyAction setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateTemplateCopyAction setRegistryConfig(CreateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public CreateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public CreateTemplateCopyAction setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
