// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDBInstanceEndpointResponseBodyData data;

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
        @NameInMap("DBInstanceEndpointId")
        public String DBInstanceEndpointId;

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
