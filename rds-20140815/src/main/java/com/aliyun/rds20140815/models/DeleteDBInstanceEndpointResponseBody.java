// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DeleteDBInstanceEndpointResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceEndpointResponseBody self = new DeleteDBInstanceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceEndpointResponseBody setData(DeleteDBInstanceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDBInstanceEndpointResponseBodyData getData() {
        return this.data;
    }

    public DeleteDBInstanceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDBInstanceEndpointResponseBodyData extends TeaModel {
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

        public static DeleteDBInstanceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDBInstanceEndpointResponseBodyData self = new DeleteDBInstanceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDBInstanceEndpointResponseBodyData setDBInstanceEndpointId(String DBInstanceEndpointId) {
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        public DeleteDBInstanceEndpointResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
