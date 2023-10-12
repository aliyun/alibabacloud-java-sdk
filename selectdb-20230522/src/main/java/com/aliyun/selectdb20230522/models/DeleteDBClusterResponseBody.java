// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteDBClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDBClusterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterResponseBody self = new DeleteDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterResponseBody setData(DeleteDBClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDBClusterResponseBodyData getData() {
        return this.data;
    }

    public DeleteDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDBClusterResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("OrderId")
        public String orderId;

        public static DeleteDBClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDBClusterResponseBodyData self = new DeleteDBClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDBClusterResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DeleteDBClusterResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
