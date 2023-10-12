// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDBClusterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterResponseBody self = new CreateDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterResponseBody setData(CreateDBClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBClusterResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreateDBClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBClusterResponseBodyData self = new CreateDBClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBClusterResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateDBClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
