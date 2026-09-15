// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateCopyAction extends TeaModel {
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("image")
    public String image;

    @NameInMap("registryConfig")
    public PublicUpdateTemplateRegistryConfig registryConfig;

    @NameInMap("registryType")
    public String registryType;

    public static PublicUpdateTemplateCopyAction build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateCopyAction self = new PublicUpdateTemplateCopyAction();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateCopyAction setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicUpdateTemplateCopyAction setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PublicUpdateTemplateCopyAction setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicUpdateTemplateCopyAction setRegistryConfig(PublicUpdateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicUpdateTemplateCopyAction setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

}
