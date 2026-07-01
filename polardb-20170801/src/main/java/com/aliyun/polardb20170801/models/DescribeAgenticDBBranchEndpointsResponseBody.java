// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchEndpointsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBBranchEndpointsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>E5F6A7B8-C9D0-1234-EFAB-567890123EFA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAgenticDBBranchEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchEndpointsResponseBody self = new DescribeAgenticDBBranchEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchEndpointsResponseBody setItems(java.util.List<DescribeAgenticDBBranchEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBBranchEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBBranchEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAgenticDBBranchEndpointsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_admin</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>10.0.1.100</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>postgresql://cloud_admin:******@10.0.1.100:5432/neondb</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>neondb</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <strong>example:</strong>
         * <p>ep-3m4n5o6p7q8r</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeAgenticDBBranchEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBBranchEndpointsResponseBodyItems self = new DescribeAgenticDBBranchEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeAgenticDBBranchEndpointsResponseBodyItems setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
