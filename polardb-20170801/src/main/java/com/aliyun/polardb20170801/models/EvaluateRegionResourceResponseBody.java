// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EvaluateRegionResourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the resources are sufficient.</p>
     * <ul>
     * <li><p><strong>true</strong>: The resources are sufficient.</p>
     * </li>
     * <li><p><strong>false</strong>: The resources are insufficient.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DBInstanceAvailable")
    public String DBInstanceAvailable;

    /**
     * <p>The database engine type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     * <ul>
     * <li><p>Valid values for MySQL:</p>
     * <ul>
     * <li><p><strong>5.6</strong></p>
     * </li>
     * <li><p><strong>5.7</strong></p>
     * </li>
     * <li><p><strong>8.0</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Valid values for PostgreSQL:</p>
     * <ul>
     * <li><p><strong>11</strong></p>
     * </li>
     * <li><p><strong>14</strong></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Valid value for Oracle: <strong>11</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
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
