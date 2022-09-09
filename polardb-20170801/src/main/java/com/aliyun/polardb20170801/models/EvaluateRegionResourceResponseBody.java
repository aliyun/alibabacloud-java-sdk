// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceResponseBody extends TeaModel {
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateRegionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateRegionResourceResponseBody self = new EvaluateRegionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateRegionResourceResponseBody setDBInstanceAvailable(String DBInstanceAvailable) {
        this.DBInstanceAvailable = DBInstanceAvailable;
        return this;
    }
    public String getDBInstanceAvailable() {
        return this.DBInstanceAvailable;
    }

    public EvaluateRegionResourceResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public EvaluateRegionResourceResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public EvaluateRegionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
