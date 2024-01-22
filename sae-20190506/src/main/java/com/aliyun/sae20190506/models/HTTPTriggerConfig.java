// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class HTTPTriggerConfig extends TeaModel {
    @NameInMap("aclConfig")
    public AclConfig aclConfig;

    @NameInMap("authConfig")
    public Object authConfig;

    @NameInMap("authType")
    public String authType;

    @NameInMap("disableURLInternet")
    public Boolean disableURLInternet;

    @NameInMap("safeMode")
    public Boolean safeMode;

    public static HTTPTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        HTTPTriggerConfig self = new HTTPTriggerConfig();
        return TeaModel.build(map, self);
    }

    public HTTPTriggerConfig setAclConfig(AclConfig aclConfig) {
        this.aclConfig = aclConfig;
        return this;
    }
    public AclConfig getAclConfig() {
        return this.aclConfig;
    }

    public HTTPTriggerConfig setAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public Object getAuthConfig() {
        return this.authConfig;
    }

    public HTTPTriggerConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public HTTPTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
        this.disableURLInternet = disableURLInternet;
        return this;
    }
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    public HTTPTriggerConfig setSafeMode(Boolean safeMode) {
        this.safeMode = safeMode;
        return this;
    }
    public Boolean getSafeMode() {
        return this.safeMode;
    }

}
