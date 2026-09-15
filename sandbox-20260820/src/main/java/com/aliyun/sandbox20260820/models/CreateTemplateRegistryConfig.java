// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryConfig extends TeaModel {
    @NameInMap("authConfig")
    public CreateTemplateRegistryAuthConfig authConfig;

    @NameInMap("certConfig")
    public CreateTemplateRegistryCertConfig certConfig;

    @NameInMap("networkConfig")
    public CreateTemplateRegistryNetworkConfig networkConfig;

    public static CreateTemplateRegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryConfig self = new CreateTemplateRegistryConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryConfig setAuthConfig(CreateTemplateRegistryAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public CreateTemplateRegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public CreateTemplateRegistryConfig setCertConfig(CreateTemplateRegistryCertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CreateTemplateRegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateTemplateRegistryConfig setNetworkConfig(CreateTemplateRegistryNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public CreateTemplateRegistryNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

}
