// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionResponseBody extends TeaModel {
    /**
     * <p>Log retention period of SQL Explorer logs. Valid values:</p>
     * <ul>
     * <li><strong>30</strong>: 30 days.</li>
     * <li><strong>180</strong>: 180 days.</li>
     * <li><strong>365</strong>: 1 year.</li>
     * <li><strong>1095</strong>: 3 years.</li>
     * <li><strong>1825</strong>: 5 years.</li>
     * </ul>
     * <blockquote>
     * <p>Log retention period of SQL Explorer logs for ApsaraDB RDS for PostgreSQL and ApsaraDB RDS for SQL Server is fixed at 30 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5CEDCC2-CA75-43F7-9508-92F418CE6391</p>
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
