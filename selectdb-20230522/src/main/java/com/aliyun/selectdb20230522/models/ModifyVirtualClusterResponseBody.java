// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyVirtualClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyVirtualClusterResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVirtualClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualClusterResponseBody self = new ModifyVirtualClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualClusterResponseBody setData(ModifyVirtualClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyVirtualClusterResponseBodyData getData() {
        return this.data;
    }

    public ModifyVirtualClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyVirtualClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb-vcg-b****-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        public static ModifyVirtualClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyVirtualClusterResponseBodyData self = new ModifyVirtualClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyVirtualClusterResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public ModifyVirtualClusterResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

    }

}
