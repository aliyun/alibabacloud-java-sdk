// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDBInstanceEndpointAddressResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceEndpointAddressResponseBody self = new DeleteDBInstanceEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceEndpointAddressResponseBody setData(DeleteDBInstanceEndpointAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDBInstanceEndpointAddressResponseBodyData getData() {
        return this.data;
    }

    public DeleteDBInstanceEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDBInstanceEndpointAddressResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceEndpointId")
        public String DBInstanceEndpointId;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static DeleteDBInstanceEndpointAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDBInstanceEndpointAddressResponseBodyData self = new DeleteDBInstanceEndpointAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDBInstanceEndpointAddressResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public DeleteDBInstanceEndpointAddressResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
