// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsZonalResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>2DC120BF-6EBA-4C63-BE99-B09F9E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterEndpointsZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsZonalResponseBody self = new DescribeDBClusterEndpointsZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsZonalResponseBody setItems(java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClusterEndpointsZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("DashboardUsed")
        public Boolean dashboardUsed;

        /**
         * <strong>example:</strong>
         * <p>192.<em><strong>.</strong></em>.***</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>1521</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p><em><strong>.</strong></em>.**.com</p>
         */
        @NameInMap("PrivateZoneConnectionString")
        public String privateZoneConnectionString;

        /**
         * <strong>example:</strong>
         * <p>vpc-***************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems self = new DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setDashboardUsed(Boolean dashboardUsed) {
            this.dashboardUsed = dashboardUsed;
            return this;
        }
        public Boolean getDashboardUsed() {
            return this.dashboardUsed;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setPrivateZoneConnectionString(String privateZoneConnectionString) {
            this.privateZoneConnectionString = privateZoneConnectionString;
            return this;
        }
        public String getPrivateZoneConnectionString() {
            return this.privateZoneConnectionString;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBClusterEndpointsZonalResponseBodyItems extends TeaModel {
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> addressItems;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("AutoAddNewNodes")
        public String autoAddNewNodes;

        /**
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBEndpointDescription")
        public String DBEndpointDescription;

        /**
         * <strong>example:</strong>
         * <p>pe-*************</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;DistributedTransaction\&quot;:\&quot;off\&quot;,\&quot;ConsistLevel\&quot;:\&quot;0\&quot;,\&quot;LoadBalanceStrategy\&quot;:\&quot;load\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</p>
         */
        @NameInMap("EndpointConfig")
        public String endpointConfig;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <strong>example:</strong>
         * <p>Reader1</p>
         */
        @NameInMap("NodeWithRoles")
        public String nodeWithRoles;

        /**
         * <strong>example:</strong>
         * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PolarSccTimeoutAction")
        public String polarSccTimeoutAction;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PolarSccWaitTimeout")
        public String polarSccWaitTimeout;

        /**
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("ReadWriteMode")
        public String readWriteMode;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        public static DescribeDBClusterEndpointsZonalResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEndpointsZonalResponseBodyItems self = new DescribeDBClusterEndpointsZonalResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setAddressItems(java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterEndpointsZonalResponseBodyItemsAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setAutoAddNewNodes(String autoAddNewNodes) {
            this.autoAddNewNodes = autoAddNewNodes;
            return this;
        }
        public String getAutoAddNewNodes() {
            return this.autoAddNewNodes;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBEndpointDescription(String DBEndpointDescription) {
            this.DBEndpointDescription = DBEndpointDescription;
            return this;
        }
        public String getDBEndpointDescription() {
            return this.DBEndpointDescription;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setEndpointConfig(String endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public String getEndpointConfig() {
            return this.endpointConfig;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setNodeWithRoles(String nodeWithRoles) {
            this.nodeWithRoles = nodeWithRoles;
            return this;
        }
        public String getNodeWithRoles() {
            return this.nodeWithRoles;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setPolarSccTimeoutAction(String polarSccTimeoutAction) {
            this.polarSccTimeoutAction = polarSccTimeoutAction;
            return this;
        }
        public String getPolarSccTimeoutAction() {
            return this.polarSccTimeoutAction;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setPolarSccWaitTimeout(String polarSccWaitTimeout) {
            this.polarSccWaitTimeout = polarSccWaitTimeout;
            return this;
        }
        public String getPolarSccWaitTimeout() {
            return this.polarSccWaitTimeout;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setReadWriteMode(String readWriteMode) {
            this.readWriteMode = readWriteMode;
            return this;
        }
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        public DescribeDBClusterEndpointsZonalResponseBodyItems setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

    }

}
