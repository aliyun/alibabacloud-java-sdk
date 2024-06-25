// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarSQLCollectorPolicyResponseBody extends TeaModel {
    /**
     * <p>The IDs of the clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3655211B-4D74-4E13-91E6-FF2AFE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the SQL Explorer feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    public static DescribePolarSQLCollectorPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarSQLCollectorPolicyResponseBody self = new DescribePolarSQLCollectorPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarSQLCollectorPolicyResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarSQLCollectorPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarSQLCollectorPolicyResponseBody setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

}
