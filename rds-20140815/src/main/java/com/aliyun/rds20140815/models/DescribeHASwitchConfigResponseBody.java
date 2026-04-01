// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The status of the automatic primary/secondary switchover feature. Valid values:</p>
     * <ul>
     * <li><strong>Auto:</strong> The automatic primary/secondary switchover feature is enabled. The system automatically switches your workloads over from the instance to its secondary instance in the event of a fault.</li>
     * <li><strong>Manual:</strong> The automatic primary/secondary switchover feature is temporarily disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("HAConfig")
    public String HAConfig;

    /**
     * <p>The time when the automatic primary/secondary switchover feature is enabled again. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-29T15:00:00Z</p>
     */
    @NameInMap("ManualHATime")
    public String manualHATime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4FDF4B79-2741-4C5F-8C76-4B953FC5C2B1</p>
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
