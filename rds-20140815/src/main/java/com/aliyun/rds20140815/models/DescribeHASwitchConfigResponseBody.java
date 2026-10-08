// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The automatic primary/secondary switchover setting. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong>: The system automatically switches over between the primary and secondary instances upon a fault.</li>
     * <li><strong>Manual</strong>: Automatic switchover has been temporarily disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("HAConfig")
    public String HAConfig;

    /**
     * <p>The deadline for the temporary disabling of automatic switchover. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-29T15:00:00Z</p>
     */
    @NameInMap("ManualHATime")
    public String manualHATime;

    /**
     * <p>The request ID.</p>
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
