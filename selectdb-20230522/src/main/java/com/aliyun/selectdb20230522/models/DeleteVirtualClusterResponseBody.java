// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteVirtualClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteVirtualClusterResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualClusterResponseBody self = new DeleteVirtualClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualClusterResponseBody setData(DeleteVirtualClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteVirtualClusterResponseBodyData getData() {
        return this.data;
    }

    public DeleteVirtualClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteVirtualClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li0****-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        public static DeleteVirtualClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteVirtualClusterResponseBodyData self = new DeleteVirtualClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteVirtualClusterResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DeleteVirtualClusterResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

    }

}
