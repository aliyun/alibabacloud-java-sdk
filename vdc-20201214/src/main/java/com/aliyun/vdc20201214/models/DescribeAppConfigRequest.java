// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConfigRequest self = new DescribeAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
