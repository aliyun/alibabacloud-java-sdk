// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryConfig extends TeaModel {
    /**
     * <p>The logon credentials for the image repository. No configuration is required when accessing a public repository.</p>
     */
    @NameInMap("authConfig")
    public CreateTemplateRegistryAuthConfig authConfig;

    /**
     * <p>The certificate validation configuration for accessing the image repository.</p>
     */
    @NameInMap("certConfig")
    public CreateTemplateRegistryCertConfig certConfig;

    /**
     * <p>The VPC configuration used to access the image repository. Configuration is required only when the repository is reachable only within a VPC.</p>
     */
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
