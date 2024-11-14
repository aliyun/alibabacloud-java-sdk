// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Data")
    public ModifyDBClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0BF61F90-ACED-55DF-A6FE-56714B2BFCF6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>219396937240838</p>
         */
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
