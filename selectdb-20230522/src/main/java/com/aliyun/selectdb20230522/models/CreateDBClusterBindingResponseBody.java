// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterBindingResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateDBClusterBindingResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBClusterBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterBindingResponseBody self = new CreateDBClusterBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterBindingResponseBody setData(CreateDBClusterBindingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBClusterBindingResponseBodyData getData() {
        return this.data;
    }

    public CreateDBClusterBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBClusterBindingResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv2ez-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <p>The numeric ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6585</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv2ez</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        public static CreateDBClusterBindingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBClusterBindingResponseBodyData self = new CreateDBClusterBindingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBClusterBindingResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public CreateDBClusterBindingResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public CreateDBClusterBindingResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

    }

}
