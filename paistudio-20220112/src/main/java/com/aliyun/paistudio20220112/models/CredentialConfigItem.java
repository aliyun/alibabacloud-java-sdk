// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CredentialConfigItem extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Roles")
    public java.util.List<CredentialRole> roles;

    @NameInMap("Type")
    public String type;

    public static CredentialConfigItem build(java.util.Map<String, ?> map) throws Exception {
        CredentialConfigItem self = new CredentialConfigItem();
        return TeaModel.build(map, self);
    }

    public CredentialConfigItem setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CredentialConfigItem setRoles(java.util.List<CredentialRole> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<CredentialRole> getRoles() {
        return this.roles;
    }

    public CredentialConfigItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
