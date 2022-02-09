// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TempModifyDBNodeResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBNodeIds")
    public java.util.List<String> DBNodeIds;

    @NameInMap("OrderId")
    public String orderId;

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
