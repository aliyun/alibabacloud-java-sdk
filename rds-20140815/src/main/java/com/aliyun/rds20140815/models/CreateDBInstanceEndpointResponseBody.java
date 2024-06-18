// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateDBInstanceEndpointResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C8E88DED-533F-4B3C-9207-731FBF394CCA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointResponseBody self = new CreateDBInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointResponseBody setData(CreateDBInstanceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBInstanceEndpointResponseBodyData getData() {
        return this.data;
    }

    public CreateDBInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBInstanceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

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

        public static CreateDBInstanceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceEndpointResponseBodyData self = new CreateDBInstanceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceEndpointResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public CreateDBInstanceEndpointResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public CreateDBInstanceEndpointResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
