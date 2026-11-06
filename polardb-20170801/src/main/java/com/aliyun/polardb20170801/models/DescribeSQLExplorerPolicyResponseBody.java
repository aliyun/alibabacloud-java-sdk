// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3655211B-4D74-4E13-91E6-FF2AFE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the SQL Explorer feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SQLCollectorStatus")
    public String SQLCollectorStatus;

    public static DescribeSQLExplorerPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerPolicyResponseBody self = new DescribeSQLExplorerPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLExplorerPolicyResponseBody setSQLCollectorStatus(String SQLCollectorStatus) {
        this.SQLCollectorStatus = SQLCollectorStatus;
        return this;
    }
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

}
