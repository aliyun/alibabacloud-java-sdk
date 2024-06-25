// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The details of the nodes.</p>
     */
    @NameInMap("DBNodeIds")
    public java.util.List<String> DBNodeIds;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>2035638*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TempModifyDBNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TempModifyDBNodeResponseBody self = new TempModifyDBNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public TempModifyDBNodeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public TempModifyDBNodeResponseBody setDBNodeIds(java.util.List<String> DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public java.util.List<String> getDBNodeIds() {
        return this.DBNodeIds;
    }

    public TempModifyDBNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TempModifyDBNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
