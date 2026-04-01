// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteDBInstanceEndpointAddressResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
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
