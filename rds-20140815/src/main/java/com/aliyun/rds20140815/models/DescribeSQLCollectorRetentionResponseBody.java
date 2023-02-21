// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionResponseBody extends TeaModel {
    /**
     * <p>The log backup retention duration that is allowed by the SQL explorer feature on the instance. Valid values:</p>
     * <br>
     * <p>*   **30:** 30 days</p>
     * <p>*   **180:** 180 days</p>
     * <p>*   **365:** one year</p>
     * <p>*   **1095:** three years</p>
     * <p>*   **1825:** five years</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLCollectorRetentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorRetentionResponseBody self = new DescribeSQLCollectorRetentionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorRetentionResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeSQLCollectorRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
