// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupRequest extends TeaModel {
    /**
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>sg-wz969ngg2e49q5i4\*\*\*\*</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static UpdateAppSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSecurityGroupRequest self = new UpdateAppSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSecurityGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
