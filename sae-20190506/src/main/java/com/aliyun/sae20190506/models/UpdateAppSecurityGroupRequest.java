// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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
