// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateBuildConfig extends TeaModel {
    /**
     * <p>The image replication action configuration.</p>
     */
    @NameInMap("copy")
    public PublicUpdateTemplateCopyAction copy;

    /**
     * <p>The envd injection action configuration.</p>
     */
    @NameInMap("envdInject")
    public PublicUpdateTemplateEnvdInjectAction envdInject;

    /**
     * <p>Installs the clients required for storage mounting.</p>
     */
    @NameInMap("installStorageClients")
    public Boolean installStorageClients;

    public static PublicUpdateTemplateBuildConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateBuildConfig self = new PublicUpdateTemplateBuildConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateBuildConfig setCopy(PublicUpdateTemplateCopyAction copy) {
        this.copy = copy;
        return this;
    }
    public PublicUpdateTemplateCopyAction getCopy() {
        return this.copy;
    }

    public PublicUpdateTemplateBuildConfig setEnvdInject(PublicUpdateTemplateEnvdInjectAction envdInject) {
        this.envdInject = envdInject;
        return this;
    }
    public PublicUpdateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

    public PublicUpdateTemplateBuildConfig setInstallStorageClients(Boolean installStorageClients) {
        this.installStorageClients = installStorageClients;
        return this;
    }
    public Boolean getInstallStorageClients() {
        return this.installStorageClients;
    }

}
