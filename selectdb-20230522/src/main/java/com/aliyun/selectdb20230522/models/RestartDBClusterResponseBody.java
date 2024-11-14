// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class RestartDBClusterResponseBody extends TeaModel {
    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Data")
    public RestartDBClusterResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD0D0B17-C145-5B91-BFC2-6791927EE973</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBClusterResponseBody self = new RestartDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBClusterResponseBody setData(RestartDBClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartDBClusterResponseBodyData getData() {
        return this.data;
    }

    public RestartDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RestartDBClusterResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213c8y****-be</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static RestartDBClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartDBClusterResponseBodyData self = new RestartDBClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartDBClusterResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public RestartDBClusterResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
