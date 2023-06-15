// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateDBInstanceEndpointAddressResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointAddressResponseBody self = new CreateDBInstanceEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointAddressResponseBody setData(CreateDBInstanceEndpointAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBInstanceEndpointAddressResponseBodyData getData() {
        return this.data;
    }

    public CreateDBInstanceEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBInstanceEndpointAddressResponseBodyData extends TeaModel {
        /**
         * <p>The public endpoint.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The endpoint ID of the instance.</p>
         */
        @NameInMap("DBInstanceEndpointId")
        public String DBInstanceEndpointId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static CreateDBInstanceEndpointAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceEndpointAddressResponseBodyData self = new CreateDBInstanceEndpointAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceEndpointAddressResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public CreateDBInstanceEndpointAddressResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public CreateDBInstanceEndpointAddressResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
