// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConnectivityResponseBody extends TeaModel {
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
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConnectivityResponseBody self = new DescribeDBClusterConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConnectivityResponseBody setConnCheckErrorCode(String connCheckErrorCode) {
        this.connCheckErrorCode = connCheckErrorCode;
        return this;
    }
    public String getConnCheckErrorCode() {
        return this.connCheckErrorCode;
    }

    public DescribeDBClusterConnectivityResponseBody setConnCheckErrorMessage(String connCheckErrorMessage) {
        this.connCheckErrorMessage = connCheckErrorMessage;
        return this;
    }
    public String getConnCheckErrorMessage() {
        return this.connCheckErrorMessage;
    }

    public DescribeDBClusterConnectivityResponseBody setConnCheckResult(String connCheckResult) {
        this.connCheckResult = connCheckResult;
        return this;
    }
    public String getConnCheckResult() {
        return this.connCheckResult;
    }

    public DescribeDBClusterConnectivityResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
