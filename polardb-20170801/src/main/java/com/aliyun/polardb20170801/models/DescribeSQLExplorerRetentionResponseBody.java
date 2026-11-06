// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerRetentionResponseBody extends TeaModel {
    /**
     * <p>The retention period of SQL Explorer logs. Valid values:</p>
     * <ul>
     * <li><strong>30</strong>: 30 days</li>
     * <li><strong>180</strong>: 180 days</li>
     * <li><strong>365</strong>: 1 year</li>
     * <li><strong>1095</strong>: 3 years</li>
     * <li><strong>1825</strong>: 5 years</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35707295</p>
     */
    @NameInMap("DBInstanceID")
    public Integer DBInstanceID;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLExplorerRetentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerRetentionResponseBody self = new DescribeSQLExplorerRetentionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerRetentionResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeSQLExplorerRetentionResponseBody setDBInstanceID(Integer DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public Integer getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeSQLExplorerRetentionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSQLExplorerRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
