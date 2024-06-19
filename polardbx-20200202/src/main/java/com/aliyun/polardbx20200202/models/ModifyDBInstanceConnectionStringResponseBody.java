// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ModifyDBInstanceConnectionStringResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>c3cf535c-a585-11ea-8263-00163e04d3a7</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>test2.polarx.huhehaote.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>pxc-unrf5ssig0ecg8</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <strong>example:</strong>
         * <p>3300</p>
         */
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
