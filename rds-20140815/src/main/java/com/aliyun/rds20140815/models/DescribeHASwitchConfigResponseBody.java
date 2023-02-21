// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The status of the automatic primary/secondary switchover function. Valid values:</p>
     * <br>
     * <p>*   **Auto:** The automatic primary/secondary switchover function is enabled. The system automatically switches over services from the primary to secondary instances in the event of a fault.</p>
     * <p>*   **Manual:** The automatic primary/secondary switchover function is temporarily disabled.</p>
     */
    @NameInMap("HAConfig")
    public String HAConfig;

    /**
     * <p>The time when at which the automatic primary/secondary switchover function is enabled again. The time must be in UTC.</p>
     */
    @NameInMap("ManualHATime")
    public String manualHATime;

    /**
     * <p>The ID of the request.</p>
     */
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
