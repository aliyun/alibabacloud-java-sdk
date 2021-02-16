// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerVersionResponseBody extends TeaModel {
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceID")
    public Integer DBInstanceID;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static DescribeSQLExplorerVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerVersionResponseBody self = new DescribeSQLExplorerVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerVersionResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeSQLExplorerVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLExplorerVersionResponseBody setDBInstanceID(Integer DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public Integer getDBInstanceID() {
        return this.DBInstanceID;
    }

    public DescribeSQLExplorerVersionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

}
