// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ModifyDBInstanceConnectionStringResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponseBody self = new ModifyDBInstanceConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ModifyDBInstanceConnectionStringResponseBody setData(ModifyDBInstanceConnectionStringResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceConnectionStringResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceConnectionStringResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDBInstanceConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceConnectionStringResponseBodyData extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("Port")
        public String port;

        public static ModifyDBInstanceConnectionStringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceConnectionStringResponseBodyData self = new ModifyDBInstanceConnectionStringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public ModifyDBInstanceConnectionStringResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
