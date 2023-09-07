// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAITaskStatusResponseBody extends TeaModel {
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

    /**
     * <p>The state of the PolarDB for AI feature. Valid values:</p>
     * <br>
     * <p>*   **1**: The feature is enabled.</p>
     * <p>*   **2**: The feature is disabled.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The state description of the PolarDB for AI feature.</p>
     */
    @NameInMap("StatusName")
    public String statusName;

    public static DescribeAITaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAITaskStatusResponseBody self = new DescribeAITaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAITaskStatusResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAITaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAITaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAITaskStatusResponseBody setStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }
    public String getStatusName() {
        return this.statusName;
    }

}
