// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the SQL Explorer (SQL Audit) feature. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disabled**</p>
     */
    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("StoragePeriod")
    public Integer storagePeriod;

    public static DescribeSQLCollectorPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponseBody self = new DescribeSQLCollectorPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLCollectorPolicyResponseBody setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public DescribeSQLCollectorPolicyResponseBody setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }
    public Integer getStoragePeriod() {
        return this.storagePeriod;
    }

}
