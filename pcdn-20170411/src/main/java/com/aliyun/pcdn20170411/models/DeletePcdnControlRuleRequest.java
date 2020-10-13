// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class DeletePcdnControlRuleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static DeletePcdnControlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePcdnControlRuleRequest self = new DeletePcdnControlRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeletePcdnControlRuleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeletePcdnControlRuleRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DeletePcdnControlRuleRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
