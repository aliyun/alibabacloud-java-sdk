// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDBInstanceEndpointAddressResponseBodyData data;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DBInstanceEndpointId")
        public String DBInstanceEndpointId;

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
