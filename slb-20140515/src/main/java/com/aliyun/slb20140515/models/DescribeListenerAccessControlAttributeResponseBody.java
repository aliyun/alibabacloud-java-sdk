// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeListenerAccessControlAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the whitelist is enabled. Valid values:</p>
     * <br>
     * <p>*   **open_white_list**: the whitelist is enabled.</p>
     * <p>*   **close**: the whitelist is disabled.</p>
     */
    @NameInMap("AccessControlStatus")
    public String accessControlStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried ACLs.</p>
     */
    @NameInMap("SourceItems")
    public String sourceItems;

    public static DescribeListenerAccessControlAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListenerAccessControlAttributeResponseBody self = new DescribeListenerAccessControlAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListenerAccessControlAttributeResponseBody setAccessControlStatus(String accessControlStatus) {
        this.accessControlStatus = accessControlStatus;
        return this;
    }
    public String getAccessControlStatus() {
        return this.accessControlStatus;
    }

    public DescribeListenerAccessControlAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListenerAccessControlAttributeResponseBody setSourceItems(String sourceItems) {
        this.sourceItems = sourceItems;
        return this;
    }
    public String getSourceItems() {
        return this.sourceItems;
    }

}
