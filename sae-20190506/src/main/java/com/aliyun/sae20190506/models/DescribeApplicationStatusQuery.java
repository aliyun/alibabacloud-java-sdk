// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static DescribeApplicationStatusQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusQuery self = new DescribeApplicationStatusQuery();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
