// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerRetentionResponseBody extends TeaModel {
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceID")
    public Integer DBInstanceID;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

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

    public DescribeSQLExplorerRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
