// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CredentialConfig extends TeaModel {
    @NameInMap("AliyunEnvRoleKey")
    public String aliyunEnvRoleKey;

    @NameInMap("CredentialConfigItems")
    public java.util.List<CredentialConfigItem> credentialConfigItems;

    @NameInMap("EnableCredentialInject")
    public Boolean enableCredentialInject;

    public static CredentialConfig build(java.util.Map<String, ?> map) throws Exception {
        CredentialConfig self = new CredentialConfig();
        return TeaModel.build(map, self);
    }

    public CredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
        this.aliyunEnvRoleKey = aliyunEnvRoleKey;
        return this;
    }
    public String getAliyunEnvRoleKey() {
        return this.aliyunEnvRoleKey;
    }

    public CredentialConfig setCredentialConfigItems(java.util.List<CredentialConfigItem> credentialConfigItems) {
        this.credentialConfigItems = credentialConfigItems;
        return this;
    }
    public java.util.List<CredentialConfigItem> getCredentialConfigItems() {
        return this.credentialConfigItems;
    }

    public CredentialConfig setEnableCredentialInject(Boolean enableCredentialInject) {
        this.enableCredentialInject = enableCredentialInject;
        return this;
    }
    public Boolean getEnableCredentialInject() {
        return this.enableCredentialInject;
    }

}
