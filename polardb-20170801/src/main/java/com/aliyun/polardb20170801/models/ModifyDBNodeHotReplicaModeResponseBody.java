// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeHotReplicaModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-2vc327c2a14a3u858</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>2148126708*****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9F4DDFBF-205C-5A3E-8DC2-C60F3E3FDC38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBNodeHotReplicaModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeHotReplicaModeResponseBody self = new ModifyDBNodeHotReplicaModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeHotReplicaModeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBNodeHotReplicaModeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBNodeHotReplicaModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
