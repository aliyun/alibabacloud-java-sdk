// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DescribeAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClientIp")
    public String clientIp;

    public static DescribeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRequest self = new DescribeAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

}
