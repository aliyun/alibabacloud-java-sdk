// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RegistryConfig extends TeaModel {
    @NameInMap("authConfig")
    public RegistryAuthConfig authConfig;

    @NameInMap("certConfig")
    public RegistryCertConfig certConfig;

    public static RegistryConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryConfig self = new RegistryConfig();
        return TeaModel.build(map, self);
    }

    public RegistryConfig setAuthConfig(RegistryAuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public RegistryAuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public RegistryConfig setCertConfig(RegistryCertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public RegistryCertConfig getCertConfig() {
        return this.certConfig;
    }

}
