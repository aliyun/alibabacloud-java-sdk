// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppExpMetricRuleRequest extends TeaModel {
    // APP ID
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppExpMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppExpMetricRuleRequest self = new DescribeAppExpMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppExpMetricRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
