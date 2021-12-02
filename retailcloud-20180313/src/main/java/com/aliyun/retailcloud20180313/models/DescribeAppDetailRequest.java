// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    public static DescribeAppDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDetailRequest self = new DescribeAppDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
