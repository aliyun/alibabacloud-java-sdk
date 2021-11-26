// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesRequest self = new DescribeApplicationScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
