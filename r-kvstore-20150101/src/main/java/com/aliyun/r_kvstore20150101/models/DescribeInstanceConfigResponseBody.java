// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Config")
    public String config;

    public static DescribeInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponseBody self = new DescribeInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
