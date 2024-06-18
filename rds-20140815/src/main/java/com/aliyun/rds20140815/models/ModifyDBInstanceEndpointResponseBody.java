// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyDBInstanceEndpointResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointResponseBody self = new ModifyDBInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointResponseBody setData(ModifyDBInstanceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceEndpointResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The endpoint ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-****</p>
         */
        @NameInMap("DBInstanceEndpointId")
        public String DBInstanceEndpointId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static ModifyDBInstanceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceEndpointResponseBodyData self = new ModifyDBInstanceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceEndpointResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public ModifyDBInstanceEndpointResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
