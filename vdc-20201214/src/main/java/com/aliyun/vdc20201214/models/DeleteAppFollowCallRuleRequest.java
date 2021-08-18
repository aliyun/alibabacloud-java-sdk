// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppFollowCallRuleRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppFollowCallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFollowCallRuleRequest self = new DeleteAppFollowCallRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppFollowCallRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
