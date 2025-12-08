// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateVirtualClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateVirtualClusterResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5ED62C81-9948-5612-81E1-EA3853752306</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualClusterResponseBody self = new CreateVirtualClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualClusterResponseBody setData(CreateVirtualClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVirtualClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateVirtualClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVirtualClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv2ez-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        public static CreateVirtualClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualClusterResponseBodyData self = new CreateVirtualClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVirtualClusterResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public CreateVirtualClusterResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

    }

}
