// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppExpMetricRuleRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppExpMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppExpMetricRuleRequest self = new DeleteAppExpMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppExpMetricRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
