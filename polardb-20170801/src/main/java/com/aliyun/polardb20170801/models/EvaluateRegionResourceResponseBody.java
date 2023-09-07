// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether sufficient resources are available. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine</p>
     * <br>
     * <p>*   Valid values for the MySQL database engine:</p>
     * <br>
     * <p>    *   **5.6**</p>
     * <p>    *   **5.7**</p>
     * <p>    *   **8.0**</p>
     * <br>
     * <p>*   Valid values for the PostgreSQL database engine:</p>
     * <br>
     * <p>    *   **11**</p>
     * <p>    *   **14**</p>
     * <br>
     * <p>*   Valid value for the Oracle database engine: **11**</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The ID of the request.</p>
     */
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
