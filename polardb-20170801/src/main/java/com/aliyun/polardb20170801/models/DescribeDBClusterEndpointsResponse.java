// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterEndpointsResponseItems> items;

    public static DescribeDBClusterEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsResponse self = new DescribeDBClusterEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterEndpointsResponseItemsAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        @Validation(required = true)
        public String connectionString;

        @NameInMap("IPAddress")
        @Validation(required = true)
        public String IPAddress;

        @NameInMap("NetType")
        @Validation(required = true)
        public String netType;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("VPCId")
        @Validation(required = true)
        public String VPCId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("VpcInstanceId")
        @Validation(required = true)
        public String vpcInstanceId;

        @NameInMap("PrivateZoneConnectionString")
        @Validation(required = true)
        public String privateZoneConnectionString;

        public static DescribeDBClusterEndpointsResponseItemsAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsResponseItemsAddressItems self = new DescribeDBClusterEndpointsResponseItemsAddressItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterEndpointsResponseItems extends TeaModel {
        @NameInMap("DBEndpointId")
        @Validation(required = true)
        public String DBEndpointId;

        @NameInMap("EndpointType")
        @Validation(required = true)
        public String endpointType;

        @NameInMap("Nodes")
        @Validation(required = true)
        public String nodes;

        @NameInMap("ReadWriteMode")
        @Validation(required = true)
        public String readWriteMode;

        @NameInMap("AutoAddNewNodes")
        @Validation(required = true)
        public String autoAddNewNodes;

        @NameInMap("EndpointConfig")
        @Validation(required = true)
        public String endpointConfig;

        @NameInMap("NodeWithRoles")
        @Validation(required = true)
        public String nodeWithRoles;

        @NameInMap("AddressItems")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterEndpointsResponseItemsAddressItems> addressItems;

        public static DescribeDBClusterEndpointsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsResponseItems self = new DescribeDBClusterEndpointsResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
