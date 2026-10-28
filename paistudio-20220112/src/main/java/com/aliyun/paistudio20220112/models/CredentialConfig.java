// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CredentialConfig extends TeaModel {
    /**
     * <p>The Alibaba Cloud environment role identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AliyunEnvRoleKey")
    public String aliyunEnvRoleKey;

    /**
     * <p>The credential configuration items.</p>
     */
    @NameInMap("CredentialConfigItems")
    public java.util.List<CredentialConfigItem> credentialConfigItems;

    /**
     * <p>Specifies whether credential injection is enabled.</p>
     */
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
