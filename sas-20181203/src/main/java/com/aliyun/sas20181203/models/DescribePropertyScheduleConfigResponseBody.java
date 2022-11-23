// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScheduleConfigResponseBody self = new DescribePropertyScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScheduleConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribePropertyScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
