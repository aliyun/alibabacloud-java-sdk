// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    public static UpdateAppSecurityGroupQuery build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSecurityGroupQuery self = new UpdateAppSecurityGroupQuery();
        return TeaModel.build(map, self);
    }

    public UpdateAppSecurityGroupQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppSecurityGroupQuery setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
