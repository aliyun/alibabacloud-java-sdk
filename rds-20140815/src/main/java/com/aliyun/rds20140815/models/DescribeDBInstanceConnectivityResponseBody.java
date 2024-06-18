// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConnectivityResponseBody extends TeaModel {
    /**
     * <p>The error code for connection diagnosis. Valid values:</p>
     * <ul>
     * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist.</li>
     * <li><strong>CONNECTION_ABNORMAL</strong>: The connection to the cluster is normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SRC_IP_NOT_IN_USER_WHITELIST</p>
     */
    @NameInMap("ConnCheckErrorCode")
    public String connCheckErrorCode;

    /**
     * <p>The error message for connection diagnosis.</p>
     * 
     * <strong>example:</strong>
     * <p>Src ip:39.106.64.59 not in user whitelist</p>
     */
    @NameInMap("ConnCheckErrorMessage")
    public String connCheckErrorMessage;

    /**
     * <p>The connection diagnosis result. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong></li>
     * <li><strong>Failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Failed</p>
     */
    @NameInMap("ConnCheckResult")
    public String connCheckResult;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze2za3is7baay1w4</p>
     */
    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D880212A-F21F-5722-8422-BD06B2874CC3</p>
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
