// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceConnectivityResponseBody extends TeaModel {
    /**
     * <p>The error code for connection diagnosis. Valid values:</p>
     * <ul>
     * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist.</li>
     * <li><strong>CONNECTION_ABNORMAL</strong>: The connection to the instance is normal.</li>
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
     * <p>Src ip:172.28.134.96 not in user whitelist</p>
     */
    @NameInMap("ConnCheckErrorMessage")
    public String connCheckErrorMessage;

    /**
     * <p>The connection check result. Valid values:</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDbInstanceConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceConnectivityResponseBody self = new DescribeDbInstanceConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceConnectivityResponseBody setConnCheckErrorCode(String connCheckErrorCode) {
        this.connCheckErrorCode = connCheckErrorCode;
        return this;
    }
    public String getConnCheckErrorCode() {
        return this.connCheckErrorCode;
    }

    public DescribeDbInstanceConnectivityResponseBody setConnCheckErrorMessage(String connCheckErrorMessage) {
        this.connCheckErrorMessage = connCheckErrorMessage;
        return this;
    }
    public String getConnCheckErrorMessage() {
        return this.connCheckErrorMessage;
    }

    public DescribeDbInstanceConnectivityResponseBody setConnCheckResult(String connCheckResult) {
        this.connCheckResult = connCheckResult;
        return this;
    }
    public String getConnCheckResult() {
        return this.connCheckResult;
    }

    public DescribeDbInstanceConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
