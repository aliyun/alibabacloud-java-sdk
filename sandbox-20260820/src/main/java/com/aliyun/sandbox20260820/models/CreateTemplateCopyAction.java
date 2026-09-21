// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCopyAction extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12-envd</p>
     */
    @NameInMap("image")
    public String image;

    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
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
