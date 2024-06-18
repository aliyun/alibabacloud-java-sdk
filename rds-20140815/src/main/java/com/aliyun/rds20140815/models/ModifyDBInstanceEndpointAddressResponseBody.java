// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ModifyDBInstanceEndpointAddressResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90496720-2319-42A8-87CD-FCE4DF95EBED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointAddressResponseBody self = new ModifyDBInstanceEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointAddressResponseBody setData(ModifyDBInstanceEndpointAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceEndpointAddressResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceEndpointAddressResponseBodyData extends TeaModel {
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

        public static ModifyDBInstanceEndpointAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceEndpointAddressResponseBodyData self = new ModifyDBInstanceEndpointAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceEndpointAddressResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public ModifyDBInstanceEndpointAddressResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
