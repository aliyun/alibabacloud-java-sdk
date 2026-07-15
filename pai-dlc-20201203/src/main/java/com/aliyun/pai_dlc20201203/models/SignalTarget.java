// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SignalTarget extends TeaModel {
    @NameInMap("PodNames")
    public java.util.List<String> podNames;

    @NameInMap("Roles")
    public java.util.List<String> roles;

    @NameInMap("Scope")
    public String scope;

    public static SignalTarget build(java.util.Map<String, ?> map) throws Exception {
        SignalTarget self = new SignalTarget();
        return TeaModel.build(map, self);
    }

    public SignalTarget setPodNames(java.util.List<String> podNames) {
        this.podNames = podNames;
        return this;
    }
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

    public SignalTarget setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    public SignalTarget setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
