// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Data")
    public ModifyDBClusterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponseBody self = new ModifyDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBClusterResponseBody setData(ModifyDBClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBClusterResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBClusterResponseBodyData extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static ModifyDBClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBClusterResponseBodyData self = new ModifyDBClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBClusterResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ModifyDBClusterResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ModifyDBClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
