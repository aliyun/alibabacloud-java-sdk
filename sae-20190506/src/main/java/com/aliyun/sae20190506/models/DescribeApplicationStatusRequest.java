// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusRequest self = new DescribeApplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
