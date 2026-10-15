// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCopyAction extends TeaModel {
    /**
     * <p>The ID of the destination Container Registry Enterprise instance. This field does not inherit the instance ID from the source image.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>Specifies whether to enable the image replication action. Required when this action block is included.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The destination image address to push to. If not specified, the service derives a new tag under the repository where the source image resides.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12-envd</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The credentials, TLS, and network configuration required to access the destination image repository.</p>
     */
    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <p>The type of the destination image repository. Valid values: oci (standard OCI repository), acr (Container Registry Personal Edition), acree (Container Registry Enterprise Edition). If not specified, the type is inferred from the destination image address.</p>
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
