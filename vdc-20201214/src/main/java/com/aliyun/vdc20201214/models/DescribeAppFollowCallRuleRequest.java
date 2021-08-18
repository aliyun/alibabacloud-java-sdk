// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppFollowCallRuleRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppFollowCallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppFollowCallRuleRequest self = new DescribeAppFollowCallRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppFollowCallRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
