// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConnectivityResponseBody extends TeaModel {
    /**
     * <p>The connection check error code. Valid values:</p>
     * <ul>
     * <li><p><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not in the whitelist.</p>
     * </li>
     * <li><p><strong>CONNECTION_ABNORMAL</strong>: The connection is abnormal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SRC_IP_NOT_IN_USER_WHITELIST</p>
     */
    @NameInMap("ConnCheckErrorCode")
    public String connCheckErrorCode;

    /**
     * <p>The connection check error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Src ip:192.<em><strong>.</strong></em>.1 not in user whitelist</p>
     */
    @NameInMap("ConnCheckErrorMessage")
    public String connCheckErrorMessage;

    /**
     * <p>The connection check result. Valid values:</p>
     * <ul>
     * <li><p><strong>Success</strong></p>
     * </li>
     * <li><p><strong>Failed</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Failed</p>
     */
    @NameInMap("ConnCheckResult")
    public String connCheckResult;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73A85BAF-1039-4CDE-A83F-1A140F******</p>
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
