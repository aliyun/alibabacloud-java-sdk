// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponseBody extends TeaModel {
    @NameInMap("HAConfig")
    public String HAConfig;

    @NameInMap("ManualHATime")
    public String manualHATime;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHASwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHASwitchConfigResponseBody self = new DescribeHASwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHASwitchConfigResponseBody setHAConfig(String HAConfig) {
        this.HAConfig = HAConfig;
        return this;
    }
    public String getHAConfig() {
        return this.HAConfig;
    }

    public DescribeHASwitchConfigResponseBody setManualHATime(String manualHATime) {
        this.manualHATime = manualHATime;
        return this;
    }
    public String getManualHATime() {
        return this.manualHATime;
    }

    public DescribeHASwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
