// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ImageRegistryConfig extends TeaModel {
    @NameInMap("AuthConfig")
    public RegistryAuthenticationConfig authConfig;

    @NameInMap("CertConfig")
    public RegistryCertificateConfig certConfig;

    public static ImageRegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageRegistryConfig self = new ImageRegistryConfig();
        return TeaModel.build(map, self);
    }

    public ImageRegistryConfig setAuthConfig(RegistryAuthenticationConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public RegistryAuthenticationConfig getAuthConfig() {
        return this.authConfig;
    }

    public ImageRegistryConfig setCertConfig(RegistryCertificateConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public RegistryCertificateConfig getCertConfig() {
        return this.certConfig;
    }

}
