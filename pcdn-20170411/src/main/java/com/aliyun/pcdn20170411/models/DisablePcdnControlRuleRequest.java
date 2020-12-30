// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DisablePcdnControlRuleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    @NameInMap("ResourceId")
    public String resourceId;

    public static DisablePcdnControlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisablePcdnControlRuleRequest self = new DisablePcdnControlRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisablePcdnControlRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DisablePcdnControlRuleRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DisablePcdnControlRuleRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
