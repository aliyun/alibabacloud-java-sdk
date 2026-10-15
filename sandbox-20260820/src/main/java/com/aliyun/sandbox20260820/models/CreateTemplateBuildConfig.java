// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateBuildConfig extends TeaModel {
    /**
     * <p>The action configuration for pulling the source image and pushing it to the destination repository.</p>
     */
    @NameInMap("copy")
    public CreateTemplateCopyAction copy;

    /**
     * <p>The action configuration for packaging the envd daemon process into the image. This is an optional intermediate step in the copy process and is supported only by first-generation sandboxes.</p>
     */
    @NameInMap("envdInject")
    public CreateTemplateEnvdInjectAction envdInject;

    /**
     * <p>The installation of clients required for storage mounting.</p>
     */
    @NameInMap("installStorageClients")
    public Boolean installStorageClients;

    public static CreateTemplateBuildConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateBuildConfig self = new CreateTemplateBuildConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateBuildConfig setCopy(CreateTemplateCopyAction copy) {
        this.copy = copy;
        return this;
    }
    public CreateTemplateCopyAction getCopy() {
        return this.copy;
    }

    public CreateTemplateBuildConfig setEnvdInject(CreateTemplateEnvdInjectAction envdInject) {
        this.envdInject = envdInject;
        return this;
    }
    public CreateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

    public CreateTemplateBuildConfig setInstallStorageClients(Boolean installStorageClients) {
        this.installStorageClients = installStorageClients;
        return this;
    }
    public Boolean getInstallStorageClients() {
        return this.installStorageClients;
    }

}
