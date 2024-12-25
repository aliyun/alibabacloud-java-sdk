// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeListenerAccessControlAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the whitelist is enabled. Valid values:</p>
     * <ul>
     * <li><strong>open_white_list</strong>: the whitelist is enabled.</li>
     * <li><strong>close</strong>: the whitelist is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open_white_list</p>
     */
    @NameInMap("AccessControlStatus")
    public String accessControlStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried ACLs.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
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
