// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConnectivityResponseBody extends TeaModel {
    /**
     * <p>The error code for connection diagnosis. Valid values:</p>
     * <br>
     * <p>*   **SRC_IP_NOT_IN_USER_WHITELIST**: The source IP address is not added to the whitelist.</p>
     * <p>*   **CONNECTION_ABNORMAL**: The connection to the cluster is normal.</p>
     */
    @NameInMap("ConnCheckErrorCode")
    public String connCheckErrorCode;

    /**
     * <p>The error message for connection diagnosis.</p>
     */
    @NameInMap("ConnCheckErrorMessage")
    public String connCheckErrorMessage;

    /**
     * <p>The connection diagnosis result. Valid values:</p>
     * <br>
     * <p>*   **Success**</p>
     * <p>*   **Failed**</p>
     */
    @NameInMap("ConnCheckResult")
    public String connCheckResult;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConnectivityResponseBody self = new DescribeDBInstanceConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConnectivityResponseBody setConnCheckErrorCode(String connCheckErrorCode) {
        this.connCheckErrorCode = connCheckErrorCode;
        return this;
    }
    public String getConnCheckErrorCode() {
        return this.connCheckErrorCode;
    }

    public DescribeDBInstanceConnectivityResponseBody setConnCheckErrorMessage(String connCheckErrorMessage) {
        this.connCheckErrorMessage = connCheckErrorMessage;
        return this;
    }
    public String getConnCheckErrorMessage() {
        return this.connCheckErrorMessage;
    }

    public DescribeDBInstanceConnectivityResponseBody setConnCheckResult(String connCheckResult) {
        this.connCheckResult = connCheckResult;
        return this;
    }
    public String getConnCheckResult() {
        return this.connCheckResult;
    }

    public DescribeDBInstanceConnectivityResponseBody setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public DescribeDBInstanceConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
